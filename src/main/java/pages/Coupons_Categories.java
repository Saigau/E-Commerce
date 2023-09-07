package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Coupons_Categories {

	private WebDriver driver;

	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/app-sidemenu[1]/div[1]/div[1]/div[2]/div[13]/a[1]")
	private WebElement Click_Coupons_Categories;

	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-controller-id[1]/app-smart-view-render[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/img[1]")
	private WebElement Coupons_Categories_create_btn ;


	@FindBy(xpath="//input[@id='cc_name']")
	private WebElement Name ;

	@FindBy(xpath="//input[@id='cc_code']")
	private WebElement Code ;

	@FindBy(xpath="//button[@id='cc_create']")
	private WebElement save;

	@FindBy(xpath="//button[@id='cc_cancel']")
	private WebElement cancel ;
	@FindBy (xpath = "//div[@class='toast-message']")
	private WebElement toste ;

	public Coupons_Categories(WebDriver driver) {

		this.driver=driver;

		PageFactory.initElements(driver, this);

	}

	public void Coupons_Categories_creationWise() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		Click_Coupons_Categories.click();
		Thread.sleep(8000);

		Coupons_Categories_create_btn.click();

		Name.sendKeys("LILAND TAXATION");

		Code.sendKeys("LILAND TAXATION");

		save.sendKeys(Keys.ENTER);

		String expectedTitle = "Coupon Category Updated Successfully";
		String actualTitle = driver.getTitle();

		// Assertion: Check if the actual title matches the expected title
		Assert.assertEquals(actualTitle, expectedTitle, "Coupon Category Updated Successfully");
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(69));
		wait.until(ExpectedConditions.visibilityOf(toste));
		System.out.println(toste.getText());
	}
}


