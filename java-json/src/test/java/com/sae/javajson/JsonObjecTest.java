package com.sae.javajson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
}
