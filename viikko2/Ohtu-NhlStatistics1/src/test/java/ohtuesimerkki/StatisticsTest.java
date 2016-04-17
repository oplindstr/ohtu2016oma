/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtuesimerkki;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Olli-Pekka
 */
public class StatisticsTest {

    Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };
    Statistics stats = new Statistics(readerStub);
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void löytääPelaajan() {
        Player pelaaja = stats.search("Semenko");

        assertEquals(pelaaja.getTeam(), "EDM");
    }
    
    @Test
    public void eiLöydäPelaajaaJosEiOle() {
        Player pelaaja = stats.search("Semesssss");

        assertEquals(pelaaja, null);
    }
    
    @Test
    public void löytääKokoTiimin() {
        List<Player> tiimi = stats.team("EDM");

        assertEquals(tiimi.size(), 3);
    }
    
    @Test
    public void eiLöydäTiimiaJosEiOle() {
        List<Player> tiimi = stats.team("EDMmmm");

        assertEquals(tiimi.size(), 0);
    }
    
    @Test
    public void topScorersOikeassaJärjestyksessä() {
        List<Player> topScorers = stats.topScorers(4);

        assertEquals(topScorers.get(0).getName(), "Gretzky");
        assertEquals(topScorers.get(1).getName(), "Lemieux");
        assertEquals(topScorers.get(2).getName(), "Yzerman");
        assertEquals(topScorers.get(3).getName(), "Kurri");
        assertEquals(topScorers.get(4).getName(), "Semenko");
    }
    
    
}
