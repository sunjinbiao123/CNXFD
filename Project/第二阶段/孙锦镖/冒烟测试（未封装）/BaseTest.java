package com.edu.core;

import java.awt.Button;

import javax.swing.text.Document;

import org.apache.poi.hssf.record.DrawingRecordForBiffViewer;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.server.HttpInput.SentinelContent;

public class BaseTest {
	static WebDriver driver;
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		 driver =new FirefoxDriver();
	    driver.get("http://localhost/index.php/admin");
		
		Thread.sleep(3000);
		driver.findElement(By.name("user")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("sjb123456");
		Thread.sleep(3000);
		driver.findElement(By.name("login_submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("配置")).click();
		Thread.sleep(1000);
	/*	driver.findElement(By.linkText("插件管理器")).click();
		//安装
		driver.findElement(By.linkText("安装ZIP")).click();
		
		driver.findElement(By.name("the_file")).sendKeys("D:\\297.zip");
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		*/
	/*	Thread.sleep(2000);
		//扫描插件
		
		driver.findElement(By.linkText("扫描文件")).click();
		
		Thread.sleep(3000);
		//从文件系统中删除
		driver.findElement(By.xpath("//a[@class='btn btn-danger']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	*/
		/*	//插件的激活
		driver.findElement(By.xpath("//button[@class='btntooltip btn btn-default btn-xs']")).click();
		Thread.sleep(1000);
		//插件的停用
		driver.findElement(By.xpath("//button[@class='btntooltip btn btn-warning btn-xs']")).click();
		Thread.sleep(1000);
	   
		Alert a=driver.switchTo().alert();   //点击确认
		a.accept();
		//插件的卸载
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btntooltip btn btn-danger btn-xs']")).click();
		Thread.sleep(1000);
		   
		Alert b=driver.switchTo().alert();   //点击确认
		b.dismiss();*/
		//排序
		/*driver.findElement(By.linkText("状态")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("插件")).click();*/
		//driver.findElement(By.linkText("调查全局设置")).click();
		//1.
	//	WebElement a=driver.findElement(By.id("admin"));
//		a.clear();
//		driver.findElement(By.linkText("保存")).click();
//		//2.
//		a.clear();
//		a.sendKeys("123456");
//		driver.findElement(By.linkText("保存")).click();
//		//保存按钮,保存并关闭，关闭按钮
//		//driver.findElement(By.linkText("保存")).click();
//		//driver.findElement(By.linkText("保存并关闭")).click();
//		//driver.findElement(By.linkText("关闭")).click();
//		//3.
//		WebElement b1 =driver.findElement(By.id("adminemail"));
//		b1.clear();
//		driver.findElement(By.linkText("保存")).click();
//		//4.
//		b1.clear();
//		b1.sendKeys("254272669@qq.com");
//		driver.findElement(By.linkText("保存")).click();
//		//5.
//		b1.clear();
//		b1.sendKeys("123456");
//		driver.findElement(By.linkText("保存并关闭")).click();
//		
//		//6.
//		WebElement b2 =driver.findElement(By.id("bounce_eamil"));
//		b1.clear();
//		driver.findElement(By.linkText("保存")).click();
//		//7.
//		b2.clear();
//		b2.sendKeys("254272669@qq.com");
//		driver.findElement(By.linkText("保存")).click();
//		//8.
//		b2.clear();
//		b2.sendKeys("123456");
//		driver.findElement(By.linkText("保存并关闭")).click();
		
		//外观
	//	Thread.sleep(1000);
	//	driver.findElement(By.id("sidemenu_presentation")).click();
		//9.导航
	//	WebElement c=driver.findElement(By.id("navigationdelay"));
	//	c.clear();
//		driver.findElement(By.linkText("保存")).click();
//		//10.
//		c.clear();
//		c.sendKeys("-1");
//		driver.findElement(By.linkText("保存")).click();
//		//11.
//		c.clear();
//		c.sendKeys("10");
//		driver.findElement(By.linkText("保存")).click();
		//12.显示问题组名
	//	WebElement  showIndex=driver.findElement(By.name("showgroupinfo"));
	//	Select select1=new Select(showIndex);
	//	select1.selectByValue("N");
		//13
//		select1.selectByValue("N");
//		//14.
//		select1.selectByValue("O");
//		//15.
//		select1.selectByValue("X");
//		//16.显示问题编号/编码
//		WebElement  showCode=driver.findElement(By.name("showqnumcode"));
//		Select select2=new Select(showCode);
//		select2.selectByValue("B");
//		//17
//		select2.selectByValue("N");
//		//18
//		select2.selectByValue("C");
//		//19
//		select2.selectByValue("X");
		//20.显示问题数
	//	driver.findElement(By.linkText("admin")).click();
		/*Thread.sleep(3000);
		WebElement sq=driver.findElement(By.xpath("//input[@id='showxquestions_opt2']"));
		Actions actions =new Actions(driver);
		actions.moveToElement(sq).click().perform();*/
	/*	
		buttonclick("//input[@id='showxquestions_opt2']");
		buttonclick("//input[@id='showxquestions_opt1']");
		
		//21.欢迎界面
		buttonclick("//input[@id='showwelcome_opt2']");
		buttonclick("//input[@id='showwelcome_opt1']");
		//22.后退导航
		buttonclick("//input[@id='allowprev_opt2']");
		buttonclick("//input[@id='allowprev_opt1']");
		//23.进度条
		buttonclick("//input[@id='showprogress_opt2']");
		buttonclick("//input[@id='showprogress_opt1']");
		//24.参与者打印答案
		buttonclick("//input[@id='printanswers_opt2']");
		buttonclick("//input[@id='printanswers_opt1']");
		//25.公开统计数据
		buttonclick("//input[@id='publicstatistics_opt2']");
		buttonclick("//input[@id='publicstatistics_opt1']");
		//26.允许公开注册
		buttonclick("//input[@id='allowregister_opt1']");
		buttonclick("//input[@id='allowregister_opt2']");
		
		//调查参与者设置
		Thread.sleep(1000);
		driver.findElement(By.id("sidemenu_generalsettings")).click();
		//27.匿名回答:
		//开启
		buttonclick("//input[@id='anonymized_opt1']");

		//28.允许公开注册
		buttonclick("//input[@id='allowregister_opt1']");
		//29.不允许公开注册
		buttonclick("//input[@id='allowregister_opt2']");
	*/	//30.访问代码输入
		/*Thread.sleep(3000);
		driver.get("http://localhost/index.php");
		driver.findElement(By.linkText("0003")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("token")).sendKeys("GsSoJyrTngIcgYR");
		driver.findElement(By.id("default")).click();
		driver.findElement(By.id("ls-button-submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ls-button-submit")).click();*/
		//通知及数据
	/*	Thread.sleep(1000);
		driver.findElement(By.id("sidemenu_notification")).click();
		//31.截止日期:
		buttonclick("//input[@id='datestamp_opt1']");
		
		
		//32.保存ip
		buttonclick("//input[@id='ipaddr_opt1']");
	
		//33.保存次数
		buttonclick("//input[@id='refurl_opt1']");
		
		//34.启动评估模式
		buttonclick("//input[@id='assessments_opt1']");
	
		//发布及访问
		buttonclick("//input[@id='allowsave_opt1']");
		
		Thread.sleep(1000);
		driver.findElement(By.id("sidemenu_publication")).click();
		//35.公开列出调查
		buttonclick("//input[@id='listpublic_opt1']");

		//36.设置cookie以防止重复参与
		buttonclick("//input[@id='usecookie_opt1']");

		//37.使用验证码访问问卷
		buttonclick("//input[@id='usecaptcha_surveyaccess_opt1']");
		//38.注册时启用验证码
		buttonclick("//input[@id='usecaptcha_registration_opt1']");

		//39.保存时启用验证码
		buttonclick("//input[@id='usecaptcha_saveandload_opt1']");
		*/
		//40.扫描安装插件
		
		//41.激活插件
		//42.卸载插件
		//43.排序
		//44.新建菜单  1 空白
		//45新建菜单  2致谢名字
		//46.新建菜单，全写
		//47.重置
		//48.安装zip
		//49.查找更新
		//50.邮件模板上传图片
		
		//菜单
		//driver.findElement(By.linkText("菜单设置")).click();
		//44.
		//driver.findElement(By.linkText("新建")).click();
		//driver.switchTo().alert();
		//Thread.sleep(5000);
		//错误新建
	/*	WebElement show=driver.findElement(By.xpath("//select[@id='Surveymenu_parent_id']"));	
		Select select1=new Select(show);
		select1.selectByValue("2");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@class='input-60 form-control']")).sendKeys("acas");
		driver.findElement(By.name("yt0")).click();
	*/	//正确新建
	/*	WebElement show=driver.findElement(By.xpath("//select[@id='Surveymenu_parent_id']"));	
		Select s1=new Select(show);
		s1.selectByValue("2");
		Thread.sleep(2000);	
		WebElement show2=driver.findElement(By.xpath("//select[@id='Surveymenu_ordering']"));	
		Select s2=new Select(show2);
		s2.selectByValue("2");
		driver .findElement(By.id("Surveymenu_showincollapse")).click();
		driver.findElement(By.xpath("//input[@class='input-60 form-control']")).sendKeys("admin123");
		
		driver.findElement(By.name("yt0")).click();
		*/
	//重置
	/*	Thread.sleep(1000);
		driver.findElement(By.linkText("重置")).click();
		Thread.sleep(2000);
		
		driver .findElement(By.id("reset-menus-confirm")).click();
		
		*/
		
		//菜单项 之搜索
		driver.findElement(By.linkText("菜单项设置")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("SurveymenuEntries_ordering")).sendKeys("1");
		Actions actions =new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
	}
	public static void buttonclick(String path) throws InterruptedException {
		Thread.sleep(3000);
		WebElement sq=driver.findElement(By.xpath(path));
		Actions actions =new Actions(driver);
		actions.moveToElement(sq).click().perform();
		
	}

}
