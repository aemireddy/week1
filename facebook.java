package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/swethareddyamireddy/Downloads/chromedriver-1" );
		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("http://www.facebook.com");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.findElement(By.cssSelector("#u_0_1")).sendKeys("swetha");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.findElement(By.cssSelector("#u_0_3")).sendKeys("reddy");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.findElement(By.cssSelector("#u_0_6")).sendKeys("7075079828");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.findElement(By.cssSelector("#u_0_9")).sendKeys("7075079828");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.findElement(By.cssSelector("#u_0_d")).sendKeys("7075079828");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.findElement(By.cssSelector("#month")).click();
		Driver.close();
		Driver.quit();
		
		
		
		
		
	}

}
