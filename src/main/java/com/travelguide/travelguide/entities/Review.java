package com.travelguide.travelguide.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Review {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long reviewId;
	@Column(nullable = false) 
	private float note;
	@Column(nullable = false) 
	private String description;
	
	@ManyToOne(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST},
			fetch=FetchType.LAZY)
	@JoinColumn(name="userId")
	private User userReview;
	
	@ManyToOne(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST},
			fetch=FetchType.LAZY)
	@JoinColumn(name="activityId")
	private Activity activityReview;
	
	public Review() {
		
	}
	
	public Review(float note, String description) {
		super();
		this.note = note;
		this.description = description;
	}

	public Long getReviewId() {
		return reviewId;
	}

	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}

	public float getNote() {
		return note;
	}

	public void setNote(float note) {
		this.note = note;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUserReview() {
		return userReview;
	}

	public void setUserReview(User userReview) {
		this.userReview = userReview;
	}

	public Activity getActivityReview() {
		return activityReview;
	}

	public void setActivityReview(Activity activityReview) {
		this.activityReview = activityReview;
	}
	
	
}
