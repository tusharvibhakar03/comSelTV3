package testsuite;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends Utility {

    String baseUrl = "http://the-internet.herokuapp.com/login";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    public String getTextFromElement(By by) {
        WebElement actualTextMessageElement = driver.findElement(by);
        return actualTextMessageElement.getText();
    }

    @Test
    public void LoginSucessfully() {
        WebElement Username = driver.findElement(By.name("username"));
        Username.sendKeys("tomsmith");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword!");

        WebElement Loginbutton = driver.findElement(By.xpath("//i[@class=\"fa fa-2x fa-sign-in\"]"));
        Loginbutton.click();


    }

    @Test
    public void LoginunSucessfully() {
        WebElement Username = driver.findElement(By.name("username"));
        Username.sendKeys("tomsmith1");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword!");

        WebElement Loginbutton = driver.findElement(By.xpath("//i[@class=\"fa fa-2x fa-sign-in\"]"));
        Loginbutton.click();


    }
    @Test
    public void LoginunSucessfully1() {
        WebElement Username = driver.findElement(By.name("username"));
        Username.sendKeys("tomsmith");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword");

        WebElement Loginbutton = driver.findElement(By.xpath("//i[@class=\"fa fa-2x fa-sign-in\"]"));
        Loginbutton.click();


    }



}