package Stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.bind.SchemaOutputResolver;

public class LoginStepDefinitions {

    WebDriver driver;
    @Given("^User able to open Browser$")
    public void user_able_to_open_Browser()  {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Given("^Enter Url$")
    public void enter_Url()  {
        driver.get("https://demo.nopcommerce.com/");

    }

    @When("^User click on Login Link$")
    public void user_click_on_Login_Link()  {
        driver.findElement(By.className("ico-login")).click();

    }

    @Then("^User on Login Page and Verify page Title$")
    public void user_on_Login_Page_and_Verify_page_Title() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce demo store. Login", title);

    }

    @Then("^User enter username and password and click on login button$")
    public void user_enter_username_and_password_and_click_on_login_button() {
        driver.findElement(By.id("Email")).sendKeys("hemant894@googlemail.com");
        driver.findElement(By.id("Password")).sendKeys("Tester1234");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

    }

    @Then("^User is on Home Page$")
    public void user_is_on_Home_Page()  {
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).click();
    }

    @Then("^User close the browser$")
    public void user_close_the_browser()  {
        driver.quit();

    }

}
