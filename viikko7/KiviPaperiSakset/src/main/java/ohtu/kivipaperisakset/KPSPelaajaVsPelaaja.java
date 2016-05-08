package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends KPS {

    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void pelaa() {
        Tuomari tuomari = new Tuomari();

        String ekanSiirto = haeEkanSiirto();
        String tokanSiirto = haeTokanSiirto(null);

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            kirjaaSiirto(tuomari, ekanSiirto, tokanSiirto);

            ekanSiirto = haeEkanSiirto();
            
            tokanSiirto = haeTokanSiirto(null);
        }

        lopeta(tuomari);
    }

}