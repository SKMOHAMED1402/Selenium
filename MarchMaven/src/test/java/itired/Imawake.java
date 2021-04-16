package itired;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Imawake {
public static WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\casa_\\Downloads\\chromedriver_win321\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}
	@Test
	public void cnn()
	
	{
		
		
		driver.get("https://www.cnn.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Breaking News"))
		
		{
			System.out.println ("The title is correct");
			
		}
		else
		{
			System.out.println("The title is incorrect");
		}
		
		driver.quit();
	}
	@Test
	public void clicklink() throws InterruptedException
		
		{
			
			driver.get("https://www.cnn.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"homepage-injection-zone-1\"]/div[2]/div/div/div/ul/li[1]/article/div/div/h3/a/span[2]")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(2000);
			WebElement f =driver.findElement(By.partialLinkText("Taiwan"));
			f.getText();
			System.out.println(f.getText());
			
		
		driver.close();
		
		}
	}
	

