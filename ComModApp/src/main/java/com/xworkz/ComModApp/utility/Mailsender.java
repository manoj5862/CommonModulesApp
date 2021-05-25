package com.xworkz.ComModApp.utility;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

@Component
public class Mailsender {
	
	@Autowired
	JavaMailSenderImpl mailSenderImpl ;
	
	public void sendEmail(){
		
		String []bccs= {"ajjuhospet96@gmail.com","veeresh.xworkz@gmail.com"};
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("manojkumarv39@gmail.com");
		message.setTo("xworkzodc01@gmail.com");
		message.setCc("sharan.xworkz@gmail.com"); 
		message.setBcc(bccs);
		message.setSubject("demo java mailsender");
		message.setText("Hello all \n manoj this side \n This is demo mail for java mailsender ");
				
		mailSenderImpl.send(message);
		
	}
}