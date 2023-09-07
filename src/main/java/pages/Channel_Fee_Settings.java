package pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Channel_Fee_Settings {

	private WebDriver driver;

	@FindBy (css = "div.wrapper.container-fluid.has-menu div.row:nth-child(2) div.col-12 div.row div.sidenav div.sidenav-content div.sidemenu-sec div.m-menu-links_item:nth-child(5) > a.text-truncate")
	private WebElement Store_settings ;

	@FindBy (xpath = "//body/app-root[1]/app-root[1]/app-admin[1]/div[1]/div[2]/app-sidemenu[1]/div[1]/div[1]/div[1]/div[2]/div[8]/a[1]")
	private WebElement Channel_Fee_Settings_click ;

	@FindBy (xpath = "//body/app-root[1]/app-root[1]/app-admin[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-smart-view-render[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/img[1]")
	private WebElement Channel_Fee_Settings_create_btn ;

	@FindBy (xpath = "//input[@id='name-value']")
	private WebElement Name ;

	@FindBy (xpath = "//textarea[@id='description-value']")
	private WebElement  Description;

	@FindBy (xpath = "//input[@id='pickup-value']")
	private WebElement Pick_Up ;

	@FindBy (xpath = "//input[@id='curbside-value']")
	private WebElement Curbside ;

	@FindBy (xpath = "//input[@id='myDeliveryCheckbox']")
	private WebElement  Delivery;

	@FindBy (xpath = "//input[@id='uber-checkbox']")
	private WebElement  Uber;

	@FindBy (xpath = "//input[@id='doordash-checkbox']")
	private WebElement  Doordash;

	@FindBy (xpath = "//input[@id='myShippingCheckbox']")
	private WebElement  Shipping;

	@FindBy (xpath = "//input[@id='fedex-checkbox']")
	private WebElement  fedx;

	@FindBy (xpath = "//input[@id='ups-checkbox']")
	private WebElement  UPS;

	@FindBy (xpath = "//input[@id='dhl-checkbox']")
	private WebElement DHL ;


	@FindBy (xpath = "//tbody/tr[4]/td[2]/div[1]/div[1]/label[1]/span[1]")
	private WebElement  Active_toggle_btn;

	@FindBy (xpath = "//button[contains(text(),'Save')]")
	private WebElement save ;


	@FindBy (xpath = "//button[contains(text(),'Cancel')]")
	private WebElement cancel ;

	public Channel_Fee_Settings(WebDriver driver) {

		this.driver=driver;

		PageFactory.initElements(driver, this);


	}

	public void Channel_Fee_Settings_levels() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Store_settings.click();

		Thread.sleep(10000);

		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		//switch to new tab

		driver.switchTo().window(newTb.get(1));

		Channel_Fee_Settings_click.click();

		Thread.sleep(10000);
		Channel_Fee_Settings_create_btn.click();

		Name.sendKeys("TV29 channel");

		Description.sendKeys("It's an kind of channel for circulating the materials  ");

		Pick_Up.click();
		Curbside.click();

		Delivery.click();
		Uber.click();
		Doordash.click();

		Shipping.click();
		fedx.click();
		UPS.click();
		DHL.click();

		//Active_toggle_btn.isEnabled();
		Active_toggle_btn.click();

		save.click();





	}

}
