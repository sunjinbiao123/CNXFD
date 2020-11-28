package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RolePage {
	public WebDriver driver;
	public RolePage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement add_role() {
		return driver.findElement(By.xpath("//*[@id='rolemanagementbar']/div/div/button[1]"));
	}
	public WebElement add_role_name() {
		return driver.switchTo().activeElement().findElement(By.id("Permissiontemplates_name"));
	}
	public WebElement add_role_description() {
		return driver.switchTo().activeElement().findElement(By.id("Permissiontemplates_description"));
	}
	public WebElement add_role_desc() {
		return driver.switchTo().activeElement();
	}
	public WebElement get_save() {
		return driver.findElement(By.id("submitForm"));
	}
	public void addrole(String rolename,String roledesc) throws InterruptedException {
		add_role_name().sendKeys(rolename);
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		add_role_desc().sendKeys(roledesc);
		Thread.sleep(3000);
		get_save().click();
		Thread.sleep(3000); 
		
	}
	public void addrolename(String rolename) throws InterruptedException {
		add_role_name().sendKeys(rolename);
		Thread.sleep(2000);
		get_save().click();
		Thread.sleep(3000); 
		
	}
	public void addroledesc(String desc) throws InterruptedException {
		add_role_description().sendKeys(desc);
		Thread.sleep(2000);
		get_save().click();
		Thread.sleep(3000);
	}

}
