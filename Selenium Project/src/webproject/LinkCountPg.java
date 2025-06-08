package webproject;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCountPg 
{
	ChromeDriver driver;
	  @Before
	  public void setUp()
	  {
		 driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/");
	  }
	  @Test
	  public void linkCountFb()
	  {
		  List<WebElement> linkDetails=driver.findElements(By.tagName("a"));
		  System.out.println("Total Number of Links="+linkDetails.size());
		  
		  for(WebElement element:linkDetails)
		  {
			  String link=element.getAttribute("href");
			  String linkText=element.getText();
			  System.out.println("Link="+link);
			  System.out.println("Link Text="+linkText);

		  }
		  
	  }
}
