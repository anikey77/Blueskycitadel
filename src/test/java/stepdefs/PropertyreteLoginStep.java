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


    //    @And("^I click on sign in botton$")
//    public void iClickOnSignInBotton() {
//        driver.findElement(By.xpath("/html/body/section/section[1]/div/figure/ul/li[1]")).click();
//    }
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


//    @And("^welcome message displayed$")
//    public void welcomeMessageDisplayed() {

}


//    @And("^I enter valid password$")
//    public void iEnterValidPassword() {
//
//    }
//    @And("^I enter valid email \"([^\"]*)\"\"([^\"]*)\"$")
//    public void iEnterValidEmail(String arg0, String arg1) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//*/
//
//    @And("^I enter valid email \"([^\"]*)\" password \"([^\"]*)\"$")
//    public void iEnterValidEmail(String email) throws Throwable {
//        driver.findElement(By.id("user_email")).sendKeys("email");
//
//    }
//    @And("^I enter valid  password \"([^\"]*)\"$")
//    public void iEnterValidPassword(String password) throws Throwable {
//        driver.findElement(By.id("user_password")).sendKeys("password");
//
//
//    }
//
//    @And("^I click on sign in$")
//    public void iClickOnSignIn() {
//        driver.findElement(By.id("btn_signin")).click();
////       }
//    }
//
//    @Then("^I am logged in$")
//    public void iAmLoggedIn() {
////        Assert.assertEquals(driver.findElement(By.id(""));
//    }
//
//
//
//    }
//
//


//    @And("^I enter invalid email$")
//    public void iEnterInvalidEmail() {
//    }
//
//    @And("^I enter valid password$")
//    public void iEnterValidPassword() {
//    }
//
//    @Then("^I am not logged in$")
//    public void iAmNotLoggedIn() {
//    }
//}


//    @And("^I enter valid password \"([^\"]*)\"$")
//    public void iEnterValidPassword(String arg0) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();








    //@And("^I enter incorrect  password$")
    //public void iEnterIncorrectPassword() {
    //}
//}




//    @When("^I click on loggin button$")
//    public void i_click_on_loggin_button() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @When("^I leave email blank$")
//    public void i_leave_email_blank() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @When("^I leave password blank$")
//    public void i_leave_password_blank() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @When("^I click on sign in button$")
//    public void i_click_on_sign_in_button() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @Then("^I am not logged in$")
//    public void i_am_not_logged_in() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @When("^I enter wrong email$")
//    public void i_enter_wrong_email() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @When("^I enter valid password$")
//    public void i_enter_valid_password() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @When("^I enter valid email$")
//    public void i_enter_valid_email() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @When("^I enter Wrong password$")
//    public void i_enter_Wrong_password() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @When("^I click on forgotten password$")
//    public void i_click_on_forgotten_password() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @When("^I click on password reset link$")
//    public void i_click_on_password_reset_link() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @When("^i reset my password$")
//    public void i_reset_my_password() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @When("^I enter wrong password$")
//    public void i_enter_wrong_password() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//
//    @Then("^I am logged in$")
//    public void iAmLoggedIn() {
//    }
//}


