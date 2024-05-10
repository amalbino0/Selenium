package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	/*public void verifyswaplaps()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement userNameField=driver.findElement(By.id("user-name"));
		userNameField.sendKeys("standard_user");
		WebElement passwordField=driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce");
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();
		
	}*/
	
	public void Verifydemoshop()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.className("ico-login"));
		login.click();
		WebElement emailfield=driver.findElement(By.id("Email"));
		emailfield.sendKeys("RRRAmal@gmail.com");
		WebElement Passwordfiled=driver.findElement(By.id("Password"));
		Passwordfiled.sendKeys("123456");
		WebElement loginfiled=driver.findElement(By.className("button-1 login-button"));
		loginfiled.click();
	}

	public static void main(String[] args) {
	Locators obj=new Locators();
	//obj.verifyswaplaps();
	obj.Verifydemoshop();
	

	}

}
