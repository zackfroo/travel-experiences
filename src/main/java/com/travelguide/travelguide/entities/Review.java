package com.travelguide.travelguide.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Review {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long reviewId;
	private float note;
	private String description;
	
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
	
	
}
