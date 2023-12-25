package sae.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class InputStreamTest {

    @Test
    void read() throws IOException {
        Path path = Path.of("pom.xml");
        try (InputStream inputStream = Files.newInputStream(path)){
            StringBuilder stringBuilder = new StringBuilder();
            int data;
            while ((data = inputStream.read()) != -1){
                stringBuilder.append((char) data);
            }
            System.out.println(stringBuilder.toString());
        }catch (IOException ioException){
            Assertions.fail(ioException);
        }
    }

    @Test
    void inputStream() throws IOException {
        Path path = Path.of("pom.xml");
        try (InputStream inputStream = Files.newInputStream(path)){
            StringBuilder stringBuilder = new StringBuilder();
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) != -1){
                stringBuilder.append(new String(buffer, 0, length));
            }
            System.out.println(stringBuilder.toString());
        }catch (IOException ioException){
            Assertions.fail(ioException);
        }
    }
}
