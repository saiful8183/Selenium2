package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test2 {

	public static void main(String[] args) {
	
		
		
		 







//System Property for Chrome Driver   
 System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Saiful Chowdhury\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");

	

    // Instantiate a ChromeDriver class.     
 WebDriver driver=new ChromeDriver();  
 
  // Launch Website  
driver.navigate().to("https://www.saucedemo.com/");  
 
//Maximize the browser  
 driver.manage().window().maximize();  

 driver.findElement(By.id("user-name")).sendKeys("standard_user");
 driver.findElement(By.id("password")).sendKeys("secret_sauce");
 
 driver.findElement(By.id("login-button")).click();

 
 //driver.close();

}

}




