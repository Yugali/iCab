package mail;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Ackmail {
	public boolean sendMail(String to,String name,String cont,String type,String origin,String dest) throws MessagingException
	{
		String host="smtp.gmail.com";
		String username="yugalibafna13@gmail.com";//emailid
		String password="yug@li1322";// emailid password
		String from="yugalibafna13@gmail.com";// email from which u have to send
		String subject="Cab Booking Information";
		
	
		String body="Your Details are :-\n"+"Name:"+name+"\nContact:"+cont+"\nCar Type:"+type+"\nOrigin:"+origin+"\nDestination:"+dest+"\n\n\n\nThank You For Using iCab";
		boolean sessionDebug=false;
		Properties props=System.getProperties();
		props.put("mail.host",host);
		props.put("mail.transport.protocol","smtp");
		props.put("mail.smtp.starttls.enable","true");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.debug", "true");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.socketFactory.fallback", "false");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "25"); 
		Session mailSession=Session.getDefaultInstance(props,null);
		mailSession.setDebug(sessionDebug);
		Message msg=new MimeMessage(mailSession);
		msg.setFrom(new InternetAddress(from));
		InternetAddress [] address={new InternetAddress(to)};
		msg.setRecipients(Message.RecipientType.TO,address);
		msg.setSubject(subject);
		msg.setSentDate(new Date());
		msg.setText(body);
		Transport tr=mailSession.getTransport("smtp");
		tr.connect(host,username,password);
		msg.saveChanges();
		tr.sendMessage(msg,msg.getAllRecipients());
		tr.close();
//		Transport.send(msg);
		return true;
	}
}
