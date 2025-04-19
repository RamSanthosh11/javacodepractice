package ExcelPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDataProvider {
  @Test(dataProvider ="userdetails",dataProviderClass = MutipileUserStore2.class)
  public void f(String username,String password,String number) {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://accounts.lambdatest.com/login?_gl=1*1n8k5z5*_gcl_au*MjA5NTcyODQzNi4xNzQ0MzU4NDAw");
	  //driver.manage().window().maximize();
	  driver.findElement(By.id("email")).sendKeys(username);
	  driver.findElement(By.id("password")).sendKeys(password);
	  WebElement ele = driver.findElement((By.id("login-button")));
	  ele.click();
	  System.out.println(username+" "+password+" "+number);
	  driver.close();
  }
}
