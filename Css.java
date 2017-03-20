package project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "/Users/swethareddyamireddy/Downloads/chromedriver-1");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://login.salesforcve.com/");
		driver.findElement(By.cssSelector("[class='identity first']")).sendKeys("fewrew");
driver.findElement(By.cssSelector(".identify.last"));


		
		
				
	}

}
