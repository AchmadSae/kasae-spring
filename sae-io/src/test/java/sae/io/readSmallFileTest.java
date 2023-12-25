package sae.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class readSmallFileTest {

    @Test
    void readSmallFile() throws IOException {
        Path path = Path.of("samll.txt");
        byte[] bytes = Files.readAllBytes(path);
        String content = new String(bytes);
        Assertions.assertEquals("Hai Achmad", content);

        Path path1 = Path.of("small1.txt");
        String content1 = Files.readString(path1);
        Assertions.assertEquals("Hai Sania", content1);
    }
}
