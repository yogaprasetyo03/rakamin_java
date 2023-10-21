package step_definitions.login_page;

import io.cucumber.java.en.Then;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Utama;

public class LoginWithInvalidData {

    private final WebDriver driver = Utama.driver;

    LoginPage loginPage = new LoginPage(driver);

    @Then("User get {string} as error message")
    public void verifyUserError(String errMsg) {
        Assert.assertEquals(errMsg, loginPage.loginIsError());
    }
}
