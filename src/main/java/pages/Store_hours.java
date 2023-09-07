package pages;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Store_hours {

	public  WebDriver driver;
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/app-sidemenu[1]/div[1]/div[1]/div[2]/div[5]/a[1]")
	private WebElement Click_store_settings ;

	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-admin[1]/div[1]/div[2]/app-sidemenu[1]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]")
	private WebElement  click_Store_Hours;

	@FindBy(xpath="//img[@class='mr-2 img-typ']")
	private WebElement Store_Hours_create_btn;


	@FindBy(xpath="//input[@id='store_name']")
	private WebElement  Enter_Name ;

	@FindBy(xpath="//select[@id='store_timezone']")
	private WebElement Set_Your_TimeZone ;

	@FindBy(xpath="//input[@id='endtime_Mon_0']")
	private WebElement Monday;

	@FindBy(xpath="//select[@id='store_buffer_time']")
	private WebElement Set_Store_Buffer_Time ;

	@FindBy(xpath="//button[@id='sphbtn']")
	private WebElement Add_Special_Hours;

	@FindBy(xpath="//input[@name='name[]']")
	private WebElement Special_Hours_and_Closures_name ;

	@FindBy(xpath="//tbody/tr[1]/td[2]/div[1]/div[1]/input[1]")
	private WebElement Dates ;

	@FindBy(xpath="//input[@id='123_starttime']")
	private WebElement Open_hours;

	@FindBy(xpath="//input[@id='123_endtime']")
	private WebElement Close_hours;

	@FindBy(xpath="//button[@id='btnsave']")
	private WebElement save_store_hours;



	public Store_hours(WebDriver driver) {

		this.driver=driver;

		PageFactory.initElements(driver, this);

	}

	public void store_hours_creation_part() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Click_store_settings.click();
		//Thread.sleep(7000);

		// to delete all cookies
		driver.manage().deleteAllCookies();

		//driver.switchTo().window(ID);

		// getWindowHandle method to get ID of main window(parent window)

		//new code added 
		Set<String> handles = driver.getWindowHandles();
		String handle = (String) handles.toArray()[1];
		driver.switchTo().window(handle);




		//        String Parent_id = driver.getWindowHandle();
		//        System.out.println(Parent_id);
		// 
		//        // getWindowHandle method to get ID of new window (child window)
		//        Set<String> Child_id = driver.getWindowHandles();
		// 
		//        // for each loop
		//        for (String a : Child_id) {
		//            // it will print IDs of both window
		//            System.out.println(a);
		// 
		//           
		//            if (Parent_id.equals(a)) {
		//            }
		//            else { // to change focus on new window
		//                driver.switchTo().window(a);
		//                Thread.sleep(2000);
		//            }
		//        }
		//        
		WebElement link = driver.findElement(By.partialLinkText("Store Hou"));
		link.click();

		// Get handles of all open windows
		Set<String> windowHandles = driver.getWindowHandles();

		// Switch to the new window
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
		}
		// Perform actions in the new window

		// Switch back to the original window
		driver.switchTo().defaultContent();

		click_Store_Hours.click();
		Thread.sleep(9000);



	//	WebElement xpath1 = driver.findElement(By.xpath("//img[@class='mr-2 img-typ']"));
	//	WebElement element = wait.until(
	//			ExpectedConditions.elementToBeClickable((xpath1)));


		/*
		 * Wait<WebDriver> Wait = new FluentWait<WebDriver>(driver)
		 * .withTimeout(Duration.ofSeconds(30)) .pollingEvery(Duration.ofSeconds(5))
		 * .ignoring(NoSuchElementException.class);
		 */


		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='mr-2 img-typ']")));
		//button.click();

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Store_Hours_create_btn.click();

		Enter_Name.sendKeys("The Glenwalks Label");

		Select sel1 = new Select(Set_Your_TimeZone);
		sel1.selectByValue("US/Central");

		Monday.sendKeys("20:20");

		Select sel2 = new Select(Set_Store_Buffer_Time);
		sel2.selectByValue("30 minutes");

		Add_Special_Hours.click();

		Special_Hours_and_Closures_name.sendKeys("DASAARA AGTAN ");

		Dates.sendKeys("28-08-2023");
		Open_hours.sendKeys("08:50");

		Close_hours.sendKeys("11:50");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='save_specialHours']")).click();
		
		
		save_store_hours.click();


	}









}