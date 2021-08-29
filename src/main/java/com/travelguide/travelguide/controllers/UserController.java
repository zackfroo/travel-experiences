package com.travelguide.travelguide.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travelguide.travelguide.entities.User;
import com.travelguide.travelguide.repositories.UserRepository;

@Controller
@RequestMapping("/register")
public class UserController {

	@Autowired
	UserRepository userRepo;
	
	@GetMapping
	public String getRegisterForm(Model model) {
		User aUser = new User();
		model.addAttribute("userObject", aUser);
		
		return "default/register";
	}
	
	@PostMapping(value="/save-user")
	public String registerUser(Model model, User aUser) {

		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String password = aUser.getPassword();
		String hashedPassword = passwordEncoder.encode(password);
		aUser.setPassword(hashedPassword);
		
		try {
		userRepo.save(aUser);
		return "default/registrationSubmitted";	
		} catch (Exception e) {
			return "default/registrationNotSubmitted";	
		}
	}
}
