package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Store_setttings_store_creation {

	private WebDriver driver;



	@FindBy (css = "div.wrapper.container-fluid.has-menu div.row:nth-child(2) div.col-12 div.row div.sidenav div.sidenav-content div.sidemenu-sec div.m-menu-links_item:nth-child(5) > a.text-truncate")
	private WebElement Store_settings ;

	@FindBy (xpath="//img[@class='mr-2 img-typ']")
	private WebElement Stores_create_button;

	@FindBy (xpath="//input[@id='store_name']")
	private WebElement Enter_store_name;

	@FindBy(xpath="//button[@id='generate_btn']")
	private WebElement Generate_store_code;	

	@FindBy(xpath="//textarea[@id='store_description']")
	private WebElement Enter_Description;	

	@FindBy(xpath="//input[@id='store_address']")
	private WebElement Enter_Address ;

	@FindBy(xpath="//input[@id='store_location']")
	private WebElement Enter_Location ;

	@FindBy(xpath="//input[@id='StoreImage']")
	private WebElement Upload_Logo ;

	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-admin[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-smart-view-render[1]/div[1]/div[1]/app-event-render[1]/div[1]/div[2]/app-markup-view[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[2]/div[1]/label[1]/span[1]")
	private WebElement click_Enable_Business_Hours;

	@FindBy(xpath="//select[@id='business_hours']")
	private WebElement Select_Business_Hours;

	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-admin[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-smart-view-render[1]/div[1]/div[1]/app-event-render[1]/div[1]/div[2]/app-markup-view[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/button[1]")
	private WebElement add_Business_Hours;

	@FindBy(xpath="//input[@id='store_name']")
	private WebElement Enter_name_for_store_hours ;

	@FindBy(xpath="//select[@id='store_timezone']")
	private WebElement Set_Your_TimeZone;

	@FindBy(xpath="//select[@id='store_buffer_time']")
	private WebElement Set_Store_Buffer_Time ;

	@FindBy(xpath="//button[@id='sphbtn']")
	private WebElement Add_btn ;

	@FindBy(xpath="//body[1]/app-root[1]/app-root[1]/app-view[1]/div[1]/app-smart-view-render[1]/div[1]/div[1]/app-event-render[1]/div[1]/div[2]/app-markup-view[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/input[1]")
	private WebElement Name  ;

	@FindBy(xpath="//tbody/tr[1]/td[2]/div[1]/div[1]/input[1]")
	private WebElement Enter_date ;

	@FindBy(xpath="//input[@id='123_starttime']")
	private WebElement open_time ;

	@FindBy(xpath="//input[@id='123_endtime']")
	private WebElement close_time ;

	@FindBy(xpath="//button[@id='save_specialHours']")
	private WebElement save_Special_Hours_and_Closures ;

	@FindBy(xpath="//select[@id='industry_type']")
	private WebElement Choose_Industry_Type;

	@FindBy(xpath="//select[@id='bankaccount']")
	private WebElement Choose_Your_Prefered_Bank_Account;

	@FindBy(xpath="//button[contains(text(),'Set New Approval Code ?')]")
	private WebElement Approval_Code;

	@FindBy(xpath="//input[@id='setCode']")
	private WebElement New_Approval_Code;

	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-admin[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-smart-view-render[1]/div[1]/div[1]/app-event-render[1]/div[1]/div[2]/app-markup-view[1]/div[1]/div[1]/div[1]/div[5]/div[4]/div[1]/div[1]/div[3]/button[2]")
	private WebElement New_Approval_Code_save;

	@FindBy(xpath="//select[@id='channel_settings']")
	private WebElement  Choose_channel_settings ;

	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-admin[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-smart-view-render[1]/div[1]/div[1]/app-event-render[1]/div[1]/div[2]/app-markup-view[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[5]/div[1]/div[2]/button[1]")
	private WebElement Add_Channel_setting;

	@FindBy(xpath="//select[@id='tax_rule']")
	private WebElement Choose_tax_Rule;

	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-admin[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-smart-view-render[1]/div[1]/div[1]/app-event-render[1]/div[1]/div[2]/app-markup-view[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[6]/div[1]/div[2]/button[1]")
	private WebElement Add_tax_Rule;

	@FindBy(xpath="//select[@id='store_number']")
	private WebElement Choose_Number ;

	@FindBy(xpath="//select[@id='qapesettings']")
	private WebElement Choose_Qape_setings ;

	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-admin[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-smart-view-render[1]/div[1]/div[1]/app-event-render[1]/div[1]/div[2]/app-markup-view[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[8]/div[1]/div[2]/button[1]")
	private WebElement Add_Qape_setings ;


	@FindBy(xpath="//button[@id='btnsave']")
	private WebElement SAVE ;


	public Store_setttings_store_creation(WebDriver driver) 
	{ this.driver=driver;

	
	PageFactory.initElements(driver,this); 
	}

	public void store_create_add() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//driver.manage().window().maximize();

		Store_settings.click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(8000);


		//WebDriverWait wait = new WebDriverWait(driver, 10);
	//	WebElement storesCreateButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='mr-2 img-typ']")));

		//storesCreateButton.click();


		Stores_create_button.click();

		Enter_store_name.sendKeys("Atrian Elctronics");
		Generate_store_code.sendKeys(Keys.ENTER);

		Enter_Description.sendKeys("Its an kind of store here you will get an  all types of vapes");
		Enter_Address.sendKeys("jpoint 2nd street kuvmpeu road texas");
		Enter_Location.sendKeys("Texas U.S.A");

		Upload_Logo.sendKeys(Keys.ENTER);

		click_Enable_Business_Hours.click();

		Select sel = new Select(Select_Business_Hours);
		sel.selectByValue("3828276946527090");

		add_Business_Hours.sendKeys(Keys.ENTER); 
		Enter_name_for_store_hours.sendKeys("Restro logcat Hours");

		Select sel1 = new Select(Set_Your_TimeZone);
		sel1.selectByValue("US/Central");

		Select sel2 = new Select(Set_Store_Buffer_Time);
		sel2.selectByValue("20 minutes");

		Add_btn.sendKeys(Keys.ENTER);
		Name.sendKeys("Apple logsCAT");
		Enter_date.sendKeys("28-08-2023");
		open_time.sendKeys("10:35");
		close_time.sendKeys("18:35");
		save_Special_Hours_and_Closures.click();

		Select sel3 = new Select(Choose_Industry_Type);
		sel3.selectByValue("Vape Store");

		Select sel4 = new Select(Choose_Your_Prefered_Bank_Account);
		sel4.selectByValue("Truist Bank Acct.No:********4305");

		Approval_Code.click();
		New_Approval_Code.sendKeys("ACSF1188");
		New_Approval_Code_save.click();

		//Select sel5 = new Select(Choose_channel_settings);
		//sel5.selectByValue("3828235147385564");

		Select sel6 = new Select(Choose_Qape_setings);
		sel6.selectByValue("3828276994189300");

		SAVE.click();


	}






}










