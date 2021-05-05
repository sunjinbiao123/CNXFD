package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BaseTest;
/**
 * 
 * @author 孙江涛
 * 模块 admin+创建问卷时统计模块
 *
 */

public class LoginPage extends BaseTest{
   public LoginPage(WebDriver driver) {
		
		this.driver= driver;	
	}
	public WebElement clickUser() {
		return driver.findElement(By.name("user"));
	}
	public WebElement clickPassword() {
		return driver.findElement(By.name("password"));
	}
	public WebElement clickSubmit() {
		return driver.findElement(By.name("login_submit"));
	}
	public WebElement clickAdmin() {
		return driver.findElement(By.partialLinkText("admin"));
	}
	public WebElement clickZhang() {
		return driver.findElement(By.linkText("我的账号"));
	}
	public WebElement clickPerson() {
		return driver.findElement(By.linkText("个人设定"));
	}
	public WebElement clickJie() {
		return driver.findElement(By.xpath("//div[@id='your-personal-settings']/div[2]/div/div/div/div/span/span/span/span[2]"));
	}
	public WebElement clickQuestion() {
		return driver.findElement(By.id("questionselectormode"));
	}
	public WebElement clickQuestionSelect() {
		return driver.findElement(By.xpath("(//option[@value='default'])[2]"));
	}
	public WebElement clickTemp() {
		return driver.findElement(By.id("templateeditormode"));
	}
	public WebElement clickTempSelect() {
		return driver.findElement(By.xpath("(//option[@value='default'])[3]"));
	}
	public WebElement clickShowScript() {
		return driver.findElement(By.id("showScriptEdit"));
	}
	public WebElement clickShowScriptSelect() {
		return driver.findElement(By.xpath("//option[@value='0']"));
	}
	public WebElement clickPreselect() {
		return driver.findElement(By.id("preselectquestiontype"));
	}
	public WebElement clickPreselectSelect() {
		return driver.findElement(By.xpath("//option[@value='O']"));
	}
	public WebElement clickDateformat() {
		return driver.findElement(By.id("dateformat"));
	}
	public WebElement clickDateformaSelect() {
		return driver.findElement(By.xpath("(//option[@value='1'])[2]"));
	}
	public WebElement clickLock() {
		return driver.findElement(By.id("lock_organizer"));
	}
	public WebElement clickLockSelect() {
		return driver.findElement(By.xpath("(//option[@value='0'])[3]"));
	}
	public WebElement clickHtml() {
		return driver.findElement(By.id("htmleditormode"));
	}
	public WebElement clickHtmlSelect() {
		return driver.findElement(By.xpath("//option[@value='default']"));
	}
	public WebElement clickNote() {
		return driver.findElement(By.id("noViewMode"));
	}
	public WebElement clickNoteSelect() {
		return driver.findElement(By.xpath("(//option[@value='0'])[2]"));
	}
	public WebElement clickAnswer() {
		return driver.findElement(By.id("answeroptionprefix"));
	}
	public WebElement clickSub() {
		return driver.findElement(By.id("subquestionprefix"));
	}
	public WebElement clickTog() {
		return driver.findElement(By.linkText("Toggle Dropdown"));
	}
	public WebElement clickImport() {
		return driver.findElement(By.linkText("导入"));
	}
	public WebElement clickCopy() {
		return driver.findElement(By.linkText("复制"));
	}
	public WebElement clickFile() {
		return driver.findElement(By.id("the_file"));
	}
	public WebElement clickDiaoCha() {
		return driver.findElement(By.xpath("//input[@value='导入问卷调查']"));
	}
	public WebElement clickCopySurvey() {
		return driver.findElement(By.id("copysurveylist"));
	}
	public WebElement clickCopySurveyS() {
		return driver.findElement(By.xpath("(//option[@value='11'])[2]"));
	}
	public WebElement clickCopySurveyName() {
		return driver.findElement(By.id("copysurveyname"));
	}
	public WebElement clickCopySurveyId() {
		return driver.findElement(By.id("copysurveyid"));
	}
	public WebElement clickCopyDiaoCha() {
		return driver.findElement(By.xpath("//input[@value='复制调查']"));
	}
	public WebElement clickQuotas() {
		return driver.findElement(By.id("copysurveyexcludequotas"));
	}
	public WebElement clickPermissions() {
		return driver.findElement(By.id("copysurveyexcludepermissions"));
	}
	public WebElement clickAnswers() {
		return driver.findElement(By.id("copysurveyexcludeanswers"));
	}
	public WebElement clickConditions() {
		return driver.findElement(By.id("copysurveyresetconditions"));
	}
	public WebElement clickEnddate() {
		return driver.findElement(By.id("copysurveyresetstartenddate"));
	}
	public WebElement clickStartid() {
		return driver.findElement(By.id("copysurveyresetresponsestartid"));
	}
	public WebElement clickQiYong() {
		return driver.findElement(By.xpath("(//a[contains(@href, '/limesurvey/index.php/admin/survey/sa/listsurveys/active/Y')])[2]"));
	}
	public WebElement clickItem() {
		return driver.findElement(By.linkText("111111111111111"));
	}
	public WebElement clickTong() {
		return driver.findElement(By.xpath("//a[@id='sidemenu_statistics']/div/div"));
	}
	public WebElement clickDaoChu() {
		return driver.findElement(By.id("statisticsExportImages"));
	}
	public WebElement clickFinish() {
		return driver.findElement(By.xpath("//div[@id='completionstate']/label[2]"));
	}
	public WebElement clickNoFinish() {
		return driver.findElement(By.xpath("//div[@id='completionstate']/label[3]"));
	}
	public WebElement clickButton1() {
		return driver.findElement(By.xpath("//div[@id='panel-data-selection']/div[2]/div[2]/div/div/div/div/span[2]"));
	}
	public WebElement clickButton2() {
		return driver.findElement(By.xpath("//div[@id='panel-data-selection']/div[2]/div[2]/div[2]/div/div/div/span[2]"));
	}
	public WebElement clickButton3() {
		return driver.findElement(By.xpath("//div[@id='panel-output-options']/div[2]/div/div/div/div/div/span[2]"));
	}
	public WebElement clickButton4() {
		return driver.findElement(By.xpath("//div[@id='panel-output-options']/div[2]/div/div[2]/div/div/div/span[2]"));
	}
	public WebElement clickRow1() {
		return driver.findElement(By.xpath("//div[@id='panel-output-options']/div[2]/div[2]/div/div/label"));
	}
	public WebElement clickRow2() {
		return driver.findElement(By.xpath("//div[@id='panel-output-options']/div[2]/div[2]/div/div/label[2]"));
	}
	public WebElement clickRow3() {
		return driver.findElement(By.xpath("//div[@id='panel-output-options']/div[2]/div[2]/div/div/label[3]"));
	}
	public WebElement clickRow4() {
		return driver.findElement(By.xpath("//div[@id='panel-output-options']/div[2]/div[3]/div/div/label[2]"));
	}
	public WebElement clickRow5() {
		return driver.findElement(By.xpath("//div[@id='panel-output-options']/div[2]/div[3]/div/div/label[3]"));
	}
	public WebElement clickChartType() {
		return driver.findElement(By.id("charttype"));
	}
	public WebElement clickChartTypeS() {
		return driver.findElement(By.xpath("//option[@value='3']"));
	}
	public WebElement clickFormat1() {
		return driver.findElement(By.xpath("//div[@id='panel-output-forma']/div[2]/div/label[2]"));
	}
	public WebElement clickFormat2() {
		return driver.findElement(By.xpath("//div[@id='panel-output-forma']/div[2]/div/label[3]"));
	}
	public WebElement clickFormat3() {
		return driver.findElement(By.id("btn_2"));
	}
	public WebElement clickFormat4() {
		return driver.findElement(By.id("T11X2X2"));
	}
	public WebElement clickFormat5() {
		return driver.findElement(By.id("idG"));
	}
	public WebElement clickFormat6() {
		return driver.findElement(By.id("idL"));
	}

