package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * 
 * @author 裴莹莹
 * 添加参与者/添加调查参与者
 * 
 *
 */
public class AddInquirePage {
	public WebDriver driver;

	public  AddInquirePage(WebDriver driver) {
		this.driver=driver;
	}
	

	public WebElement get_firstname() {
		return driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
	}
	
	public WebElement get_lastname() {
		return driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
	}
	
	public WebElement get_email() {
		return driver.findElement(By.xpath("//*[@id=\"email\"]"));
	}
	
	public WebElement get_emailstatus() {
		return driver.findElement(By.xpath("//*[@id=\"emailstatus\"]"));
	}
	
	public WebElement get_usesleft() {
		return driver.findElement(By.xpath("//*[@id=\"usesleft\"]"));
	}
	
	public WebElement get_save_button() {
		return driver.findElement(By.xpath("//*[@id=\"save-button\"]"));
	}
	
	public void add_inquire(String firstname,String lastname,String email,String emailstatus,String usesleft) throws InterruptedException {
		get_firstname().sendKeys(firstname);
		get_lastname().sendKeys(lastname);
		get_email().sendKeys(email);
		get_emailstatus().clear();
		get_emailstatus().sendKeys(emailstatus);
		get_usesleft().clear();
		get_usesleft().sendKeys(usesleft);
		Thread.sleep(3000);
		get_save_button().click();
		Thread.sleep(3000);
	}

}
