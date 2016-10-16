package signIn;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Sacred on 16.10.2016.
 */
public class SignInPage {

    SelenideElement loginButton = $("#loginBtn");
    SelenideElement chooseServer = $("#serverLogin");


    public void clickOnLoginButton() {
        loginButton.click();
    }
    public void chooseServer(String serverName) {
        chooseServer.selectOption(serverName);
    }
}
