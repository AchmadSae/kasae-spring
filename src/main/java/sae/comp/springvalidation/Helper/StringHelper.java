package sae.comp.springvalidation.Helper;

import org.springframework.stereotype.Component;
@Component
public class StringHelper {

    public boolean isPalindrome(String value){
        String reverse = new StringBuilder(value).reverse().toString();
        return value.equals(reverse);
    }
}