	public WebElement clickClear() {
		return driver.findElement(By.linkText("清除"));
	}
	
	
	public WebElement editEmail() {
		return driver.findElement(By.id("email"));
	}
	public WebElement editFullName() {
		return driver.findElement(By.id("fullname"));
	}
	public WebElement editPassword() {
		return driver.findElement(By.id("selector__showChangePassword"));
	}
	public WebElement editOldPassword() {
		return driver.findElement(By.id("oldpassword"));
	}
	public WebElement editNewPassword() {
		return driver.findElement(By.id("password"));
	}
	public WebElement editRepeatPassword() {
		return driver.findElement(By.id("repeatpassword"));
	}
	public WebElement save() {
		return driver.findElement(By.id("save-form-button"));
	}
	public WebElement out() {
		return driver.findElement(By.linkText("登出"));
	}
	public WebElement saveClose() {
		return driver.findElement(By.linkText("关闭"));
	}
	
	
	
	public void loginSuccess(String username,String password) throws InterruptedException{
		
		Thread.sleep(3000);
		clickUser().sendKeys(username);
		clickPassword().sendKeys(password);
		clickSubmit().click();
		
	}
	 public void clickZhangHao() throws InterruptedException{
			
		Thread.sleep(3000);
		clickAdmin().click();
		Thread.sleep(3000);
		clickZhang().click();
			
		}
    public void editEmail(String email) throws InterruptedException{
		
		Thread.sleep(3000);
		editEmail().clear();
		editEmail().sendKeys(email);
		save().click();
		
	}
    public void editFullName(String fullname) throws InterruptedException{
		
		Thread.sleep(3000);
		editFullName().clear();
		editFullName().sendKeys(fullname);
		save().click();
		
	}
    public void editPassword(String oldpassword,String newpassword,String repeatpassword) throws InterruptedException{
		
		Thread.sleep(3000);
		editPassword().click();
		Thread.sleep(3000);
		editOldPassword().clear();
		editOldPassword().sendKeys(oldpassword);
		Thread.sleep(3000);
		clickPassword().click();
		Thread.sleep(3000);
		editNewPassword().clear();
		editNewPassword().sendKeys(newpassword);
		Thread.sleep(3000);
		editRepeatPassword().clear();
		clickPassword().click();
		Thread.sleep(3000);
		editRepeatPassword().sendKeys(repeatpassword);
		save().click();
	}
    public void clickPersonSet() throws InterruptedException{
		
		Thread.sleep(3000);
		clickPerson().click();
		Thread.sleep(3000);
		save().click();
		
	}
    public void clickQues(String con) throws InterruptedException{
    	Thread.sleep(3000);
		clickPerson().click();
		Thread.sleep(3000);
		clickQuestion().click();
		new Select(clickQuestion()).selectByVisibleText(con);
		Thread.sleep(3000);
		clickQuestionSelect().click();
		Thread.sleep(3000);
		save().click();
		
	}
    public void clickTemp(String con) throws InterruptedException{
    	Thread.sleep(3000);
		clickPerson().click();
		Thread.sleep(3000);
		clickTemp().click();
	
		new Select(clickTemp()).selectByVisibleText(con);
		Thread.sleep(3000);
		clickTempSelect().click();
		Thread.sleep(3000);
		save().click();
		
	}
    public void clickShow(String con) throws InterruptedException{
    	Thread.sleep(3000);
		clickPerson().click();
		Thread.sleep(3000);
		clickShowScript().click();
	
		new Select(clickShowScript()).selectByVisibleText(con);
		Thread.sleep(3000);
		clickShowScriptSelect().click();
		Thread.sleep(3000);
		save().click();
		
	}
    public void clickPre(String con) throws InterruptedException{
    	Thread.sleep(3000);
		clickPerson().click();
		Thread.sleep(3000);
		clickPreselect().click();
	
		new Select(clickPreselect()).selectByVisibleText(con);
		Thread.sleep(3000);
		clickPreselectSelect().click();
		Thread.sleep(3000);
		save().click();
		
	}
    public void clickDate(String con) throws InterruptedException{
		
		Thread.sleep(3000);
		clickDateformat().click();
	
		new Select(clickDateformat()).selectByVisibleText(con);
		Thread.sleep(3000);
		clickDateformaSelect().click();
		
		
	}
    public void selectLock() throws InterruptedException{
    	Thread.sleep(3000);
		clickPerson().click();
		Thread.sleep(3000);
		clickLock().click();
		Thread.sleep(3000);
	
		clickLockSelect().click();
		Thread.sleep(3000);
		save().click();
		
		
	}
    public void selectHtml() throws InterruptedException{
    	Thread.sleep(3000);
		clickPerson().click();
		Thread.sleep(3000);
		clickHtml().click();
		Thread.sleep(3000);
	
		clickHtmlSelect().click();
		Thread.sleep(3000);
		save().click();
		
		
	}
    public void selectNote() throws InterruptedException{
    	Thread.sleep(3000);
		clickPerson().click();
		Thread.sleep(3000);
		clickNote().click();
		Thread.sleep(3000);
	
		clickNoteSelect().click();
		Thread.sleep(3000);
		save().click();
		
		
	}
    public void selectJie() throws InterruptedException{
    	Thread.sleep(3000);
		clickPerson().click();
		Thread.sleep(3000);
		clickJie().click();
		Thread.sleep(3000);
		save().click();
	
		
	}
    public void clickAnswer(String con) throws InterruptedException{
    	Thread.sleep(3000);
		clickPerson().click();
		Thread.sleep(3000);
		clickAnswer().clear();
		Thread.sleep(3000);
		clickAnswer().sendKeys(con);
		Thread.sleep(3000);
		save().click();
	
		
	}
    public void clickSub(String con) throws InterruptedException{
    	Thread.sleep(3000);
		clickPerson().click();
		Thread.sleep(3000);
		clickSub().clear();
		Thread.sleep(3000);
		clickSub().sendKeys(con);
		Thread.sleep(3000);
		save().click();
	
		
	}
    public void clickOut() throws InterruptedException{
		
		Thread.sleep(3000);
		clickAdmin().click();
		Thread.sleep(3000);
		out().click();
		
	
		
	}
    public void clickClose() throws InterruptedException{
		
		Thread.sleep(3000);
		saveClose().click();
		
	}
    public void clickDaoRu(String file) throws InterruptedException{
		
		Thread.sleep(3000);
		clickTog().click();
		clickImport().click();
		Thread.sleep(3000);
		clickFile().click();
		Thread.sleep(3000);
		clickFile().clear();
		Thread.sleep(3000);
		clickFile().sendKeys(file);
		Thread.sleep(3000);
		clickDiaoCha().click();
		
	}

