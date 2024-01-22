import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SerialThree_dropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//		driver.get("https://in.via.com/hotels");
//		WebElement selectOption=driver.findElement(By.xpath("//select[@id='nationalityCountry']"));
//		Select dropDown=new Select(selectOption);
//		dropDown.selectByIndex(3);
//		System.out.println(dropDown.getFirstSelectedOption().getText());
//		dropDown.selectByVisibleText("Italy");
//		System.out.println(dropDown.getFirstSelectedOption().getText());
		driver.get("https://www.facebook.com/signup");
		WebElement selectOption=driver.findElement(By.xpath("//select[@id='day']"));
		Select dropdown=new Select(selectOption);
		//selectByIndex
//		dropdown.selectByIndex(4);
//		System.out.println(dropdown.getFirstSelectedOption().getText());

		//selectByVisibleText
		//dropdown.selectByVisibleText("5");
		//selectByvalue
		dropdown.selectByValue("6");
		
		

	}

}
