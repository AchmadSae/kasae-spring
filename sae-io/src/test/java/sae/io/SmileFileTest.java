package sae.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SmileFileTest {
    @Test
    void writeSmallFile() throws IOException {
        Path path = Path.of("samll.txt");
        byte[] bytes = "Hai Achmad".getBytes();
        Files.write(path, bytes);
        Assertions.assertTrue(Files.exists(path));

        Path path1 = Path.of("small1.txt");
        Files.writeString(path1, "Hai Sania");
        Assertions.assertTrue(Files.exists(path1));
    }
}
