package alerts.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class class2 {
	
	static WebDriver pen;
	
	@BeforeSuite
	
	public static void well() throws Exception{
		
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\chromedriver.exe");
		
		pen = new ChromeDriver();
		
		pen.manage().window().maximize();
		
	}
	
	@Test
	public static void time()  throws Exception{
		
		pen.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		pen.findElement(By.xpath("//div/span/a[text()='ACCEPT']")).click();
		
		pen.findElement(By.xpath("//p[7]/button[text()='Confirm Pop up']")).click();
		
		WebDriverWait hold = new WebDriverWait(pen,10);
		
		hold.until(ExpectedConditions.alertIsPresent());
		
	//	Thread.sleep(6000);
		
		 Alert paint=pen.switchTo().alert();
		 
		 System.out.println(paint.getText());
		 
		  paint.dismiss();
		
		
	}

}
