package testcase;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.BaseTest;
import pages.LoginPage;
/**
 * 
 * @author 孙江涛
 * 模块 admin+创建问卷时统计模块
 *
 */
public class LoginTest extends BaseTest{
	LoginPage loginPage;
	@BeforeClass
	public void initPage() {
		loginPage=new LoginPage(driver);
	}
	@AfterClass
	public void test_clickOut() throws InterruptedException {

		loginPage.clickOut();

	}
	@Test(priority = 0)
	public void test_login_success() throws InterruptedException {
		
		loginPage.loginSuccess("admin","admin");
		
		
	}
	@Test(priority = 0)
	public void test_login_fail() throws InterruptedException {

		loginPage.loginSuccess("1", "2");

	}
	@Test(priority = 1)
	public void test_clickZhangHao() throws InterruptedException {
		
		loginPage.clickZhangHao();
		
	}
	
	@Test(priority = 2)
	public void test_editEmail() throws InterruptedException {

		loginPage.editEmail("1394750446@qq.com");

	}
	@Test(priority = 2)
	public void test_editEmaiFullName() throws InterruptedException {

		loginPage.editFullName("admin");

	}
	@Test(priority = 2)
	public void test_editPassword() throws InterruptedException {

		loginPage.editPassword("123456","admin","admin");

	}
	@Test(priority = 2)
	public void test_editPassword_fail1() throws InterruptedException {

		loginPage.editPassword("admin","admin","admin");

	}
	@Test(priority = 2)
	public void test_editPassword_fail2() throws InterruptedException {

		loginPage.editPassword("123456","admin","admin");

	}
	@Test(priority = 2)
	public void test_editPassword_fail3() throws InterruptedException {

		loginPage.editPassword("admin","admin","123456");

	}
	@Test(priority = 2)
	public void test_editPassword_fail4() throws InterruptedException {

		loginPage.editPassword("admin","1","1");

	}
	@Test(priority = 2)
	public void test_editPassword_fail5() throws InterruptedException {

		loginPage.editPassword("admin","123456","123456");

	}
	@Test(priority = 3)
	public void test_clickPerson() throws InterruptedException {

		loginPage.clickPersonSet();

	}
	@Test(priority = 3)
	public void test_clickQues() throws InterruptedException {

		loginPage.clickQues("默认");

	}
	@Test(priority = 3)
	public void test_clickTemp() throws InterruptedException {

		loginPage.clickTemp("默认");

	}
	@Test(priority = 3)
	public void test_clickShow() throws InterruptedException {

		loginPage.clickShow("否");

	}
	@Test(priority = 3)
	public void test_clickPre() throws InterruptedException {

		loginPage.clickPre("带评论的列表");

	}
//	@Test(priority = 3)
//	public void test_clickDate() throws InterruptedException {
//
//		loginPage.clickDate(("dd.mm.yyyy"));
//
//	}
	@Test(priority = 3)
	public void test_selectLock() throws InterruptedException {

		loginPage.selectLock();

	}
	@Test(priority = 3)
	public void test_selectHtml() throws InterruptedException {

		loginPage.selectHtml();

	}
	@Test(priority = 3)
	public void test_selectNote() throws InterruptedException {

		loginPage.selectNote();

	}
	@Test(priority = 3)
	public void test_selectJie() throws InterruptedException {

		loginPage.selectJie();

	}
	@Test(priority = 3)
	public void test_clickAnswer() throws InterruptedException {

		loginPage.clickAnswer("AO");

	}
	@Test(priority = 3)
	public void test_clickSub() throws InterruptedException {

		loginPage.clickSub("SQ");

	}
//	@Test(priority = 4)
//	public void test_clickDaoRu() throws InterruptedException {
//
//		loginPage.clickDaoRu("新建文本文档.txt");
//
//	}
//	@Test(priority = 4)
//	public void test_clickDaoRuWen() throws InterruptedException {
//
//		loginPage.clickQuestionDiao("C:\\fakepath\\新建文本文档.txt");
//
//	}
	@Test(priority = 5)
	public void test_clickCopy() throws InterruptedException {

		loginPage.clickFuZhi();

	}
	@Test(priority = 5)
	public void test_clickCopySurvey() throws InterruptedException {

		loginPage.clickCopySurvey("111111111111111");

	}
	@Test(priority = 5)
	public void test_clickCopySurveyName() throws InterruptedException {

		loginPage.clickCopySurveyName("111");

	}
	@Test(priority = 5)
	public void test_clickCopySurveyId() throws InterruptedException {

		loginPage.clickCopySurveyId("1111");

	}
	@Test(priority = 5)
	public void test_clickCopyPermiss() throws InterruptedException {

		loginPage.clickCopyPermiss();

	}
	@Test(priority = 5)
	public void test_clickCopyQuotas() throws InterruptedException {

		loginPage.clickCopyQuotas();

	}
	@Test(priority = 5)
	public void test_clickCopyAnswers() throws InterruptedException {

		loginPage.clickCopyAnswers();

	}
	@Test(priority = 5)
	public void test_clickCopyConditions() throws InterruptedException {

		loginPage.clickCopyConditions();

	}
	@Test(priority = 5)
	public void test_clickCopyEnddate() throws InterruptedException {

		loginPage.clickCopyEnddate();

	}
	@Test(priority = 5)
	public void test_clickCopyStartid() throws InterruptedException {

		loginPage.clickCopyStartid();

	}
	@Test(priority = 5)
	public void test_clickCopyDiao() throws InterruptedException {

		loginPage.clickCopyDiao();

	}
	@Test(priority = 6)
	public void test_TongJi() throws InterruptedException {

		loginPage.clickTongJi();

	}
	@Test(priority = 6)
	public void test_clickOnlyFin() throws InterruptedException {

		loginPage.clickOnlyFin();

	}
	@Test(priority = 6)
	public void test_clickOnlyNoFin() throws InterruptedException {

		loginPage.clickOnlyNoFin();

	}
	@Test(priority = 6)
	public void test_clickBut1() throws InterruptedException {

		loginPage.clickBut1();

	}
	@Test(priority = 6)
	public void test_clickBut2() throws InterruptedException {

		loginPage.clickBut2();

	}
	@Test(priority = 6)
	public void test_clickBut3() throws InterruptedException {

		loginPage.clickBut3();

	}
	@Test(priority = 6)
	public void test_clickBut4() throws InterruptedException {

		loginPage.clickBut4();

	}
	@Test(priority = 6)
	public void test_clickRoww1() throws InterruptedException {

		loginPage.clickRoww1();

	}
	@Test(priority = 6)
	public void test_clickRoww2() throws InterruptedException {

		loginPage.clickRoww2();

	}
	@Test(priority = 6)
	public void test_clickRoww3() throws InterruptedException {

		loginPage.clickRoww3();

	}
	@Test(priority = 6)
	public void test_clickRoww4() throws InterruptedException {

		loginPage.clickRoww2();

	}
	@Test(priority = 6)
	public void test_clickRoww5() throws InterruptedException {

		loginPage.clickRoww3();

	}
	@Test(priority = 6)
	public void test_clickChartType() throws InterruptedException {

		loginPage.clickChartType("折线图");

	}
	@Test(priority = 6)
	public void test_clickFormat1() throws InterruptedException {

		loginPage.clickFormat1();

	}
	@Test(priority = 6)
	public void test_clickFormat2() throws InterruptedException {

		loginPage.clickFormat2();

	}
	@Test(priority = 6)
	public void test_clickFormat3() throws InterruptedException {

		loginPage.clickFor3("123");

	}
	@Test(priority = 6)
	public void test_clickFormat4() throws InterruptedException {

		loginPage.clickFor4("5","10");

	}


}
