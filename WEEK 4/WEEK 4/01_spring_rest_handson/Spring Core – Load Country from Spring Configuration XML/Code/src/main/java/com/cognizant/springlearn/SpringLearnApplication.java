package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
// <- this tells Spring Boot to load beans from country.xml
@ImportResource("classpath:country.xml")
public class SpringLearnApplication implements CommandLineRunner {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	private final ConfigurableApplicationContext context;

	public SpringLearnApplication(ConfigurableApplicationContext context) {
		this.context = context;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
	}

	@Override
	public void run(String... args) {
		// now Boot’s context *includes* your Country bean
		Country country = context.getBean("country", Country.class);
		LOGGER.debug("Country : {}", country);

		// shut down cleanly
		context.close();
	}
}
