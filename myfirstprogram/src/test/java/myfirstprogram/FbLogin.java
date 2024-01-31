package myfirstprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLogin {
	
	WebDriver driver;
	
	@Test(priority=1)
	void openBrowser() {
		//System.setProperty("webdriver.gecko.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle()+ "\t opened in chrome");
		}
	
	@Test(priority=2)
	void login() throws Exception {
		
		
		driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span/span")).click();
		driver.findElement(By.xpath("//input[@id='ap_email'][@name='email']")).sendKeys("satishnarayana.k@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sambasiva_09");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		System.out.println("log in successful");
		Thread.sleep(6000);
		
		
		
		//driver.findElement(By.xpath("//span[contains(@class,'nav-action-inner')]")).click();
		/*facebook login
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kakimukkala.satishnarayana@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("satish_09");
		driver.findElement(By.xpath("//button[@name='login']")).click();*/
		Thread.sleep(10000);
		
	}
		
	
	@Test(priority=3)
void closeBrowser() {
	driver.quit();
	System.out.println("Browser has been closed");
	
}

}
