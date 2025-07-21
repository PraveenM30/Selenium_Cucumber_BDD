package stepDefination;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pageObjects.Login;

public class AdminDemo_Login {
    WebDriver driver;
    public Login lp;

    @Given("User launch chrome browser")
    public void user_launch_chrome_browser() {
        driver=new ChromeDriver();
        lp=new Login(driver);
       }
    @When("User opens URL {string}")
    public void user_opens_url(String URL) {
        driver.manage().window().maximize();
        driver.get(URL);

    }
    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_and_password(String UN, String PWD) throws InterruptedException {
    lp.UserNameTextfield(UN);
    lp.PasswordTextfield(PWD);
    }
    @When("Click on Login")
    public void click_on_login() throws InterruptedException {
    lp.clickloginButton();
    }
    @Then("Page title should be {string}")
    public void page_title_should_be(String ExpectedTitle) {
        String title=driver.getTitle();
        System.out.println("title is >>>>>>>>>"+ title);
        Assert.assertEquals(title,ExpectedTitle);
    }
    @When("User click on signOut button")
    public void user_click_on_sign_out_button() throws InterruptedException {
        lp.clickLogOutButton();
    }
    @Then("close the Browser")
    public void close_the_browser() {
   driver.close();
    }
}
