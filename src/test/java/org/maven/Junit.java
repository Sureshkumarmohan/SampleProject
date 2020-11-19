package org.maven;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {

	
	
    @Test
    public void method2() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\MavenTest\\Driver\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.facebook.com/");
    	
    	
    }
    
    
	}


