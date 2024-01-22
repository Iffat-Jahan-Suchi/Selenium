

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SerialFourteen_MouseHover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions item=new Actions(driver);
		WebElement element=driver.findElement(By.id("nav-link-accountList"));
//		item.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click()
//		.keyDown(Keys.SHIFT).sendKeys("mobile").build().perform();
		
		//double click
		item.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click()
		.keyDown(Keys.SHIFT).sendKeys("mobile").doubleClick().build().perform();
		
		//item.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		//rightClick
		item.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
		

	}

}
