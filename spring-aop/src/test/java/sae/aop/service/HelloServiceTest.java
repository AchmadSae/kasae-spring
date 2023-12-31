package sae.aop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    @Test
    void helloService() {
        Assertions.assertEquals("Hello Achmad", helloService.hello("Achmad"));
        Assertions.assertEquals("Hello Achmad Saepudin", helloService.hello("Achmad","Saepudin"));
        Assertions.assertEquals("Bye Achmad", helloService.bye("Achmad"));
    }

}
