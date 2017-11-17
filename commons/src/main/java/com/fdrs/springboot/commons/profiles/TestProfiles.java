package com.fdrs.springboot.commons.profiles;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by bruce.lch on 17/11/2017.
 */


//可以通过命令行指定指定使用哪套profile
// 例如：
// mvn spring-boot:run -Drun.arguments="--spring.config.location=file:./application.yml,--spring.profiles.active=otherprofile"
//也可以在application.xml中指定用哪套profiles
//spring:
//  profiles:
//    active: myprofile
@ConfigurationProperties(prefix = "test.profile")
public class TestProfiles {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
