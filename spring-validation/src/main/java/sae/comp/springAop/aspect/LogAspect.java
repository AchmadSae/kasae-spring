package sae.comp.springAop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LogAspect {
    @Pointcut("target(sae.comp.springAop.service.HelloService)")
    public void helloServiceMethod(){
    }

    @Before("helloServiceMethod()")
    public void beforeHelloServiceMethod(){
        log.info("Before HellosService Method Again");
    }
}
