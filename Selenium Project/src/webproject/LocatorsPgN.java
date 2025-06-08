package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPgN 
{
  ChromeDriver driver;
  @Before
  public void setUp()
  {
	 driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
  }
  @Test
  public void LocatorsPg()
  {
	  WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
	  email.sendKeys("Abcd");
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Abcd");
	  driver.findElement(By.name("login")).click();
  }
}
