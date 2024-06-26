package main;

import java.io.IOException;
import java.util.Scanner;

import donnees.ComparateurAlbum;
import donnees.ComparateurArtiste;
import donnees.ComparateurNbPistes;
import donnees.Magasin;
import XML.ChargeurMagasin;

/**
 * permet de charger un magasin de test
 */
public class MainChargeurMagasin {

	/**
	 * methode principale
	 * 
	 * @param args
	 *            inutilise
	 * @throws IOException
	 *             en cas de probleme de lecture entree/sortie
	 */
	public static void main(String args[]) throws IOException {
		
		String repertoire = "src/magasinCD_donnees/musicbrainzSimple";
		ChargeurMagasin charge = new ChargeurMagasin(repertoire);
		Magasin resultat = charge.chargerMagasin();
		//System.out.println(resultat);

		//resultat.trier(new ComparateurArtiste());
		//System.out.println(resultat);

		//resultat.trier(new ComparateurAlbum());
		//System.out.println(resultat);

		resultat.trier(new ComparateurNbPistes());
		System.out.println(resultat);

	}

}
