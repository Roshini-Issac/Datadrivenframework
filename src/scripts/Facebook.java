package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	static
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("roshini.busybee@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Forever1309");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		String t=driver.getTitle();
		System.out.println(t);
		String u=driver.getCurrentUrl();
		System.out.println(u);
		if(t.equals("Facebook"))
		{
			System.out.println("Pass: home page is Displayed");
		}
		else
		{
			System.out.println("Fail: home page is not Displayed");
		}
		
	}
}
