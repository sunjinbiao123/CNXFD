package com.test.demo;

import java.io.UnsupportedEncodingException;

import com.test.utils.MailUtil;

/*
 * �����
 * ����ģ�飺LimeSurvey����ģ�飨��ҳ�趨��ȫ�����ã�
 */

public class SendReport {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		MailUtil.sendEmail();
	}
	
}
