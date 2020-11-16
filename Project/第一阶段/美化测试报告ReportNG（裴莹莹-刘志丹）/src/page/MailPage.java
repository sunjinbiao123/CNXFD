package page;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.dom4j.io.SAXReader;
import org.openqa.selenium.remote.http.HttpClient;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.google.inject.spi.Element;

public class MailPage {

	public static boolean hasDigit(String content) {
		boolean flag = false;
		Pattern p = Pattern.compile(".*\\d+.*");
		Matcher m = p.matcher(content);
		if (m.matches())
			flag = true;
		return flag;

	}

	/**
	 * 获取到最新的目录
	 * 
	 * @return 返回目录的名称
	 */
	private static String getLastesFolder() {
		File path = new File("./test-output/xml/");
		// 列出该目录下所有文件和文件夹
		File[] files = path.listFiles();
		// 按照文件最后修改日期倒序排序
		Arrays.sort(files, new Comparator<File>() {
			@Override
			public int compare(File file1, File file2) {
				return (int) (file2.lastModified() - file1.lastModified());
			}
		});
		// 取出第一个(即最新修改的)文件，打印文件名
		for (File file : files) {
			System.out.println(file.getName());
			if (hasDigit(file.getName())) {
				return file.getName();
			}
		}
		return files[0].getName();
	}

	/**
	 * 读取Suite.xml文件
	 * 
	 * @return 对应的html内容
	 */
	public String readSuitsXml() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>测试报告的样式</title>");
        sb.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />"); 
	
		sb.append("<div style='font-size:30px'>"+"自动化测试报告"+"</div>\n");


		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document = db.parse("./test-output/xml/" + getLastesFolder());
			NodeList testlist = document.getElementsByTagName("testcase");
			sb.append("<br>本次共运行自动化用例"+testlist.getLength()+"个"+"</br>\n");
			sb.append("<table width='100%'  border='1' cellspacing='0'  style='font-size:12px'>");
		    sb.append("<tr height='40'>");
			sb.append("<th  colspan='4' align='left' nowrap bgcolor='#66CC33'   scope='col'>"+"<div style='color:red' >"+"以下case执行失败"+"</div>"+"</th>\n");
			sb.append("</tr>\n");
			int testCasePass = 0, testCaseFail = 0;
			for (int i = 0; i < testlist.getLength(); i++) {
//				获取每个节点
				Node testcase = testlist.item(i);
//				获取节点的属性
				NamedNodeMap attrs = testcase.getAttributes();
//				获得子节点
				NodeList testChildNodes = testcase.getChildNodes();
				if(testChildNodes.getLength()!=0) {
				 for (int k = 0; k < testChildNodes.getLength(); k++) {
				   Node testChild = testChildNodes.item(k);
				   String type=testChild.getNodeName();
				   if (type.equals("failure")) {
				     for (int j = 0; j < attrs.getLength(); j++) {
//				     获取单个节点的属性
					 Node att = attrs.item(j);
//					获取属性名称
					String attName = att.getNodeName();
					if(attName.equals("name")) {
					 String attValue=att.getNodeValue();
					    sb.append("<tr height='60px'>");
					    sb.append( "<th bgcolor='pink'><strong>" + "失败的测试用例"+attValue
								+ "</strong></th>\n");
					    sb.append("</tr>");
						testCaseFail += 1;
						
					  } 
					 }
				   }
				 }
				}
				else {
					 for (int s = 0; s < attrs.getLength(); s++) {
//					     获取单个节点的属性
						 Node att = attrs.item(s);
//						获取属性名称
						String attName = att.getNodeName();
						if(attName.equals("name")) {
						 String attValue=att.getNodeValue();
						 sb.append("<tr bgcolor='orange' height='35'>");
						 sb.append("<th bgcolor='orange' ><strong>" + "成功的测试用例"+attValue
									+ "</strong></th>\n");
						 sb.append("</tr>\n");
							testCasePass += 1;
						  } 
					 }
				}
				
				sb.append("</table>\n");
				sb.append("</div>\n" + "</body>\n" + "</html>");
				String baseHtml=sb.toString();
				baseHtml = baseHtml.replace("SUCCESSCOUNT", String.valueOf(testCasePass));
				baseHtml = baseHtml.replace("FAILCOUNT", String.valueOf(testCaseFail));
				System.out.println(testCaseFail);
				System.out.println(testCasePass);
			}
		 }
		    catch (ParserConfigurationException e) {
			   e.printStackTrace();
		   } catch (SAXException e) {
			    e.printStackTrace();
		   } catch (IOException e) {
			   e.printStackTrace();
		}
		return sb.toString();
	}
}
