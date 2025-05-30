package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginSteps {
    WebDriver driver;
    
    LoginPage loginPage;

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
        } else {
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        }
    
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        loginPage = new LoginPage(driver);
    }
    

    @When("User click makeAppointment")
    public void user_click_makeAppointment() {
        loginPage.makeAppointment();
    }

    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        loginPage.enterUsername("John Doe");
        loginPage.enterPassword("ThisIsNotAPassword");
    }

    @And("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        loginPage.clickLogin();
    }

    @Then("User should be redirected to the homepage")
    public void user_should_be_redirected_to_the_homepage() {
        String title = driver.getTitle();
        assert title.equals("Home");
        driver.quit();
    }
}
