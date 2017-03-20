package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/swethareddyamireddy/Downloads/chromedriver-1" );
		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("http://www.google.com/maps");
		Driver.findElement(By.cssSelector("#searchboxinput")).sendKeys("3525 country square drive apt e202,carrollton,texas,75006");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.findElement(By.cssSelector("#searchbox-searchbutton")).click();
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.findElement(By.cssSelector("#pane > div > div.widget-pane-content.scrollable-y > div > div > div.section-hero-header.white-foreground > button.section-hero-header-directions.noprint > div")).click();
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.findElement(By.cssSelector("#sb_ifc51 > input")).sendKeys("40013 fremont blvd,fremont,california");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Driver.findElement(By.cssSelector("#omnibox-directions > div > div.widget-directions-travel-mode-switcher-container > div > div > div.adjusted-to-decreased-spacing.directions-travel-mode-selector > div:nth-child(2) > button > div.directions-travel-mode-icon.directions-drive-icon")).click();
	Driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	Driver.findElement(By.cssSelector("#pane > div > div.widget-pane-content.scrollable-y > div > div > div.section-directions-options.white-foreground.noprint > button.section-directions-options-link > span:nth-child(1)")).click();
	Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Driver.findElement(By.cssSelector("#pane > div > div.widget-pane-content.scrollable-y > div > div > div.section-directions-options.white-foreground.noprint > div.section-directions-options-route-options.route-options-card > div > div.directions-options-drive > div:nth-child(1) > label:nth-child(6)")).click();
	
	
		
		
		
	}

}
