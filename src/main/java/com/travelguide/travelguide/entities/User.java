package com.travelguide.travelguide.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long userId;
	@Column(nullable = false) 
	private String firstName;
	@Column(nullable = false) 
	private String lastName;
	@Column(nullable = false) 
	private String sexe;
	@Column(nullable = false, unique=true) 
	private String emailAddress;
	@Column(nullable = false, unique=true)
	private String phoneNumber;
	@Column(nullable = false) 
	private String country;
	@Column(nullable = false) 
	private String city;
	@Column(nullable = false, unique=true) 
	private String cardId;
	@Column(nullable = false) 
	private String password;
	

	@OneToMany(mappedBy="userReview")
	private List<Review> userReviews;
	
	@OneToMany(mappedBy="userActivity")
	private List<Activity> activities;
	
	public User() {	
		
	}

	public User(String firstName, String lastName, String sexe, String emailAddress, String phoneNumber, String country,
			String city, String cardId, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.sexe = sexe;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.country = country;
		this.city = city;
		this.cardId = cardId;
		this.password = password;
	}
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Review> getUserReviews() {
		return userReviews;
	}

	public void setUserReviews(List<Review> userReviews) {
		this.userReviews = userReviews;
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}
}