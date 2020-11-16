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
	 * ��ȡ�����µ�Ŀ¼
	 * 
	 * @return ����Ŀ¼������
	 */
	private static String getLastesFolder() {
		File path = new File("./test-output/xml/");
		// �г���Ŀ¼�������ļ����ļ���
		File[] files = path.listFiles();
		// �����ļ�����޸����ڵ�������
		Arrays.sort(files, new Comparator<File>() {
			@Override
			public int compare(File file1, File file2) {
				return (int) (file2.lastModified() - file1.lastModified());
			}
		});
		// ȡ����һ��(�������޸ĵ�)�ļ�����ӡ�ļ���
		for (File file : files) {
			System.out.println(file.getName());
			if (hasDigit(file.getName())) {
				return file.getName();
			}
		}
		return files[0].getName();
	}

	/**
	 * ��ȡSuite.xml�ļ�
	 * 
	 * @return ��Ӧ��html����
	 */
	public String readSuitsXml() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>���Ա������ʽ</title>");
        sb.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />"); 
	
		sb.append("<div style='font-size:30px'>"+"�Զ������Ա���"+"</div>\n");


		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document = db.parse("./test-output/xml/" + getLastesFolder());
			NodeList testlist = document.getElementsByTagName("testcase");
			sb.append("<br>���ι������Զ�������"+testlist.getLength()+"��"+"</br>\n");
			sb.append("<table width='100%'  border='1' cellspacing='0'  style='font-size:12px'>");
		    sb.append("<tr height='40'>");
			sb.append("<th  colspan='4' align='left' nowrap bgcolor='#66CC33'   scope='col'>"+"<div style='color:red' >"+"����caseִ��ʧ��"+"</div>"+"</th>\n");
			sb.append("</tr>\n");
			int testCasePass = 0, testCaseFail = 0;
			for (int i = 0; i < testlist.getLength(); i++) {
//				��ȡÿ���ڵ�
				Node testcase = testlist.item(i);
//				��ȡ�ڵ������
				NamedNodeMap attrs = testcase.getAttributes();
//				����ӽڵ�
				NodeList testChildNodes = testcase.getChildNodes();
				if(testChildNodes.getLength()!=0) {
				 for (int k = 0; k < testChildNodes.getLength(); k++) {
				   Node testChild = testChildNodes.item(k);
				   String type=testChild.getNodeName();
				   if (type.equals("failure")) {
				     for (int j = 0; j < attrs.getLength(); j++) {
//				     ��ȡ�����ڵ������
					 Node att = attrs.item(j);
//					��ȡ��������
					String attName = att.getNodeName();
					if(attName.equals("name")) {
					 String attValue=att.getNodeValue();
					    sb.append("<tr height='60px'>");
					    sb.append( "<th bgcolor='pink'><strong>" + "ʧ�ܵĲ�������"+attValue
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
//					     ��ȡ�����ڵ������
						 Node att = attrs.item(s);
//						��ȡ��������
						String attName = att.getNodeName();
						if(attName.equals("name")) {
						 String attValue=att.getNodeValue();
						 sb.append("<tr bgcolor='orange' height='35'>");
						 sb.append("<th bgcolor='orange' ><strong>" + "�ɹ��Ĳ�������"+attValue
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
