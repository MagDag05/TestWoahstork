package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver myDriver) {
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver = myDriver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver,4);

    }

    protected WebElement findElement(String cssLocator) {
        return wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssLocator)));
    }
}
