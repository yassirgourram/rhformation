package com.example.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Poste implements Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
 private long number;
 private String nomPoste;
 
public Poste(long number, String nomPoste) {
	super();
	this.number = number;
	this.nomPoste = nomPoste;
}
public Poste() {
		super();
	}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
public String getNomPoste() {
	return nomPoste;
}
public void setNomPoste(String nomPoste) {
	this.nomPoste = nomPoste;
}
 
 
 
 
}
