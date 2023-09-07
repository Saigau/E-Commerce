package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class categories {

	private WebDriver driver;


	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/app-sidemenu[1]/div[1]/div[1]/div[2]/div[11]/a[1]")
	private WebElement Click_categories;

	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-controller-id[1]/app-smart-view-render[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/img[1]")
	private WebElement Create_btn_categories;

	@FindBy(xpath="//input[@id='category_name']")
	private WebElement Enter_Category_name ;

	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElement save ;

	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	private WebElement cancel ;

	@FindBy(xpath="//div[@class='toast-message']")
	private WebElement toaste;


	public categories(WebDriver driver) {
		this.driver=driver;

		PageFactory.initElements(driver,this);


	}

	public void  categories_wise() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Click_categories.click();
		Thread.sleep(8000);

		Create_btn_categories.click();

		Enter_Category_name.sendKeys("Electronic Gadgets");

		save.click();

		String expectedTitle = "Category Updated Successfully";
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle, "Category Updated Successfully");
		
		//Assert.assertEquals(expectedTitle, actualTitle,"Category added Successfully"); 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(69));

		wait.until(ExpectedConditions.visibilityOf(toaste));
		System.out.println(toaste.getText());

	}

}