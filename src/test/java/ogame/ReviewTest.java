package ogame;

import org.junit.Test;
import preparation.BeforeClass;
import signIn.SignInPage;

/**
 * Created by Sacred on 16.10.2016.
 */
public class ReviewTest extends BeforeClass{

    SignInPage signInPage = new SignInPage();

    @Test
    public void review() throws InterruptedException {
        signInPage.clickOnLoginButton();
        signInPage.chooseServer("Izar");
        Thread.sleep(3000);
    }
}
