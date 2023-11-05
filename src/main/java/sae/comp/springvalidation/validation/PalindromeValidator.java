package sae.comp.springvalidation.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import sae.comp.springvalidation.Helper.StringHelper;

public class PalindromeValidator implements ConstraintValidator<Palindrome, String> {
    @Autowired
    private StringHelper stringHelper;


    @Override
    public void initialize(Palindrome constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext context) {
        return stringHelper.isPalindrome(s);
    }
}
