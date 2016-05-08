package ohtu.kivipaperisakset;

public class KPSTekoaly extends KPS {

    @Override
    public void pelaa() {
        Tuomari tuomari = new Tuomari();
        TekoalyPerus tekoaly = new TekoalyPerus();

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