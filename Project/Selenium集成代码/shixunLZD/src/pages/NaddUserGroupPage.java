package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//姓名：刘志丹   学号：2018012017
//添加用户组页面对象类
public class NaddUserGroupPage {
	public WebDriver driver;

	public NaddUserGroupPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement cli_add() {
		return driver.findElement(By.xpath("//a[contains(@href, 'addGroup')]"));
	}
	public WebElement get_groupname() {
		return driver.findElement(By.id("group_name"));
	}
	public WebElement get_groupdesc() {
		return driver.findElement(By.id("group_description"));
	}
	public WebElement get_save() {
		return driver.findElement(By.id("save-form-button"));
	}
	public void add_group(String name,String desc) throws InterruptedException {
		get_groupname().sendKeys(name);
		get_groupdesc().sendKeys(desc);
		Thread.sleep(2000);
		get_save().click();
		Thread.sleep(3000);
	}
	public void addGroupName(String name) throws InterruptedException {
		get_groupname().sendKeys(name);
		Thread.sleep(2000);
		get_save().click();
		Thread.sleep(3000);
	}
	public void addGroupDesc(String desc) throws InterruptedException {
		get_groupdesc().sendKeys(desc);
		Thread.sleep(2000);
		get_save().click();
		Thread.sleep(3000);
	}
}
