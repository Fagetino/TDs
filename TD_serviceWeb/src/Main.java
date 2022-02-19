import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*; 

public class Main extends JFrame{
	private JPanel ecran;
	private JButton btnTirer;
	private JButton btnCreer;
	
	private String idJeu;

	public Main(){
		super("Fenetre"); //creation avec le nom de la fenetre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Arrêt du programme
		
		ecran=new JPanel();
		getContentPane().add(ecran); //Ajoute la zone d'affichage "ecran" à la fenetre
		
		//Ajout des boutons dans l'interface
		btnTirer=new JButton("Tirer");
		btnCreer=new JButton("Créer");
		ecran.add(btnCreer);
		ecran.add(btnTirer);
		
		btnCreer.addActionListener(new ClickCreer());
		
		pack();
		
		setVisible(true); // visible
	}
	
	public class ClickCreer implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			idJeu = recupereID();
			
			
		}

		private String recupereID() {
			communique("http://deckofcardsapi.com/api/new/shuffle/?deck_count=1");
			return null;
		}
		
		private String communique(String chemin) {
			try {
				URL url=new URL(chemin);
				url.openConnection();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
	}
	
	
	public static void main(String[] args) {
		new Main();

	}

}
