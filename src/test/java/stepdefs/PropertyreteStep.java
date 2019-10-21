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


//        MobileElement greeting = driver.findElement(By.className("com.ebay.mobile:i/text_google_sign-in_greeting"));
//        Assert.assertTrue(greeting.isDispayed());
//        Assert.assertTrue(greeting.getText().contains("email" +
        // ""));
    }

    @And("^an error message was received$")
    public void anErrorMessageWasReceived() {

        Assert.assertEquals(driver.findElement(By.id("dng_id")).getText(), "The Captcha field is required.");
    }
}


//    @And("^I receive a popup message advising about receipt of activation code via sms$")
//    public void iReceiveAPopupMessageAdvisingAboutReceiptOfActivationCodeViaSms() {
//
//    }
//
//    @And("^I receive activation code via sms$")
//    public void iReceiveActivationCodeViaSms() {
//
//    }
//
//    @And("^iI click on the link sent to via sms$")
//    public void iiClickOnTheLinkSentToViaSms() {
//
//    }
//
//    @And("^I enter the code in the activation code field$")
//    public void iEnterTheCodeInTheActivationCodeField() {
//
//    }
//
//    @And("^I click on activate account button$")
//    public void iClickOnActivateAccountButton() {
//
//    }
//
//    @Then("^I am  not registered$")
//    public void iAmNotRegistered() {
      //  String Captcha = driver.findElement(By.id("dng_id")).

     //   Assert.assertEquals(driver.findElement(By.id("dng_id")).getText(),"The Captcha field is required.");
    //}



//    @And("^an error message was received$")
//    public void anErrorMessageWasReceived() {
//          WebElement Captcha= driver.findElement(By.xpath("/html/body/section/section[1]/div/figure/div[3]/div[2]/form/div[9]/span/p") );
//         Assert.assertEquals(driver.findElement(By.xpath("/html/body/section/section[1]/div/figure/div[3]/div[2]/form/div[9]/span/p")).getText(),""
//    }
//}

//    @Then("^the account is not created$")
//    public void theAccountIsNotCreated() {
//
//    }
//
//    @And("^I leave the firstname box blank$")
//    public void iLeaveTheFirstnameBoxBlank() {
//
//    }
//
//    @And("^I leave lastname box blank$")
//    public void iLeaveLastnameBoxBlank() {
//    }
//
//    @And("^I leave email blank$")
//    public void iLeaveEmailBlank() {
//    }
//
//    @And("^I leave country flag unselected$")
//    public void iLeaveCountryFlagUnselected() {
//    }
//
//    @And("^I leave  phone number blank$")
//    public void iLeavePhoneNumberBlank() {
//    }
//
//    @And("^I leave password blank$")
//    public void iLeavePasswordBlank() {
//    }
//
//    @And("^I  leave confirm password blank$")
//    public void iLeaveConfirmPasswordBlank() {
//    }
//
//    @And("^i click on create account button$")
//    public void iClickOnCreateAccountButton() {
//    }
//
//    @Then("^the accpount is not created$")
//    public void theAccpountIsNotCreated() {
//    }
//
//     @And("^I leave the firstname box blank$")
//     public void iLeaveTheFirstnameBoxBlank() {
//
//        driver.findElement(By.id("first_name")).sendKeys("");
//     }
//
//    @And("^I leave lastname box blank$")
//    public void iLeaveLastnameBoxBlank() {
//        driver.findElement(By.name("last_name")).sendKeys("");
//    }
//
//    @And("^I leave email blank$")
//    public void iLeaveEmailBlank() {
//        driver.findElement(By.id("email")).sendKeys("");
//    }
//    @And("^I leave country flag unselected$")
//    public void iLeaveCountryFlagUnselected() {
//       driver.findElement(By.className("selected-flag")).sendKeys("");
//    }
//
//
//
//    @And("^I leave  phone number blank$")
//    public void iLeavePhoneNumberBlank() {
//        driver.findElement(By.name("mobile")).sendKeys("");
//    }
//
//    @And("^I leave password blank$")
//    public void iLeavePasswordBlank() {
//        driver.findElement(By.id("password")).sendKeys("");
//    }
//
//    @And("^I  leave confirm password blank$")
//    public void iLeaveConfirmPasswordBlank() {
//        driver.findElement(By.name("confirm_password")).sendKeys("");
//    }
//
//    @And("^i click on create account button$")
//    public void iClickOnCreateAccountButton() {
//        driver.findElement(By.id("btn_register")).click();
//    }
//
//    @Then("^the accpount is not created$")
//    public void theAccpountIsNotCreated() {
//    }
//
//    @And("^I enter firstname$")
//    public void iEnterFirstname() {
//        driver.findElement(By.id("first_name")).sendKeys("Kudirat");
//    }
//
//    @And("^I enter lastname$")
//    public void iEnterLastname() {
//        driver.findElement(By.name("last_name")).sendKeys("Ajimajasan");
//    }
//
//    @And("^I enter email$")
//    public void iEnterEmail() {
//        driver.findElement(By.id("email")).sendKeys("kudyajimajasan@yahoo.com");
//    }
//
//    @And("^I select country flag$")
//    public void iSelectCountryFlag() {
//        driver.findElement(By.className("selected-flag")).sendKeys("united kingdom");
//    }
//
//    @And("^I enter  phone number$")
//    public void iEnterPhoneNumber() {
//        driver.findElement(By.name("mobile")).sendKeys("+447578446563");
//    }
//
//    @And("^I enter password$")
//    public void iEnterPassword() {
//        driver.findElement(By.id("password")).sendKeys("korede");
//    }
//
//    @And("^I enter incorrect  password$")
//    public void iEnterIncorrectPassword() {
//        driver.findElement(By.name("confirm_password")).sendKeys("korede");
//    }
//
//    @And("^I click on create account button$")
//    public void iClickOnCreateAccountButton() {
//        driver.findElement(By.id("btn_register")).click();
//    }
//
//    @Then("^the account is not created$")
//    public void theAccountIsNotCreated() {
//
//    }
//}
//
////
////
//
//
























