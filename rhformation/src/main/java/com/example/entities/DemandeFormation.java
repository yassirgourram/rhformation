package com.example.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DemandeFormation implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numberDemondeFormation;
	private String dateFormation;
	private String raison;
	private String StatutDemandeFormation;
	
	public DemandeFormation(Long numberDemondeFormation, String dateFormation, String raison,
		String statutDemandeFormation) {
	super();
	this.numberDemondeFormation = numberDemondeFormation;
	this.dateFormation = dateFormation;
	this.raison = raison;
	StatutDemandeFormation = statutDemandeFormation;
	}
	
	public DemandeFormation() {
		super();
	}
	public Long getNumberDemondeFormation() {
		return numberDemondeFormation;
	}
	public void setNumberDemondeFormation(Long numberDemondeFormation) {
		this.numberDemondeFormation = numberDemondeFormation;
	}
	public String getDateFormation() {
		return dateFormation;
	}
	public void setDateFormation(String dateFormation) {
		this.dateFormation = dateFormation;
	}
	public String getRaison() {
		return raison;
	}
	public void setRaison(String raison) {
		this.raison = raison;
	}
	public String getStatutDemandeFormation() {
		return StatutDemandeFormation;
	}	
	public void setStatutDemandeFormation(String statutDemandeFormation) {
		StatutDemandeFormation = statutDemandeFormation;
	}
 
 
 
  
 
}
