package preparation;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit.ScreenShooter;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import signIn.SignInPage;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Sacred on 16.10.2016.
 */
public class BeforeClass extends ReadPropertiesForTest {

    final String browserPropertyName = "webdriver.chrome.driver";
    final String browserPropertyPath = "./src/main/resources/chromedriver.exe";
    final int timeOut = 10000;
    private final String baseURL = "https://ru.ogame.gameforge.com/";

    @Rule
    public ScreenShooter makeScreenshotOnFailure = ScreenShooter.failedTests().succeededTests();
    SignInPage signInPage = new SignInPage();

    @Before
    public void before() {
        Configuration.browser = "chrome";
        Configuration.timeout = timeOut;
        makeScreenshotOnFailure.captureSuccessfulTests = true;
        System.setProperty(browserPropertyName, browserPropertyPath);
        open(baseURL);
        signInPage.loginToAccount(
                loginData("serverName"),
                loginData("username"),
                loginData("password"));
    }

    @After
    public void after() {
        //  close();
        Configuration.holdBrowserOpen = true;
    }
}
