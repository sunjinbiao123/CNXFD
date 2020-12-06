package com.test.demo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.base.BaseTest;
import com.test.utils.ExcelDataProvider;

public class SmokeTesting extends BaseTest {
	
	@BeforeClass
	public void testLogin() throws InterruptedException {		
			webtest.open("http://localhost:7777/index.php/admin/authentication/sa/login");
			webtest.type("name=user","admin" );
			webtest.type("name=password", "admin");
			webtest.click("name=login_submit");
			webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
			assertTrue(webtest.isElementPresent("id=notification-bell"));	
	}
	
	@DataProvider(name = "testData1")
	public Object[][] testData1() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data_excel/data.xlsx", "Sheet1");
	}
	
	@DataProvider(name = "testData2")
	public Object[][] testData2() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data_excel/data.xlsx", "Sheet2");
	}
	
	@DataProvider(name = "testData3")
	public Object[][] testData3() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data_excel/data.xlsx", "Sheet3");
	}
	
	@DataProvider(name = "testData4")
	public Object[][] testData4() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data_excel/data.xlsx", "Sheet4");
	}
	
	@DataProvider(name = "testData5")
	public Object[][] testData5() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data_excel/data.xlsx", "Sheet5");
	}
	
	@Test(priority = 1)
	public void testLogoOff() throws InterruptedException {
		if (webtest.isElementPresent("id=lime-logo")) {
			webtest.click("link=配置");
			webtest.click("link=主页设定");
			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[2]/div[1]/div");
			webtest.click("link=关闭");
			assertTrue(!webtest.isElementPresent("id=lime-logo"));
		}
	}
	
	@Test(priority = 2)
	public void testLogoOn() throws InterruptedException{
		if (!webtest.isElementPresent("id=lime-logo")) {
			webtest.click("link=配置");
			webtest.click("link=主页设定");
			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[2]/div[1]/div");
			webtest.click("link=关闭");
			assertTrue(webtest.isElementPresent("id=lime-logo"));
		}
	}
	
	@Test(priority = 3)
	public void testSurveyListOn() throws InterruptedException {
		if (!webtest.isElementPresent("id=survey-grid")) {
			webtest.click("link=配置");
			webtest.click("link=主页设定");
			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[3]/div[1]/div");
			webtest.click("link=关闭");
			assertTrue(webtest.isElementPresent("id=survey-grid"));
		}
	}
	
	@Test(priority = 4)
	public void testSurveyListOff() throws InterruptedException {
		if (webtest.isElementPresent("id=survey-grid")) {
			webtest.click("link=配置");
			webtest.click("link=主页设定");
			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[3]/div[1]/div");
			webtest.click("link=关闭");
			assertTrue(!webtest.isElementPresent("id=survey-grid"));
		}
	}
	
	@Test(priority = 5)
	public void testContainerOff() throws InterruptedException {
		if (webtest.isElementPresent("class=container ls-flex ls-panelboxes selector__lstour--mainfunctionboxes")) {
			webtest.click("link=配置");
			webtest.click("link=主页设定");
			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[4]/div/div");
			webtest.click("link=关闭");
			assertTrue(!webtest.isElementPresent("class=container ls-flex ls-panelboxes selector__lstour--mainfunctionboxes"));
		}
	}
	
	@Test(priority = 6)
	public void testContainerOn() throws InterruptedException {
		if (!webtest.isElementPresent("class=container ls-flex ls-panelboxes selector__lstour--mainfunctionboxes")) {
			webtest.click("link=配置");
			webtest.click("link=主页设定");
			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[4]/div/div");
			webtest.click("link=关闭");
			assertTrue(webtest.isElementPresent("class=container ls-flex ls-panelboxes selector__lstour--mainfunctionboxes"));
		}
	}
	
	@Test(priority = 7)
	public void testLastSurveyOff() throws InterruptedException {
		if (webtest.isElementPresent("id=last_survey")) {
			webtest.click("link=配置");
			webtest.click("link=主页设定");
			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[2]/div[2]/div");
			webtest.click("link=关闭");
			assertTrue(!webtest.isElementPresent("id=last_survey"));
		}
	}
	
	@Test(priority = 8)
	public void testLastSurveyOn() throws InterruptedException {
		if (!webtest.isElementPresent("id=last_survey")) {
			webtest.click("link=配置");
			webtest.click("link=主页设定");
			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[2]/div[2]/div");
			webtest.click("link=关闭");
			assertTrue(webtest.isElementPresent("id=last_survey"));
		}
		
	}
	
	@Test(priority = 9)
	public void testSearchOff() throws InterruptedException {
		this.testSurveyListOn();
		if (webtest.isElementPresent("id=Survey_searched_value")) {
			webtest.click("link=配置");
			webtest.click("link=主页设定");
			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[3]/div[2]/div");
			webtest.click("link=关闭");
			assertTrue(!webtest.isElementPresent("id=Survey_searched_value"));
		}
		this.testSurveyListOff();
	}
	
	@Test(priority = 10)
	public void testSearchOn() throws InterruptedException {
		this.testSurveyListOn();
		if (!webtest.isElementPresent("id=Survey_searched_value")) {
			webtest.click("link=配置");
			webtest.click("link=主页设定");
			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[3]/div[2]/div");
			webtest.click("link=关闭");
			assertTrue(webtest.isElementPresent("id=Survey_searched_value"));
		}
		this.testSurveyListOff();
	}
	
	@Test(priority = 11)
	public void testChangeCol() throws InterruptedException {
		if (webtest.isElementPresent("class=col-md-4 col-sm-8 ls-flex-column ls-panelboxes-panelbox text-primary")) {
			webtest.click("link=配置");
			webtest.click("link=主页设定");
			webtest.typeAndClear("id=iBoxesByRow", "4");
			webtest.click("id=save_boxes_setting");
			webtest.click("link=关闭");
			assertTrue(webtest.isElementPresent("class=col-md-3 col-sm-6 ls-flex-column ls-panelboxes-panelbox text-primary"));
		}
	}
	
	@Test(priority = 12)
	public void testChangeBtnDirection() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=主页设定");
		webtest.selectByValue("id=iBoxesOffset", "1");
		webtest.click("id=save_boxes_setting");
		webtest.click("link=关闭");
	}
	
	@Test(priority = 13)
	public void testCreateBtn() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=主页设定");
		webtest.click("link=创建一个新按钮");
		webtest.type("id=Box_position", "7");
		webtest.type("id=Box_url", "admin/survey/sa/newsurvey");
		webtest.type("id=Box_title", "test btn Survey Create");
		webtest.click("class=btn-group");
		webtest.click("xpath=//*[@id='boxes-form']/div[4]/div/div/ul/li/div/div[1]/ul/li[2]");
		webtest.type("id=Box_desc", "test");
		webtest.selectByValue("id=Box_usergroup", "-2");
		webtest.click("id=save-and-close-form-button");
		webtest.click("link=关闭");
		assertTrue(webtest.isElementPresent("id=panel-7"));
	}
	
	@Test(priority = 14)
	public void testDeleteBtn() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=主页设定");
		webtest.click("xpath=//*[@id='yw0']/table/tbody/tr[6]/td[7]/a[2]");
		webtest.click("xpath=//button[text()='是，删除']");
		webtest.click("link=关闭");
		assertTrue(!webtest.isElementPresent("id=panel-6"));
	}
	
	@Test(priority = 23)
	public void testRestoreBtn() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=主页设定");
		webtest.click("link=恢复成默认按钮组");
		webtest.click1("id=dataConfirmOK");
		webtest.click("link=关闭");
		assertTrue(webtest.isElementPresent("id=panel-6"));
	}
		
	@Test(priority = 16)
	public void testEditBtnPosition() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=主页设定");
		webtest.click("xpath=//*[@id='yw0']/table/tbody/tr[2]/td[7]/a[1]");
		webtest.typeAndClear("id=Box_position", "7");
		webtest.click("id=save-and-close-form-button");
		webtest.click("link=关闭");
		assertTrue(webtest.isElementPresent("id=panel-7"));
	}
	
	@Test(priority = 17)
	public void testEditBtnUrl() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=主页设定");
		webtest.click("xpath=//*[@id='yw0']/table/tbody/tr[2]/td[7]/a[1]");
		webtest.typeAndClear("id=Box_url", "admin/survey/sa/newsurvey");
		webtest.click("id=save-and-close-form-button");
		webtest.click("link=关闭");
		webtest.click("id=panel-7");
		assertTrue(webtest.isElementPresent("id=surveyTitle"));
	}
	
	@Test(priority = 18)
	public void testEditBtnTitle() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=主页设定");
		webtest.click("xpath=//*[@id='yw0']/table/tbody/tr[2]/td[7]/a[1]");
		webtest.typeAndClear("id=Box_title", "title edit");
		webtest.click("id=save-and-close-form-button");
		webtest.click("link=关闭");
		assertEquals(webtest.getText("xpath=//*[@id='panel-7']/div[1]/div"), "title edit");
	}
	
	@Test(priority = 19)
	public void testEditBtnIcon() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=主页设定");
		webtest.click("xpath=//*[@id='yw0']/table/tbody/tr[2]/td[7]/a[1]");
		webtest.click("class=btn-group");
		webtest.click("xpath=//*[@id='boxes-form']/div[4]/div/div/ul/li/div/div[3]/ul/li[18]");
		webtest.click("id=save-and-close-form-button");
		webtest.click("link=关闭");
		assertTrue(webtest.isElementPresent("class=icon-usergroup"));
	}
	
	@Test(priority = 20)
	public void testEditBtnDescription() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=主页设定");
		webtest.click("xpath=//*[@id='yw0']/table/tbody/tr[2]/td[7]/a[1]");
		webtest.typeAndClear("id=Box_desc", "description edit");
		webtest.click("id=save-and-close-form-button");
		webtest.click("link=关闭");
		assertEquals(webtest.getText("xpath=//*[@id='panel-7']/div[2]/div[2]"), "description edit");
	}
	
	@Test(priority = 21)
	public void testEditBtnShowTo() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=主页设定");
		webtest.click("xpath=//*[@id='yw0']/table/tbody/tr[2]/td[7]/a[1]");
		webtest.selectByValue("id=Box_usergroup", "-3");
		webtest.click("id=save-and-close-form-button");
		webtest.click("link=关闭");
		assertTrue(webtest.isElementPresent("id=panel-7"));
	}
	
	@Test(dataProvider = "testData1",priority = 22)
	public void testCreateBtnFromExcel(String position,String url,String title,String desc) throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=主页设定");
		webtest.click("link=创建一个新按钮");
		webtest.type("id=Box_position", position);
		webtest.type("id=Box_url", url);
		webtest.type("id=Box_title", title);
		webtest.click("class=btn-group");
		webtest.click("xpath=//*[@id='boxes-form']/div[4]/div/div/ul/li/div/div[1]/ul/li[2]");
		webtest.type("id=Box_desc", desc);
		webtest.selectByValue("id=Box_usergroup", "-2");
		webtest.click("id=save-and-close-form-button");
		webtest.click("link=关闭");
		assertTrue(webtest.isElementPresent("id=panel-"+Integer.parseInt(position)));
	}
	
	@Test(dataProvider = "testData1",priority = 15)
	public void testEditBtnFromExcel(String position,String url,String title,String desc) throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=主页设定");
		webtest.click("xpath=//*[@id='yw0']/table/tbody/tr[2]/td[7]/a[1]");
		webtest.typeAndClear("id=Box_position", position);
		webtest.typeAndClear("id=Box_url", url);
		webtest.typeAndClear("id=Box_title", title);
		webtest.click("class=btn-group");
		webtest.click("xpath=//*[@id='boxes-form']/div[4]/div/div/ul/li/div/div[1]/ul/li[2]");
		webtest.typeAndClear("id=Box_desc", desc);
		webtest.selectByValue("id=Box_usergroup", "-2");
		webtest.click("id=save-and-close-form-button");
		webtest.click("link=关闭");
		assertTrue(webtest.isElementPresent("id=panel-"+Integer.parseInt(position)));
	}
	
	@Test(priority = 24)
	public void testShowPhpConf() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=总览");
		webtest.click("link=显示PHP配置信息");
		webtest.getWindow(1);
		Thread.sleep(1000);
		assertEquals(webtest.getTitle(), "PHP 7.3.4 - phpinfo()");
		webtest.getWindow(0);
		Thread.sleep(1000);
		webtest.click("id=save-and-close-form-button");
	}
	
	@Test(priority = 25)
	public void testChangeSiteName() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=常规");
		webtest.typeAndClear("id=sitename", "test edit LimeSurvey");
		webtest.click("id=save-and-close-form-button");
		Thread.sleep(1000);
		assertEquals(webtest.getTitle(), "test edit LimeSurvey");
	}
	
	@Test(priority = 26)
	public void testChangeDefaultTheme() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=常规");
		webtest.selectByValue("id=defaulttheme", "vanilla");
		webtest.click("id=save-and-close-form-button");
	}
	
	@Test(priority = 27)
	public void testChangeAdminTheme() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=常规");
		webtest.selectByValue("id=admintheme", "Purple_Tentacle");
		webtest.click("id=save-and-close-form-button");
		assertEquals(webtest.getColor("link=配置"), "rgb(153, 51, 153)");
	}
	
	@Test(priority = 28)
	public void testChangeTimeAdjust() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=常规");
		webtest.typeAndClear("id=timeadjust", "5");
		webtest.click("save-form-button");
		assertEquals(webtest.getValue("id=timeadjust"),"5");
		webtest.click("id=save-and-close-form-button");
	}
	
	@Test(priority = 29)
	public void testChangeCharacterset() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=常规");
		webtest.selectByValue("id=characterset", "gbk");
		webtest.click("save-form-button");
		assertEquals(webtest.getSelect("id=characterset").getFirstSelectedOption().getText(),"GBK 简体中文");
		webtest.click("id=save-and-close-form-button");
	}
	
	@Test(priority = 30)
	public void testChangeKeys() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=常规");
		webtest.typeAndClear("id=ipInfoDbAPIKey", "a");
		webtest.typeAndClear("id=googleMapsAPIKey", "b");
		webtest.typeAndClear("id=googleanalyticsapikey", "c");
		webtest.typeAndClear("id=googletranslateapikey", "d");
		webtest.click("save-form-button");
		assertEquals(webtest.getValue("id=ipInfoDbAPIKey"), "a");
		webtest.click("id=save-and-close-form-button");
	}
	
	@Test(dataProvider = "testData2",priority = 31)
	public void testChangeKeysFromRxcel(String ikey,String gmkey,String gakey,String gtkey) throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=常规");
		webtest.typeAndClear("id=ipInfoDbAPIKey", ikey);
		webtest.typeAndClear("id=googleMapsAPIKey", gmkey);
		webtest.typeAndClear("id=googleanalyticsapikey", gakey);
		webtest.typeAndClear("id=googletranslateapikey", gtkey);
		webtest.click("save-form-button");
		assertEquals(webtest.getValue("id=ipInfoDbAPIKey"), ikey);
		webtest.click("id=save-and-close-form-button");
	}
	
	@Test(priority = 32)
	public void testChangeToSoftMode() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=常规");
		webtest.click("xpath=//label[text()='软锁']");
		webtest.click("save-form-button");
		webtest.click("id=save-and-close-form-button");
		assertTrue(webtest.isElementPresent("link=维护模式已激活！"));
	}
	
	@Test(priority = 33)
	public void testChangeToHardMode() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=常规");
		webtest.click("xpath=//label[text()='全锁']");
		webtest.click("save-form-button");
		webtest.click("id=save-and-close-form-button");
		assertTrue(webtest.isElementPresent("link=维护模式已激活！"));
	}
	
	@Test(priority = 34)
	public void testChangeToClosedMode() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=常规");
		webtest.click("xpath=//label[text()='关']");
		webtest.click("save-form-button");
		webtest.click("id=save-and-close-form-button");
		assertTrue(!webtest.isElementPresent("link=维护模式已激活！"));
	}
	
	@Test(priority = 35)
	public void testRefreshAssets() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=常规");
		webtest.click("link=立即清除");
		webtest.click("save-form-button");
		assertNotEquals(webtest.getText("xpath=//*[@id='general']/div/div[2]/div[2]/div/label/small"), "(1)");
		webtest.click("id=save-and-close-form-button");
	}
	
	@Test(priority = 36)
	public void testChangeHtmlEditor1() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=常规");
		webtest.click("xpath=//label[text()='所见即所得编辑器']");
		webtest.click("save-form-button");
		assertEquals(webtest.getAttribute("id=defaulthtmleditormode_opt1", "checked"), "true");
		webtest.click("id=save-and-close-form-button");
	}
	
	@Test(priority = 37)
	public void testChangeHtmlEditor2() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=常规");
		webtest.click("xpath=//label[text()='源代码']");
		webtest.click("save-form-button");
		assertEquals(webtest.getAttribute("id=defaulthtmleditormode_opt2", "checked"), "true");
		webtest.click("id=save-and-close-form-button");
	}
	
	@Test(priority = 38)
	public void testChangeDefaultAdminEmail() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=邮件设置");
		webtest.typeAndClear("id=siteadminemail", "testchangedemail@qq.com");
		webtest.click("id=save-and-close-form-button");
		webtest.click("link=admin");
		webtest.click("link=我的账号");
		assertEquals(webtest.getValue("id=email"), "testchangedemail@qq.com");
		webtest.click("id=save-and-close-form-button");
	}
	
	@Test(priority = 39)
	public void testChangeSiteAdminName() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=邮件设置");
		webtest.typeAndClear("id=siteadminname", "testChangedAdmin");
		webtest.click("id=save-and-close-form-button");
		webtest.click("link=admin");
		webtest.click("link=我的账号");
		assertEquals(webtest.getValue("id=fullname"), "testChangedAdmin");
		webtest.click("id=save-and-close-form-button");
	}
	
	@Test(dataProvider = "testData3",priority = 40)
	public void testChangeSMTPFromExcel(String smtphost,String smtpuser,String smtppwd) throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=邮件设置");
		webtest.click("xpath=//label[text()='SMTP']");
		webtest.typeAndClear("id=emailsmtphost", smtphost);
		webtest.typeAndClear("id=emailsmtpuser", smtpuser);
		webtest.typeAndClear("id=emailsmtppassword", smtppwd);
		webtest.click("id=save-form-button");
		assertEquals(webtest.getValue("id=emailsmtphost"), smtphost);
		webtest.click("id=save-and-close-form-button");
	}
	
	@Test(priority = 41)
	public void testChangeSMTPSSL1() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=邮件设置");
		webtest.click("xpath=//label[text()='SSL']");
		webtest.click("id=save-form-button");
		assertEquals(webtest.getAttribute("id=emailsmtpssl_opt2", "checked"), "true");
		webtest.click("id=save-and-close-form-button");
	}
	
	@Test(priority = 42)
	public void testChangeSMTPSSL2() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=邮件设置");
		webtest.click("xpath=//label[text()='TLS']");
		webtest.click("id=save-form-button");
		assertEquals(webtest.getAttribute("id=emailsmtpssl_opt3", "checked"), "true");
		webtest.click("id=save-and-close-form-button");
	}
	
	@Test(priority = 43)
	public void testChangeSMTPDebug1() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=邮件设置");
		webtest.click("xpath=//label[text()='发生错误时']");
		webtest.click1("id=save-form-button");
		assertEquals(webtest.getAttribute("id=emailsmtpdebug_opt2", "checked"), "true");
		webtest.click("id=save-and-close-form-button");
	}
	
	@Test(priority = 44)
	public void testChangeSMTPDebug2() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=邮件设置");
		webtest.click("xpath=//label[text()='始终']");
		webtest.click1("id=save-form-button");
		assertEquals(webtest.getAttribute("id=emailsmtpdebug_opt3", "checked"), "true");
		webtest.click("id=save-and-close-form-button");
	}
	
	@Test(dataProvider = "testData4",priority = 45)
	public void testChangeBounceAccountFromExcel(String bahost,String bauser,String bapwd) throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=退信设置");
		webtest.click("xpath=//label[text()='IMAP']");
		webtest.typeAndClear("id=bounceaccounthost", bahost);
		webtest.typeAndClear("id=bounceaccountuser", bauser);
		webtest.typeAndClear("id=bounceaccountpass", bapwd);
		webtest.click("id=save-form-button");
		assertEquals(webtest.getValue("id=bounceaccounthost"), bahost);
		webtest.click("id=save-and-close-form-button");
	}
	
	@Test(priority = 46)
	public void testChangeDefaultLanguage() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=语言");
		webtest.selectByValue("id=defaultlang", "zh-Hans");
		webtest.click("id=save-form-button");
		assertEquals(webtest.getText("link=语言"), "语言");
		webtest.click("id=save-and-close-form-button");
	}
	
	@Test(priority = 47)
	public void testDeleteLanguage() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=语言");
		webtest.click("xpath=//option[text()='中文(繁体-台湾)']");
		webtest.click("id=btnRemove");
		webtest.click("xpath=//option[text()='中文(繁体-香港)']");
		webtest.click("id=btnRemove");
		webtest.click("id=save-form-button");
		assertEquals(webtest.getText("xpath=//*[@id='excludedLanguages']/option[1]"), "中文(繁体-香港)");
		webtest.click("id=save-and-close-form-button");
	}
	
	@Test(priority = 48)
	public void testAddLanguage() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=语言");
		webtest.click("xpath=//option[text()='中文(繁体-台湾)']");
		webtest.click("id=btnAdd");
		webtest.click("xpath=//option[text()='中文(繁体-香港)']");
		webtest.click("id=btnAdd");
		webtest.click("id=save-form-button");
		assertTrue(!webtest.isElementPresent("xpath=//*[@id='excludedLanguages']/option[1]"));
		webtest.click("id=save-and-close-form-button");
	}
	
	@Test(dataProvider = "testData5",priority = 49)
	public void testEditPresentationFromExcel(String rheading,String pdffontsize,String pdflogowidth,String headertitle,String pdfheaderstring) throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=外观");
		webtest.typeAndClear("id=repeatheadings", rheading);
		webtest.typeAndClear("id=pdffontsize", pdffontsize);
		webtest.typeAndClear("id=pdflogowidth", pdflogowidth);
		webtest.typeAndClear("id=pdfheadertitle", headertitle);
		webtest.typeAndClear("id=pdfheaderstring", pdfheaderstring);
		webtest.click("id=save-form-button");
		assertEquals(webtest.getValue("id=pdfheadertitle"), headertitle);
		webtest.click("id=save-and-close-form-button");
	}
	
	@Test(priority = 50)
	public void testChangeSurveyPreviewRequire() throws InterruptedException {
		webtest.click("link=配置");
		webtest.click("link=全局设置");
		webtest.click("link=安全");
		webtest.click("xpath=//*[@id='security']/div[1]/div/div/div/span[2]");
		webtest.click("id=save-and-close-form-button");
		webtest.click("link=调查");
		webtest.click("xpath=//*[@id='survey-grid']/table/tbody/tr/td[13]/a[1]");
		assertTrue(webtest.isElementPresent("id=preview_survey_button"));
		webtest.click("link=test edit LimeSurvey");
	}
	
}
