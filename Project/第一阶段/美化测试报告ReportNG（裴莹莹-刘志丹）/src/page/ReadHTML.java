package page;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;


public class ReadHTML {
	public ReadHTML() {
		
	}
	public String readString(String url) throws ParseException, IOException {
		File f = new File(url);
		if(!f.exists() && !f.getAbsolutePath().endsWith("html")) {
		return "";
		} 
		InputStream in = new FileInputStream(f) ;
		StringBuffer b = new StringBuffer();
		int c;
		while((c =in.read()) != -1) {
		b.append((char)c);
		}
		return b.toString();
	}

}
