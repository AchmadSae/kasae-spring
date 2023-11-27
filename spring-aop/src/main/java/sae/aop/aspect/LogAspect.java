package sae.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LogAspect {

    @Pointcut("target(sae.aop.service.HelloService)")
    public void helloServiceMethod(){

    }
    @Pointcut("execution(* sae.aop.service.HelloService.*(java.lang.String))")
    public void pointCutHelloServiceStringParam(){

    }

    @Before("helloServiceMethod()")
    public void beforeHelloServiceMethod(JoinPoint joinPoint){
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        log.info("Before " + className + "." +methodName +"()");
    }

    @Around("helloServiceMethod()")
    public Object aroundHelloServiceMethod(ProceedingJoinPoint joinPoint) throws Throwable{
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        try {
            log.info("Before run success" + className + "." +methodName +"()");
            return joinPoint.proceed(joinPoint.getArgs());
        }catch (Throwable throwable) {
            log.info("Before error " + className + "." +methodName +"()");
            throw throwable;
        }
        finally {
            log.info("Before finally" + className + "." +methodName +"()");
        }
    }

    @Before("pointCutHelloServiceStringParam()")
    public void logStringParam(JoinPoint joinPoint){
        String value =(String) joinPoint.getArgs()[0];
        log.info("Executed method wih parameter :"+value);
    }
}
