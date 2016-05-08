package ohtu.kivipaperisakset;

import java.util.Scanner;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends KPS {

    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void pelaa() {
        Tuomari tuomari = new Tuomari();
        TekoalyParannettu tekoaly = new TekoalyParannettu(20);

        String ekanSiirto = haeEkanSiirto();
        String tokanSiirto = haeTokanSiirto(tekoaly);


        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            kirjaaSiirto(tuomari, ekanSiirto, tokanSiirto);

            ekanSiirto = haeEkanSiirto();

            tokanSiirto = haeTokanSiirto(tekoaly);
            tekoaly.asetaSiirto(ekanSiirto);

        }

        lopeta(tuomari);
    }

}
