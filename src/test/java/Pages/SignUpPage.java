package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.sql.Timestamp;

public class SignUpPage extends BasePage {


    @FindBy (css = "https://test.woahstork.com/register")
    private WebElement sighUpPage;

    @FindBy (css = "[placeholder='Email']")
    private WebElement emailField;

    @FindBy (css = "[class='styled__CheckboxWrapper-sc-1x07d2p-2 cjrWjQ'] [class*='ws-checkbox']")
    private WebElement checkboxTermsAndConditions;

    @FindBy (css = "[class='styled__CheckboxWrapper-sc-1x07d2p-2 cIPcIz'] [class*='ws-checkbox']")
    private WebElement checkboxHIPAA;

    @FindBy (css = "[label='Your Phone Number']")
    private WebElement phoneNumberElement;

    @FindBy (xpath = "//button[text()='Sign Up']")
    private WebElement signUpButton;

    @FindBy (css = "[placeholder='Password']")
    private WebElement passwordField;

    @FindBy (css = "[placeholder='Zipcode']")
    private WebElement zip;


    public SignUpPage(WebDriver myDriver) {
        super(myDriver);
    }


    public void openSignUpPage() {

        driver.get("https://test.woahstork.com/register");
    }

    public void clickCheckboxTermsAndConditions() {

        checkboxTermsAndConditions.click();
    }

    public void clickCheckboxHIPAA () {

       checkboxHIPAA.click();
    }

    public WebElement getPhoneNumberElement() {

        return phoneNumberElement;
    }

    public String getRandomEmail() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime() + "@gmail.com";

    }

    public HomePage clickToLoginButton(){
        signUpButton.click();
        return new HomePage(driver);
    }

    public void setEmailField(String email){
        wait.until(ExpectedConditions.visibilityOf(emailField)).sendKeys(email);
    }

    public void setPasswordField(String password){
        passwordField.sendKeys(password);
    }

    public void setConfirmPasswordField(String password){
         passwordField.sendKeys(password);
    }

    public void setZipCode(String zipcode){
         zip.sendKeys(zipcode);
    }


}
