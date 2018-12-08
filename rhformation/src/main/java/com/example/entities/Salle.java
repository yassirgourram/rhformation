package com.example.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Salle implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long  numbersalle;
	public long getNumbersalle() {
		return numbersalle;
	}
	public void setNumbersalle(long numbersalle) {
		this.numbersalle = numbersalle;
	}
	public String getNomSalle() {
		return nomSalle;
	}
	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}
	public String getCapacite() {
		return capacite;
	}
	public void setCapacite(String capacite) {
		this.capacite = capacite;
	}
	private String nomSalle;
	private String capacite;
	public Salle() {
		super();
	}
	public Salle(long numbersalle, String nomSalle, String capacite) {
		super();
		this.numbersalle = numbersalle;
		this.nomSalle = nomSalle;
		this.capacite = capacite;
	}
	
	
	
}
