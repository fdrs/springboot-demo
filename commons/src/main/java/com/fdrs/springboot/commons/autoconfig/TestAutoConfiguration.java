package com.fdrs.springboot.commons.autoconfig;

/**
 * Created by bruce.lch on 16/11/2017.
 */

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConditionalOnClass(BizService.class)
@EnableConfigurationProperties(TestProperties.class)
@ConditionalOnProperty(prefix = "author", value = "enabled", matchIfMissing = true)
public class TestAutoConfiguration {

    private final TestProperties testProperties;

    public TestAutoConfiguration(TestProperties testProperties) {
        this.testProperties = testProperties;
    }

    @Bean
    @ConditionalOnMissingBean(BizService.class)
    public BizService bizService() throws JsonProcessingException {
        BizService bizService = new BizService();
        bizService.setMsg(testProperties.getName() + " :" + testProperties.getPwd());

        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println("arrayProps: " + objectMapper.writeValueAsString(testProperties.getArrayProps()));
        System.out.println("listProp1: " + objectMapper.writeValueAsString(testProperties.getListProp1()));
        System.out.println("listProp2: " + objectMapper.writeValueAsString(testProperties.getListProp2()));
        System.out.println("mapProps: " + objectMapper.writeValueAsString(testProperties.getMapProps()));
        System.out.println("Props: " + objectMapper.writeValueAsString(testProperties.getProperties()));
        return bizService;
    }
}
