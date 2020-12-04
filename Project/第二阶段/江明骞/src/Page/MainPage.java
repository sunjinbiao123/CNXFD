package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElements;
import org.openqa.selenium.support.ui.Select;

import Base.BaseTest;


public class MainPage extends BaseTest{
	public MainPage(WebDriver driver) {
		this.driver=driver;
	}
	

	//创建问卷调查
	public WebElement get_create() {
		return driver.findElement(By.xpath("//div[@id='panel-1']/div[2]/div/span[2]"));
	}
	//调查名称
	public WebElement exit_name() {
		return driver.findElement(By.id("surveyTitle"));
	}
	//描述
	public WebElement exit_describe() {
		return driver.findElement(By.xpath("//div[@id='advancedTextEditor']/div/div[4]/div/div[3]/div[2]/div"));
	}
	//欢迎
	public WebElement exit_welcome() {
		return driver.findElement(By.xpath("//div[@id='advancedTextEditor']/div/div[5]/div/div[3]/div[2]/div"));
	}
	//结束消息
	public WebElement exit_endmessage() {
		return driver.findElement(By.xpath("//div[@id='advancedTextEditor']/div/div[6]/div/div[3]/div[2]/div"));
	}
	//结束url
	public WebElement exit_endurl() {
		return driver.findElement(By.id("endUrl"));	
	}
	//url描述
	public WebElement exit_urldescribe() {
		return driver.findElement(By.id("endUrlDescription"));	
	}
	//保存
	public WebElement save_form() {
		return  driver.findElement(By.id("save-form-button"));	
	}
	//日期格式
	public WebElement date() {
		return driver.findElement(By.id("dateFormat"));
	}
	//默认用例
	public WebElement createsample(){
		return driver.findElement(By.name("createsample"));
	}
	//结构
	public WebElement StructureButton(){
		return driver.findElement(By.id("adminsidepanel__sidebar--selectorStructureButton"));
	}
	//添加组
	public WebElement CreateQuestionGroup(){
		return driver.findElement(By.id("adminsidepanel__sidebar--selectorCreateQuestionGroup"));
	}
	//组标题
	public WebElement groupTitle(){
		return driver.findElement(By.id("groupTitle"));
	}
	//保存并添加问题
	public WebElement save_new_question_button(){
		return  driver.findElement(By.id("save-and-new-question-button"));
	}
	//问题
	public WebElement Question(){
		return  driver.findElement(By.xpath("//div[@id='advancedQuestionEditor']/div/span/div[2]/div/div/div/div/div[2]/div/div[3]/div[2]/div"));
	}
	//保存
	public WebElement save_button(){
		return  driver.findElement(By.id("save-button"));
	}
	//设置
	public WebElement SettingsButton(){
		return  driver.findElement(By.id("adminsidepanel__sidebar--selectorSettingsButton"));
	}
	//总览
	public WebElement sidemenu_overview(){
		return  driver.findElement(By.id("sidemenu_overview"));
	}
	//启用本调查
	public WebElement ls_activate_survey(){
		return  driver.findElement(By.id("ls-activate-survey"));
	}
	//保存并启用本调查
	public WebElement activateSurvey__basicSettings(){
		return  driver.findElement(By.id("activateSurvey__basicSettings--proceed"));
	}
	//停止本调查
	public WebElement stop_survey(){
		return  driver.findElement(By.id("ls-stop-survey"));
	}
	//停用调查
	public WebElement stopsurvey(){
		return  driver.findElement(By.xpath("//input[@value='停用调查']"));
	}
	//调查列表
	public WebElement list(){
		return  driver.findElement(By.xpath("//div[@id='panel-2']/div[2]/div/span[2]"));
	}
	//点击test1
	public WebElement clicktest1(){
		return  driver.findElement(By.linkText("test1"));
	}
	//点击test2
		public WebElement clicktest2(){
			return  driver.findElement(By.linkText("test2"));
		}
	//添加问题
	public WebElement CreateQuestion(){
		return  driver.findElement(By.id("adminsidepanel__sidebar--selectorCreateQuestion"));
	}
	//添加问题样式
	public WebElement trigger_question(){
		return  driver.findElement(By.id("trigger_question_selector_button"));
	}
	//单选题
	public WebElement danxuan(){
		return  driver.findElement(By.linkText("单选题"));
	}
	//单选题子项
	public WebElement danxuan_3(){
		return driver.findElement(By.xpath("//div[@id='collapsible_单选题']/div/div/a[3]"));
	}
	//选择问题提交
	public WebElement select(){
		return driver.findElement(By.id("selector__select-this-question_type_selector"));
	}
	//答案项
	public WebElement daan(){
		return driver.findElement(By.linkText("答案项"));
	}
	//快速添加
	public WebElement kuaisuadd(){
		return driver.findElement(By.xpath("//div[@id='advanced-options-container']/div[2]/div/div/div/div/button"));
	}
	//添加框
	public WebElement addtext(){
		return driver.findElement(By.xpath("//div[@id='modals-container']/div/div/div[2]/div/div[2]/div/div[2]/textarea"));
	}
	//添加
	public WebElement addbutton(){
		return  driver.findElement(By.xpath("//div[@id='modals-container']/div/div/div[2]/div/div[3]/div/div/button[2]"));
	}
    //替换
	public WebElement replacebutton(){
		return  driver.findElement(By.xpath("//div[@id='modals-container']/div/div/div[2]/div/div[3]/div/div/button[1]"));
	}
	//阵列问题
	public WebElement zhenlie(){
		return  driver.findElement(By.linkText("阵列"));
	}
	//阵列子项
	public WebElement zhenlie_4(){
		return  driver.findElement(By.xpath("//div[@id='collapsible_阵列']/div/div/a[4]/em"));
	}
	//子问题
	public WebElement ziwenti(){
		return  driver.findElement(By.linkText("子问题"));
	}
	//多选题
	public WebElement duoxuan(){
		return  driver.findElement(By.linkText("多选题"));
	}
	//多选子项
	public WebElement duoxuan_3(){
		return  driver.findElement(By.xpath("//div[@id='collapsible_多选题']/div/div/a[3]/em"));
	}
	//文本问题
	public WebElement text(){
		return  driver.findElement(By.linkText("文本问题"));
	}
	//文本子项
	public WebElement text_3(){
		return  driver.findElement(By.xpath("//div[@id='collapsible_文本问题']/div/div/a[3]/em"));
	}
	//掩码问题
	public WebElement yanma(){
		return  driver.findElement(By.linkText("掩码问题"));
	}
	//掩码子项性别
	public WebElement yanma_5(){
		return  driver.findElement(By.xpath("//div[@id='collapsible_掩码问题']/div/div/a[5]/em"));
	}
	//第一个组
	public WebElement testgroupid1(){
		return  driver.findElement(By.xpath("//div[@id='questionexplorer']/div[2]/ul/li/div/a/span"));
	}	
	//第一个问题
	public WebElement testid1(){
		return  driver.findElement(By.xpath("//div[@id='questionexplorer']/div[2]/ul/li/ul/li/a/span"));
	}
	//复制
	public WebElement copy(){
		return  driver.findElement(By.id("copy_button"));
	}
	//问题编辑
	public WebElement questionEditorButton(){
		return  driver.findElement(By.id("questionEditorButton"));
	}
	//问题编号	
	public WebElement questionCode(){
		return  driver.findElement(By.id("questionCode"));
	}
	//导出问题
	public WebElement export_button(){
		return  driver.findElement(By.id("export_button"));
	}
	//导入问题
	public WebElement impor_button(){
		return  driver.findElement(By.id("import-button"));
	}
	//选择文件
	public WebElement the_file(){
		return  driver.findElement(By.id("the_file"));
	}
	//编辑默认答案
	public WebElement default_value_button(){
		return  driver.findElement(By.id("default_value_button"));
	}
	//默认答案输入框
	public WebElement default_text(){
		return  driver.findElement(By.id("defaultanswerscale_0_zh-Hans_61"));
	}
	//检查逻辑
	public WebElement check_logic_button(){
		return  driver.findElement(By.id("check_logic_button"));
	}
	//打开可打印的视图
	public WebElement printablesubmit(){
		return  driver.findElement(By.name("printablesubmit"));
	}
	//工具
	public WebElement tools_button(){
		return  driver.findElement(By.id("tools_button"));
	}
	//工具——删除调查
	public WebElement tool_delete(){
		return  driver.findElement(By.linkText("删除调查"));
	}
	//删除调查
	public WebElement delete(){
		return  driver.findElement(By.xpath("//input[@value='删除调查']"));
	}
	//工具——快速翻译
	public WebElement fanyi(){
		return  driver.findElement(By.linkText("快速翻译"));
	}
	//工具——重置条件
	public WebElement retiaojian(){
		return  driver.findElement(By.linkText("重置条件"));
	}
	//工具——检查逻辑
	public WebElement tool_check(){
		return  driver.findElement(By.linkText("检查逻辑"));
	}
	//工具——整齐的
	public WebElement tool_zhengqi(){
		return  driver.findElement(By.linkText("整齐的"));
	}
    //工具——按问题组
	public WebElement tool_group(){
		return  driver.findElement(By.linkText("按问题组"));
	}
	//删除问题
	public WebElement delete_button(){
		return  driver.findElement(By.id("delete_button"));
	}
	//删除问题确定
	public WebElement ok_button(){
		return  driver.findElement(By.id("identity__bsconfirmModal_button_ok"));
	}
	//浏览问题
	public WebElement preview_question(){
		return  driver.findElement(By.id("preview_question"));
	}
	//浏览题组
	public WebElement preview_questiongroup(){
		return  driver.findElement(By.id("preview_questiongroup"));
	}
	//浏览调查
	public WebElement preview_survey(){
		return  driver.findElement(By.id("preview_survey"));
	}
	//导出组
	public WebElement export_group(){
		return  driver.findElement(By.id("export"));
	}
	//导入组
	public WebElement import_group(){
		return  driver.findElement(By.id("import"));
	}
	//检查当前组逻辑
	public WebElement check_survey_logic(){
		return  driver.findElement(By.id("check_survey_logic"));
	}
	//问题组编辑
	public WebElement group_editor(){
		return   driver.findElement(By.xpath("//div[@id='advancedQuestionGroupEditor']/div/span/div/button[2]"));
	}
	//问题组描述
	public WebElement group_descripe(){
		return  driver.findElement(By.xpath("//div[@id='advancedQuestionGroupEditor']/div/span/div[3]/div[2]/div/div[2]/div[2]/div[3]/div[2]/div"));
	}
	//删除当前组
	public WebElement delete_current_question_group(){
		return  driver.findElement(By.id("delete_current_question_group"));
	}
	//删除当前组——确定
	public WebElement ok_deletegroup(){
		return  driver.findElement(By.id("identity__bsconfirmModal_button_ok"));
	}
	//显示/导出
	public WebElement selector__exportTypeSelector(){
		return  driver.findElement(By.id("selector__exportTypeSelector--buttonText"));
	}
	//调查结构 (.lss)
	public WebElement lss(){
		return  driver.findElement(By.linkText("调查结构 (.lss)："));
	}
	//queXML 格式 (*.xml)
	public WebElement xml(){
		return  driver.findElement(By.linkText("queXML 格式 (*.xml)"));
	}
	//导出queXML PDF
	public WebElement pdf(){
		return  driver.findElement(By.linkText("导出queXML PDF"));
	}
	//使用Tab分隔符格式文件（*.txt）
	public WebElement txt(){
		return  driver.findElement(By.linkText("使用Tab分隔符格式文件（*.txt）"));
	}
	//可打印的调查（*.html）
	public WebElement html(){
		return  driver.findElement(By.linkText("可打印的调查（*.html）"));
	}
	//调查存档文件（.lsa）
	public WebElement lsa(){
		return  driver.findElement(By.linkText("调查存档文件（.lsa）"));
	}
	//可打印的调查
	public WebElement show(){
		return  driver.findElement(By.linkText("可打印的调查"));
	}
	//导出按钮
	public WebElement TypeSelector(){
		return  driver.findElement(By.id("selector__select-this-exportTypeSelector"));
	}
	//调查问卷第一个方框
	public WebElement list_1(){
		return  driver.findElement(By.id("sid_0"));
	}
	//已选择调查
	public WebElement list_choose(){
		return  driver.findElement(By.xpath("(//button[@type='button'])[2]"));
	}
	//已选择调查——删除
	public WebElement list_delete(){
		return  driver.findElement(By.linkText("删除"));
	}
	//删除——是
	public WebElement list_yes(){
		return  driver.findElement(By.linkText("是"));
	}
	//调查主题
	public WebElement theme(){
		return  driver.findElement(By.linkText("调查主题"));
	}
	//选择主题
	public WebElement theme_choose(){
		return  driver.findElement(By.id("theme"));
	}
	//fruity主题
	public WebElement theme_fruity(){
		return  driver.findElement(By.xpath("//option[@value='fruity']"));
	}
	//调查主题——是
	public WebElement theme_yes(){
		return  driver.findElement(By.xpath("//div[@id='massive-actions-modal-survey-grid-updateTheme-2']/div/div/div[3]/a/span"));
	}
	//调查问卷组list
	public WebElement surveygroup(){
		return  driver.findElement(By.xpath("//div[@id='surveyListActions']/ul/li[4]/a"));
	}
	//调查问卷组——选择
	public WebElement surveygroup_choose(){
		return  driver.findElement(By.id("surveygroupid"));
	}
	//调查问卷组——another
	public WebElement surveygroup_another(){
		return  driver.findElement(By.xpath("(//option[@value='3'])[2]"));
	}
	//调查问卷组——是
	public WebElement surveygroup_yes(){
		return  driver.findElement(By.xpath("(//a[contains(text(),'是')])[3]"));
	}
	//设置过期日期
	public WebElement lostdata(){
		return  driver.findElement(By.linkText("设置过期日期"));
	}
	//日期输入
	public WebElement lostdata_add(){
		return  driver.findElement(By.id("expires"));
	}
	//空白
	public WebElement lostdata_kong(){
		return  driver.findElement(By.xpath("//div[@id='massive-actions-modal-survey-grid-expire-9']/div/div/div[3]"));
	}
	//过期日期——是
	public WebElement lostdata_yes(){
		return  driver.findElement(By.xpath("(//a[contains(text(),'是')])[7]"));
	}
	//搜索框
	public WebElement search(){
		return  driver.findElement(By.id("Survey_searched_value"));
	}
	//搜索按钮
	public WebElement search_button(){
		return  driver.findElement(By.name("yt0"));
	}
	//重置按钮
	public WebElement rewrite(){
		return  driver.findElement(By.linkText("重置"));
	}
	//问卷调查组
	public WebElement group(){
		return  driver.findElement(By.linkText("问卷调查组"));
	}
	//创建新调查组
	public WebElement group_creat(){
		return  driver.findElement(By.linkText("创建新调查组"));
	}
	//问卷调查组——名字
	public WebElement group_name(){
		return  driver.findElement(By.id("SurveysGroups_name"));
	}
	//问卷调查组——标题
	public WebElement group_title(){
		return  driver.findElement(By.id("SurveysGroups_title"));
	}
	//问卷调查组——描述
	public WebElement group_text(){
		return  driver.findElement(By.id("SurveysGroups_description"));
	}
	
	
	public void Test1Page(String name,String describe,String welcome,String endmessage,String endurl,String urldescribe) throws InterruptedException {
		Thread.sleep(1000);
		get_create().click();
		Thread.sleep(1000);
		exit_name().clear();
		exit_name().sendKeys(name);
		Thread.sleep(1000);
		scrollTo(exit_endmessage(), driver);
		Thread.sleep(2000);
		exit_describe().click();
		exit_describe().sendKeys(describe);
		Thread.sleep(1000);
		exit_welcome().click();;
		exit_welcome().sendKeys(welcome);
		Thread.sleep(1000);
		exit_endmessage().click();
		exit_endmessage().sendKeys(endmessage);
		Thread.sleep(1000);
		exit_endurl().clear();
		exit_endurl().sendKeys(endurl);
		exit_urldescribe().clear();
		exit_urldescribe().sendKeys(urldescribe);
		scrollTo(save_form(), driver);
		save_form().click();
	}
	
