package com.cognizant.springlearn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:country.xml")
class SpringLearnApplicationTests {

	@Autowired
	private Country country;

	@Test
	void countryBeanIsCreatedAndPopulated() {
		assertNotNull(country, "Country bean should be injected");
		assertEquals("IN",    country.getCode());
		assertEquals("India", country.getName());
	}
}
