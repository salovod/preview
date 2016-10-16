package preparation;

import utils.PropertiesReader;

import java.util.Properties;

/**
 * Created by Oleh on 16.10.2016.
 */
public class ReadPropertiesForTest {

    private Properties loginData = PropertiesReader.readProperties("login.properties");

    protected String loginData(String data) {
        return loginData.getProperty(data);
    }
}

