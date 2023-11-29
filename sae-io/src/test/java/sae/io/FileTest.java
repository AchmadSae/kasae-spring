package sae.io;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.io.File;
@Slf4j
public class FileTest {

    @Test
    void createFile() {

        File file = new File("File.txt");

        Assertions.assertEquals("File.txt", file.getName());
        log.info("match");
        Assertions.assertFalse(file.exists(), () -> "File should not exist: " + file.getPath());
    }

    @Test
    void createFilExist() {

        File file = new File("src/main/resources/application.properties");

        Assertions.assertEquals("application.properties", file.getName());
        log.info("match");
        Assertions.assertTrue(file.exists());
    }
}
