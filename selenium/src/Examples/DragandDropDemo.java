package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDropDemo {
	
	WebDriver driver;
	@Test
	void drop() throws Exception {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	   Thread.sleep(3000);
	   WebElement source=  driver.findElement(By.xpath("//div[@id='box6']"));
	   WebElement target=   driver.findElement(By.xpath("//div[text()='Italy']"));
	   Actions act=new Actions(driver);
	   //act.dragAndDrop(source, target).build().perform();
	   act.clickAndHold(source).moveToElement(target).release().build().perform();
	   

}
}
