import javax.swing.*; 

@SuppressWarnings("serial")
public class Fenetre extends JFrame{
	private JLabel ecran;
	
	public Fenetre() {
		super("Fenetre"); //creation avec le nom de la fenetre
		ecran=new JLabel();
		getContentPane().add(ecran); //Ajoute la zone d'affichage "ecran" à la fenetre
		setResizable(false); //Desactive la possiblité de redimensionner la fenetre
		setVisible(true); // visible
	}
	
	public void afficherImage(String nom) {
		ImageIcon image= new ImageIcon(nom);
		ecran.setIcon(image); //Affiche l'image sur la fenetre
		pack(); //redimentionne la fenetre à la taille de l'image
	}
	
	public static void main(String[] args) {
		Fenetre fenetre = new Fenetre();
		fenetre.afficherImage("singeDoigt.png"); //Affichage d'une image dans la fenetre
		
		try { Thread.sleep(5000); } //On attend 5s
		catch (InterruptedException ie) {}
		fenetre.afficherImage("singePenisBouche.png"); //Changement d'image
		
		try { Thread.sleep(5000); } //On attend 5s
		catch (InterruptedException ie) {}
		fenetre.dispose(); //On ferme la fenetre
		
		
	}

}
