package alerts.alerts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class class1 {
	static WebDriver alert1;

	
	@BeforeSuite
	
	
	
	public static void test() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver.exe");
		
		 alert1 = new ChromeDriver();
		 
		 alert1.manage().window().maximize();
		
		
	}
	
	@Test
	
	public static void note() throws Exception{
		
	alert1.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
	
	alert1.findElement(By.xpath("//div/span/a[text()='ACCEPT']")).click();
		
		//Thread.sleep(5000);
		
		alert1.findElement(By.xpath("//p[3]/button[text()='Simple Alert']")).click();

		WebDriverWait wait = new WebDriverWait(alert1,10);
		wait.until(ExpectedConditions.alertIsPresent());
		
		//Thread.sleep(5000);
		
		Alert just= alert1.switchTo().alert();
		
		System.out.println(just.getText());
		
		just.accept();
		
		
		/*click.navigate().to("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		String obj = click.findElement(By.xpath("//span/span[text()='HOME']")).getText();
		
		String exp="TOOLS";
		
		assertEquals(obj,exp);
		
		*/
	}


		
	}