	public void Test4Page(String name,String describe,String welcome,String endmessage,String endurl,String urldescribe) throws InterruptedException {
		Thread.sleep(1000);
		get_create().click();
		Thread.sleep(1000);
		date().click();
		new Select(date()).selectByVisibleText("yyyy.mm.dd");
		driver.findElement(By.xpath("//option[@value='3']")).click();
		exit_name().clear();
		exit_name().sendKeys(name);
		Thread.sleep(1000);
		scrollTo(exit_endmessage(), driver);
		Thread.sleep(2000);
		exit_describe().click();
		exit_describe().sendKeys(describe);
		Thread.sleep(1000);
		exit_welcome().click();
		exit_welcome().sendKeys(welcome);
		Thread.sleep(1000);
		exit_endmessage().click();
		exit_endmessage().sendKeys(endmessage);
		Thread.sleep(1000);
		exit_endurl().clear();
		exit_endurl().sendKeys(endurl);
		exit_urldescribe().clear();
		exit_urldescribe().sendKeys(urldescribe);
		scrollTo(save_form(), driver);
		save_form().click();
	}
	
	public void Test5Page(String name,String describe,String welcome,String endmessage,String endurl,String urldescribe) throws InterruptedException {
		Thread.sleep(1000);
		get_create().click();
		Thread.sleep(1000);
		createsample().click();
		exit_name().clear();
		exit_name().sendKeys(name);
		Thread.sleep(1000);
		scrollTo(exit_endmessage(), driver);
		Thread.sleep(2000);
		exit_describe().click();	
		exit_describe().sendKeys(describe);
		Thread.sleep(1000);
		exit_welcome().click();
		exit_welcome().sendKeys(welcome);
		Thread.sleep(1000);
		exit_endmessage().click();
		exit_endmessage().sendKeys(endmessage);
		Thread.sleep(1000);
		exit_endurl().clear();
		exit_endurl().sendKeys(endurl);
		exit_urldescribe().clear();
		exit_urldescribe().sendKeys(urldescribe);
		scrollTo(save_form(), driver);
		save_form().click();
	}
	public void Test6Page(String name,String grouptitle,String question) throws InterruptedException {
		Thread.sleep(1000);
		get_create().click();
		Thread.sleep(1000);
		exit_name().clear();
		exit_name().sendKeys(name);
		Thread.sleep(1000);
		save_form().click();
		Thread.sleep(2000);
		StructureButton().click();
		CreateQuestionGroup().click();
		Thread.sleep(2000);
		groupTitle().clear();
		groupTitle().sendKeys(grouptitle);
		save_new_question_button().click();
		Thread.sleep(3000);
		Question().click();
		Question().sendKeys(question);
		save_button().click();
		Thread.sleep(2000);
		SettingsButton().click();
		sidemenu_overview().click();
		Thread.sleep(2000);
		ls_activate_survey().click();
		Thread.sleep(2000);
		activateSurvey__basicSettings().click();
	}
	public void Test7Page(String name,String grouptitle,String question,String grouptitle2) throws InterruptedException {
		Thread.sleep(1000);
		get_create().click();
		Thread.sleep(1000);
		exit_name().clear();
		exit_name().sendKeys(name);
		Thread.sleep(1000);
		save_form().click();
		Thread.sleep(2000);
		StructureButton().click();
		CreateQuestionGroup().click();
		Thread.sleep(2000);
		groupTitle().clear();
		groupTitle().sendKeys(grouptitle);
		save_new_question_button().click();
		Thread.sleep(3000);
		Question().click();
		Question().sendKeys(question);
		save_button().click();
		Thread.sleep(2000);
		StructureButton().click();
		CreateQuestionGroup().click();
		Thread.sleep(2000);
		groupTitle().clear();
		groupTitle().sendKeys(grouptitle2);
		save_button().click();
		Thread.sleep(2000);
		SettingsButton().click();
		sidemenu_overview().click();
		Thread.sleep(2000);
		ls_activate_survey().click();
		Thread.sleep(2000);
		activateSurvey__basicSettings().click();	
	}
	
