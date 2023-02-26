package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class tesstTest {
	ChromeDriver driver;
  @Test
  public void openwebsite() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://iconicpineapple.com/");
		System.out.println(driver.getTitle());	
		Thread.sleep(2000);   
		driver.findElement(By.xpath("//*[@id=\"popup\"]/div[1]/a")).click();
		System.out.println("Pop up closed");
  }
  @Test
  public void login() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/ul[1]/li[2]/a")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id=\"login-email\"]")).sendKeys("shahid004@yopmail.com");
		driver.findElement(By.xpath("//*[@id=\"login-password\"]")).sendKeys("Shahid@123");
		driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[4]/div[1]/button")).click();
	  System.out.println("logged in");
  }
  
	  @Test
	  public void done(){
		  driver.close();
		  driver.quit();
	  }
	  
	  public static void main(String[] args) throws InterruptedException {
		  tesstTest og = new tesstTest();
		og.openwebsite();
		og.login();
		og.done();
  }}

