package com.travelguide.travelguide.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Activity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long activityId;
	private String title;
	private String description;
	private String country;
	private String city;
	private Float price;
	
	@ManyToOne(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST},
			fetch=FetchType.LAZY)
	@JoinColumn(name="userId")
	private User userActivity;
	
	@ManyToOne(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST},
			fetch=FetchType.LAZY)
	
	@JoinColumn(name="categoryId")
	private Category categoryActivity;

	@OneToMany(mappedBy="activityReview")
	private List<Review> activityReviews;
	
	public Activity() {
		
	}

	public Activity(String title, String description, String country, String city, Float price) {
		super();
		this.title = title;
		this.description = description;
		this.country = country;
		this.city = city;
		this.price = price;
	}

	public Category getCategoryActivity() {
		return categoryActivity;
	}

	public void setCategoryActivity(Category categoryActivity) {
		this.categoryActivity = categoryActivity;
	}

	public Long getActivityId() {
		return activityId;
	}

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public User getUserActivity() {
		return userActivity;
	}

	public void setUserActivity(User userActivity) {
		this.userActivity = userActivity;
	}

	public List<Review> getActivityReviews() {
		return activityReviews;
	}

	public void setActivityReviews(List<Review> activityReviews) {
		this.activityReviews = activityReviews;
	}
}