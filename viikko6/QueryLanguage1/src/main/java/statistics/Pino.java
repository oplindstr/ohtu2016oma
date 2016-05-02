/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import statistics.matcher.Matcher;

/**
 *
 * @author Olli-Pekka
 */
public class Pino {

    private LinkedList<Matcher> alkiot;

    public Pino() {
        alkiot = new LinkedList<>();
    }

    public void push(Matcher matcher){
        alkiot.addFirst(matcher);
    }

    public Matcher pop(){
        return alkiot.remove();
    }

    public boolean empty(){
        return alkiot.isEmpty();
    }
    
    public List<Matcher> kaikkiPinosta(){
        ArrayList<Matcher> alkiot = new ArrayList<>();

        while(!this.empty()) {
            alkiot.add(this.pop());
        }

        return alkiot;
    }
}
