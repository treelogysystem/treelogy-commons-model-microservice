package br.treelogy.modelmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@EnableCaching
@SpringBootApplication
public class ModelMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModelMicroServiceApplication.class, args);
	}

}
