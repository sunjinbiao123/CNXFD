package com.webtest.test;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.page.AppearancePage;
import com.webtest.page.BaseTest;


public class AppearancePageTest extends BaseTest {
	AppearancePage Page2;
	@BeforeClass
	public void initClass() throws InterruptedException {
		 Page2  =new AppearancePage(driver);
		 login("admin", "sjb123456");
		 driver.findElement(By.linkText("配置")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("调查全局设置")).click();
		 Thread.sleep(2000);
		 
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.findElement(By.id("sidemenu_presentation")).click();
	}
	@AfterMethod
	public void AfterMethod() {
		driver.findElement(By.linkText("保存")).click();
	}
	//导航数据
	@Test
	public void test9() {
		Page2 .Navigation();
	}
	@Test
	public void test10() {
		Page2.Navigation("-1");
	}
	@Test
	public void test11() {
		Page2.Navigation("10");
	}
	//显示问题索引
	@Test
	public void test12() throws InterruptedException {
		buttonclick("'questionindex_opt2'");
	}
	@Test
	public void test13()throws InterruptedException {
		buttonclick("'questionindex_opt3'");
	}
	//显示问题组名
	@Test
	public void test14() {
		Page2.showGroupInfo("B");
	}
	@Test
	public void test15() {
		Page2.showGroupInfo("N");
	}
	@Test
	public void test16() {
		Page2.showGroupInfo("D");
	}
	
	@Test
	public void test17() {
		Page2.showGroupInfo("X");
	}
	//显示问题编号，编码
	@Test
	public void test18() {
		Page2.showGroupCode("B");
	}
	@Test
	public void test19() {
		Page2.showGroupCode("N");
	}
	@Test
	public void test20() {
		Page2.showGroupCode("C");
	}
	@Test
	public void test21() {
		Page2.showGroupCode("X");
	}
	//显示问题数
	@Test
	public void test22() throws InterruptedException {
		buttonclick("'showxquestions_opt1'");
	}
	//欢迎界面
	@Test
	public void test23()throws InterruptedException{
		buttonclick("'showwelcome_opt1'");
	}
	//显示后退导航
	@Test
	public void test24() throws InterruptedException {
		buttonclick("'allowprev_opt1'");
	}
	//显示进度条
	@Test
	public void test25() throws InterruptedException {
		buttonclick("'showprogress_opt1'");
	}
	//显示参与者打印答案
	@Test
	public void test26() throws InterruptedException {
		buttonclick("'printanswers_opt1'");
	}
	//公开统计数据
	@Test
	public void test27() throws InterruptedException {
		buttonclick("'publicstatistics_opt1'");
	}
	//公开统计内显示统计图
	@Test
	public void test28() throws InterruptedException {
		buttonclick("'publicgraphs_opt1'");
	}

	
	
	
	
}
