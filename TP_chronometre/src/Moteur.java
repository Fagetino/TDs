import javax.swing.JTextField;
	public class Moteur extends Thread {
	private boolean rapide;
	private JTextField champ1, champ2;
	private boolean enMarche;
	
	public Moteur(JTextField c1, JTextField c2, boolean vitesse) {
		champ1=c1; champ2=c2;
		rapide=vitesse;
		enMarche = true;
	}
	
	public void run() {
		int limite, delai;
		
		if (rapide) {
			limite = 100;
			delai=10;
		} else {
			limite = 60;
			delai=1000;
		}
		while (enMarche) {
			try {
				sleep(delai);
				int sec;
				try { 
					sec=Integer.parseInt(champ2.getText()); 
				}
				catch (NumberFormatException nfem) {
					sec=-1;
				}
				sec++;
				if (sec==limite) {
					sec=0;
					int m;
					try { 
						m=Integer.parseInt(champ1.getText()); 
					} catch (NumberFormatException nfem) {
						m=-1;
					}
					m++;
					if (m==limite) {
					m=0;
					}
					if (m<10) {
						champ1.setText("0"+String.valueOf(m));
					} else {
						champ1.setText(String.valueOf(m));
					}
				}
				if (sec<10) {
					champ2.setText("0"+String.valueOf(sec));
				}else {
					champ2.setText(String.valueOf(sec));
				}
			} catch (InterruptedException ie) {}
		}
	}
	
	public void arreter() {
		enMarche=false;
		interrupt();
	}
} 
