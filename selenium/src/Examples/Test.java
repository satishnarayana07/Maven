package Examples;

//package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {
	
	 WebDriver wd;
	 
	 //ChromeOptions ch=new ChromeOptions();
	
	void openChrome()throws Exception
	{
		WebDriver wd=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		wd.get("https://gmail.com");
		System.out.println(wd.getTitle());
	Thread.sleep(3000);
		wd.close();
		
	}
	
}

class Main_Test{

	public static void main(String[] args) throws Exception {
		
     Test t=new Test();
      t.openChrome();
	}

}

