package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class presets {

	private WebDriver driver;

	@FindBy (xpath = "//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/app-sidemenu[1]/div[1]/div[1]/div[2]/div[9]/a[1]")
	private WebElement  Presets_click;

	@FindBy (xpath = "//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-controller-id[1]/app-smart-view-render[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/img[1]")
	private WebElement  presets_create_btn;

	@FindBy (xpath = "//input[@id='template_name']")
	private WebElement  Enter_add_Ons_presets_name;

	@FindBy (xpath = "//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-controller-id[1]/app-smart-view-render[1]/div[1]/div[1]/app-event-render[1]/div[1]/div[2]/app-markup-view[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/img[1]")
	private WebElement  SelectImage1;

	@FindBy (xpath = "//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-controller-id[1]/app-smart-view-render[1]/div[1]/div[1]/app-event-render[1]/div[1]/div[2]/app-markup-view[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/img[1]")
	private WebElement  SelectImage2;

	@FindBy (xpath = "//select[@id='filterCategory']")
	private WebElement  Select_Sub_categories;

	@FindBy (xpath = "//button[@id='btnsave']")
	private WebElement  save;

	@FindBy (xpath = "//button[contains(text(),'Back')]")
	private WebElement cancel ;

	public presets (WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	public void presets_wise() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Presets_click.click();

		presets_create_btn.click();

		Enter_add_Ons_presets_name.sendKeys("whirpool");

		SelectImage1.click();

		SelectImage2.click();

		Select sel = new Select(Select_Sub_categories);
		sel.selectByValue("");		

		save.click();
	}


}
