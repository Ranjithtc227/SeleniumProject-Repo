package webproject;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class ResponseCodePgm 
{
  private static final String HttpURLConnection = null;
String link="https://www.facebook.com/";
  
  @Test
  public void responseCodeFb()
  {
	  try
	  {
		  URL u=new URL(link);
		  HttpURLConnection connection=(HttpURLConnection)u.openConnection();
		  int code=connection.getResponseCode();
		  System.out.println(code);
		  if(code==200)
		  {
			  System.out.println("Sucessful link");
		  }
		  else
		  {
			  System.out.println("Not a sucessful link");
		  }
	  }
	  catch(Exception e)
	  {
		  
	  }
  }
}
