package pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Tax_rates {

	private WebDriver driver;

	@FindBy (css = "div.wrapper.container-fluid.has-menu div.row:nth-child(2) div.col-12 div.row div.sidenav div.sidenav-content div.sidemenu-sec div.m-menu-links_item:nth-child(5) > a.text-truncate")
	private WebElement Store_settings ;

	@FindBy(css="div.wrapper.container-fluid.has-menu div.row:nth-child(2) div.sidenav div.sidenav-content div.sidemenu-sec div.m-menu-submenu:nth-child(2) div.m-menu-links_item:nth-child(7) > a.text-truncate.active")
	private WebElement Tax_rates_click  ;

	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-admin[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-smart-view-render[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/img[1]")
	private WebElement Tax_rates_create_btn   ;

	@FindBy(xpath="//input[@id='tax_name']")
	private WebElement Enter_Tax_Rate_Name;

	@FindBy(xpath="//input[@id='tax_rate']")
	private WebElement  Enter_Tax_Rate ;

	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-admin[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-smart-view-render[1]/div[1]/div[1]/app-event-render[1]/div[1]/div[2]/app-markup-view[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[3]/select[1]")
	private WebElement Zone;

	@FindBy(xpath="//select[@id='tax-categories']")
	private WebElement Select_Tax_Category ;

	@FindBy(xpath="//input[@id='included-price']")
	private WebElement  Included_in_Price ;

	@FindBy(xpath="//input[@id='show-rate-label']")
	private WebElement   Show_Rate_in_label ;

	@FindBy(xpath="//button[@id='save-button']")
	private WebElement   save ;


	public Tax_rates(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);

	}


	public void Tax_rates_levec() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Store_settings.click();
		Thread.sleep(10000);
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		//switch to new tab
		driver.switchTo().window(newTb.get(1));
		
        
		Tax_rates_click.click();

		Tax_rates_create_btn.click();

		Enter_Tax_Rate_Name.sendKeys("RDS12TAX");

		Enter_Tax_Rate.sendKeys("12");

		Select sel = new Select(Zone);
		sel.selectByValue("Asia");
		
		Select sel1 = new Select(Select_Tax_Category);
		sel1.selectByValue("3828996222043384");
		
		Included_in_Price.click();
		
		Show_Rate_in_label.click();
		
		save.click();
		

	}

}
