import java.io.Serializable;
public class EtatChronometre implements Serializable {
	private static final long serialVersionUID = 1L;
	private String valeur1, valeur2, valeurInt;
	private boolean minSec;

	public EtatChronometre(String v1, String v2, String vi, boolean mod) {
	 valeur1 = v1;
	 valeur2 = v2;
	 valeurInt = vi;
	 minSec = mod;
	 }
	
	public void setValeur1(String v1) { valeur1 = v1; }
	public String getValeur1() { return valeur1; }
	
	public void setValeur2(String v2) { valeur2 = v2; }
	public String getValeur2() { return valeur2; }
	
	public void setValeurInt(String vi) { valeurInt = vi; }
	public String getValeurInt() { return valeurInt; }
	
	public void setminSec(boolean mod) { minSec=mod; }
	public boolean getMinSec() { return minSec; }
}