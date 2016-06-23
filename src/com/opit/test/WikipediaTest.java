package com.opit.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WikipediaTest {
	public WebDriver driver;
	public String baseURL;
	
	@Before
	public void setUp() throws Exception {
		//opening the browser
		System.getProperty("C:\\Users\\Sunil\\Documents\\Jars_and_Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		//Implicit wait: GLobla wait applies to all elements on a page
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		//driver.close();
	}

	@Test
	public void testWikipediaSearch() {
	
		baseURL="http://www.wikipedia.org";
		
		driver.get(baseURL);
		//driver.get("http://www.wikipedia.org");
		WebElement searchBox=driver.findElement(By.id("searchInput"));
		//driver.findElement(By.id("Golden State Warriers"));
		
		//WebElement searchBox = driver.findElement(By.xpath("//input[name='search]"))
		
		searchBox.sendKeys("Golden State Warriers");
	}

}
