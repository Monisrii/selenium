package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DropDown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement eleDropDown1=driver.findElement(By.id("dropdown1"));
		Select dd1=new Select(driver.findElement(By.id("dropdown1")));
		driver.findElement(By.id("dropdown1")).sendKeys("Appium");
		}

		}

	
