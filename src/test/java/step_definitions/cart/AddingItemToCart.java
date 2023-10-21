package step_definitions.home_page;

import io.cucumber.java.en.When;
import org.example.pageObject.HomePage;
import org.openqa.selenium.WebDriver;
import step_definitions.Utama;

public class AddingItemToCart {

    private final WebDriver driver = Utama.driver;

    HomePage homePage = new HomePage(driver);

    @When("User clicking {string} of item into a cart")
    public void AddingCart(String str) {
        homePage.clickAddToCart(str);
    }

}
