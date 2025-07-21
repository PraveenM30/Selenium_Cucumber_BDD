package stepDefination;

import io.cucumber.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSteps {

    WebDriver driver;

    @Given("I launch the chrome browser")
    public void launchBrowser() {
        driver = new ChromeDriver();
    }

    @When("I open Google Home page")
    public void navigateToHomePage() {
        driver.get("https://www.google.com/");
    }

    @Then("I verify the logo in home page")
    public void VerifyLogo() {
        boolean status = driver.findElement(By.xpath("//*[@class=\"lnXdpd\"]")).isDisplayed();
        Assert.assertEquals(true, status);
    }

    @Then("I close the Browser")
    public void closeBrowser() {
        driver.quit();
    }

}
