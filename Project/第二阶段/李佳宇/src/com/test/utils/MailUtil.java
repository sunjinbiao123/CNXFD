package com.test.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.sun.mail.util.MailSSLSocketFactory;
import com.test.utils.ReadProperties;

public class MailUtil {
	
	static int port = 25;
	static String server = "smtp.126.com";
	static String from;
	static String to;
	static String user;
	static String password;
	
	public static void sendEmail() throws UnsupportedEncodingException {
        try {
        	from = ReadProperties.getPropertyValue("from");
        	to = ReadProperties.getPropertyValue("to");
        	user = ReadProperties.getPropertyValue("user");
        	password = ReadProperties.getPropertyValue("password");
            Properties props = new Properties();
            props.put("mail.smtp.host", server);
            props.put("mail.smtp.port", String.valueOf(port));
            props.put("mail.smtp.auth", "true");
            Transport transport = null;
            Session session = Session.getDefaultInstance(props,null);
            transport = session.getTransport("smtp");
            transport.connect(server, user, password);
            MimeMessage message = new MimeMessage(session);
            message.setSentDate(new Date());
            
            InternetAddress fromAddress = new InternetAddress(user,from,"UTF-8");
            message.setFrom(fromAddress);
            String emailList[]=to.split(",");
            InternetAddress[] toAddress = new InternetAddress[emailList.length];
            
            for(int i=0;i<emailList.length;i++)
            {
            	toAddress[i]=new InternetAddress(emailList[i]);
            }
          
            message.addRecipients(Message.RecipientType.TO, toAddress);  
            message.setSubject("测试报告","UTF-8");
            
            BodyPart messageBodyPart1 = new MimeBodyPart();
//            messageBodyPart1.setText("正文");
 			MimeBodyPart messageBodyPart2 = new MimeBodyPart();
// 			String filename = "D:\\eclipse-workspace\\the frame\\test-output\\index.html";
 			String filename2 = "test-output/navigation.html";
 			DataSource source2 = new FileDataSource(filename2);
 			messageBodyPart2.setDataHandler(new DataHandler(source2));
 			String filename3 = "test-output/overview.html";
 			DataSource source3 = new FileDataSource(filename3);
 			BodyPart messageBodyPart3 = new MimeBodyPart();
 			messageBodyPart3.setDataHandler(new DataHandler(source3));
 			String filename4 = "test-output/Suite_Test1.html";
 			DataSource source4 = new FileDataSource(filename4);
 			BodyPart messageBodyPart4 = new MimeBodyPart();
 			messageBodyPart4.setDataHandler(new DataHandler(source4));
 //			messageBodyPart2.setFileName(filename);
 			Multipart multipart = new MimeMultipart();
// 			multipart.addBodyPart(messageBodyPart1);
 			multipart.addBodyPart(messageBodyPart2);
 			multipart.addBodyPart(messageBodyPart3);
 			multipart.addBodyPart(messageBodyPart4);
 			message.setContent(multipart,"text/html");
 			message.saveChanges();
            transport.sendMessage(message, message.getAllRecipients());
            
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (IOException e) {
			e.printStackTrace();
		}
    }
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		MailUtil.sendEmail();
	}
	
}
