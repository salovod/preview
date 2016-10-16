package signIn;

import ScreensRules.ScreenRule;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Sacred on 16.10.2016.
 */
public class SignInPage extends ScreenRule {

    SelenideElement loginButton = $("#loginBtn");
    SelenideElement chooseServer = $("#serverLogin");
    SelenideElement usernameField = $("#usernameLogin");
    SelenideElement passwordField = $("#passwordLogin");
    SelenideElement submitLoginButton = $("#loginSubmit");


    private void clickOnLoginButton() {
        loginButton.click();
        makeScreenshot();
    }

    private void submitLogin() {
        submitLoginButton.click();
        makeScreenshot();
    }

    private void chooseServer(String serverName) {
        chooseServer.selectOption(serverName);
        makeScreenshot();
    }

    private void fillUsername(String username) {
        usernameField.val(username);
        makeScreenshot();
    }

    private void fillPassword(String password) {
        passwordField.val(password);
        makeScreenshot();
    }

    public void completeLogin(String serverName, String username, String password) {
        clickOnLoginButton();
        chooseServer(serverName);
        fillUsername(username);
        fillPassword(password);
        submitLogin();
    }
}
