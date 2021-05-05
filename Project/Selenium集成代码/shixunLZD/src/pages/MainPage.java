package pages;

import org.apache.log4j.chainsaw.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//姓名：刘志丹   学号：2018012017
//添加用户和添加虚拟用户页面对象类
public class MainPage {
	public WebDriver driver;

	public  MainPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement get_usersname() {
		return  driver.findElement(By.id("User_Form_users_name"));
	}
	public WebElement get_fullname() {
		return driver.findElement(By.id("User_Form_full_name"));
	}
	public WebElement get_email() {
		return driver.findElement(By.id("User_Form_email"));
	}
	public WebElement get_sub() {
		return driver.findElement(By.id("submitForm"));
	}
	public WebElement get_add() {
		return driver.findElement(By.xpath("//button[text()=' 添加用户                    ']"));
	}
	public WebElement cli_true() {
		return driver.findElement(By.xpath("//*[@id='utility_set_password']/div[2]/label[1]"));
	}
	public WebElement get_password1() {
		return driver.findElement(By.id("User_Form_password"));
	}
	public WebElement get_password2() {
		return driver.findElement(By.id("password_repeat"));
	}
	public WebElement cli_addX() {
		return driver.findElement(By.xpath("//button[text()=' 添加虚拟用户                    ']"));
	}
	public WebElement add_XnUser() {
		return driver.findElement(By.id("submitForm"));
	}
	public void add_new_user(String username,String fullname,String email) throws InterruptedException {
		get_usersname().sendKeys(username);
		get_fullname().sendKeys(fullname);
		get_email().sendKeys(email);
		Thread.sleep(2000);
		get_sub().click();
		Thread.sleep(2000);
	}
	public void add_new_user_withPassword(String username,String fullname,String email,String password) throws InterruptedException {
		get_usersname().sendKeys(username);
		get_fullname().sendKeys(fullname);
		get_email().sendKeys(email);
		Thread.sleep(2000);
		cli_true().click();
		Thread.sleep(3000);
		get_password1().sendKeys(password);
		get_password2().sendKeys(password);
		Thread.sleep(2000);
		get_sub().click();
		Thread.sleep(3000);
	}
	public void add_xn_user() throws InterruptedException {
		add_XnUser().click();
		Thread.sleep(3000);
	}

}
