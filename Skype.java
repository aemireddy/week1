package project;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/swethareddyamireddy/Downloads/chromedriver-1" );
		WebDriver Driver = new ChromeDriver();

Driver.navigate().to("http://login.skype.com/");
Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
Driver.findElement(By.cssSelector("#username")).sendKeys("4089165324");
Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
Driver.findElement(By.cssSelector("#signIn > span")).click();
Driver.findElement(By.cssSelector("#createNewAccount")).click();
Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
Driver.findElement(By.cssSelector("#MemberName")).sendKeys("me4swetha@gmail.com");
Driver.findElement(By.cssSelector("#Password")).sendKeys("Swetha@9963");
Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
Driver.findElement(By .cssSelector("#easiSwitch")).click();
Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
Driver.close();
Driver.quit();










	}

}
