package com.sae.javajson;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

public class JavaBeanTest {
    @Test
    void serializationInclusion() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);
        Person person = new Person();
        person.setId("1");
        person.setName("Sania");

        String json = objectMapper.writeValueAsString(person);
        System.out.println(json);
    }
}
