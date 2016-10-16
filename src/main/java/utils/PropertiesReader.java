package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Oleh on 16.10.2016.
 */
public class PropertiesReader {

    public static Properties readProperties(String name) {
        try (InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream(name)) {
            Properties properties = new Properties();
            properties.load(stream);
            return properties;
        } catch (IOException e) {
            return null;
        }
    }
}
