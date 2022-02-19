import javax.swing.JFrame; //Fenêtre

import javax.swing.JLabel; //Affichage de l'image
import javax.swing.ImageIcon; //Image
//import java.awt.GridLayout; //Placement en tableau 1x1
import java.awt.FlowLayout; //OU placement en flow 1 élément

public class AffichageImage extends JFrame { //Interface => hérite de JFrame
	private JLabel ecran; //Cette interface ne contient qu'un JLabel pour une image
	
	public AffichageImage(String nomImage) { //Interface d'affichage reçoit le nom du fichier image
		super(nomImage); //nom du fichier image mis en titre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Arrêt du programme
		
		//GridLayout placeur = new GridLayout(1,1,2,2); //placement en tableau (GridLayout)
		FlowLayout placeur = new FlowLayout(FlowLayout.LEFT, 20, 40); //Placement en FlowLayout
		getContentPane().setLayout(placeur); //Placement dans le conteneur de la fenêtre
		
		ecran = new JLabel(new ImageIcon(nomImage)); //Création de la zone d'affichage d'image
		getContentPane().add(ecran); //Ajout de cette zone à la fenêtre
		
		pack(); //Taille de fenête minimale
		setVisible(true); //Fenêtre visible
	}
	
	public static void main(String argv[]) { //Démarage du programme
		new AffichageImage("singeFume.png"); //Création d'une fenêtre
		new AffichageImage("singePenis.png");
	}
	
}


