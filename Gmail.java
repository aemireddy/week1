package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/swethareddyamireddy/Downloads/chromedriver-1" );
		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("http://mail.google.com");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.findElement(By.cssSelector("#Email")).sendKeys("automationfunworld@gmail.com");
		Driver.findElement(By.cssSelector("#next")).click();
		Driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Driver.findElement(By.cssSelector("#Passwd")).sendKeys("automation2016");
		Driver.findElement(By.cssSelector("#signIn")).click();
		
		Driver.close();
		Driver.quit();
		
		
		
		
		
		
		
		
	}

}
