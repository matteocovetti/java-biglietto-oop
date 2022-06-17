package jana60;

import java.util.Scanner;

public class Biglietteria {
	/*
	 * Aggiungere una classe Biglietteria, eseguibile con metodo main, in cui si
	 * chiede all’utente di inserire il numero di km e l’età del passeggero e stampa
	 * il prezzo del biglietto calcolato.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int etaPasseggero, km;

		System.out.print("Benvenuto/a! Inserisca età passeggero: ");
		etaPasseggero = Integer.parseInt(scan.nextLine());

		System.out.print("Inserisca il numero di chilometri che vuole percorrere: ");
		km = Integer.parseInt(scan.nextLine());

		Biglietto biglietto = new Biglietto(etaPasseggero, km);

		if (etaPasseggero >= 1 && km >= 1) {
			System.out.println("Il costo del biglietto è di: " + biglietto.getPrezzoTotaleFormattato());
		} else {
			System.out.println("Ha inserito età o chilometri inferiori ad 1, si prega di riprovare.");
		}

		scan.close();
	}

}
