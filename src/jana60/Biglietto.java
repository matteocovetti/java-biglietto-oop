package jana60;

import java.text.DecimalFormat;

public class Biglietto {
	/*
	 * Creare una classe Biglietto con due attributi: chilometri ed età del
	 * passeggero. Utilizzare i modificatori dei livelli di accesso per proteggere
	 * il funzionamento interno della classe ed esporre solo un’interfaccia fatta di
	 * metodi public, come abbiamo visto in classe e nelle slide. La classe deve
	 * esporre un metodo che calcola il prezzo del biglietto secondo la logica: il
	 * prezzo del biglietto è definito in base ai km (0.21 € al km) va applicato uno
	 * sconto del 20% per i minorenni va applicato uno sconto del 40% per gli over
	 * 65
	 */

	// attributi
	private int etaPasseggero, km;
	private double costoAlKm = 0.21, scontoMinorenni = 0.20, scontoOver65 = 0.40;

	private DecimalFormat df = new DecimalFormat("0.00€");

	// costruttore
	public Biglietto(int etaPasseggero, int km) {
		super();
		this.etaPasseggero = etaPasseggero;
		this.km = km;
	}

	// getter e setter
	public int getEtaPasseggero() {
		return etaPasseggero;
	}

	public void setEtaPasseggero(int etaPasseggero) {
		this.etaPasseggero = etaPasseggero;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	// metodi
	public double prezzoTotale() {
		double prezzoTotale = 0.0;
		prezzoTotale = km * costoAlKm;

		if (etaPasseggero < 18) {
			return prezzoTotale = prezzoTotale - (prezzoTotale * scontoMinorenni);
		} else if (etaPasseggero > 65) {
			return prezzoTotale = prezzoTotale - (prezzoTotale * scontoOver65);
		} else {
			return prezzoTotale;
		}

	}

	public String getPrezzoTotaleFormattato() {
		return df.format(prezzoTotale());
	}

}
