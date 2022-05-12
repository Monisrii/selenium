package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class FaceBook {

public static void main(String[] args)
{
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.linkText("Create New Account")).click();
driver.findElement(By.name("firstname")).sendKeys("monika");
driver.findElement(By.name("lastname")).sendKeys("kumaran");
driver.findElement(By.name("reg_email__")).sendKeys("monimonish1999@gmail.com");
driver.findElement(By.name("reg_passwd__")).sendKeys("monijio@123");
WebElement date =driver.findElement(By.id("day"));
Select dd1=new Select(date);
dd1.selectByValue("23");
WebElement month=driver.findElement(By.id("month"));
Select dd2=new Select(month);
dd2.selectByValue("3");
WebElement year =driver.findElement(By.id("year"));
Select dd3=new Select(year);
dd3.selectByValue("2020");

}
 
}


	






	


