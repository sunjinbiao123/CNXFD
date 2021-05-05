package pages;

import org.apache.log4j.chainsaw.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * 
 * @author 裴莹莹
 *参与者中央数据库模块/属性管理页面
 *参与者中央数据库模块/参与者集中管理页面
 */

public class MainPage {
	public WebDriver driver;

	public  MainPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement get_firstname() {
		return driver.findElement(By.xpath("//*[@id=\"Participant_firstname\"]"));
	}
	
	public WebElement get_lastname() {
		return driver.findElement(By.xpath("//*[@id=\"Participant_lastname\"]"));
	}
	
	public WebElement get_email() {
		return driver.findElement(By.xpath("//*[@id=\"Participant_email\"]"));
	}
	
	public WebElement get_language() {
		return driver.findElement(By.xpath("//*[@id=\"Participant_language\"]"));
	}
	
	public WebElement get_hei() {
		return driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/form/div[4]/div/div"));
	}
	
	public WebElement get_uid() {
		return driver.findElement(By.xpath("//*[@id=\"owner_uid\"]"));
	}
	
	public WebElement get_attributes() {
		return driver.findElement(By.xpath("//*[@id=\"Attributes_ea_7\"]"));
	}
	
	public WebElement get_save1() {
		return driver.findElement(By.xpath("//button[text()='保存']"));
	}
	
	public WebElement get_addcpp() {
		return driver.findElement(By.xpath("//*[@id=\"addParticipantToCPP\"]"));
	}
	
	
	public WebElement get_defaultname() {
		return driver.findElement(By.xpath("//*[@id=\"ParticipantAttributeName_defaultname\"]"));
	}
	
	public WebElement get_attribute_type() {
		return driver.findElement(By.xpath("//*[@id=\"ParticipantAttributeName_attribute_type\"]"));
	}
	
	public WebElement get_visual() {
		return driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/form/div[3]/div/div"));
	}
	
	public WebElement get_encryption() {
		return driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/form/div[4]/div/div"));
	}
	
	public WebElement get_addLanguage_language() {
		return driver.findElement(By.xpath("//*[@id=\"ParticipantAttributeName_addLanguage_language\"]"));
	}
	
	public WebElement get_zh_Hans() {
		return driver.findElement(By.xpath("//*[@id=\"ParticipantAttributeNameLanguages_zh-Hans\"]"));
	}
	
	public WebElement get_save2() {
		return driver.findElement(By.xpath("//button[text()='保存']"));
	}
	
	public WebElement get_addAttributeName() {
		return driver.findElement(By.xpath("//*[@id=\"addParticipantAttributeName\"]"));
	}
	
	
	public void add_new_participant(String firstname,String lastname,String email) throws InterruptedException {
		get_firstname().sendKeys(firstname);
		get_lastname().sendKeys(lastname);
		get_email().sendKeys(email);
		Thread.sleep(2000);
		get_save1().click();
		Thread.sleep(2000);
	}
	
	public void add_new_property(String defaultname,String zhHans) throws InterruptedException {
		get_defaultname().sendKeys(defaultname);
		get_zh_Hans().sendKeys(zhHans);
		
		Thread.sleep(2000);
		get_save2().click();
		Thread.sleep(2000);
	}

}
