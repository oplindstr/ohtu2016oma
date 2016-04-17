package ohtu;

import ohtu.verkkokauppa.Kauppa;
import ohtu.verkkokauppa.Kirjanpito;

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD
        Kirjanpito kirjanpito      = new Kirjanpito();
        Kauppa kauppa = luoKauppa();
        kauppaTapahtumat1(kauppa);
        kauppaTapahtumat2(kauppa);
        tulostaTapahtumat(kirjanpito);
    }
    
    public static Kauppa luoKauppa() {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/spring-context.xml");
        Kauppa kauppa = ctx.getBean(Kauppa.class);

        return kauppa;
    }
    
    public static void kauppaTapahtumat1(Kauppa kauppa) {
=======
        Kauppa kauppa = new Kauppa();

        // kauppa hoitaa yhden asiakkaan kerrallaan seuraavaan tapaan:
>>>>>>> b2738b24fef5ddcffed81ab1b3e7824a5cef2e0b
        kauppa.aloitaAsiointi();
        kauppa.lisaaKoriin(1);
        kauppa.lisaaKoriin(3);
        kauppa.lisaaKoriin(3);
        kauppa.poistaKorista(1);
        kauppa.tilimaksu("Pekka Mikkola", "1234-12345");
    }
    
    public static void kauppaTapahtumat2(Kauppa kauppa) {
        kauppa.aloitaAsiointi();
        for (int i = 0; i < 24; i++) {
            kauppa.lisaaKoriin(5);
        }
        kauppa.tilimaksu("Arto Vihavainen", "3425-1652");
<<<<<<< HEAD
    }
    
    public static void tulostaTapahtumat(Kirjanpito kirjanpito) {
        for (String tapahtuma : kirjanpito.getTapahtumat()) {
=======

        // kirjanpito
        for (String tapahtuma : Kirjanpito.getInstance().getTapahtumat()) {
>>>>>>> b2738b24fef5ddcffed81ab1b3e7824a5cef2e0b
            System.out.println(tapahtuma);
        }
    }
}
