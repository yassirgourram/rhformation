package com.example.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Formation implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
     private Long codeFormation;
	 private String nomFormation;
	 private String competanceVise;
	public Formation(Long codeFormation, String nomFormation, String competanceVise) {
		super();
		this.codeFormation = codeFormation;
		this.nomFormation = nomFormation;
		this.competanceVise = competanceVise;
	}
	public Formation() {
		super();
	}
	public Long getCodeFormation() {
		return codeFormation;
	}
	public void setCodeFormation(Long codeFormation) {
		this.codeFormation = codeFormation;
	}
	public String getNomFormation() {
		return nomFormation;
	}
	public void setNomFormation(String nomFormation) {
		this.nomFormation = nomFormation;
	}
	public String getCompetanceVise() {
		return competanceVise;
	}
	public void setCompetanceVise(String competanceVise) {
		this.competanceVise = competanceVise;
	}
	 
	 
}
