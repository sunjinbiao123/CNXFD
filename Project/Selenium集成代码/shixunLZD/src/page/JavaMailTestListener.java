package page;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.hc.core5.http.ParseException;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import properties.Log;
import properties.ReadProperties;

//–’√˚£∫¡ı÷æµ§ —ß∫≈£∫2018012017
//º‡Ã˝∆˜¿‡

public class JavaMailTestListener extends TestListenerAdapter {
    ReadHTML hReporter=new ReadHTML();
	
    public JavaMailTestListener() {
		// TODO Auto-generated constructor stub
		super();
	}
	


	
	@Override
	public void onFinish(ITestContext testContext){
		// TODO Auto-generated method stub
		super.onFinish(testContext);
		if(System.getProperty("os.name").contains("dow"))
		{
			//return;
		}
		try {
			if(ReadProperties.getPropertyValue("enable_email").equals("true"))
			{
				Thread.sleep(2000);
				String emailContent=hReporter.readString("./test-output/html/suite1_test1_results.html");
				Thread.sleep(2000);
				String emailContent2=hReporter.readString("./test-output/html/reportng.css");
				Thread.sleep(2000);
				String emailContent3=hReporter.readString("./test-output/html/reportng.js");
				String changestr1="<style type=\"text/css\"> h1{display:inline}>"+emailContent2+"</style>";
				String changestr2="<script type=\"text/javascript\">"+emailContent3+"</script>";
				emailContent=emailContent.replace(" <link href=\"reportng.css\" rel=\"stylesheet\" type=\"text/css\" />", changestr1);
				emailContent=emailContent.replace(" <script type=\"text/javascript\" src=\"reportng.js\"></script>", changestr2);
				String emailTitle=ReadProperties.getPropertyValue("mail_title")+"----"+this.getTime();
				String toMail=ReadProperties.getPropertyValue("to_mail");
				try {
					if(this.getFailedTests()!=null&&this.getFailedTests().size()>0)
					{
						MailUtil.sendEmail(toMail,emailTitle, emailContent);
						Log.info("email send to "+toMail+" success");
					}
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					Log.fatal("email send fail :"+e.getMessage());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	}
  public String getTime()
    {
    	java.util.Calendar c=java.util.Calendar.getInstance();    
        java.text.SimpleDateFormat f=new java.text.SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");    
       	return  f.format(c.getTime());    
    }
}