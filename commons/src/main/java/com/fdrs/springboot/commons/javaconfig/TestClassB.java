package com.fdrs.springboot.commons.javaconfig;

import org.springframework.stereotype.Component;

/**
 * Created by bruce.lch on 16/11/2017.
 */

@Component
public class TestClassB {
    public void helloWorld() {
        System.out.println("Test Java Config constructor injection!");
    }
}
