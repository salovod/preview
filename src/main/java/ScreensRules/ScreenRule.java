package ScreensRules;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Created by Sacred on 16.10.2016.
 */
public class ScreenRule {

    @Attachment(type = "image/png")
    protected byte[] makeScreenshot() {
        return ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
