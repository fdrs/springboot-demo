package com.fdrs.springboot.commons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author bruce.lch(bruce.lch@alibaba-inc.com) on 17-11-8.
 */
@ComponentScan
@Configuration
@EnableAutoConfiguration
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    private static void runForever() {
        while(true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.info("springboot-commons application started.");
        runForever();
    }
}
