package day1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SalesForce {
	WebDriver driver;
	@BeforeMethod
    public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mehir\\eclipse-workspace\\JetBlue\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login.salesforce.com/");
        
	}
	
	
	@Test
	public void Stringrgs() {
		System.out.println("Got results");
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("123456");
		//driver.findElement(By.className("button r4 wide primary")).click();//Error
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());

		
}
}