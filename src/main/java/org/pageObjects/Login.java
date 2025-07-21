package org.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Login {
    WebDriver driverr;
    WebDriverWait wait;

    public Login(WebDriver driver){
        this.driverr=driver;
        this.wait=new WebDriverWait(driverr, Duration.ofSeconds(30));
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="Email")
    private WebElement emailTextfield;
    @FindBy(id="Password")
    private WebElement passwordTextfield;
    @FindBy(xpath="//button[@type=\"submit\"]")
    private WebElement logInButton;
    @FindBy(xpath = "//a[@href=\"/logout\"]")
    private WebElement logoutButton;
    @FindBy(id = "loadCustomerStatisticsAlert-action-alert")
    private WebElement popupModal;
    @FindBy(xpath = "//div[@id='loadCustomerStatisticsAlert-action-alert']//button[contains(@class,'close')]")
    private WebElement popupCloseButton;


    public void UserNameTextfield(String username) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(emailTextfield));
        emailTextfield.clear();
        emailTextfield.sendKeys(username);
    }
    public void PasswordTextfield(String pwd) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(passwordTextfield));
        passwordTextfield.clear();
        passwordTextfield.sendKeys(pwd);
    }
    public void clickloginButton() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(logInButton));
        logInButton.click();
    }
    public void clickLogOutButton() {
        try {
            // Check if popup is present and close it
            if (popupModal.isDisplayed()) {
                System.out.println("Popup detected. Attempting to close it...");
                popupCloseButton.click();
                wait.until(ExpectedConditions.invisibilityOf(popupModal));
            }

            wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
            logoutButton.click();
            System.out.println("Logged out successfully.");
        } catch (Exception e) {
            System.out.println("Error while logging out: " + e.getMessage());
        }
    }

}
