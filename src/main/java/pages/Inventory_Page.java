package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import groovyjarjarantlr4.v4.runtime.tree.xpath.XPath;

public class Inventory_Page {
private WebDriver driver;


@FindBy (xpath = "//a[@class='text-truncate active']")
private WebElement InventoryModule ;

@FindBy(xpath = "//img[@class='mr-2 img-typ']")
private WebElement Addbutton ;


@FindBy(xpath = "//input[@id='product-name-value']")

private WebElement productname ;

@FindBy (xpath = "//select[@id='Categories-dp']")

private WebElement category ;                                           //Select


@FindBy(xpath = "//select[@id='Sub-Categories-dp']")

private WebElement Subcategories;         //Select

@FindBy(xpath = "//input[@id='Pick_Up']")
private WebElement pickbutton ;

@FindBy(xpath = "//textarea[@id='description-value']")

private WebElement Description ;

@FindBy(xpath = "//button[@class='btn-next'][normalize-space()='Save']")
private WebElement Save ;



public Inventory_Page (WebDriver driver)
{
	this.driver = driver ;
	
	PageFactory.initElements(driver, this);
}

public void add_item() throws InterruptedException
{
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	InventoryModule.click();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Addbutton.click();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	productname.sendKeys("Good product");
	
	Select selcat = new Select(category);
	Thread.sleep(2000);
	selcat.selectByValue("3828379545795425");
	
	Select selsub = new Select(Subcategories);
	Thread.sleep(2000);
	selsub.selectByValue("471");
	
	pickbutton.click();
	
	Description.click();
	
	Save.click();
	
}
}
