package sae.comp.springAop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloServiceTest {
    @Autowired
    private HelloService helloImpService;
    @Test
    void ceckHello(){
        Assertions.assertEquals("Hello Achmad", helloImpService.hello("Achmad"));
        Assertions.assertEquals("Bye Achmad", helloImpService.bye("Achmad"));
    }
}
