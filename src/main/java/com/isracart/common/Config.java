package com.isracart.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

    protected static Properties properties;

    public Config() {
        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

}
