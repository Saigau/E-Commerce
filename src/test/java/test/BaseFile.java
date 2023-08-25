package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Utility.proper;
import pages.Inventory_Page;
import pages.Login_Page;



public class BaseFile{
	public  static WebDriver driver;
	Login_Page login;
	Inventory_Page invit;
	@BeforeSuite
	public void init() throws InterruptedException, IOException

	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		driver.get(proper.prop("Url"));

		driver.manage().window().maximize();

		Thread.sleep(5000);

	}
	//	}
	//		{
	//		// Set the path to the ChromeDriver executable
	//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saigaurav\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//        
	//        // Create an instance of ChromeDriver
	//        driver = new ChromeDriver();
	//		
	//		driver.get("https://devportal.uncode.io/apption/login");
	//
	//
	//
	//		Thread.sleep(5000);
	//	}
	@BeforeClass
	public void Obj()
	{
		login= new Login_Page(driver);
		invit = new Inventory_Page(driver);
	}

}
