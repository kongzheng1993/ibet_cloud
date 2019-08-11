package com.evil.ibetbusi.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

    static Properties properties = new Properties();

    public static String getPropertie(String key) {
        {
            try {
                properties.load(PropertiesUtil.class.getClassLoader().getResourceAsStream("config/system.properties"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties.getProperty(key);
    }

    public static void main(String[] args) {
        System.out.println(PropertiesUtil.getPropertie("AppId"));
    }

}