	public void Test8Page(String name,String grouptitle,String question) throws InterruptedException {
		Thread.sleep(1000);
		get_create().click();
		Thread.sleep(2000);
		exit_name().clear();
		exit_name().sendKeys(name);
		Thread.sleep(2000);
		save_form().click();
		Thread.sleep(2000);
		StructureButton().click();
		CreateQuestionGroup().click();
		Thread.sleep(2000);
		groupTitle().clear();
		groupTitle().sendKeys(grouptitle);
		save_new_question_button().click();
		Thread.sleep(3000);
		Question().click();
		Question().sendKeys(question);
		save_button().click();
		Thread.sleep(3000);
		SettingsButton().click();
		sidemenu_overview().click();
		Thread.sleep(3000);
		ls_activate_survey().click();
		Thread.sleep(3000);
		activateSurvey__basicSettings().click();
		Thread.sleep(3000);
		stop_survey().click();
		Thread.sleep(3000);
		stopsurvey().click();	
	}
	
	public void Test9Page(String question,String choose1,String choose2) throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		CreateQuestion().click();
		Thread.sleep(2000);
		trigger_question().click();
		Thread.sleep(2000);
		danxuan().click();
		danxuan_3().click();
		select().click();
		Thread.sleep(2000);
		scrollTo(daan(), driver);
		daan().click();
		kuaisuadd().click();
		Thread.sleep(2000);
		addtext().sendKeys(choose1);
		Thread.sleep(2000);
		replacebutton().click();
		Thread.sleep(2000);
		kuaisuadd().click();
		Thread.sleep(2000);
		addtext().sendKeys(Keys.CONTROL, "a");
		addtext().sendKeys(choose2);
		Thread.sleep(2000);
		addbutton().click();
		Thread.sleep(2000);
		scrollTo(save_button(), driver);
		Question().click();
		Question().sendKeys(question);
		Thread.sleep(2000);
		save_button().click();	
	}
	public void Test10Page(String question,String choose1,String choose2) throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		CreateQuestion().click();
		Thread.sleep(2000);
		trigger_question().click();
		Thread.sleep(2000);
		zhenlie().click();
		zhenlie_4().click();
		select().click();
		Thread.sleep(2000);
		scrollTo(ziwenti(), driver);
		ziwenti().click();
		kuaisuadd().click();
		Thread.sleep(2000);
		addtext().sendKeys(choose1);
		Thread.sleep(2000);
		replacebutton().click();
		Thread.sleep(2000);
		daan().click();
		kuaisuadd().click();
		Thread.sleep(2000);
		addtext().sendKeys(choose2);
		Thread.sleep(2000);
		replacebutton().click();
		Thread.sleep(2000);
		scrollTo(save_button(), driver);
		Question().click();
		Question().sendKeys(question);
		Thread.sleep(2000);
		save_button().click();	
	}
	public void Test11Page(String question,String choose1,String choose2) throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		CreateQuestion().click();
		Thread.sleep(2000);
		trigger_question().click();
		Thread.sleep(2000);
		duoxuan().click();
		duoxuan_3().click();
		select().click();
		Thread.sleep(2000);
		scrollTo(ziwenti(), driver);
		ziwenti().click();
		kuaisuadd().click();
		Thread.sleep(2000);
		addtext().sendKeys(choose1);
		Thread.sleep(2000);
		replacebutton().click();
		Thread.sleep(2000);
		kuaisuadd().click();
		Thread.sleep(2000);
		addtext().sendKeys(Keys.CONTROL, "a");
		addtext().sendKeys(choose2);
		Thread.sleep(2000);
		addbutton().click();
		Thread.sleep(2000);
		scrollTo(save_button(), driver);
		Question().click();
		Question().sendKeys(question);
		Thread.sleep(2000);
		save_button().click();	
	}
	public void Test12Page(String question,String text) throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		CreateQuestion().click();
		Thread.sleep(2000);
		trigger_question().click();
		Thread.sleep(2000);
		text().click();
		text_3().click();
		select().click();
		Thread.sleep(2000);
		scrollTo(ziwenti(), driver);
		ziwenti().click();
		kuaisuadd().click();
		Thread.sleep(2000);
		addtext().sendKeys(text);
		Thread.sleep(2000);
		replacebutton().click();
		Thread.sleep(2000);
		scrollTo(save_button(), driver);
		Question().click();
		Question().sendKeys(question);
		Thread.sleep(2000);
		save_button().click();	
	}
	public void Test13Page(String question) throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		CreateQuestion().click();
		Thread.sleep(2000);
		trigger_question().click();
		Thread.sleep(2000);
		yanma().click();
		yanma_5().click();
		select().click();
		Thread.sleep(2000);
		Question().click();
		Question().sendKeys(question);
		Thread.sleep(2000);
		save_button().click();	
	}
	public void Test14Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(2000);
		copy().click();
		Thread.sleep(2000);
		save_button().click();		
	}
	public void Test15Page(String id,String text) throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(2000);
		questionEditorButton().click();
		Thread.sleep(2000);
		questionCode().clear();
		questionCode().sendKeys(id);
		Question().clear();
		Question().sendKeys(text);
		Thread.sleep(2000);
		save_button().click();		
	}
	public void Test17Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(2000);
		export_button().click();
	}
	
	public void Test18Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		impor_button().click();
		Thread.sleep(2000);
		the_file().sendKeys("H:\\xishun-test\\limesurvey_question_60.lsq");
		save_button().click();	
	}
	public void Test19Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		impor_button().click();
		Thread.sleep(2000);
		save_button().click();	
	}
	public void Test20Page(String text) throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		default_value_button().click();
		Thread.sleep(2000);
		default_text().clear();
		default_text().sendKeys(text);
		save_button().click();
	}
	public void Test21Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		check_logic_button().click();
		Thread.sleep(2000);
		printablesubmit().click();	
	}
	public void Test22Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		check_logic_button().click();
		Thread.sleep(2000);
		tools_button().click();
		Thread.sleep(2000);
		tool_delete().click();
		Thread.sleep(2000);
		delete().click();
	}
	public void Test23Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		check_logic_button().click();
		Thread.sleep(2000);
		tools_button().click();
		Thread.sleep(2000);
		fanyi().click();
	}
	public void Test24Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		check_logic_button().click();
		Thread.sleep(2000);
		tools_button().click();
		Thread.sleep(2000);
		retiaojian().click();
	}
	public void Test25Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		check_logic_button().click();
		Thread.sleep(2000);
		tools_button().click();
		Thread.sleep(2000);
		tool_check().click();
	}
	public void Test26Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		check_logic_button().click();
		Thread.sleep(2000);
		tools_button().click();
		Thread.sleep(2000);
		tool_zhengqi().click();
	}
	public void Test27Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		check_logic_button().click();
		Thread.sleep(2000);
		tools_button().click();
		Thread.sleep(2000);
		tool_group().click();
	}
	public void Test28Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		delete_button().click();
		Thread.sleep(2000);
		ok_button().click();	
	}
	public void Test29Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		preview_question().click();
	}
	public void Test30Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		preview_questiongroup().click();
	}
	public void Test31Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		testid1().click();
		Thread.sleep(3000);
		preview_survey().click();	
	}
	public void Test32Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		export_group().click();
	}
	public void Test33Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		import_group().click();
		Thread.sleep(2000);
		the_file().sendKeys("H:\\xishun-test\\limesurvey_group_23.lsg");
		save_button().click();
	}
	public void Test34Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		check_survey_logic().click();
	}
	public void Test35Page(String title,String descripe) throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		group_editor().click();
		Thread.sleep(2000);
		groupTitle().clear();
		groupTitle().sendKeys(title);
		group_descripe().click();
		group_descripe().sendKeys(descripe);
		save_button().click();
	}
	public void Test36Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		StructureButton().click();
		Thread.sleep(2000);
		testgroupid1().click();
		Thread.sleep(2000);
		delete_current_question_group().click();
		Thread.sleep(2000);
		ok_deletegroup().click();
	}
	public void Test37Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		selector__exportTypeSelector().click();
		Thread.sleep(2000);
		lss().click();
		TypeSelector().click();
	}
	public void Test38Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		selector__exportTypeSelector().click();
		Thread.sleep(2000);
		xml().click();
		TypeSelector().click();
	}
	public void Test39Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		selector__exportTypeSelector().click();
		Thread.sleep(2000);
		pdf().click();
		TypeSelector().click();
	}
	public void Test40Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		selector__exportTypeSelector().click();
		Thread.sleep(2000);
		txt().click();
		TypeSelector().click();
	}
	public void Test41Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(3000);
		selector__exportTypeSelector().click();
		Thread.sleep(2000);
		html().click();
		Thread.sleep(2000);
		TypeSelector().click();
	}
	public void Test42Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest2().click();
		Thread.sleep(2000);
		selector__exportTypeSelector().click();
		Thread.sleep(2000);
		lsa().click();
		TypeSelector().click();
	}
	public void Test43Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		clicktest1().click();
		Thread.sleep(2000);
		selector__exportTypeSelector().click();
		Thread.sleep(2000);
		show().click();
		TypeSelector().click();
	}
	public void Test44Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		list_1().click();
		Thread.sleep(2000);
		scrollTo(list_choose(), driver);
		Thread.sleep(2000);
		list_choose().click();
		Thread.sleep(2000);
		list_delete().click();
		Thread.sleep(2000);
		list_yes().click();
	}
	public void Test45Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		list_1().click();
		Thread.sleep(2000);
		scrollTo(list_choose(), driver);
		Thread.sleep(2000);
		list_choose().click();
		Thread.sleep(2000);
		theme().click();
		Thread.sleep(2000);
		theme_choose().click();
		Thread.sleep(2000);
		theme_fruity().click();
		theme_yes().click();
	}
	public void Test46Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		list_1().click();
		Thread.sleep(2000);
		scrollTo(list_choose(), driver);
		Thread.sleep(2000);
		list_choose().click();
		Thread.sleep(2000);
		surveygroup().click();
		Thread.sleep(2000);
		surveygroup_choose().click();
		Thread.sleep(2000);
		surveygroup_another().click();
		surveygroup_yes().click();
	}
	public void Test47Page() throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		list_1().click();
		Thread.sleep(2000);
		scrollTo(list_choose(), driver);
		Thread.sleep(2000);
		list_choose().click();
		Thread.sleep(2000);
		lostdata().click();
		Thread.sleep(2000);
		lostdata_add().clear();
		lostdata_add().sendKeys("31.11.2020 17:10");
		lostdata_kong().click();
		lostdata_yes().click();		
	}
	public void Test48Page(String text) throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		search().clear();
		search().sendKeys(text);
		Thread.sleep(2000);
		search_button().click();
	}
	public void Test49Page(String text) throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		search().clear();
		search().sendKeys(text);
		Thread.sleep(2000);
		search_button().click();
		Thread.sleep(2000);
		rewrite().click();
	}
	public void Test50Page(String name,String title,String text) throws InterruptedException {
		Thread.sleep(1000);
		list().click();
		Thread.sleep(2000);
		group().click();
		Thread.sleep(2000);
		group_creat().click();
		Thread.sleep(2000);
		group_name().clear();
		group_name().sendKeys(name);
		group_title().clear();
		group_title().sendKeys(title);
		group_text().clear();
		group_text().sendKeys(text);
		Thread.sleep(2000);
		save_form().click();
	}

	
	//实现滚动条拖动
	public static void scrollTo(WebElement element, WebDriver driver) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(false);", element);
    }
	
	
	

}
	