package CrossBrowser_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFox_Opening {
  @Test
  public void f() {
	  
	  
	  System.setProperty("webdriver.gecko.driver", "F:\\Software Testing Notes\\QA\\geckodriver-v0.32.0-win64\\geckodriver.exe");
      
		 WebDriver driver=new FirefoxDriver();
			     
		 driver.get("https://demo.guru99.com/v4/");	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
