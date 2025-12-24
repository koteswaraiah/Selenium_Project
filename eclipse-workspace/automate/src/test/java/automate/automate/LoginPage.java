package automate.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	 WebDriver driver;

	    public LoginPage(WebDriver driver){
	        this.driver = driver;
	    }
	    
	    

	    By usernameField = By.id("username");
	    By passwordField = By.id("password");
	    
	    By loginButton = By.id("loginButton");
	    By welcomeMessage = By.id("welcomeMessage");

	    public void enterUsername(String username){
	        driver.findElement(usernameField).sendKeys(username);
	    }

	    public void enterPassword(String password){
	        driver.findElement(passwordField).sendKeys(password);
	    }

	    public void clickLogin(){
	        driver.findElement(loginButton).click();
	    }

	    public boolean isWelcomeMessageDisplayed(){
	        return driver.findElement(welcomeMessage).isDisplayed();
	    }

}
