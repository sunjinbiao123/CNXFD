package page;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
//姓名：刘志丹   学号：2018012017
//读取HTML类
public class ReadHTML {
	public ReadHTML() {
		
	}
	public String readString(String url) throws ParseException, IOException {
		File f = new File(url);
		if(!f.exists() && !f.getAbsolutePath().endsWith("html")) {
		return "";
		} 
	    InputStreamReader read = new InputStreamReader(new FileInputStream(f),"UTF-8");
		StringBuffer b = new StringBuffer();
		int c;
		while((c =read.read()) != -1) {
		b.append((char)c);
		}
		return b.toString();
	}

}
