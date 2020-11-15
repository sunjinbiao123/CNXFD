package com.test.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.base.BaseTest;

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
	
	@Test(priority = 5)
	public void testContainerOff() throws InterruptedException {
		if (webtest.isElementPresent("class=container ls-flex ls-panelboxes selector__lstour--mainfunctionboxes")) {
			Thread.sleep(1000);
			webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
			webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[4]/div/div");
			webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
			webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
			Thread.sleep(1000);
			assertTrue(!webtest.isElementPresent("class=container ls-flex ls-panelboxes selector__lstour--mainfunctionboxes"));
		}
	}
	
	@Test(priority = 6)
	public void testContainerOn() throws InterruptedException {
		if (!webtest.isElementPresent("class=container ls-flex ls-panelboxes selector__lstour--mainfunctionboxes")) {
			Thread.sleep(1000);
			webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]");
			webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[4]/div/div");
			webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
			webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
			Thread.sleep(1000);
			assertTrue(webtest.isElementPresent("class=container ls-flex ls-panelboxes selector__lstour--mainfunctionboxes"));
		}
	}
	
	@Test(priority = 7)
	public void testLastSurveyOff() throws InterruptedException {
		if (webtest.isElementPresent("id=last_survey")) {
			Thread.sleep(1000);
			webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
			webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[2]/div[2]/div");
			webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
			webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
			Thread.sleep(1000);
			assertTrue(!webtest.isElementPresent("id=last_survey"));
		}
	}
	
	@Test(priority = 8)
	public void testLastSurveyOn() throws InterruptedException {
		if (!webtest.isElementPresent("id=last_survey")) {
			Thread.sleep(1000);
			webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
			webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[2]/div[2]/div");
			webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
			webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
			Thread.sleep(1000);
			assertTrue(webtest.isElementPresent("id=last_survey"));
		}
		
	}
	
	@Test(priority = 9)
	public void testSearchOff() throws InterruptedException {
		this.testSurveyListOn();
		if (webtest.isElementPresent("id=Survey_searched_value")) {
			Thread.sleep(1000);
			webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
			webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[3]/div[2]/div");
			webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
			webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
			Thread.sleep(1000);
			assertTrue(!webtest.isElementPresent("id=Survey_searched_value"));
		}
		this.testSurveyListOff();
	}
	
	@Test(priority = 10)
	public void testSearchOn() throws InterruptedException {
		this.testSurveyListOn();
		if (!webtest.isElementPresent("id=Survey_searched_value")) {
			Thread.sleep(1000);
			webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
			webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
			webtest.click("xpath=//*[@id='in_survey_common_action']/div/div[3]/div[2]/div");
			webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
			webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
			Thread.sleep(1000);
			assertTrue(webtest.isElementPresent("id=Survey_searched_value"));
		}
		this.testSurveyListOff();
	}
	
	@Test(priority = 11)
	public void testChangeCol() throws InterruptedException {
		if (webtest.isElementPresent("class=col-md-4 col-sm-8 ls-flex-column ls-panelboxes-panelbox text-primary")) {
			Thread.sleep(1000);
			webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
			webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
			webtest.typeAndClear("id=iBoxesByRow", "4");
			webtest.click("id=save_boxes_setting");
			webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
			webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
			Thread.sleep(1000);
			assertTrue(webtest.isElementPresent("class=col-md-3 col-sm-6 ls-flex-column ls-panelboxes-panelbox text-primary"));
		}
	}
	
	@Test(priority = 12)
	public void testChangeBtnDirection() throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
		webtest.click("id=iBoxesOffset");
		webtest.click("xpath=//*[@id='iBoxesOffset']/option[1]");
		webtest.click("id=save_boxes_setting");
		webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
		Thread.sleep(1000);
	}
	
	@Test(priority = 13)
	public void testCreateBtn() throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
		webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[1]");
		webtest.type("id=Box_position", "7");
		webtest.type("id=Box_url", "admin/survey/sa/newsurvey");
		webtest.type("id=Box_title", "test btn Survey Create");
		webtest.click("class=btn btn-default dropdown-toggle limebutton form-control");
		webtest.click("class=option-icon icon-add");
		webtest.type("id=Box_desc", "test");
		webtest.click("id=Box_usergroup");
		webtest.click("xpath=//*[@id='Box_usergroup']/option[2]");
		webtest.click("id=save-and-close-form-button");
		webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
		Thread.sleep(1000);
		assertTrue(webtest.isElementPresent("id=panel-7"));
	}
	
	@Test(priority = 14)
	public void testDeleteBtn() throws InterruptedException {
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/nav/div[3]/ul/li[2]/a");
		webtest.click("xpath=//*[@id='mainmenu-dropdown']/li[5]/ul/li[3]/a");
		webtest.click("xpath=//*[@id='yw0']/table/tbody/tr[6]/td[7]/a[2]");
		webtest.click("class=btn btn-primary selector--button-confirm");
		webtest.click("xpath=//*[@id='fullpagebar']/div/div[2]/a[3]");
		webtest.click("xpath=//*[@id='welcomeModal']/div/div/div[3]/button");
		Thread.sleep(1000);
		assertTrue(!webtest.isElementPresent("id=panel-6"));
	}

}
