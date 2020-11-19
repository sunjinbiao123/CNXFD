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
			Thread.sleep(1000);
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
			Thread.sleep(1000);
			webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
			webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[2]/div[1]/div");
			webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
			webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
			Thread.sleep(1000);
			assertTrue(!webtest.isElementPresent("id=lime-logo"));
		}
	}
	
	@Test(priority = 2)
	public void testLogoOn() throws InterruptedException{
		if (!webtest.isElementPresent("id=lime-logo")) {
			Thread.sleep(1000);
			webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
			webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[2]/div[1]/div");
			webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
			webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
			Thread.sleep(1000);
			assertTrue(webtest.isElementPresent("id=lime-logo"));
		}
	}
	
	@Test(priority = 3)
	public void testSurveyListOn() throws InterruptedException {
		if (!webtest.isElementPresent("id=survey-grid")) {
			Thread.sleep(1000);
			webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
			webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[3]/div[1]/div");
			webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
			webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
			Thread.sleep(1000);
			assertTrue(webtest.isElementPresent("id=survey-grid"));
		}
	}
	
	@Test(priority = 4)
	public void testSurveyListOff() throws InterruptedException {
		if (webtest.isElementPresent("id=survey-grid")) {
			Thread.sleep(1000);
			webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
			webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[3]/div[1]/div");
			webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
			webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
			Thread.sleep(1000);
			assertTrue(!webtest.isElementPresent("id=survey-grid"));
		}
	}
	
