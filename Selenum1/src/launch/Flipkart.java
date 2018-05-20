package launch;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Flipkart {
    @Test
    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\sahun\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.google.com");
	String actual_title=driver.getTitle();
	String expected_title="Google";
	if(actual_title.equals(expected_title))
	{
		System.out.println("Passed");
	}
	else
	{
		System.out.println("Failed");
	}
    
	driver.close();
    }
}
    
	
	