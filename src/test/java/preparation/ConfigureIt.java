package preparation;

//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.service.local.AppiumDriverLocalService;
//import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.logging.Level;

import static com.codeborne.selenide.Configuration.timeout;

/**
 * Created by Sacred on 19.08.2017.
 */
public class ConfigureIt {

    private static WebDriver driver = null;
    //    private static AppiumDriverLocalService service;
    private final int maxWaitTime = 15000;
    String path = "C:\\Users\\Sacred\\.m2\\repository\\webdriver\\chromedriver\\win32\\2.32\\chromedriver.exe";

    public ConfigureIt() {
        System.out.println("Drivers initiated");
    }

    public WebDriver getChromeDriver() {
        ChromeDriverManager.getInstance().setup();
        System.setProperty("webdriver.chrome.driver", path);
        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        options.addArguments("--start-maximized");
        options.addArguments("--test-type");
        options.addArguments("--disable-notifications");
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 1);
        chromePrefs.put("safebrowsing.enabled", true);
        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
        capabilities.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
        options.setExperimentalOption("prefs", chromePrefs);
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        timeout = maxWaitTime;
        return driver = new ChromeDriver(capabilities);
    }

//    public WebDriver connect() {
//
//
//        // TODO Create getAppium .....
//
//
//        service = AppiumDriverLocalService.buildDefaultService();
//        service.start();
//
//        if (service == null || !service.isRunning()) {
//            throw new AppiumServerHasNotBeenStartedLocallyException(
//                    "An appium server node is not started!");
//        }
//        File classpathRoot = new File(System.getProperty("user.dir"));
////        File appDir = new File(classpathRoot, "../../../apps/ApiDemos/bin");
////        File app = new File(appDir.getCanonicalPath(), "ApiDemos-debug.apk");
//        DesiredCapabilities capabilities = new DesiredCapabilities();
////        capabilities.setCapability("deviceName","Android Emulator");
//        capabilities.setCapability("deviceName", "emulator-5556");
////        capabilities.setCapability("app", app.getAbsolutePath());
//        capabilities.setCapability("browserName", "Chrome");
//
////        capabilities.setCapability("appPackage", "io.appium.android.apis");
////        capabilities.setCapability("appActivity", ".ApiDemos");
//        driver = new AndroidDriver<>(service.getUrl(), capabilities);
//        return driver;
//    }
}
