package com.webtest.test;

import static org.testng.Assert.assertTrue;
/**
 * 江明骞
 * 模块：创建、删除问卷模块
 */

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Base.BaseTest;
import Page.MainPage;

public class demo extends BaseTest{
	MainPage MainPage;
	@BeforeClass
	public void init() {
		MainPage=new MainPage(driver);
	}
	//1.创建一个非活动的无问题组的调查问卷
	@Test(priority=1)
	public void test1() throws InterruptedException {
		MainPage.Test1Page("test1", "test1", "test1", "test1", "http://www.baidu.com /", "这是百度界面");
	} 
	//2.创建一个非活动的无问题组无调查名称的调查问卷
	@Test(priority=2)
	public void test2() throws InterruptedException {
		MainPage.Test1Page(null, "test1", "test1", "test1", "http://www.baidu.com /", "这是百度界面");
	}
	//3.用空格替代调查名称创建一个非活动的无问题组的调查问卷
	@Test(priority=3)
	public void test3() throws InterruptedException {
		MainPage.Test1Page("  ", "test1", "test1", "test1", "http://www.baidu.com /", "这是百度界面");
	}
	//4.创建一个非活动的无问题组日期非默认格式调查问卷
	@Test(priority=4)
	public void test4() throws InterruptedException {	
		MainPage.Test4Page("test1", "test1", "test1", "test1", "http://www.baidu.com /", "这是百度界面");
	}
	//5.使用系统的示例问题和问题组创建非活动调查问卷
	@Test(priority=5)
	public void test5() throws InterruptedException {	
		MainPage.Test5Page("test1", "test1", "test1", "test1", "http://www.baidu.com /", "这是百度界面");
	}
	//6.创建一个调查问卷并启动
	@Test(priority=6)
 	public void test6() throws InterruptedException {	
		MainPage.Test6Page("test2", "test1组", "test1问题");
	}
	//7.创建一个包含无问题问题组的调查问卷并启动
	@Test(priority=7)
	public void test7() throws InterruptedException {	
		MainPage.Test7Page("test2", "test1组", "test1问题","test2组");
	}
	//8.创建一个调查问卷启动后停用调查
	@Test(priority=8)
	public void test8() throws InterruptedException {	
		MainPage.Test8Page("test1", "test1组", "test1问题");
	}
	//9.设立一个单选问题
	@Test(priority=9)
	public void test9() throws InterruptedException {	
		MainPage.Test9Page("选择一个选项", "A","B");
	}
	//10.设立一个阵列问题
	@Test(priority=10)
	public void test10() throws InterruptedException {	
		MainPage.Test9Page("根据阵列选择", "A","B");
	}
	//11.设立一个多选问题
	@Test(priority=11)
	public void test11() throws InterruptedException {	
		MainPage.Test11Page("请选择选项", "A","B");
	}
	//12.设立一个文本问题
	@Test(priority=13)
	public void test13() throws InterruptedException {	
		MainPage.Test12Page("输入以下文本", "test");
	}
	//13.设立一个掩码问题
	@Test(priority=12)
	public void test12() throws InterruptedException {	
		MainPage.Test13Page("请选择性别");
	}
	//14.问题的复制
	@Test(priority=14)
	public void test14() throws InterruptedException {	
		MainPage.Test14Page();
	}
	//15.问题编号及问题的正确编辑
	@Test(priority=15)
	public void test15() throws InterruptedException {	
		MainPage.Test15Page("Q1","1");
	}
	//16.问题编号的错误编辑
	@Test(priority=16)
	public void test16() throws InterruptedException {	
		MainPage.Test15Page("1","1");
	}
	//17.问题的导出
	@Test(priority=17)
	public void test17() throws InterruptedException {	
		MainPage.Test17Page();
	}
	//18.问题的导入
	@Test(priority=18)
	public void test18() throws InterruptedException {	
		MainPage.Test18Page();
	}
	//19.问题的空白导入
	@Test(priority=19)
	public void test19() throws InterruptedException {	
		MainPage.Test19Page();
	}
	//20.文本问题的编辑默认答案
	@Test(priority=20)
	public void test20() throws InterruptedException {	
		MainPage.Test20Page("默认答案");
	}
	//21.从检查逻辑中打开可打印的视图
	@Test(priority=21)
	public void test21() throws InterruptedException {	
		MainPage.Test21Page();
	}
	//22.从检查逻辑中运用工具删除调查
	@Test(priority=22)
	public void test22() throws InterruptedException {	
		MainPage.Test22Page();
	}
	//23.从检查逻辑中运用工具快速翻译
	@Test(priority=23)
	public void test23() throws InterruptedException {	
		MainPage.Test23Page();
	}
	//24.从检查逻辑中运用工具重置条件
	@Test(priority=24)
	public void test24() throws InterruptedException {	
		MainPage.Test24Page();
	}
	//25.从检查逻辑中运用工具检查逻辑
	@Test(priority=25)
	public void test25() throws InterruptedException {	
		MainPage.Test25Page();
	}
	//26.从检查逻辑中运用工具重新生成整齐的问题编码
	@Test(priority=26)
	public void test26() throws InterruptedException {	
		MainPage.Test26Page();
	}
	//27.从检查逻辑中运用工具按问题组重新生成问题编码
	@Test(priority=27)
	public void test27() throws InterruptedException {	
		MainPage.Test27Page();
	}
	//28.删除test1调查问卷第一个问题
	@Test(priority=28)
	public void test28() throws InterruptedException {	
		MainPage.Test28Page();
	}
	//29.预览问题
	@Test(priority=29)
	public void test29() throws InterruptedException {	
		MainPage.Test29Page();
	}
	//30.预览题组
	@Test(priority=30)
	public void test30() throws InterruptedException {	
		MainPage.Test30Page();
	}
	//31.预览调查
	@Test(priority=31)
	public void test31() throws InterruptedException {	
		MainPage.Test31Page();
	}
	//32.问题组的导出
	@Test(priority=32)
	public void test32() throws InterruptedException {	
		MainPage.Test32Page();
	}
	//33.问题组的导入
	@Test(priority=33)
	public void test33() throws InterruptedException {	
		MainPage.Test33Page();
	}
	//34.问题组的检查当前组逻辑
	@Test(priority=34)
	public void test34() throws InterruptedException {	
		MainPage.Test34Page();
	}
	//35.问题组标题及描述的编辑
	@Test(priority=35)
	public void test35() throws InterruptedException {	
		MainPage.Test35Page("Test2组","Test2");
	}
	//36.问题组的删除
	@Test(priority=36)
	public void test36() throws InterruptedException {	
		MainPage.Test36Page();
	}
	//37.调查的导出.lss格式
	@Test(priority=37)
	public void test37() throws InterruptedException{	
		MainPage.Test37Page();
	}
	//38.调查的导出.xml格式
	@Test(priority=38)
	public void test38() throws InterruptedException {	
		MainPage.Test38Page();
	}
	//39.调查的导出queXML PDF格式
	@Test(priority=39)
	public void test39() throws InterruptedException {	
		MainPage.Test39Page();
	}
	//40.调查的导出.txt格式
	@Test(priority=40)
	public void test40() throws InterruptedException {	
		MainPage.Test40Page();
	}
	//41.调查的导出.html格式
	@Test(priority=41)
	public void test41() throws InterruptedException {	
		MainPage.Test41Page();
	}
	//42.活动调查的调查存档文件的导出
	@Test(priority=42)
	public void test42() throws InterruptedException {	
		MainPage.Test42Page();
	}
	//43.调查的显示
	@Test(priority=43)
	public void test43() throws InterruptedException {	
		MainPage.Test43Page();
	}
	//44.调查的删除
	@Test(priority=44)
	public void test44() throws InterruptedException {	
		MainPage.Test44Page();
	}
	//45.调查主题的设置
	@Test(priority=45)
	public void test45() throws InterruptedException {	
		MainPage.Test45Page();
	}
	//46.编辑调查的问卷调查组
	@Test(priority=46)
	public void test46() throws InterruptedException {	
		MainPage.Test46Page();
	}
	//47.设置调查的过期日期
	@Test(priority=47)
	public void test47() throws InterruptedException {	
		MainPage.Test47Page();
	}
	//48.查询标题有test的调查问卷
	@Test(priority=48)
	public void test48() throws InterruptedException {	
		MainPage.Test48Page("test");
	}
	//49.重置搜索条件
	@Test(priority=49)
	public void test49() throws InterruptedException {	
		MainPage.Test49Page("test");
	}
	//50.创建一个调查问卷组
	@Test(priority=50)
	public void test50() throws InterruptedException {	
		MainPage.Test50Page("another","another","another");
	}
	


}
