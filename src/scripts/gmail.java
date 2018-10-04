

package scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
		static
		{
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			//open the browser
			
			WebDriver driver=new ChromeDriver();
			
			//enter the test url of the application
			driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	       
			//inspecting the elements of login page
	        driver.findElement(By.id("identifierId")).sendKeys("roshinitm95@gmail.com");
	        driver.findElement(By.xpath("//span[text()='Next']")).click();
	       
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("official1309");
	        driver.findElement(By.xpath("//span[text()='Next']")).click();
	        
	        //getting the title of the page
	        String a=driver.getTitle();
			System.out.println(a);
			String b=driver.getCurrentUrl();
			System.out.println(b);
			
			//verification
			if(a.equals("Gmail"))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
		}
		}