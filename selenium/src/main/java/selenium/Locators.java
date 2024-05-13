package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public void verifyswaplaps()
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
		
	}
	
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
		WebElement loginfiled=driver.findElement(By.className("login-button"));
		loginfiled.click();
	}
	
	
	//Registration :"https://demo.guru99.com/test/newtours/register.php"
	
	public void VerifyDemo2Registration()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement firstname=driver.findElement(By.name("firstName"));
		firstname.sendKeys("arjun");
		WebElement lastname=driver.findElement(By.name("lastName"));
		lastname.sendKeys("das");
		WebElement phone=driver.findElement(By.name("phone"));
		phone.sendKeys("1234567891");
		WebElement email=driver.findElement(By.id("userName"));
		email.sendKeys("abcc@gmail.com");
		WebElement address=driver.findElement(By.name("address1"));
		address.sendKeys("abcd");
		WebElement city=driver.findElement(By.name("city"));
		city.sendKeys("kottayam");
		WebElement state=driver.findElement(By.name("state"));
		state.sendKeys("kerala");
		WebElement postal=driver.findElement(By.name("postalCode"));
		postal.sendKeys("656201");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("abcc@gmail.com");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("123456");
		WebElement Confrmpass=driver.findElement(By.name("confirmPassword"));
		Confrmpass.sendKeys("123456");
		WebElement submit=driver.findElement(By.name("submit"));
		submit.click();
	}

	// linktext
	public void VerifyLinkText()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		WebElement Destination=driver.findElement(By.linkText("your destination"));
		Destination.click();
		
	}
	
	
	//partiallinktext
	public void VerifyPartialLinkText()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		WebElement Destination=driver.findElement(By.partialLinkText("destination"));
		Destination.click();
	}
	
	
	//Demowebshop Absloutepath
	public void AbslouteXpath()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
		login.click();
		WebElement username=driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		username.sendKeys("RRRAmal@gmail.com");
		WebElement password=driver.findElement(By.xpath("//*[@id=\"Password\"]"));
		password.sendKeys("123456");
		WebElement loginbutton=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		loginbutton.click();
		
	}
	
	
	
	//DemoWebshop using css selectors
	public void CssSelectors() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.header > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a"));
	    login.click();
	    WebElement username=driver.findElement(By.cssSelector("#Email"));
	    username.sendKeys("RRRAmal@gmail.com");
	    WebElement passsword=driver.findElement(By.cssSelector("#Password"));
	    passsword.sendKeys("123456");
	    WebElement loginbutton=driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.customer-blocks > div.returning-wrapper > div.form-fields > form > div.buttons > input"));
		loginbutton.click();
		
	}	
	    
	public static void main(String[] args) {
	Locators obj=new Locators();
	//obj.verifyswaplaps();
	//obj.Verifydemoshop();
	//obj.VerifyDemo2Registration();
	//obj.VerifyLinkText();
	//obj.VerifyPartialLinkText();
	//obj.AbslouteXpath();
	obj.CssSelectors();
	

	}
	
	

}
