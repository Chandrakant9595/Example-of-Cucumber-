package stepDefination;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataDrivenUsingTableStepDefination {
	
	WebDriver driver;
	
	@Given("^admin is on home page$")
	public void admin_is_on_home_page(){
	    
		System.setProperty("webdriver.chrome.driver","/home/nadsoft/AutomationSoftware/ChromrDriver/chromedriver"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dev.drive-on.com.au/login/");
	}

	@When("^verify the url$")
	public void verify_the_url(){
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://dev.drive-on.com.au/login/", url);  
	}

	@Then("^admin enter username and password$")
	public void admin_enter_username_and_password(DataTable dt) {
	    
		List<List<String>> data = dt.raw();
		driver.findElement(By.id("user_login")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("user_pass")).sendKeys(data.get(0).get(1));
	}

	@Then("^admin click on login button$")
	public void admin_click_on_login_button(){
	    
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
	}

	@Then("^url verify the home page$")
	public void url_verify_the_home_page(){
	    
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://dev.drive-on.com.au/partners/my-dashboard/", url);
	}

	@Then("^open Add Living Cost page$")
	public void open_Add_Living_Cost_page() throws InterruptedException{
	    
		//click on manage back end
		driver.findElement(By.xpath(".//*[@id='side-menu']/li[7]/a")).click();
		Thread.sleep(300);
		//click on manage living cost
		driver.findElement(By.xpath(".//*[@id='side-menu']/li[7]/ul/li[4]/a")).click();
		Thread.sleep(300);
		//click on add living cost 
		driver.findElement(By.xpath(".//*[@id='side-menu']/li[7]/ul/li[4]/ul/li[2]/a")).click();
		Thread.sleep(300);
	}

	@Then("^admin enter livinh cost details$")
	public void admin_enter_livinh_cost_details(DataTable dt){
	    
		List<List<String>> data = dt.raw();
		driver.findElement(By.id("leaving_type_name")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("leaving_cost")).sendKeys(data.get(0).get(1));
		driver.findElement(By.xpath(".//*[@id='submit_btn']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[2]")));
		
		String msg = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(msg);
		Assert.assertEquals("test1", msg);
	}

	@Then("^driver close the browser$")
	public void driver_close_the_browser(){
	    
		driver.quit();
	}

}
