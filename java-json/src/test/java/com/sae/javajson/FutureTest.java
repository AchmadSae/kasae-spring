package com.sae.javajson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FutureTest {
    @Test
    void mapperFuture() throws JsonProcessingException {
        String json = """
                {"ID":"1","Name":"Achmad"}
                """;
        ObjectMapper objectMapper = new ObjectMapper().configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);

        Person person = objectMapper.readValue(json, Person.class);
        Assertions.assertEquals("1",person.getId());
    }

    @Test
    void deserializationFuture() throws JsonProcessingException {
        String json = """
                {"ID":"1","Name":"Achmad","age":21,"dreamsWork":"BA"}
                """;
        ObjectMapper objectMapper = new ObjectMapper().configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true)
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY,true);

        Person person = objectMapper.readValue(json, Person.class);
        Assertions.assertEquals("1",person.getId());
        Assertions.assertEquals(List.of("BA"), person.getDreamsWork());
    }
}
