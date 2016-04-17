package ohtu;

import ohtu.verkkokauppa.Kauppa;
import ohtu.verkkokauppa.Kirjanpito;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
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
    }
    
    public static void tulostaTapahtumat(Kirjanpito kirjanpito) {
        for (String tapahtuma : kirjanpito.getTapahtumat()) {
            System.out.println(tapahtuma);
        }
    }
}
