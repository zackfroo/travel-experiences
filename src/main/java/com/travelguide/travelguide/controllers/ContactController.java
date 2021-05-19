package com.travelguide.travelguide.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private JavaMailSender mailSender;
	
	@GetMapping
	public String showContactForm() {
		
		return "default/contact";
	}
	
	@PostMapping("/send")
	public String submitContact(HttpServletRequest request) {
		String fullName = request.getParameter("fullName");
		String email = request.getParameter("email");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("guidetoworld2@gmail.com");
		message.setTo("guidetoworld2@gmail.com");
		String mailSubject = fullName + " has sent a message";
		String mailContent = "Sender Name: " + fullName + "\n";
		mailContent += "Sender E-mail: " + email + "\n";
		mailContent += "Subject: " + subject + "\n";
		mailContent += "Content: " + content + "\n";
		
		message.setSubject(mailSubject);
		message.setText(mailContent);
		
		mailSender.send(message);
		
		return "default/messageSubmitted";
	}
}
