package onlineMarket.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	public static WebDriver driver;
  @Test(priority=1)
  public void openApp() throws InterruptedException {
	  Thread.sleep(5000);
  }
  @Test(priority=2)
  public void Login()
  {
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  driver.findElement(By.xpath("/html/body/my-app/buyer-login/div/form/div[1]/input")).sendKeys("abc");
	  driver.findElement(By.xpath("/html/body/my-app/buyer-login/div/form/div[2]/input")).sendKeys("123");
	  driver.findElement(By.xpath("/html/body/my-app/buyer-login/div/form/input")).click();
	  
  }
  @BeforeTest
	public void beforetest() {	
		System.setProperty("webdriver.chrome.driver",  "C:\\fci.cu\\3rd year\\testing\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://localhost:3000/buyerLogin");
  }
  @AfterTest
  public void aftertest() {
	//  driver.close();
  }
}
