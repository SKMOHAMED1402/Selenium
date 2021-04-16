package itired;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Imtired {
@Test
	public void setup() throws InterruptedException 
	
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\casa_\\Downloads\\chromedriver_win321\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://money.rediff.com/index.html");
	
	driver.manage().window().maximize();
	WebElement e= driver.findElement(By.xpath("//div[@class='hmnseindicestable']/child::ul[3]/li[1]"));
	
	
	String h =e.getText();
	
	Thread.sleep(3000);
	
	System.out.println(h);
	if (h.equalsIgnoreCase("NIFTY IT"))
	{
		System.out.println("number is correct");
	}	
	else {
		System.out.println("number is incorrect");
	}
	
	
	driver.close();
	}
}
