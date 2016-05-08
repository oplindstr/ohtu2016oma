/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;

import java.util.HashMap;

/**
 *
 * @author Olli-Pekka
 */
public class PelinHallinta {
    
    private HashMap<String, KPS> komennot;
    
    public PelinHallinta() {
        komennot = new HashMap<String, KPS>();
        komennot.put("a", KPS.luoKPSPelaajaVsPelaaja());
        komennot.put("b", KPS.luoTekoaly());
        komennot.put("c", KPS.luoKPSParempiTekoaly());
    }
    
    public KPS haeKPS(String komento) {
        return komennot.get(komento);
    }
}
