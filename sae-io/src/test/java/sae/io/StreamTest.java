package sae.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class StreamTest {

    @Test
    void Scanner() {
        Path path = Path.of("write.txt");
        try(InputStream outputStream = Files.newInputStream(path);
            Scanner scanner = new Scanner(outputStream)){
            while(scanner.hasNextLine()){
                String text = scanner.nextLine();
                System.out.println(text);
            }
        }catch (IOException exception){
            Assertions.fail(exception);
        }
    }
}
