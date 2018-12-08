package com.example.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//test
@Entity
public class Bureau implements  Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long number;

	public Bureau(Long number) {
		super();
		this.number = number;
	}

	public Bureau() {
		super();
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}
	
	
	
	
	
	
}
