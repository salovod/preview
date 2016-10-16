package preparation;

import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Sacred on 16.10.2016.
 */
public class BeforeClass {

    private final String baseURL = "";
    private final String regURLPart = "";
    final String browserPropertyName = "webdriver.chrome.driver";
    final String browserPropertyPath = "./src/main/resources/chromedriver.exe";
    final int timeOut = 10000;

    @Before
    public void before() {
        Configuration.browser = "firefox";
        Configuration.timeout = timeOut;
        System.setProperty(browserPropertyName, browserPropertyPath);
        open(baseURL + regURLPart);
    }



    @After
    public void after() {
        close();
    }
}
