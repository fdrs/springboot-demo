package com.fdrs.springboot.commons.autoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.*;

/**
 * Created by bruce.lch on 16/11/2017.
 */

@ConfigurationProperties("author")//1
public class TestProperties {
    private static final String NAME = "pyj";

    private static final String PWD = "12324";

    private String name = NAME;//2

    private String pwd = PWD;

    private String[] arrayProps;//3

    private Properties properties = new Properties();//4

    private List<Map<String, Object>> listProp1 = new ArrayList();//5

    private List<String> listProp2 = new ArrayList();//6

    private Map<String, Object> mapProps = new HashMap();//7

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String[] getArrayProps() {
        return arrayProps;
    }

    public void setArrayProps(String[] arrayProps) {
        this.arrayProps = arrayProps;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List<Map<String, Object>> getListProp1() {
        return listProp1;
    }

    public void setListProp1(List<Map<String, Object>> listProp1) {
        this.listProp1 = listProp1;
    }

    public List<String> getListProp2() {
        return listProp2;
    }

    public void setListProp2(List<String> listProp2) {
        this.listProp2 = listProp2;
    }

    public Map<String, Object> getMapProps() {
        return mapProps;
    }

    public void setMapProps(Map<String, Object> mapProps) {
        this.mapProps = mapProps;
    }
}