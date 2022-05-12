package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTaps {
	public static void main(String[]args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("monica");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumaran");
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("xxx");
				driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("yyy");
				driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("emp");
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("abc");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("software testing");
				WebElement source =driver.findElement(By.id("createLeadForm_dataSourceId"));
				Select dd1=new Select(source);
				dd1.selectByVisibleText("Other");
				WebElement industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
				Select dd2=new Select(industry);
				dd2.selectByVisibleText("Press");
}
	
}
