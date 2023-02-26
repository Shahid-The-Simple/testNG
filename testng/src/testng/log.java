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
	
	@Test
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
	
		  @Test
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

	//@Test
	//public void newsletter() throws InterruptedException, IOException {
		
		
	//}
	@Test
	public void homepage() throws InterruptedException, IOException {
		
		driver.get("https://burnerparts.com/");
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  Files.copy(f, new File("C:\\Users\\shahi\\OneDrive\\Documents\\testSS\\BurnerHome.jpg"));
		Thread.sleep(2000);
	}
	
	@Test
	public void opencat() throws InterruptedException {
		WebElement cat1 = driver.findElement(By.id("navbarDropdown"));
		cat1.click();
		JavascriptExecutor Scrool = (JavascriptExecutor) driver;
		Scrool.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);
	}
	
	@Test
	public void search() throws InterruptedException, IOException {
		WebElement search = driver.findElement(By.id("search"));
		search.sendKeys("Burner");
		search.click();
		WebElement searchres = driver.findElement(By.xpath("//*[@id=\"search_mini_form\"]/div[2]/button"));
		searchres.click();
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  Files.copy(f, new File("C:\\Users\\shahi\\OneDrive\\Documents\\testSS\\Burnersearch.jpg"));
		Thread.sleep(3000);
		
	}
	
	
	@AfterClass
	
	public void close() throws IOException {
	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  Files.copy(f, new File("C:\\Users\\shahi\\OneDrive\\Documents\\testSS\\Burnerclose.jpg"));
       
		driver.quit();
		
		
	}}

