package launch;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Browser {
	public static void main(String[] args) {
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\sahun\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Java",Keys.ENTER);
		driver.findElement(By.linkText("Download Free Java Software")).click();
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleIs("Download Free Java Software"));
		String actualtitle=driver.getTitle();
		String expectedtitle="Download Free Java Software";
		System.out.println(actualtitle);
		if(actualtitle.equals(expectedtitle)){
			System.out.println("Passed");
		}
		else{
			System.out.println("Failed");
		}
		driver.close();
		}
	}
