package com.sae.javajson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class JsonArrayTest {
    @Test
    void createJsonArray() throws JsonProcessingException {
        List<String> dreamsWork = List.of("CTO","PM","DEV");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(dreamsWork);
        System.out.println(json);
    }

    @Test
    void readJsonArray() throws JsonProcessingException {
        String json = """
                ["CTO","PM","DEV"]
                """;
        ObjectMapper objectMapper = new ObjectMapper();
        List<String> dreamsWork = objectMapper.readValue(json, new TypeReference<List<String>>() {
        });
        Assertions.assertEquals(List.of("CTO","PM","DEV"), dreamsWork);


    }
}
