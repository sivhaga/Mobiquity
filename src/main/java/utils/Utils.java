package utils;

import org.apache.log4j.Logger;

import java.io.*;
import java.util.Properties;
import org.apache.log4j.Logger;

public class Utils {

    private static Logger log = Logger.getLogger(Utils.class);

    public static String getConfigPropertyValue(String propertyFileName, String propertyName) {
        String Value = null;
        try {
            FileInputStream fileIS = new FileInputStream(new File(propertyFileName));
            Properties prop = new Properties();
            prop.load(fileIS);

            Value = prop.getProperty(propertyName);
        } catch (IOException e) {
            log.info(e.getStackTrace()) ;
        }

        return Value;
    }

}
