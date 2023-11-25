package sae.comp.springvalidation;

import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sae.comp.springvalidation.Helper.SayHello;

@SpringBootTest
public class SayHelloTest {

    @Autowired
    private SayHello sayHello;

    @Test
    void testSuccess(){
       String message = sayHello.sayHello("Achmad");
        Assertions.assertEquals("hello Achmad", message);
    }

    @Test
    void testUnSuccess(){
        Assertions.assertThrows(ConstraintViolationException.class, () -> sayHello.sayHello(""));
    }
}
