package Base;

import org.openqa.selenium.By;

public class LoginPage extends BaseTest {
	
	public void login(String username,String password) throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.name("user")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.name("login_submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/div/div/div[3]/button")).click();
	}

}
