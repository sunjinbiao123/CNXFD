package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//姓名：刘志丹   学号：2018012017
//登录页面对象类
public class LoginPage {
	public WebDriver driver;

    public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
    public WebElement get_username() {
    	return 	driver.findElement(By.name("user"));
    }
    public WebElement get_password() {
    	return driver.findElement(By.name("password"));
		
	}
    public  WebElement get_submit(){
    	return driver.findElement(By.name("login_submit"));
	}

	public void login(String username,String password) throws InterruptedException {
		get_username().sendKeys(username);
		get_password().sendKeys(password);
		Thread.sleep(2000);
		get_submit().click();
		Thread.sleep(2000);
	}
	

}
