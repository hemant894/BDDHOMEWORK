package Stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.zh_cn.但是;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class RegisterStepDefinitions {

    WebDriver driver;

    @When("^User click on Register Link$")
    public void user_click_on_Register_Link()  {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.className("ico-register")).click();

    }

    @Then("^User Select the Gender$")
    public void user_Select_the_Gender()  {
        driver.findElement(By.id("gender-male")).click();

    }
    @Then("^user Enter First Name$")
    public void user_Enter_First_Name() {
        driver.findElement(By.id("FirstName")).sendKeys("Hemant");


    }

    @Then("^User Enter Last Name$")
    public void user_Enter_Last_Name()  {
        driver.findElement(By.id("LastName")).sendKeys("patel");

    }

    @Then("^User Enter DOB  Day$")
    public void user_Enter_DOB_Day()  {
        driver.findElement(By.className("valid")).sendKeys("2");


    }

    @Then("^User Enter DOB Month$")
    public void user_Enter_DOB_Month()  {
        driver.findElement(By.className("valid")).sendKeys("May");

    }

    @Then("^User Enter DOB Year$")
    public void user_Enter_DOB_Year()  {
        driver.findElement(By.className("valid")).sendKeys("1986");

    }

    @Then("^User Enter Email$")
    public void user_Enter_Email() {
        driver.findElement(By.id("Email")).sendKeys("hemant894@google.mail");
    }


    @Then("^User Enter Company Name$")
    public void user_Enter_Company_Name()  {
        driver.findElement(By.id("Company")).sendKeys("TESTER");


    }

    @Then("^User Select Newsletter$")
    public void user_Select_Newsletter()  {
        driver.findElement(By.id("Newsletter")).click();


    }

    @Then("^User enter Password$")
    public void user_enter_Password()  {
        driver.findElement(By.id("Password")).sendKeys("Tester1234");

    }

    @Then("^User enter Confirm Password$")
    public void user_enter_Confirm_Password()  {
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Tester1234");

    }

    @Then("^User click on Register$")
    public void user_click_on_Register() {
        driver.findElement(By.id("register-button")).click();


    }

}

