package testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class screenTest {
  @Test
  public void test() throws IOException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://burnerparts.com/");
	  
	  File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  Files.copy(f, new File("C:\\Users\\shahi\\OneDrive\\Documents\\testSS\\test.jpg"));
	  
	  driver.quit();
  }
  
  
}
