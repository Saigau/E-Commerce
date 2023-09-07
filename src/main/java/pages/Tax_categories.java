package pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tax_categories {

	private WebDriver driver;
	
	@FindBy (css = "div.wrapper.container-fluid.has-menu div.row:nth-child(2) div.col-12 div.row div.sidenav div.sidenav-content div.sidemenu-sec div.m-menu-links_item:nth-child(5) > a.text-truncate")
	private WebElement Store_settings ;
	
	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-admin[1]/div[1]/div[2]/app-sidemenu[1]/div[1]/div[1]/div[1]/div[2]/div[5]/a[1]")
	private WebElement Click_Tax_Category;
	
	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-admin[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-smart-view-render[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/img[1]")
	private WebElement Tax_Category_create_btn ;
	
	@FindBy(xpath="//input[@id='tax_cat_name']")
	private WebElement Enter_tax_Category_Name;
	
	@FindBy(xpath="//input[@id='tax_code']")
	private WebElement Enter_Tax_Code   ;
	
	@FindBy(xpath="//textarea[@id='description']")
	private WebElement Enter_Description ;
	
	@FindBy(xpath="//button[@id='save-button']")
	private WebElement save ;
	
	
   public Tax_categories(WebDriver driver) {
	  
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	   
   }
   
   
   
   public void Tax_categories_wise() throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	   Store_settings.click();
	   Thread.sleep(10000);
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		//switch to new tab
		driver.switchTo().window(newTb.get(1));
	   
	   
	   Click_Tax_Category.click();
	   Thread.sleep(10000);
	   Tax_Category_create_btn.click();
	   
	   //Thread.sleep(10000);
	   Enter_tax_Category_Name.sendKeys("CRST251%");
	   
	   Enter_Tax_Code.sendKeys("12");
	   
	   Enter_Description.sendKeys("Its an kind of tax category here we will get all kinds of taxation");

	   save.click();
	   
   }

}