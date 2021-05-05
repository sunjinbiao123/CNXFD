package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//姓名：刘志丹   学号：2018012017
//删除用户组页面对象类
public class SdeleteUserGroupPage {
	WebDriver driver;
	public SdeleteUserGroupPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement get_delete() {
		return driver.findElement(By.xpath("//*[@id='usergroups-grid-mine']/table/tbody/tr/td[6]/span"));
	}
	public WebElement confirm_delete() {
		return driver.switchTo().activeElement().findElement(By.id("confirm-deletion"));
	}
	public void delete() throws InterruptedException {
		Thread.sleep(2000);
        get_delete().click();
		Thread.sleep(4000);
		confirm_delete().click();
		Thread.sleep(2000);
	}
	

}
