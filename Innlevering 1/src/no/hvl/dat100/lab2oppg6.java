package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class lab2oppg6 {
	public static void main(String[] args) {
		int inntekt = parseInt(showInputDialog("Gi inntekt: "));
		
		String ut = "";
		
		if (inntekt>0 && inntekt<180800)
			ut = "Ingen trinnskatt.";
		if (inntekt>180800 && inntekt<254500)
			ut = "Trinn 1: 1.9%";
		if (inntekt>254500 && inntekt<639750)
			ut = "Trinn 2: 4.2%";
		if (inntekt>639750 && inntekt<999550)
			ut = "Trinn 3: 13.2%";
		if (inntekt>999500 && inntekt<999999999)
			ut = "Trinn 4: 16.2%";
		
		showMessageDialog(null, ut);
		}
	}
