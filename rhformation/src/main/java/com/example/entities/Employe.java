package com.example.entities;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Employe implements Serializable {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeEmploye;
	private String nom;
	private String prenom;
	private String diplome;
	private Date dateDeNaissance;
	private String adresse;
	
	public Employe(String nom, String prenom, String diplome, Date dateDeNaissance, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.diplome = diplome;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
	}

	public Employe() {
		super();
	}

	public Long getCodeEmploye() {
		return codeEmploye;
	}

	public void setCodeEmploye(Long codeEmploye) {
		this.codeEmploye = codeEmploye;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	
	
	
}
