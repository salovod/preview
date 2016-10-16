package preparation;

import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Before;
import signIn.SignInPage;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Sacred on 16.10.2016.
 */
public class BeforeClass {

    SignInPage signInPage = new SignInPage();

    private final String baseURL = "https://ru.ogame.gameforge.com/";
    final String browserPropertyName = "webdriver.chrome.driver";
    final String browserPropertyPath = "./src/main/resources/chromedriver.exe";
    final int timeOut = 10000;

    @Before
    public void before() {
        Configuration.browser = "chrome";
        Configuration.timeout = timeOut;
        System.setProperty(browserPropertyName, browserPropertyPath);
        open(baseURL);
        signInPage.clickOnLoginButton();
        signInPage.chooseServer("Izar");
    }



    @After
    public void after() {
        close();
    }
}
