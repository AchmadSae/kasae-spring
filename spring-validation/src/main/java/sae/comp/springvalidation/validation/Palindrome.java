package sae.comp.springvalidation.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PalindromeValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Palindrome {
    String message() default "{Palindrome.message}";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
