import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SerialFour_dynamicdropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		driver.findElement(By.xpath("(//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT'])[1]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='Hyderabad (HYD)'])[1]")).click();
		driver.findElement(By.xpath("(//a[@value='UDR'][normalize-space()='Udaipur (UDR)'])[2]")).click();
		
		

	}

}
