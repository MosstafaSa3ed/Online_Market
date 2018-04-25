package onlineMarket.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProductControllerTest {
	public static WebDriver driver;
  @Test(priority=1)
  public void openApp() {
	  
  }
  @Test(priority=2)
  public void Login()
  {
	  driver.findElement(By.xpath("/html/body/my-app/buyer-login/div/form/div[1]/input")).sendKeys("abc");
	  driver.findElement(By.xpath("/html/body/my-app/buyer-login/div/form/div[2]/input")).sendKeys("123");
	  driver.findElement(By.xpath("/html/body/my-app/buyer-login/div/form/input")).click();
	  
  }
  @BeforeTest
	public void beforetest() {	
		 driver=new FirefoxDriver();
  }
  @AfterTest
  public void aftertest() {
	  driver.close();
  }
}
