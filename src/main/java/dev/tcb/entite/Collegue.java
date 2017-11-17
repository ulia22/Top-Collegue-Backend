/**
 * 
 */
package dev.tcb.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @author ETY9
 *
 */
@Entity
public class Collegue {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	@JsonIgnore
	private Integer id;
	
	@Column(name="score",length=10)
	@JsonProperty("_score")
	private Integer score;
	
	@Column(name="nom", length=50, unique=true)
	@JsonProperty("_nom")
	private String nom;
	
	@Column(name="urlImage", length=255)
	@JsonProperty("_urlImage")
	private String urlImage;

	/**
	 * 
	 */
	public Collegue() {}

	/**
	 * Getter for id.
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter for id
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Getter for score.
	 * @return the score
	 */
	public Integer getScore() {
		return score;
	}

	/**
	 * Setter for score
	 * @param score the score to set
	 */
	public void setScore(Integer score) {
		this.score = score;
	}

	/**
	 * Getter for nom.
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter for nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter for urlImage.
	 * @return the urlImage
	 */
	public String getUrlImage() {
		return urlImage;
	}

	/**
	 * Setter for urlImage
	 * @param imageUrl the urlImage to set
	 */
	public void setUrlImage(String imageUrl) {
		this.urlImage = imageUrl;
	}
	
	
}
