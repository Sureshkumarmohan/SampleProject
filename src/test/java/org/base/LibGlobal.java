package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal {
	public static WebDriver driver;
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\MavenTest\\Driver\\chromedriver.exe");
		driver =new ChromeDriver();
		
	}
		
	public static void enterUrl(String data) {
		driver.get(data);
		
	}
	
	public static void enterValue(WebElement element,String Value) {
		element.sendKeys(Value);
		
		
	}
	public static void btnclick(WebElement element) {
		element.click();
		
	}
	
	private void Scrollup(WebElement element) {
		element.sc
		

	}
	}

