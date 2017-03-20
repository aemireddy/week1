package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","/Users/swethareddyamireddy/Downloads/chromedriver-1" );
WebDriver driver=new ChromeDriver();
driver.get("http://www.facebook.com");
driver.findElement(By.cssSelector("#email")).sendKeys("pandureddy145@gmail.com");
driver.findElement(By.cssSelector("#pass")).sendKeys("1234swetha");
driver.findElement(By.cssSelector("#u_0_q")).click();
driver.findElement(By.cssSelector("#loginform > div._wp9 > a")).click();
driver.findElement(By.cssSelector("#initiate_interstitial > div.uiInterstitialBar.uiBoxGray.topborder > div > div.pts > a")).click();
driver.findElement(By.cssSelector("#u_0_0")).click();



	}

}
