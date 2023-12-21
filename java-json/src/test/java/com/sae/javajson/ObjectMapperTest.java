package com.sae.javajson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObjectMapperTest {

    @Test
    void mapper() {
        ObjectMapper objectMapper = new ObjectMapper();

        Assertions.assertNotNull(objectMapper);
    }
}
