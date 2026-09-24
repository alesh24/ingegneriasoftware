package PO1099300;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Stadio sanremo=new Stadio(); 
		try {
			//inserimento di 4 giocatori 2 per ciascun tipo:
			Giocatore g1=new GiocatoreEsperto("AB1G46FR90", "MARCO", "ROSSI", 2, 2); 
			sanremo.addGiocatore(g1);
			Giocatore g2=new GiocatoreEsperto("BH986HROU1", "PAOLO", "VERDI", 1, 1); 
			sanremo.addGiocatore(g2);
			Giocatore g3=new GiocatoreNovello("K934F5H782", "CLAUDIO", "BIANCHI", 3, 4, g1.getNome()); 
			sanremo.addGiocatore(g3);
			Giocatore g4=new GiocatoreNovello("B89GF456SD", "LUCA", "NERI", 2, 5, g2.getNome()); 
			sanremo.addGiocatore(g4);
			//accumulaPunti 
			g1.accumulaPunti();
			g2.accumulaPunti(2);
			g3.accumulaPunti();
			g4.accumulaPunti(4);
			//inserimento città
			Città c1=new Città("SANREMO"); 
			sanremo.addCitta(c1);
			Città c2=new Città("MILANO"); 
			sanremo.addCitta(c2);
			//inserimento date: 
			LocalDate d1=LocalDate.of(2026, 02, 23); 
			LocalDate d2=LocalDate.of(2026, 03, 17); 
			//inserimento tornei: 
			Torneo t1=new Torneo ("TORN-01",c1,d1); 
			sanremo.addTorneo(t1);
			Torneo t2=new Torneo("TORN-01", c2, d2); 
			sanremo.addTorneo(t2);
			//ricerca di un giocatore: 
			System.out.println("\n======RICERCA GIOCATORE PER CODICE-ID: AB1G46FR9O....======= "); 
			Giocatore trovato=sanremo.ricGiocatore("AB1G46FR9O"); 
			if(trovato!=null) {
				System.out.println("Giocatore trovato !! Nome--> "+trovato.getNome()+"|Cognome-->"+trovato.getCognome()+"|ID-->"+trovato.getCodiceId());   
			}
			//stampa sistema: 
			sanremo.statoSistema();
		}catch(CodiceIdentificativoDuplicatoException e) {
			System.err.println(e.getMessage()); 
			
		}

	}

}
