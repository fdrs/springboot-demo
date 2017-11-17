package com.fdrs.springboot.commons.profiles;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by bruce.lch on 17/11/2017.
 */

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
