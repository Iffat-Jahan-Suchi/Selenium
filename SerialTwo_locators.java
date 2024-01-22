import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SerialTwo_locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(5000);
		//name and claaName locator
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.className("oxd-button")).click();
		
		//Id
		//driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(5000);
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
		
		//className
//		Thread.sleep(5000);
//		driver.findElement(By.className("form_input")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.className("btn_action")).click();
		
		// cssSelector by class=tagname.class
//		driver.findElement(By.cssSelector("input.form_input")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.cssSelector("input.btn_action")).click();
//		
		//css selector by id=tagname#id
//		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
//		driver.findElement(By.cssSelector("input#login-button")).click();
		
		//tagname=tagname[attribute='value']
//		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");
//		driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
		
		//xpath //tagname=[@attribute='value']
//		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		//link test and partial link test ForgetPass
//		driver.get("https://member.daraz.com.bd/user/login?spm=a2a0e.home.header.d5.735212f7can3yI&redirect=https%3A%2F%2Fwww.daraz.com.bd%2F");
//		driver.findElement(By.linkText("Reset Your Password")).click();
		//partial link
		driver.get("https://member.daraz.com.bd/user/login?spm=a2a0e.home.header.d5.735212f7can3yI&redirect=https%3A%2F%2Fwww.daraz.com.bd%2F");
		driver.findElement(By.partialLinkText("Reset")).click();

		
		
		

	}

}
