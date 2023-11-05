package sae.comp.springvalidation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sae.comp.springvalidation.data.Person;

import java.util.Set;

@SpringBootTest
public class ValidatorTest {

    @Autowired
    private Validator validator;
    @Test
    void personNotValid(){
        var person = new Person();

        Set<ConstraintViolation<Person>> constraintViolation = validator.validate(person);

        Assertions.assertFalse(constraintViolation.isEmpty());
        Assertions.assertEquals(2, constraintViolation.size());
    }
@Test
    void personValid(){
        var person = new Person("1", "Achmad");

        Set<ConstraintViolation<Person>> constraintViolation = validator.validate(person);

        Assertions.assertTrue(constraintViolation.isEmpty());
    }
}
