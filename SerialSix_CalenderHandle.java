import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SerialSix_CalenderHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		driver.findElement(By.xpath("(//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT'])[1]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='Hyderabad (HYD)'])[1]")).click();
	driver.findElement(By.xpath("(//a[@value='UDR'][normalize-space()='Udaipur (UDR)'])[2]")).click();
		driver.findElement(By.className("ui-state-active")).click();
		//System.out.println(driver.findElement(By.id("custom_date_picker_id_2")).isEnabled());
		System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
		Thread.sleep(2000);
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).click();
		
		
	}

}
