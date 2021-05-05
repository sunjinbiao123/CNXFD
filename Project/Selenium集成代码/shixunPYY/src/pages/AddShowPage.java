package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * 
 * @author 裴莹莹
 * 创建演示参与者
 *
 */
public class AddShowPage {

	public WebDriver driver;

	public  AddShowPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement get_amount() {
		return driver.findElement(By.xpath("//*[@id=\"amount\"]"));
	}
	
	public WebElement get_tokenlen() {
		return driver.findElement(By.xpath("//*[@id=\"tokenlen\"]"));
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
	
	public WebElement get_usesleft() {
		return driver.findElement(By.xpath("//*[@id=\"usesleft\"]"));
	}
	
	public WebElement get_save_button() {
		return driver.findElement(By.xpath("//*[@id=\"save-button\"]"));
	}
	
	public void add_show_participant(String amount,String tokenlen,String firstname,String lastname,String email,String usesleft) throws InterruptedException {
		get_amount().clear();
		get_amount().sendKeys(amount);
		get_tokenlen().clear();
		get_tokenlen().sendKeys(tokenlen);
		get_firstname().sendKeys(firstname);
		get_lastname().sendKeys(lastname);
		get_email().sendKeys(email);
		get_usesleft().clear();
		get_usesleft().sendKeys(usesleft);
		Thread.sleep(3000);
		get_save_button().click();
		Thread.sleep(3000);
	}
}
