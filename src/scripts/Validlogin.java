package scripts;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import generic.Auto_constant;
	import generic.Excel;

	public class Validlogin implements Auto_constant {
	static
	{
		
			System.setProperty(key,value);	
	}
	public static void main(String[] args)
	{
		String us1 = Excel.abc(excelpath,"Sheet1",0,0);
		String pwd=Excel.abc(excelpath,"Sheet1",1,0);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.infibeam.com");
		driver.findElement(By.xpath("//a[@id='loginlink']")).click();
		driver.findElement(By.name("email")).sendKeys(us1);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@class='btn btn-login]")).click();
		try 
		{
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	}
