package com.example.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Site implements Serializable {
	 @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long numberSite;
	private String nomSite;
	private String adresse;
	public Site() {
		super();
	}
	public Site(long numberSite, String nomSite, String adresse) {
		super();
		this.numberSite = numberSite;
		this.nomSite = nomSite;
		this.adresse = adresse;
	}
	public long getNumberSite() {
		return numberSite;
	}
	public void setNumberSite(long numberSite) {
		this.numberSite = numberSite;
	}
	public String getNomSite() {
		return nomSite;
	}
	public void setNomSite(String nomSite) {
		this.nomSite = nomSite;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	

}
