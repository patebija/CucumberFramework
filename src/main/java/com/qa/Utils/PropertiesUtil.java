package com.qa.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

    public static Properties loadApplicationProperties(){

        Properties properties = new Properties();

        File file = new File("src/test/resources/config/application.properties");
        try {
            FileInputStream fis = new FileInputStream(file);
            properties.load(fis);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
       return properties;
    }
}
