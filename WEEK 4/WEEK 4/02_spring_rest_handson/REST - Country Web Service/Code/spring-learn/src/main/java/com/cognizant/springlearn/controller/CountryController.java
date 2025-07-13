package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @RequestMapping("/country")
    public Country getCountryIndia() {
        LOGGER.info("START: getCountryIndia()");
        Country country = null;

        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("Country.xml");
            country = (Country) context.getBean("in");
        } catch (Exception e) {
            LOGGER.error("ERROR: Exception occurred while loading country bean", e);
        }

        LOGGER.info("END: getCountryIndia()");
        return country;
    }
}
