package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Utility.proper;
import pages.Channel_Fee_Settings;
import pages.Coupons_Categories;
import pages.Inventory_Page;
import pages.Login_Page;
import pages.Numbers;
import pages.Option_types;
import pages.Store_hours;
import pages.Store_setttings_store_creation;
import pages.Sub_categories;
import pages.Tax_categories;
import pages.Tax_rates;
import pages.categories;
import pages.presets;



public class BaseFile{
	public  static WebDriver driver;
	Login_Page login;
	Inventory_Page invit;
	Store_setttings_store_creation store_settings_create;
	Store_hours Store_hours_creationwise;
	Coupons_Categories Coupons_Categories_level;
	categories   categories_levelWise;
	Sub_categories Sub_categories_levelWisec;
	Tax_categories   Tax_categories_lev;
	Tax_rates      Tax_rates_Wisec;
	Numbers   Numbers_wisec;
	Channel_Fee_Settings  Channel_Fee_SettingsC;
	Option_types Option_types_wise;
	presets presets_levelC;
	
	
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
		Store_hours_creationwise = new Store_hours(driver);
		Coupons_Categories_level =  new Coupons_Categories(driver);
		categories_levelWise = new categories(driver);
		Sub_categories_levelWisec = new Sub_categories(driver);
		Tax_categories_lev =  new Tax_categories(driver);
		Tax_rates_Wisec = new Tax_rates(driver);
	
		Channel_Fee_SettingsC = new Channel_Fee_Settings(driver);
		Numbers_wisec =  new Numbers(driver);
		Option_types_wise = new Option_types(driver);
		presets_levelC =  new presets(driver);
		
	}






}
