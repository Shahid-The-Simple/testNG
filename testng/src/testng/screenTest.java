package testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class screenTest {
  @Test
  public void test() throws IOException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  //driver.get("https://burnerparts.com/");
	  //driver.close();
  }
	  @Test
	  public void categories() throws IOException, InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			  driver.get("https://burnerparts.com/");
			WebElement cathov = driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div[2]/div/ul[2]/li[12]/a"));
			Actions actions = new Actions(driver);
			actions.moveToElement(cathov).build().perform();
			WebElement search = driver.findElement(By.id("search"));
			search.sendKeys("Burner");
			search.click();
			WebElement searchres = driver.findElement(By.xpath("//*[@id=\"search_mini_form\"]/div[2]/button"));
			searchres.click();
			driver.findElement(By.className("product-image-photo")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0, -500)");
			driver.findElement(By.id("attribute182"));
			driver.findElement(By.xpath("//*[@id=\"attribute182\"]/option[5]")).click();
			driver.findElement(By.id("product-addtocart-button")).click();
	  Thread.sleep(3000);
	  
	  //File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	 // Files.copy(f, new File("C:\\Users\\shahi\\OneDrive\\Documents\\testSS\\test.jpg"));
	  
	  //driver.quit();
  }
  
  
}


