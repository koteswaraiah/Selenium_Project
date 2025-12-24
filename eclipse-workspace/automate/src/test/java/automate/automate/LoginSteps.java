package automate.automate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import io.cucumber.java.en.*;

public class LoginSteps {
	
       
	
	WebDriver driver;

@Given("launch browser {string}")
public void launch_browser(String url) {
	 driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get(url);
     driver.quit();
    
}


@When("practice locatorss")
public void practice_locatorss() {
   
}

@When("practice webElemt methods")
public void practice_web_elemt_methods() {
   
}

@When("practice webDriver methods")
public void practice_web_driver_methods() {
    
}

@When("practice radio and checkbox and table")
public void practice_radio_and_checkbox_and_table() {
   
}

@When("practice alerts and drag, drop and mouse hover actions")
public void practice_alerts_and_drag_drop_and_mouse_hover_actions() {
   
}

@When("practice waits and screen shot.")
public void practice_waits_and_screen_shot() {
   
}

@When("practice window handles and Iframes")
public void practice_window_handles_and_iframes() {
    
}







}
