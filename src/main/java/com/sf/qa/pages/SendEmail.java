package com.sf.qa.pages;

import javax.mail.*;
import javax.mail.internet.*;

import com.sf.qa.base.TestBase;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Properties;


public class SendEmail extends TestBase { 

    private static final String SMTP_HOST_NAME = "smtp.gmail.com";
    private static final String SMTP_AUTH_USER = "armany.test1@gmail.com";
    private static final String SMTP_AUTH_PWD  = "Tester123";
    private static final  String SMTP_SERVER_PORT = "465";
   

    public void SendEmailTo(String receiveremailid, String receiversubject, String receiveremailbody ) throws Exception {
        Properties props = new Properties();
        props.put("mail.transport.protocol","smtp");
        props.put("mail.smtp.host",SMTP_HOST_NAME);
        props.put("mail.smtp.port",SMTP_SERVER_PORT);
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.enable", "true");
    	props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
    	props.put("mail.smtp.socketFactory.fallback","false");

        //Authenticator auth = new SMTPAuthenticator();
       /* Session mailSession = Session.getDefaultInstance(props, new javax.mail.Authenticator(){
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(SMTP_AUTH_USER,SMTP_AUTH_PWD);
			}
		});*/
    	
    	
    	
    	
    	Session mailSession = Session.getDefaultInstance(props,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(SMTP_AUTH_USER,SMTP_AUTH_PWD);
                    }
                });
       
        mailSession.setDebug(true);
     /*   Transport transport = mailSession.getTransport();

        MimeMessage message = new MimeMessage(mailSession);
        
        message.setFrom(new InternetAddress(SMTP_AUTH_USER));
        message.addRecipient(Message.RecipientType.TO,
             new InternetAddress(receiveremailid));
        message.setSubject(receiversubject);
        message.setContent("This is a test",receiveremailbody);

        try {
                transport.connect();
        transport.sendMessage(message,
            message.getRecipients(Message.RecipientType.TO));
        transport.close();
    
    }
    catch(Exception e) {
    	 e.printStackTrace(); 
    }*/
    
    //private class SMTPAuthenticator extends javax.mail.Authenticator {
      //  public PasswordAuthentication getPasswordAuthentication() {
       //    String username = SMTP_AUTH_USER;
       //    String password = SMTP_AUTH_PWD;
       //    return new PasswordAuthentication(username, password);
       // }
   // }
    
       
        
    	Message message = new MimeMessage(mailSession);
        message.setFrom(new InternetAddress(SMTP_AUTH_USER));
        message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(receiveremailid));
        message.setSubject(receiversubject);
        message.setText(receiveremailbody);
        
        message.setFrom(new InternetAddress(SMTP_AUTH_USER));
        message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(receiveremailid));
        message.setSubject(receiversubject);
        message.setText(receiveremailbody);
        
        System.out.println("Sender UserName: "+SMTP_AUTH_USER);
        System.out.println("Sender Password: "+SMTP_AUTH_PWD);
        System.out.println("Receiver UserName: "+receiveremailid);
        System.out.println("Receiver Subject: "+receiversubject);
        System.out.println("Receiver Email Body: "+receiveremailbody);
        
        System.out.println(message.getContent());
        System.out.println(message.getSubject());
        System.out.println(message.getDescription());
        
       // System.setProperty("https.proxyHost", "hostname");
       // System.setProperty("https.proxyPort", "port number");
        
        Transport transport = mailSession.getTransport("smtp");
        transport.connect();
        
    try {
        transport.sendMessage(message,
        		message.getAllRecipients());
    } catch (MessagingException e) {
        e.printStackTrace();
    } finally {
        transport.close();
    }
        
        //Transport.send(message);
        //System.out.println("Done");
        //Thread.sleep(2000L);

  //  } catch (Exception e) {
    //    throw new RuntimeException(e);
    //}
    }   
}