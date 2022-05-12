package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.navigate().back();
		
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
