package com.sae.javajson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class createJsonFromObjectTest {
    @Test
    void createJsonFromObject() throws JsonProcessingException {
        Person person = new Person();
        person.setId("1");
        person.setName("Achmad");
        person.setDreamsWork(List.of("Java Dev","Google BA","PM"));

        Adress adress = new Adress();
        adress.setStreet("Jl. Alternatif Luwunggede");
        adress.setCity("Brebes");
        adress.setCountry("Indonesia");
        person.setAdress(String.valueOf(adress));

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(person);
        System.out.println(json);
    }

    @Test
    void createObjectFromJson() throws JsonProcessingException {
        String json = """
                {"id":"1","name":"Achmad","dreamsWork":["Java Dev","Google BA","PM"],"adress":"com.sae.javajson.Adress@2145433b"}
                """;
        ObjectMapper objectMapper = new ObjectMapper();
        Person person = objectMapper.readValue(json, Person.class);

        Assertions.assertEquals("Achmad", person.getName());
        Assertions.assertEquals(List.of("Java Dev","Google BA","PM"), person.getDreamsWork());
    }
}
