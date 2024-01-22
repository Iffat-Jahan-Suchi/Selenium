import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SerialNine_jsAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("abc");
		driver.switchTo().alert().accept();
		
		//autheticattion alert
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//		Thread.sleep(4000);
//		driver.switchTo().alert().accept();
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//		Alert window=driver.switchTo().alert();
//		System.out.println(window.getText());
//		window.dismiss();
//		Thread.sleep(4000);
		
		//alert input field
		
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
//		Thread.sleep(3000);
//		Alert alertWindow=driver.switchTo().alert();
//		System.out.println(alertWindow.getText());
//		Thread.sleep(3000);
//		alertWindow.sendKeys("java");
//		//alertWindow.accept();
//		alertWindow.dismiss();

		
		
		

	}

}
