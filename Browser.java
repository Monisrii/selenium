package week2.day1;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
public class Browser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	/*	WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();*/
		
		
		/*	WebDriverManager.firefoxdriver().setup();
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();*/

			WebDriverManager.edgedriver().setup();
			EdgeDriver driver=new EdgeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();

}
}
