/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics;

import java.util.ArrayList;
import java.util.List;
import statistics.matcher.And;
import statistics.matcher.HasAtLeast;
import statistics.matcher.HasFewerThan;
import statistics.matcher.Matcher;
import statistics.matcher.Not;
import statistics.matcher.Or;
import statistics.matcher.PlaysIn;

/**
 *
 * @author Olli-Pekka
 */
public class PinoRakentaja {
    Pino pino;

    public PinoRakentaja() {
        pino = new Pino();
    }
    
    public Pino pino() {
        return pino;
    }

    PinoRakentaja HasAtLeast(int value, String fieldName) {
        pino.push(new HasAtLeast(value, fieldName));
        return this;
    }
    
    PinoRakentaja HasFewerThan(int value, String fieldName) {
        pino.push(new HasFewerThan(value, fieldName));
        return this;
    }
    
    PinoRakentaja PlaysIn(String team) {
        pino.push(new PlaysIn(team));
        return this;
    }
    
    PinoRakentaja OneOf(Matcher... matchers) {
        pino = new Pino();
        pino.push(new Or(matchers));
        return this;
    }
    
    PinoRakentaja Not(Matcher... matchers) {
        pino = new Pino();
        pino.push(new Not(matchers));
        return this;
    }
    
    public Matcher build() {
        
        List<Matcher> matchersList = this.pino.kaikkiPinosta();
        
        int pinonKoko = matchersList.size();
        
        Matcher[] matchers = new Matcher[pinonKoko];
        
        int i = 0;
        
        for (Matcher matcher : matchersList) {
            matchers[i] = matcher;
            i++;
        }
        
        return new And(matchers);
        
    }
}
