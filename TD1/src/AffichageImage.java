import javax.swing.JFrame; //Fen�tre

import javax.swing.JLabel; //Affichage de l'image
import javax.swing.ImageIcon; //Image
//import java.awt.GridLayout; //Placement en tableau 1x1
import java.awt.FlowLayout; //OU placement en flow 1 �l�ment

public class AffichageImage extends JFrame { //Interface => h�rite de JFrame
	private JLabel ecran; //Cette interface ne contient qu'un JLabel pour une image
	
	public AffichageImage(String nomImage) { //Interface d'affichage re�oit le nom du fichier image
		super(nomImage); //nom du fichier image mis en titre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Arr�t du programme
		
		//GridLayout placeur = new GridLayout(1,1,2,2); //placement en tableau (GridLayout)
		FlowLayout placeur = new FlowLayout(FlowLayout.LEFT, 20, 40); //Placement en FlowLayout
		getContentPane().setLayout(placeur); //Placement dans le conteneur de la fen�tre
		
		ecran = new JLabel(new ImageIcon(nomImage)); //Cr�ation de la zone d'affichage d'image
		getContentPane().add(ecran); //Ajout de cette zone � la fen�tre
		
		pack(); //Taille de fen�te minimale
		setVisible(true); //Fen�tre visible
	}
	
	public static void main(String argv[]) { //D�marage du programme
		new AffichageImage("singeFume.png"); //Cr�ation d'une fen�tre
		new AffichageImage("singePenis.png");
	}
	
}


