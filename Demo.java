package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		 
		 WebElement time = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
		 
		 Select select = new Select(time);
		 select.selectByVisibleText("December");
		 
		 System.out.println((driver.findElement(By.xpath("//*[@class='page-title']//*[text()='Register']")).isDisplayed()));
		 
		 
		 
	}

}
