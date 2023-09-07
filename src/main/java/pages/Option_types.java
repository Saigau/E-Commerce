package pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Option_types {


	private WebDriver driver;

	@FindBy (css = "div.wrapper.container-fluid.has-menu div.row:nth-child(2) div.col-12 div.row div.sidenav div.sidenav-content div.sidemenu-sec div.m-menu-links_item:nth-child(5) > a.text-truncate")
	private WebElement Store_settings ;

	@FindBy (xpath = "//body/app-root[1]/app-root[1]/app-admin[1]/div[1]/div[2]/app-sidemenu[1]/div[1]/div[1]/div[1]/div[2]/div[11]/a[1]")
	private WebElement option_types_click ;

	@FindBy (xpath = "//body/app-root[1]/app-root[1]/app-admin[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-smart-view-render[1]/div[1]/div[1]/div[2]/app-grid-view-render[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/button[1]/img[1]")
	private WebElement Name_Color_edit  ;

	@FindBy (xpath = "//button[@id='add-option-value-btn']")
	private WebElement  Add_option_value;

	@FindBy (xpath = "//tbody/tr[@id='new']/td[1]/input[2]")
	private WebElement  Add_option_value_name;

	@FindBy (xpath = "//tbody/tr[@id='new']/td[3]/input[1]")
	private WebElement  Add_option_value_presentation;

	@FindBy (xpath = "//button[@id='update-Options-btn']")
	private WebElement update_color_btn ;

	@FindBy (xpath = "//body/app-root[1]/app-root[1]/app-admin[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-smart-view-render[1]/div[1]/div[1]/div[2]/app-grid-view-render[1]/div[1]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/button[1]/img[1]")
	private WebElement  Name_Brand_edit;


	@FindBy (xpath = "//button[@id='add-option-value-btn']")
	private WebElement  Add_option_value_name_brand;

	@FindBy (xpath = "//tbody/tr[@id='new']/td[1]/input[2]")
	private WebElement  Name_brand;

	@FindBy (xpath = "//tbody/tr[@id='new']/td[3]/input[1]")
	private WebElement  Display_T_Brand;

	@FindBy (xpath = "//button[@id='update-Options-btn']")
	private WebElement update_brand_btn ;

	@FindBy (xpath = "//body/app-root[1]/app-root[1]/app-admin[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-smart-view-render[1]/div[1]/div[1]/div[2]/app-grid-view-render[1]/div[1]/div[1]/div[3]/div[1]/div[3]/ul[1]/li[1]/div[1]/button[1]/img[1]")
	private WebElement  Name_Strength_edit ;

	@FindBy (xpath = "//button[@id='add-option-value-btn']")
	private WebElement   Add_option_value_strenghjt;

	@FindBy (xpath = "//tbody/tr[@id='new']/td[1]/input[2]")
	private WebElement Name_strenghth ;

	@FindBy (xpath = "//tbody/tr[@id='new']/td[3]/input[1]")
	private WebElement  Display_T_strenghth;

	@FindBy (xpath = "//button[@id='update-Options-btn']")
	private WebElement  update_strenghth_btn ;


	public Option_types(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);


	}

	public void Option_types_leveling() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Store_settings.click();

		Thread.sleep(10000);
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		//switch to new tab
		driver.switchTo().window(newTb.get(1));

		option_types_click.click();

		Name_Color_edit.click();

		Add_option_value.click();
		Add_option_value_name.sendKeys("Johnie walker");
		Add_option_value_presentation.sendKeys("Johnie walker");
		Thread.sleep(5000);

		update_color_btn.click();

		Name_Brand_edit.click();

		Add_option_value_name_brand.click();
		Name_brand.sendKeys("Taver loger");
		Display_T_Brand.sendKeys("Taver loger");
		Thread.sleep(5000);
		update_brand_btn.click();

		Name_Strength_edit.click();

		Add_option_value_strenghjt.click();
		Name_strenghth.sendKeys("Amazon Levelling");
		Display_T_strenghth.sendKeys("Amazon Levelling");
		Thread.sleep(5000);

		update_strenghth_btn.click();






	}




}