//	@Test(priority = 5)
//	public void testContainerOff() throws InterruptedException {
//		if (webtest.isElementPresent("class=container ls-flex ls-panelboxes selector__lstour--mainfunctionboxes")) {
//			Thread.sleep(1000);
//			webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//			webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
//			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[4]/div/div");
//			webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
//			webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//			Thread.sleep(1000);
//			assertTrue(!webtest.isElementPresent("class=container ls-flex ls-panelboxes selector__lstour--mainfunctionboxes"));
//		}
//	}
//	
//	@Test(priority = 6)
//	public void testContainerOn() throws InterruptedException {
//		if (!webtest.isElementPresent("class=container ls-flex ls-panelboxes selector__lstour--mainfunctionboxes")) {
//			Thread.sleep(1000);
//			webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]");
//			webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
//			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[4]/div/div");
//			webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
//			webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//			Thread.sleep(1000);
//			assertTrue(webtest.isElementPresent("class=container ls-flex ls-panelboxes selector__lstour--mainfunctionboxes"));
//		}
//	}
//	
//	@Test(priority = 7)
//	public void testLastSurveyOff() throws InterruptedException {
//		if (webtest.isElementPresent("id=last_survey")) {
//			Thread.sleep(1000);
//			webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//			webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
//			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[2]/div[2]/div");
//			webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
//			webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//			Thread.sleep(1000);
//			assertTrue(!webtest.isElementPresent("id=last_survey"));
//		}
//	}
//	
//	@Test(priority = 8)
//	public void testLastSurveyOn() throws InterruptedException {
//		if (!webtest.isElementPresent("id=last_survey")) {
//			Thread.sleep(1000);
//			webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//			webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
//			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[2]/div[2]/div");
//			webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
//			webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//			Thread.sleep(1000);
//			assertTrue(webtest.isElementPresent("id=last_survey"));
//		}
//		
//	}
//	
//	@Test(priority = 9)
//	public void testSearchOff() throws InterruptedException {
//		this.testSurveyListOn();
//		if (webtest.isElementPresent("id=Survey_searched_value")) {
//			Thread.sleep(1000);
//			webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//			webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
//			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[3]/div[2]/div");
//			webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
//			webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//			Thread.sleep(1000);
//			assertTrue(!webtest.isElementPresent("id=Survey_searched_value"));
//		}
//		this.testSurveyListOff();
//	}
//	
//	@Test(priority = 10)
//	public void testSearchOn() throws InterruptedException {
//		this.testSurveyListOn();
//		if (!webtest.isElementPresent("id=Survey_searched_value")) {
//			Thread.sleep(1000);
//			webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//			webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
//			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[3]/div[2]/div");
//			webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
//			webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//			Thread.sleep(1000);
//			assertTrue(webtest.isElementPresent("id=Survey_searched_value"));
//		}
//		this.testSurveyListOff();
//	}
//	
//	@Test(priority = 11)
//	public void testChangeCol() throws InterruptedException {
//		if (webtest.isElementPresent("class=col-md-4 col-sm-8 ls-flex-column ls-panelboxes-panelbox text-primary")) {
//			Thread.sleep(1000);
//			webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//			webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
//			webtest.typeAndClear("id=iBoxesByRow", "4");
//			webtest.click("id=save_boxes_setting");
//			webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
//			webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//			Thread.sleep(1000);
//			assertTrue(webtest.isElementPresent("class=col-md-3 col-sm-6 ls-flex-column ls-panelboxes-panelbox text-primary"));
//		}
//	}
//	
//	@Test(priority = 12)
//	public void testChangeBtnDirection() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
//		webtest.click("id=iBoxesOffset");
//		webtest.click("xpath=//*[@id='iBoxesOffset']/option[1]");
//		webtest.click("id=save_boxes_setting");
//		webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority = 13)
//	public void testCreateBtn() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
//		webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[1]");
//		webtest.type("id=Box_position", "7");
//		webtest.type("id=Box_url", "admin/survey/sa/newsurvey");
//		webtest.type("id=Box_title", "test btn Survey Create");
//		webtest.click("xpath=//*[@id='boxes-form']/div[4]/div/div/button");
//		webtest.click("xpath=//*[@id='boxes-form']/div[4]/div/div/ul/li/div/div[1]/ul/li[2]");
//		webtest.type("id=Box_desc", "test");
//		webtest.click("id=Box_usergroup");
//		webtest.click("xpath=//*[@id='Box_usergroup']/option[2]");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//		assertTrue(webtest.isElementPresent("id=panel-7"));
//	}
//	
//	@Test(priority = 14)
//	public void testDeleteBtn() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
//		webtest.click("xpath=//*[@id='yw0']/table/tbody/tr[6]/td[7]/a[2]");
//		webtest.click1("xpath=/html/body/div[13]/div/div/div[3]/button[2]");
//		webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//		assertTrue(!webtest.isElementPresent("id=panel-6"));
//	}
//	
//	@Test(priority = 23)
//	public void testRestoreBtn() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
//		webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[2]");
//		webtest.click1("id=dataConfirmOK");
//		webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//		assertTrue(webtest.isElementPresent("id=panel-6"));
//	}
//	
//	@Test(priority = 16)
//	public void testEditBtnPosition() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
//		webtest.click("xpath=//*[@id='yw0']/table/tbody/tr[2]/td[7]/a[1]");
//		webtest.typeAndClear("id=Box_position", "7");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//		assertTrue(webtest.isElementPresent("id=panel-7"));
//	}
//	
//	@Test(priority = 17)
//	public void testEditBtnUrl() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
//		webtest.click("xpath=//*[@id='yw0']/table/tbody/tr[2]/td[7]/a[1]");
//		webtest.typeAndClear("id=Box_url", "admin/survey/sa/newsurvey");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		webtest.click("id=panel-7");
//		Thread.sleep(1000);
//		assertTrue(webtest.isElementPresent("id=surveyTitle"));
//	}
//	
//	@Test(priority = 18)
//	public void testEditBtnTitle() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
//		webtest.click("xpath=//*[@id='yw0']/table/tbody/tr[2]/td[7]/a[1]");
//		webtest.typeAndClear("id=Box_title", "title edit");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//		assertEquals(webtest.getText("xpath=//*[@id='panel-7']/div[1]/div"), "title edit");
//	}
//	
//	@Test(priority = 19)
//	public void testEditBtnIcon() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
//		webtest.click("xpath=//*[@id='yw0']/table/tbody/tr[2]/td[7]/a[1]");
//		webtest.click("xpath=//*[@id='boxes-form']/div[4]/div/div/button");
//		webtest.click("xpath=//*[@id='boxes-form']/div[4]/div/div/ul/li/div/div[3]/ul/li[18]");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//		assertTrue(webtest.isElementPresent("class=icon-usergroup"));
//	}
//	
//	@Test(priority = 20)
//	public void testEditBtnDescription() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
//		webtest.click("xpath=//*[@id='yw0']/table/tbody/tr[2]/td[7]/a[1]");
//		webtest.typeAndClear("id=Box_desc", "description edit");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//		assertEquals(webtest.getText("xpath=//*[@id='panel-7']/div[2]/div[2]"), "description edit");
//	}
//	
//	@Test(priority = 21)
//	public void testEditBtnShowTo() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
//		webtest.click("xpath=//*[@id='yw0']/table/tbody/tr[2]/td[7]/a[1]");
//		webtest.selectByValue("id=Box_usergroup", "-3");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//		assertTrue(webtest.isElementPresent("id=panel-7"));
//	}
//	
//	@Test(dataProvider = "testData1",priority = 22)
//	public void testCreateBtnFromExcel(String position,String url,String title,String desc) throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
//		webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[1]");
//		webtest.type("id=Box_position", position);
//		webtest.type("id=Box_url", url);
//		webtest.type("id=Box_title", title);
//		webtest.click("xpath=//*[@id='boxes-form']/div[4]/div/div/button");
//		webtest.click("xpath=//*[@id='boxes-form']/div[4]/div/div/ul/li/div/div[1]/ul/li[2]");
//		webtest.type("id=Box_desc", desc);
//		webtest.click("id=Box_usergroup");
//		webtest.click("xpath=//*[@id='Box_usergroup']/option[2]");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//		assertTrue(webtest.isElementPresent("id=panel-"+Integer.parseInt(position)));
//	}
//	
//	@Test(dataProvider = "testData1",priority = 15)
//	public void testEditBtnFromExcel(String position,String url,String title,String desc) throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
//		webtest.click("xpath=//*[@id='yw0']/table/tbody/tr[2]/td[7]/a[1]");
//		webtest.typeAndClear("id=Box_position", position);
//		webtest.typeAndClear("id=Box_url", url);
//		webtest.typeAndClear("id=Box_title", title);
//		webtest.click("xpath=//*[@id='boxes-form']/div[4]/div/div/button");
//		webtest.click("xpath=//*[@id='boxes-form']/div[4]/div/div/ul/li/div/div[1]/ul/li[2]");
//		webtest.typeAndClear("id=Box_desc", desc);
//		webtest.click("id=Box_usergroup");
//		webtest.click("xpath=//*[@id='Box_usergroup']/option[2]");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//		assertTrue(webtest.isElementPresent("id=panel-"+Integer.parseInt(position)));
//	}
//	
//	@Test(priority = 24)
//	public void testShowPhpConf() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[1]");
//		webtest.click("xpath=//*[@id='overview']/p/a");
//		webtest.getWindow(1);
//		Thread.sleep(1000);
//		assertEquals(webtest.getText("xpath=/html/body/div/h2[1]/a"), "bcmath");
//		webtest.getWindow(0);
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[1]/a");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//	}
//	
//	@Test(priority = 25)
//	public void testChangeSiteName() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[2]");
//		webtest.typeAndClear("id=sitename", "test edit LimeSurvey");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//		assertEquals(webtest.getTitle(), "test edit LimeSurvey");
//	}
//	
//	@Test(priority = 26)
//	public void testChangeDefaultTheme() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[2]");
//		webtest.selectByValue("id=defaulttheme", "vanilla");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority = 27)
//	public void testChangeAdminTheme() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[2]");
//		webtest.selectByValue("id=admintheme", "Purple_Tentacle");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//		assertEquals(webtest.getColor("xpath=/html/body/nav/div[3]/ul/li[1]/a"), "rgb(153, 51, 153)");
//	}
//	
//	@Test(priority = 28)
//	public void testChangeTimeAdjust() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[2]");
//		webtest.typeAndClear("id=timeadjust", "5");
//		webtest.click("save-form-button");
//		assertNotEquals(webtest.getText("xpath=//*[@id='general']/div/div[1]/div[4]/div/div[2]/text()[1]"),webtest.getText( "xpath=//*[@id='general']/div/div[1]/div[4]/div/div[2]/text()[2]"));
//		Thread.sleep(1000);
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//	}
//	
//	@Test(priority = 29)
//	public void testChangeCharacterset() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[2]");
//		webtest.selectByValue("id=characterset", "gbk");
//		webtest.click("save-form-button");
//		assertEquals(webtest.getSelect("id=characterset").getFirstSelectedOption().getText(),"GBK 简体中文");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority = 30)
//	public void testChangeKeys() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[2]");
//		webtest.typeAndClear("id=ipInfoDbAPIKey", "a");
//		webtest.typeAndClear("id=googleMapsAPIKey", "b");
//		webtest.typeAndClear("id=googleanalyticsapikey", "c");
//		webtest.typeAndClear("id=googletranslateapikey", "d");
//		webtest.click("save-form-button");
//		Thread.sleep(1000);
//		assertEquals(webtest.getValue("id=ipInfoDbAPIKey"), "a");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//	}
//	
//	@Test(dataProvider = "testData2",priority = 31)
//	public void testChangeKeysFromRxcel(String ikey,String gmkey,String gakey,String gtkey) throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[2]");
//		webtest.typeAndClear("id=ipInfoDbAPIKey", ikey);
//		webtest.typeAndClear("id=googleMapsAPIKey", gmkey);
//		webtest.typeAndClear("id=googleanalyticsapikey", gakey);
//		webtest.typeAndClear("id=googletranslateapikey", gtkey);
//		webtest.click("save-form-button");
//		Thread.sleep(1000);
//		assertEquals(webtest.getValue("id=ipInfoDbAPIKey"), ikey);
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//	}
//	
//	@Test(priority = 32)
//	public void testChangeToSoftMode() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[2]");
//		webtest.click("xpath=//*[@id='maintenancemode']/label[2]");
//		webtest.click("save-form-button");
////		assertEquals(webtest.getAttribute("id=maintenancemode_opt2", "checked"), "true");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		assertTrue(webtest.isElementPresent("xpath=/html/body/nav/div[4]/ul/li/a"));
//	}
//	
//	@Test(priority = 33)
//	public void testChangeToHardMode() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[2]");
//		webtest.click("xpath=//*[@id='maintenancemode']/label[3]");
//		webtest.click("save-form-button");
////		assertEquals(webtest.getAttribute("id=maintenancemode_opt3", "checked"), "true");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		assertTrue(webtest.isElementPresent("xpath=/html/body/nav/div[4]/ul/li/a"));
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority = 34)
//	public void testChangeToClosedMode() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[2]");
//		webtest.click("xpath=//*[@id='maintenancemode']/label[1]");
//		webtest.click("save-form-button");
////		assertEquals(webtest.getAttribute("id=maintenancemode_opt3", "checked"), "true");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		assertTrue(!webtest.isElementPresent("xpath=/html/body/nav/div[4]/ul/li/a"));
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority = 35)
//	public void testRefreshAssets() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[2]");
//		webtest.click("xpath=//*[@id='general']/div/div[2]/div[2]/div/div/a");
//		webtest.click("save-form-button");
//		assertNotEquals(webtest.getText("xpath=//*[@id='general']/div/div[2]/div[2]/div/label/small"), "(1)");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority = 36)
//	public void testChangeHtmlEditor1() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[2]");
//		webtest.click("xpath=//*[@id='defaulthtmleditormode']/label[1]");
//		webtest.click("save-form-button");
//		assertEquals(webtest.getAttribute("id=defaulthtmleditormode_opt1", "checked"), "true");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority = 37)
//	public void testChangeHtmlEditor2() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[2]");
//		webtest.click("xpath=//*[@id='defaulthtmleditormode']/label[2]");
//		webtest.click("save-form-button");
//		assertEquals(webtest.getAttribute("id=defaulthtmleditormode_opt2", "checked"), "true");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority = 38)
//	public void testChangeDefaultAdminEmail() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[3]");
//		webtest.typeAndClear("id=siteadminemail", "testchangedemail@qq.com");
//		Thread.sleep(1000);
//		webtest.click("id=save-and-close-form-button");
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[5]/a");
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[5]/ul/li[1]/a");
//		assertEquals(webtest.getValue("id=email"), "testchangedemail@qq.com");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority = 39)
//	public void testChangeSiteAdminName() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[3]");
//		webtest.typeAndClear("id=siteadminname", "testChangedAdmin");
//		Thread.sleep(1000);
//		webtest.click("id=save-and-close-form-button");
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[5]/a");
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[5]/ul/li[1]/a");
//		assertEquals(webtest.getValue("id=fullname"), "testChangedAdmin");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//	}
//	
//	@Test(dataProvider = "testData3",priority = 40)
//	public void testChangeSMTPFromExcel(String smtphost,String smtpuser,String smtppwd) throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[3]");
//		webtest.click("xpath=//*[@id='emailmethod']/label[2]");
//		webtest.typeAndClear("id=emailsmtphost", smtphost);
//		webtest.typeAndClear("id=emailsmtpuser", smtpuser);
//		webtest.typeAndClear("id=emailsmtppassword", smtppwd);
//		Thread.sleep(1000);
//		webtest.click("id=save-form-button");
//		assertEquals(webtest.getValue("id=emailsmtphost"), smtphost);
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority = 41)
//	public void testChangeSMTPSSL1() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[3]");
//		webtest.click("xpath=//*[@id='emailsmtpssl']/label[2]");
//		Thread.sleep(1000);
//		webtest.click("id=save-form-button");
//		assertEquals(webtest.getAttribute("id=emailsmtpssl_opt2", "checked"), "true");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority = 42)
//	public void testChangeSMTPSSL2() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[3]");
//		webtest.click("xpath=//*[@id='emailsmtpssl']/label[3]");
//		Thread.sleep(1000);
//		webtest.click("id=save-form-button");
//		assertEquals(webtest.getAttribute("id=emailsmtpssl_opt3", "checked"), "true");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority = 43)
//	public void testChangeSMTPDebug1() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[3]");
//		webtest.click("xpath=//*[@id='emailsmtpdebug']/label[2]");
//		Thread.sleep(1000);
//		webtest.click1("id=save-form-button");
//		assertEquals(webtest.getAttribute("id=emailsmtpdebug_opt2", "checked"), "true");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority = 44)
//	public void testChangeSMTPDebug2() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[3]");
//		webtest.click("xpath=//*[@id='emailsmtpdebug']/label[3]");
//		Thread.sleep(1000);
//		webtest.click1("id=save-form-button");
//		assertEquals(webtest.getAttribute("id=emailsmtpdebug_opt3", "checked"), "true");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//	}
//	
//	@Test(dataProvider = "testData4",priority = 45)
//	public void testChangeBounceAccountFromExcel(String bahost,String bauser,String bapwd) throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[4]");
//		webtest.click("xpath=//*[@id='bounceaccounttype']/label[2]");
//		webtest.typeAndClear("id=bounceaccounthost", bahost);
//		webtest.typeAndClear("id=bounceaccountuser", bauser);
//		webtest.typeAndClear("id=bounceaccountpass", bapwd);
//		Thread.sleep(1000);
//		webtest.click("id=save-form-button");
//		assertEquals(webtest.getValue("id=bounceaccounthost"), bahost);
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority = 46)
//	public void testChangeDefaultLanguage() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[7]");
//		webtest.selectByValue("id=defaultlang", "zh-Hans");
//		webtest.click("id=save-form-button");
//		Thread.sleep(1000);
//		assertEquals(webtest.getText("xpath=//*[@id='settingTabs']/li[7]/a"), "语言");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");		
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority = 47)
//	public void testDeleteLanguage() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[7]");
//		webtest.click("xpath=//*[@id='includedLanguages']/option[5]");
//		webtest.click("id=btnRemove");
//		webtest.click("xpath=//*[@id='includedLanguages']/option[5]");
//		webtest.click("id=btnRemove");
//		webtest.click("id=save-form-button");
//		Thread.sleep(1000);
//		assertEquals(webtest.getText("xpath=//*[@id='excludedLanguages']/option[1]"), "中文(繁体-台湾)");
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");		
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority = 48)
//	public void testAddLanguage() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[7]");
//		webtest.click("xpath=//*[@id='excludedLanguages']/option[1]");
//		webtest.click("id=btnAdd");
//		webtest.click("xpath=//*[@id='excludedLanguages']/option");
//		webtest.click("id=btnAdd");
//		webtest.click("id=save-form-button");
//		Thread.sleep(1000);
//		assertTrue(!webtest.isElementPresent("xpath=//*[@id='excludedLanguages']/option[1]"));
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");		
//		Thread.sleep(1000);
//	}
//	
//	@Test(dataProvider = "testData5",priority = 49)
//	public void testEditPresentationFromExcel(String rheading,String pdffontsize,String pdflogowidth,String headertitle,String pdfheaderstring) throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[6]");
//		webtest.typeAndClear("id=repeatheadings", rheading);
//		webtest.typeAndClear("id=pdffontsize", pdffontsize);
//		webtest.typeAndClear("id=pdflogowidth", pdflogowidth);
//		webtest.typeAndClear("id=pdfheadertitle", headertitle);
//		webtest.typeAndClear("id=pdfheaderstring", pdfheaderstring);
//		webtest.click("id=save-form-button");
//		Thread.sleep(1000);
//		assertEquals(webtest.getValue("id=pdfheadertitle"), headertitle);
//		webtest.click("id=save-and-close-form-button");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");		
//		Thread.sleep(1000);
//	}
//	
//	@Test(priority = 50)
//	public void testChangeToAdminOnly() throws InterruptedException {
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
//		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[4]/a");
//		webtest.click("xpath=//*[@id='settingTabs']/li[5]");
//		webtest.click("xpath=//*[@id='security']/div[1]/div/div/div/span[2]");
//		webtest.click("id=save-and-close-form-button");
//		Thread.sleep(1000);
//		webtest.click("xpath=/html/body/nav/div[3]/ul/li[3]");
//		webtest.click("xpath=//*[@id='survey-grid']/table/tbody/tr/td[4]");
//		assertTrue(webtest.isElementPresent("id=preview_survey_button"));
//		webtest.click("xpath=/html/body/nav/div[1]/a");
//		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");		
//		Thread.sleep(1000);
//	}
	
}
