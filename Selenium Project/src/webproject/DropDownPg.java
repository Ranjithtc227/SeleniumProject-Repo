package webproject;



import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPg 
{
	ChromeDriver driver;
	  @Before
	  public void setUp()
	  {
		 driver=new ChromeDriver();
		 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	  }
	  @Test
	  public void dropDownHndlng()
	  {
		  WebElement day=driver.findElement(By.xpath("//select[contains(@name,'DOB_Daydaa3ef74')]"));
		  Select dayDetails=new Select(day);
		  dayDetails.selectByValue("05");
		  
		  WebElement month=driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
		  Select monthDetails=new Select(month);
		  monthDetails.selectByVisibleText("FEB");
		  
		  WebElement year=driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));
		  Select yearDetails=new Select(year);
		  yearDetails.selectByValue("2025");
	  }
}
