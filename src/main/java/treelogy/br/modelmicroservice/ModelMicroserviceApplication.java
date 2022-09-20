package treelogy.br.modelmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@EnableCaching
@SpringBootApplication
public class TemplateBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplateBackApplication.class, args);
	}

}
