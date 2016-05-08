package ohtu.kivipaperisakset;

public class Paaohjelma {

    private static final IO io = new IO();
    private static final PelinHallinta hallinta = new PelinHallinta();
    private static KPS kps;

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan"
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetetaan");

            String vastaus = io.nextLine();
            kps = hallinta.haeKPS(vastaus);
            if (kps != null) {
                System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
                kps.pelaa();
            } else {
                break;
            }

        }

    }
}
