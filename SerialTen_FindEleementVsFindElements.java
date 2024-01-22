import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SerialTen_FindEleementVsFindElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.via.com/hotels");
		//findElement return single element
		//case-1
		//driver.findElement(By.id("destination")).sendKeys("bali");
		
		
		//multiple element return single element
//		WebElement text=driver.findElement(By.xpath("//div[@class='footer']//a"));
//		System.out.println(text.getText());
		
		//mising element return error
		//driver.findElement(By.xpath("//img[@title='Maldive']")).click();
		
		//findElements
//		List <WebElement> texts=driver.findElements(By.xpath("//div[@class='footer']//a"));
//		System.out.println(texts.size());
//		
//		for(WebElement text:texts)
//		{
//			System.out.println(text.getText());
//		}
		
		//missing elements return 0
		List <WebElement> texts=driver.findElements(By.xpath("//span[normalize-space()='Flight']"));
		
		System.out.println(texts.size());

	}

}
