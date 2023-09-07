package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Sub_categories {

	private WebDriver driver;

	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/app-sidemenu[1]/div[1]/div[1]/div[2]/div[11]/a[1]")
	private WebElement Click_categories;

	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-controller-id[1]/app-smart-view-render[1]/div[1]/div[1]/div[2]/app-grid-view-render[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]/span[1]/i[1]")
	private WebElement Categories_3_dots ;
	
	@FindBy(xpath="//span[contains(text(),'Sub Categories')]")
	private WebElement Sub_categories_selection  ;

	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-controller-id[1]/app-smart-view-render[1]/div[1]/div[1]/app-event-render[1]/div[1]/div[2]/app-smart-view-render[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/img[1]")
	private WebElement Create_sub_categories_btn ;

	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElement save  ;

	@FindBy(xpath="//input[@id='sub_category_name']")
	private WebElement Add_Sub_Category_btn;

	@FindBy (xpath = "//div[@class='toast-message']")
	private WebElement toste ;
	
	@FindBy (xpath = "//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-controller-id[1]/app-smart-view-render[1]/div[1]/div[1]/app-event-render[1]/div[1]/div[2]/app-smart-view-render[1]/div[1]/div[1]/div[2]/app-list-view-render[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]/span[1]/span[1]/i[1]")
	private WebElement Add_Sub_Category_3_dots ;
	
	@FindBy (xpath = "//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-controller-id[1]/app-smart-view-render[1]/div[1]/div[1]/app-event-render[1]/div[1]/div[2]/app-smart-view-render[1]/div[1]/div[1]/div[2]/app-list-view-render[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]/span[1]/span[1]/div[1]/span[1]/span[1]")
	private WebElement Add_Sub_Category_edit ;

	@FindBy (xpath = "//input[@id='sub_category_name']")
	private WebElement Enter_Sub_Category ;
	
	@FindBy (xpath = "//button[contains(text(),'Update')]")
	private WebElement Sub_Category_Update_click;
	
	

	public Sub_categories(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	public void Sub_categoriesWise() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		Click_categories.click();

//		Select sel =  new Select(Categories_3_dots);
//		sel.selectByValue("//span[contains(text(),'Sub Categories')]");

		Categories_3_dots.click();
		Thread.sleep(3000);
		
		Sub_categories_selection.click();
		Thread.sleep(10000);
		
		Create_sub_categories_btn.click();
		Thread.sleep(3000);
		
		Add_Sub_Category_btn.sendKeys("mi");

		save.click();
		
		String expectedTitle = "Coupon Category Updated Successfully";
		String actualTitle = driver.getTitle();

		// Assertion: Check if the actual title matches the expected title
		Assert.assertEquals(actualTitle, expectedTitle, "Coupon Category Updated Successfully");
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(toste));
		System.out.println(toste.getText());
         
		Add_Sub_Category_btn.click();
		
		Add_Sub_Category_3_dots.click();
		
		Add_Sub_Category_edit.click();
		
		Enter_Sub_Category.sendKeys("Micromax");
		Sub_Category_Update_click.click();
		

		
		
	}





}
