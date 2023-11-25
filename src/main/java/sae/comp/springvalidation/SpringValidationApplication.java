package sae.comp.springvalidation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import sae.comp.springvalidation.properties.DatabaseProperties;

@EnableConfigurationProperties({
		DatabaseProperties.class
})

@SpringBootApplication
public class SpringValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringValidationApplication.class, args);
	}

}
