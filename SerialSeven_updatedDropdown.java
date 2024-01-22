import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SerialSeven_updatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.easemytrip.com/flights.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='spnTraveller']")).click();
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.xpath("//div[@id='field1']//button[@id='add']")).click();
		}
		Thread.sleep(5000);
		for(int i=5;i>1;i--)
		{
			driver.findElement(By.xpath("//button[@id='asub']")).click();
		}

	}

}
