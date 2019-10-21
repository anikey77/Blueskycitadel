package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class PropertyreteStep {
    //STEP1: declare webdriver
    WebDriver driver;


    @Given("^I navigate to propertyrete site$")
    public void i_navigate_to_propertyrete_site() throws Throwable {
        // STEP 2: set your system path
        System.setProperty("webdriver.gecko.driver", "D:\\Blueskycitadel\\firefox\\geckodriver.exe");
        //Step 3: Instantiate your firefox driver
        driver = new FirefoxDriver();
        //STEP 4: Navigate to url
        driver.get("https://www.propertyrete.com");

    }

    @When("^I click on register button$")
    public void i_click_on_register_button() throws Throwable {
        driver.findElement(By.xpath("/html/body/section[1]/nav/div[1]/a[1]")).click();
    }


    @When("^I enter firstname$")
    public void i_enter_firstname() throws Throwable {
        driver.findElement(By.id("first_name")).sendKeys("Kudirat");
    }

    @When("^I enter lastname$")
    public void i_enter_lastname() throws Throwable {
        driver.findElement(By.name("last_name")).sendKeys("Ajimajasan");
    }

    @And("^I enter email$")
    public void iEnterEmail() throws Throwable {
        driver.findElement(By.id("email")).sendKeys("kudyajimajasan@yahoo.com");
    }

    @And("^I select country flag$")
    public void iSelectCountryFlag() throws InterruptedException {
        // driver.findElement(By.className("selected-flag")).sendKeys("united kingdom");
        driver.findElement(By.cssSelector(".selected-flag")).click();
        driver.findElement(By.cssSelector(".iti-flag.gb")).click();
    }


    @And("^I enter  phone number$")
    public void iEnterPhoneNumber() {

        driver.findElement(By.name("mobile")).sendKeys("+447578446563");
    }

    @When("^I enter password$")
    public void i_enter_password() throws Throwable {
        driver.findElement(By.id("password")).sendKeys("korede");
    }

    @And("^I confirm password$")
    public void iConfirmPassword() {
        driver.findElement(By.name("confirm_password")).sendKeys("korede");

    }


    @And("^I click on create account button$")
    public void iClickOnCreateAccountButton() {
        driver.findElement(By.id("btn_register")).click();


    @And("^an error message was received$")
    public void anErrorMessageWasReceived() {

        Assert.assertEquals(driver.findElement(By.id("dng_id")).getText(), "The Captcha field is required.");
    }
}



























