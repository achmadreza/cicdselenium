package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
//test ini
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void makeAppointment(){
        driver.findElement(By.id("btn-make-appointment")).click();
    }

    public void enterUsername(String username) {
        driver.findElement(By.id("txt-username")).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("txt-password")).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(By.id("btn-login")).click();
    }
}
