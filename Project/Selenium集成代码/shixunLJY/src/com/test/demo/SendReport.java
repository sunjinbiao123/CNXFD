package com.test.demo;

import java.io.UnsupportedEncodingException;

import com.test.utils.MailUtil;


/*
 * 李佳宇
 * 负责模块：LimeSurvey设置模块（主页设定，全局设置）
 */

public class SendReport {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		MailUtil.sendEmail();
	}
	
}
