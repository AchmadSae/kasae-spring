package sae.comp.springvalidation.data;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sae.comp.springvalidation.validation.Palindrome;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Foo {
    @Palindrome
    private String bar;

}
