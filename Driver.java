package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
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
				driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000");
				driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1234");
				driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("9876412351");
				driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("cccc");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("my office work");
				driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("mmmmm");
				driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("employee");
				driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("computer hardware");
				driver.findElement(By.id("createLeadForm_ownershipEnumId")).sendKeys("corporation");
				driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("456738");
				driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("automobile");
				driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/03/1999");
				driver.findElement(By.id("createLeadForm_currencyUomId")).sendKeys("USD-American Dollar");
				//contact info
				
				driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("23");
				driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("789099");
				driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("coc");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rivejeethu1999@gmail.com");
				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567891");
				driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("moni");
				driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http//.testleaf.com");
				//primary address
				driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("mmmm");
				driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("mangadu");
				driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
				driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("606900");
				driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("53");
				driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("xyz");
				driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("abc");
				driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tamilnadu");
				driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
				driver.findElement(By.className("smallSubmit")).click();
				driver.close();
				
					
		
	}
	}


