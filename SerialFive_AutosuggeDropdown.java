import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SerialFive_AutosuggeDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.via.com/hotels");
		driver.findElement(By.xpath("(//input[@id='destination'])[1]")).sendKeys("lo");
		Thread.sleep(4000);
		List <WebElement> elements=driver.findElements(By.xpath("//li[@class='ui-menu-item']//span"));
		for(WebElement element:elements)
		{
			if(element.getText().equalsIgnoreCase("Los Angeles,CA,United States of America")) {
				element.click();
				break;
			}
		}
//
	}

}
