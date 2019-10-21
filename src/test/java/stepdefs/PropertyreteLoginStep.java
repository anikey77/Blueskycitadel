package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class PropertyreteLoginStep {

    //STEP1: declare webdriver
    WebDriver driver;


    @Given("^I navigate to propertyrete website$")
    public void i_navigate_to_propertyrete_site() throws Throwable {
        System.setProperty("webdriver.gecko.driver", "D:\\Blueskycitadel\\firefox\\geckodriver.exe");
        //Step 3: Instantiate your firefox driver
        driver = new FirefoxDriver();
        //STEP 4: Navigate to url
        driver.get("https://www.propertyrete.com");
        // driver.manage().timeouts().implicitlyW}
    }

    @When("^I click on login button$")
    public void iClickOnLoginButton() {
        driver.findElement(By.xpath("/html/body/section/nav/div[1]/a[2]")).click();
    }
    @And("^I enter valid email \"([^\"]*)\"$")
    public void iEnterValidEmail(String Email) throws Throwable {
        driver.findElement(By.id("user_email")).sendKeys("johntrott727@yahoo.com");
    }

    @And("^I enter valid  password \"([^\"]*)\"$")
    public void iEnterValidPassword(String Password) throws Throwable {
        driver.findElement(By.id("user_password")).sendKeys("korede");
    }


    @And("^I click on sign in$")
    public void i_click_on_sign_in() throws Throwable {
        driver.findElement(By.id("btn_signin")).click();
    }

    @Then("^I am logged in$")
    public void i_am_logged_in() throws Throwable {
          Assert.assertEquals(driver.findElement(By.xpath("/html/body/section/nav/div[1]/a[1]")).getText(),"WELCOME: TROTT JOHN");
         // Assert.assertEquals(driver.findElement(By.xpath("/html/body/section/nav/ul/li[1]/a")).isDisplayed();
    }