    public void clickFuZhi() throws InterruptedException{
		
		Thread.sleep(3000);
		clickTog().click();
		clickCopy().click();
		
	}
    public void clickCopySurvey(String con) throws InterruptedException{
 		
		Thread.sleep(3000);
		clickCopySurvey().click();
		new Select(clickCopySurvey()).selectByVisibleText(con);
		Thread.sleep(3000);
		clickCopySurveyS().click();
		
	}
    public void clickCopySurveyName(String name) throws InterruptedException{
		Thread.sleep(3000);
		clickCopySurveyName().click();
		clickCopySurveyName().clear();
		Thread.sleep(3000);
		clickCopySurveyName().sendKeys(name);
		
		
	}
    public void clickCopySurveyId(String id) throws InterruptedException{
		Thread.sleep(3000);
		clickCopySurveyId().click();
		clickCopySurveyId().clear();
		Thread.sleep(3000);
		clickCopySurveyId().sendKeys(id);
		
		
	}
    public void clickCopyDiao() throws InterruptedException{
		
		Thread.sleep(3000);
		clickCopyDiaoCha().click();
		
		
	}
    public void clickCopyQuotas() throws InterruptedException{
    	
		Thread.sleep(3000);
		clickQuotas().click();
		
		
	}
    public void clickCopyPermiss() throws InterruptedException{
		
		Thread.sleep(3000);
		clickPermissions().click();
		
		
	}
    public void clickCopyAnswers() throws InterruptedException{
		
		Thread.sleep(3000);
		clickAnswers().click();
		
		
	}
    public void clickCopyConditions() throws InterruptedException{
		
		Thread.sleep(3000);
		clickConditions().click();
		
		
	}
    public void clickCopyEnddate() throws InterruptedException{
		
		Thread.sleep(3000);
		clickEnddate().click();
		
		
	}
    public void clickCopyStartid() throws InterruptedException{
		
		Thread.sleep(3000);
		clickStartid().click();
		
		
	}
    public void clickTongJi() throws InterruptedException{
 		
		Thread.sleep(3000);
		clickQiYong().click();
		clickItem().click();
		Thread.sleep(3000);
		clickTong().click();
		scrollTo(clickDaoChu(), driver);
		Thread.sleep(3000);
		clickDaoChu().click();
		clickClear().click();
		
	}
 
