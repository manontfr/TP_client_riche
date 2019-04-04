package commerce.catalogue.domaine.modele;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;

/**
 * Title:        commerce
 * Description:  Class for e-commerce
 * Company:      IUT Laval - Université du Mans
 * Author  A. Corbière
 */

@Entity (name="commerce.catalogue.domaine.modele.Article")
@DiscriminatorColumn(
  name="article_type",
  discriminatorType= DiscriminatorType.STRING
)
@DiscriminatorValue("article")
public class Article {
	private String refArticle; 
	private String titre;
	private String image;
	private double prix;
	private int disponibilite;
	//private String avis; // added
	
//	public String getAvis() { //added
//		return avis;
//	}
//	public void setAvis(String inAvis) { //added
//		this.avis = inAvis;
//	}

	@Id
	public String getRefArticle() {
		return refArticle;
	}
	public void setRefArticle(String inRefArticle) {
		refArticle = inRefArticle;
	}
	
	@Basic
	public String getTitre() {
		return titre;
	}
	public void setTitre(String inTitre) {
		titre = inTitre;
	}	  
	
	@Basic
	public String getImage() {
		return image;
	}
	public void setImage(String inImage) {
		image = inImage;
	}
	
	@Basic
	public double getPrix() {
		return prix;
	}
	public void setPrix(double inPrix) {
		prix = inPrix;
	}
	public void setPrix(String inPrix) {
		prix = Double.parseDouble(inPrix);
	}
	
	@Basic
	public int getDisponibilite() {
		return disponibilite;
	}
	public void setDisponibilite(String inDisponibilite) {
		disponibilite = Integer.parseInt(inDisponibilite);
	}
	public void setDisponibilite(int inDisponibilite) {
		disponibilite = inDisponibilite;
	}
	
	

	public boolean equals(Object o) {
		boolean retour = false ;
		if (!(o instanceof Article))
			retour = false ;
		else {
			Article inArticle = (Article)o ;
			if (this.getRefArticle().equals(inArticle.getRefArticle()))
				retour = true ;
			else
				retour = false ;
		}
		return retour ;
	}
}
