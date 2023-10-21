package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutAndCartPage {
    public static WebDriver webDriver;

    public CheckoutAndCartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifyOnPage;

    @FindBy(css = ".shopping_cart_link")
    private WebElement cart;

    @FindBy(id = "continue-shopping")
    private WebElement backToDashboard;

    @FindBy(id = "cancel")
    private WebElement backToCheckout;

    @FindBy(id = "back-to-products")
    private WebElement backToProduct; //on last page

    @FindBy(id = "checkout")
    private WebElement checkout;

    @FindBy(id = "continue")
    private WebElement continueCheckout;

    @FindBy(id = "finish")
    private WebElement finish;

    @FindBy(className = "cart_button")
    private WebElement removeButton;

    @FindBy(id = "first-name")
    private WebElement firstNameCheckout;

    @FindBy(id = "last-name")
    private WebElement lastNameCheckout;

    @FindBy(id = "postal-code")
    private WebElement postalCode;

    @FindBy(css = ".shopping_cart_badge")
    private WebElement cartBadge;

    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement itemPrice;

    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement taxPrice;

    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement totalPrice;

    public void clickCart(){
        cart.click();
    }

    public void clickCheckout(){
        checkout.click();
    }

    public void clickBackToDashboard(){
        backToDashboard.click();
    }

    public String getBadgeTextCart(){
        return cartBadge.getText();
    }

    public void setFirstName(String firstName){
        firstNameCheckout.sendKeys(firstName);
    }

    public void setLastName(String lastName){
        lastNameCheckout.sendKeys(lastName);
    }

    public void setPostalCode(String postalCode){
        this.postalCode.sendKeys(postalCode);
    }

    public void clickRemoveItem(){
        removeButton.click();
    }

    public void clickContinue(){
        continueCheckout.click();
    }

    public void clickFinish(){
        finish.click();
    }

    public void clickBackToProduct() {
        backToProduct.click();
    }

    public String verifyOnCartPage() {
        return verifyOnPage.getText();
    }

    public String getItemPrice(){
        return itemPrice.getText();
    }

    public String getTaxPrice(){
        return taxPrice.getText();
    }

    public String getTotalPrice(){
        return totalPrice.getText();
    }

}