    public static void scrollTo(WebElement element, WebDriver driver) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(false);", element);
    }
    
    public void clickOnlyFin() throws InterruptedException{
 		
    	Thread.sleep(3000);
		clickFinish().click();
		Thread.sleep(3000);
		scrollTo(clickDaoChu(), driver);
		Thread.sleep(3000);
		clickDaoChu().click();
		Thread.sleep(3000);
		clickClear().click();
		
	}
    public void clickOnlyNoFin() throws InterruptedException{
 		
    	Thread.sleep(3000);
		clickNoFinish().click();
		scrollTo(clickDaoChu(), driver);
		Thread.sleep(3000);
		clickDaoChu().click();
		Thread.sleep(3000);
		clickClear().click();
		
	}
    public void clickBut1() throws InterruptedException{
 		
    	Thread.sleep(3000);
		
		clickButton1().click();
		scrollTo(clickDaoChu(), driver);
		Thread.sleep(3000);
		clickDaoChu().click();
		Thread.sleep(3000);
		clickClear().click();
		
	}
    public void clickBut2() throws InterruptedException{
 		
    	Thread.sleep(3000);
		
		clickButton2().click();
		scrollTo(clickDaoChu(), driver);
		Thread.sleep(3000);
		clickDaoChu().click();
		Thread.sleep(3000);
		clickClear().click();
		
	}
    public void clickBut3() throws InterruptedException{
 		
    	Thread.sleep(3000);
		
		clickButton3().click();
		scrollTo(clickDaoChu(), driver);
		Thread.sleep(3000);
		clickDaoChu().click();
		Thread.sleep(3000);
		clickClear().click();
		
	}
    public void clickBut4() throws InterruptedException{
 		
    	Thread.sleep(3000);
		
		clickButton4().click();
		scrollTo(clickDaoChu(), driver);
		Thread.sleep(3000);
		clickDaoChu().click();
		Thread.sleep(3000);
		clickClear().click();
		
	}
    public void clickRoww1() throws InterruptedException{
 		
    	Thread.sleep(3000);
		
		clickRow1().click();
		scrollTo(clickDaoChu(), driver);
		Thread.sleep(3000);
		clickDaoChu().click();
		Thread.sleep(3000);
		clickClear().click();
		
	}
    public void clickRoww2() throws InterruptedException{
 		
    	Thread.sleep(3000);
		
		clickRow2().click();
		scrollTo(clickDaoChu(), driver);
		Thread.sleep(3000);
		clickDaoChu().click();
		Thread.sleep(3000);
		clickClear().click();
		
	}
    public void clickRoww3() throws InterruptedException{
 		
    	Thread.sleep(3000);
	
		clickRow3().click();
		scrollTo(clickDaoChu(), driver);
		Thread.sleep(3000);
		clickDaoChu().click();
		Thread.sleep(3000);
		clickClear().click();
		
	}
    public void clickRoww4() throws InterruptedException{
 		
    	Thread.sleep(3000);
		
		clickRow4().click();
		scrollTo(clickDaoChu(), driver);
		Thread.sleep(3000);
		clickDaoChu().click();
		Thread.sleep(3000);
		clickClear().click();
		
	}
    public void clickRoww5() throws InterruptedException{
 		
    	Thread.sleep(3000);
	
		clickRow5().click();
		scrollTo(clickDaoChu(), driver);
		Thread.sleep(3000);
		clickDaoChu().click();
		Thread.sleep(3000);
		clickClear().click();
		
	}
    public void clickChartType(String con) throws InterruptedException{
 		
		Thread.sleep(3000);
		clickChartType().click();
		new Select(clickChartType()).selectByVisibleText(con);
		Thread.sleep(3000);
		clickChartTypeS().click();
		
	}
    public void clickFor1() throws InterruptedException{
 		
    	Thread.sleep(3000);
		clickFormat1().click();
		scrollTo(clickDaoChu(), driver);
		Thread.sleep(3000);
		clickDaoChu().click();
		Thread.sleep(3000);
		clickClear().click();
		
	}
    public void clickFor2() throws InterruptedException{
 		
    	Thread.sleep(3000);
		clickFormat2().click();
		scrollTo(clickDaoChu(), driver);
		Thread.sleep(3000);
		clickDaoChu().click();
		Thread.sleep(3000);
		clickClear().click();
		
	}
    public void clickFor3(String con) throws InterruptedException{
 		
    	Thread.sleep(3000);
    	scrollTo(clickDaoChu(), driver);
    	Thread.sleep(3000);
		clickFormat3().click();
		Thread.sleep(3000);
		clickFormat4().click();
		clickFormat4().clear();
		clickFormat4().sendKeys(con);
		clickDaoChu().click();
		Thread.sleep(3000);
		clickClear().click();
		
	}
    public void clickFor4(String i,String j) throws InterruptedException{
    	
    	Thread.sleep(3000);
		clickFormat5().click();
		clickFormat5().clear();
		clickFormat5().sendKeys(i);
		Thread.sleep(3000);
		clickFormat6().click();
		clickFormat6().clear();
		clickFormat6().sendKeys(j);
		scrollTo(clickDaoChu(), driver);
		clickDaoChu().click();
		Thread.sleep(3000);
		clickClear().click();
		
	}
}