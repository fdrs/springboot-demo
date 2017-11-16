package com.fdrs.springboot.commons.javaconfig;

import org.springframework.context.annotation.Configuration;

/**
 * Created by bruce.lch on 16/11/2017.
 */
@Configuration
public class TestClassA {
    private TestClassB testB;
    public TestClassA(TestClassB testB){
        this.testB = testB;
        testB.helloWorld();
    }
}
