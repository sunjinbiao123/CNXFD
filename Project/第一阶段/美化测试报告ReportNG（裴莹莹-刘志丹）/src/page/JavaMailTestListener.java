package page;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import properties.Log;
import properties.ReadProperties;



public class JavaMailTestListener extends TestListenerAdapter {
    MailPage hReporter=new MailPage();
	
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
				String emailContent=hReporter.readSuitsXml();
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
		}
	
	}
  public String getTime()
    {
    	java.util.Calendar c=java.util.Calendar.getInstance();    
        java.text.SimpleDateFormat f=new java.text.SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");    
       	return  f.format(c.getTime());    
    }
}