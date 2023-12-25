package sae.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ClosableTest {

    @Test
    void closeIO() {
        Path path = Path.of("pom.xml");
        InputStream inputStream = null;

        try{
            inputStream = Files.newInputStream(path);
        }catch (IOException ioException){

        }finally {
            if (inputStream != null ){
                try{
                    inputStream.close();
                } catch (IOException e) {
                    Assertions.fail(e);
                }
            }
        }
    }

    @Test
    void closeIOwithResource() {
        Path path = Path.of("pom.xml");
        try(InputStream inputStream = Files.newInputStream(path)){

        }catch (IOException ioException){
            Assertions.fail(ioException);
        }
    }
}
