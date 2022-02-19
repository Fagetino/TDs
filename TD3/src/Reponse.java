import java.io.Serializable;

import javax.swing.ImageIcon;

public class Reponse implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String idJeu;
	private ImageIcon carte;
	
	private transient final String erreur = "?";
	
	public Reponse() {
		idJeu = new String(erreur);
		carte = null;
	}
	
	public Reponse(String ident) {
		idJeu = new String(ident);
		carte = null;
	}
	
	public Reponse(String ident, ImageIcon img) {
		idJeu = new String(ident);
		carte = img;
	}
	
	public boolean contientIdJeu() {
		return(!idJeu.equals(erreur));
	}
	
	public String getIdJeu() {
		return idJeu;
	}
	
	public boolean contientCarte(){
		return (carte != null);
	}
	
	public ImageIcon getCarte() {
		return carte;
	}
}
