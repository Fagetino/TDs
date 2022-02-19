import java.io.Serializable;

public class Requete implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String idJeu;
	private transient final String creerJeu = "?";
	
	public Requete() {
		idJeu = new String(creerJeu);
	}
	
	public Requete(String ident) {
		idJeu = new String(ident);
	}
	
	public boolean estCreation() {
		return(idJeu.equals(creerJeu));
	}
	
	public String getIdJeu() {
		return new String(idJeu);
	}
	
	public static void main(String[] args) {

	}

}
