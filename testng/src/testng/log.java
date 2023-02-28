package testng;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class log {

	WebDriver driver;
	
	@BeforeClass
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test(priority = 1)
	public void login() throws InterruptedException, IOException {
		driver.get("https://burnerparts.com/");
		System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[3]/header/div[2]/div[2]/div/ul[1]/li[3]/a")).click();
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("vivek29@yopmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Shahid@123");
		WebElement button = driver.findElement(By.xpath("//*[@id=\"send2\"]"));
		button.click();
		Thread.sleep(3000);
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  Files.copy(f, new File("C:\\Users\\shahi\\OneDrive\\Documents\\testSS\\Burnerlogin.jpg"));
	}
	
		  @Test(priority = 2)
		  public void subs() throws InterruptedException, IOException {
			  
		  driver.navigate().to("https://burnerparts.com/newsletter/manage/");
		  //driver.findElement(By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[12]/strong"));
			WebElement subs = driver.findElement(By.id("subscription"));
			subs.click();
			WebElement savsubs = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button"));
			savsubs.click();
			Thread.sleep(2000);
			
			File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  
			  Files.copy(f, new File("C:\\Users\\shahi\\OneDrive\\Documents\\testSS\\Burnersubs.jpg"));
			Thread.sleep(3000);
		}
	//}
	@Test(priority = 3)
	public void homepage() throws InterruptedException, IOException {
		
		driver.get("https://burnerparts.com/");
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  Files.copy(f, new File("C:\\Users\\shahi\\OneDrive\\Documents\\testSS\\BurnerHome.jpg"));
		  Files.copy(f, new File("C:\\Users\\shahi\\OneDrive\\Documents\\testSS\\Homelogo.jpg"));
		  Files.copy(f, new File("C:\\Users\\shahi\\OneDrive\\Documents\\testSS\\BurnerBanner.jpg"));
		Thread.sleep(2000);
	}
	
	@Test(priority = 4)
	public void search() throws InterruptedException, IOException {
		WebElement search = driver.findElement(By.id("search"));
		search.sendKeys("66642VL");
		search.click();
		//WebElement searchres = driver.findElement(By.xpath("//*[@id=\"search_mini_form\"]/div[2]/button"));
		//searchres.click();
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  Files.copy(f, new File("C:\\Users\\shahi\\OneDrive\\Documents\\testSS\\Burnersearch.jpg"));
		Thread.sleep(3000);
	}
	@Test(priority = 5)
	public void categories() throws IOException {
		driver.navigate().to("https://burnerparts.com/burners/burners.html");
  File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  Files.copy(f, new File("C:\\Users\\shahi\\OneDrive\\Documents\\testSS\\categories.jpg"));
 
	}
	@Test(priority = 6)
	public void productpage() throws IOException, InterruptedException {
		WebElement product = driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[3]/main/div/div[2]/div[2]/div[4]/div/div[1]/strong/a"));
		product.click();
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  Files.copy(f, new File("C:\\Users\\shahi\\OneDrive\\Documents\\testSS\\product page.jpg"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 600)");
		Thread.sleep(2000);
		driver.findElement(By.id("product-addtocart-button")).click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, -500)");
		File z = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  Files.copy(z, new File("C:\\Users\\shahi\\OneDrive\\Documents\\testSS\\Addtocart.jpg"));
	}
	
@Test(priority = 7)
public void checkout() throws InterruptedException, IOException {
	driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[3]/header/div[2]/div[1]/div/div[2]/div/a/i")).click();
	Thread.sleep(2000);
	File z = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  Files.copy(z, new File("C:\\Users\\shahi\\OneDrive\\Documents\\testSS\\shoppingcart.jpg"));
	  driver.findElement(By.xpath("//*[@id=\"XSE8FPP\"]")).sendKeys("66102");
	  Thread.sleep(2000);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 600)");
		driver.findElement(By.xpath("//*[@id=\"s_method_ups_GND\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[3]/main/div/div[3]/div/div[2]/div[1]/ul/li[1]/button")).click();
	  Thread.sleep(2000);
	  File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  Files.copy(s, new File("C:\\Users\\shahi\\OneDrive\\Documents\\testSS\\proceedtocheckou.jpg"));
}
	
	@AfterClass
	public void close() throws IOException {
	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  Files.copy(f, new File("C:\\Users\\shahi\\OneDrive\\Documents\\testSS\\Burnerclose.jpg"));
       
		driver.quit();
		
		
	}}

