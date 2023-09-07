package pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Numbers {

	private WebDriver driver;

	@FindBy (css = "div.wrapper.container-fluid.has-menu div.row:nth-child(2) div.col-12 div.row div.sidenav div.sidenav-content div.sidemenu-sec div.m-menu-links_item:nth-child(5) > a.text-truncate")
	private WebElement Store_settings ;

	@FindBy (xpath = "//body/app-root[1]/app-root[1]/app-admin[1]/div[1]/div[2]/app-sidemenu[1]/div[1]/div[1]/div[1]/div[2]/div[7]/a[1]")
	private WebElement Numbers_click ;

	@FindBy (xpath = "//body/app-root[1]/app-root[1]/app-admin[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-manage-numbers[1]/div[1]/div[2]/app-smart-view-render[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/i[1]")
	private WebElement Numbers_add_btn ;

	@FindBy (xpath = "//body/app-root[1]/app-root[1]/app-admin[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-manage-numbers[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement Enter_Buy_Number  ;

	@FindBy (xpath = "//button[contains(text(),'Search')]")
	private WebElement Search  ;


	@FindBy (xpath = "//body/app-root[1]/app-root[1]/app-admin[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-manage-numbers[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]")
	private WebElement Add_to_cart  ;

	@FindBy (xpath = "//button[contains(text(),'Checkout')]")
	private WebElement CheckOut  ;





	public Numbers(WebDriver driver) {

		this.driver=driver;
		
		PageFactory.initElements(driver, this);

	}

	public void Numbers_Module() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Store_settings.click();

		Thread.sleep(10000);
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		//switch to new tab
		driver.switchTo().window(newTb.get(1));

		Numbers_click.click();
		Thread.sleep(10000);
		
		Numbers_add_btn.click();
		
		//Numbers_add_btn.sendKeys("484");
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/app-root[1]/app-admin[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-manage-numbers[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("484");
		
		
		Enter_Buy_Number.click();
		
		Search.click();
		
		Add_to_cart.click();
		
		Thread.sleep(2000);
		CheckOut.click();
		
		
	}



}