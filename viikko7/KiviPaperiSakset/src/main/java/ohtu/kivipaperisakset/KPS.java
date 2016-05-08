/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;

/**
 *
 * @author Olli-Pekka
 */
public abstract class KPS {
    
    protected static final IO io = new IO();
    
    public static KPS luoKPSParempiTekoaly() {
        return new KPSParempiTekoaly();
    }
    
    public static KPS luoTekoaly() {
        return new KPSTekoaly();
    }
    
    public static KPS luoKPSPelaajaVsPelaaja() {
        return new KPSPelaajaVsPelaaja();
    }
    
    protected static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
    
    protected String haeEkanSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        return io.nextLine();
    }
    
    protected String haeTokanSiirto(Tekoaly tekoaly) {
        if (tekoaly != null) {
            String tokanSiirto = tekoaly.annaSiirto();
            System.out.println("Tietokone valitsi: " + tokanSiirto);
            return tokanSiirto;
        }
        else {
            System.out.print("Toisen pelaajan siirto: ");
            return io.nextLine();
        }
    }
    
    protected void kirjaaSiirto(Tuomari tuomari, String ekanSiirto, String tokanSiirto) {
        tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
        System.out.println(tuomari);
        System.out.println();
    }
    
    protected void lopeta(Tuomari tuomari) {
        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }
    
    public abstract void pelaa();
    
    
}
