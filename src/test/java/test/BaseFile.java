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
import pages.Store_setttings_store_creation;



public class BaseFile{
	public  static WebDriver driver;
	Login_Page login;
	Inventory_Page invit;
	Store_setttings_store_creation store_settings_create;
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

	@BeforeClass
	public void Obj()
	{
		login= new Login_Page(driver);
		invit = new Inventory_Page(driver);
		store_settings_create = new Store_setttings_store_creation(driver);
		
		
	}

}
