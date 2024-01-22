import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SerialFifteen_linkCount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://docs.cypress.io/guides/overview/why-cypress");
		//total link size
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//footer link size
		WebElement elements=driver.findElement(By.xpath("//footer[@class='footer footer--dark']"));
		System.out.println(elements.findElements(By.tagName("a")).size());
		System.out.println(elements.findElements(By.xpath("//div[@class='row footer__links']//div[1]//ul[1]//li")).size());
		int a=elements.findElements(By.xpath("//div[@class='row footer__links']//div[1]//ul[1]//li")).size();
		
		
		
		//open link diff tab
		
		for(int i=0;i<3;i++)
		{
			String Onclick=Keys.chord(Keys.CONTROL,Keys.ENTER);
			elements.findElements(By.tagName("a")).get(i).sendKeys(Onclick);
		}
//		
		Set <String> wins=driver.getWindowHandles();
		java.util.Iterator<String> it=wins.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}

	}

}
