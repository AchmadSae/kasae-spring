package com.sae.javajson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;


public class JsonObjecTest {
    @Test
    void createJson() throws JsonProcessingException {
        Map<String, Object> person =  Map.of(
                "firstName", "Achmad",
                "lastName", "Saepudin",
                "gender", "Male",
                "age", 25,
                "isMarried", true,
                "adderss", Map.of(
                        "street","Gg.Musholah No,3",
                        "city","Tangerang South",
                        "country", "Indonesia"
                )

        );
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(person);
        System.out.println(json);
    }

    @Test
    void readJson() throws JsonProcessingException {
        String json = """
                {
                  "lastName": "Saepudin",
                  "age": 25,
                  "firstName": "Achmad",
                  "isMarried": true,
                  "gender": "Male",
                  "address": {
                    "city": "Tangerang South",
                    "country": "Indonesia",
                    "street": "Gg.Musholah No,3"
                  }
                }
                """;
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> person = objectMapper.readValue(json, new TypeReference<Map<String, Object>>() {
        });

        Assertions.assertEquals("Achmad", person.get("firstName"));
        Map<String, Object> address = (Map<String, Object>) person.get("address");
        Assertions.assertEquals("Indonesia",address.get("country"));
    }
}
