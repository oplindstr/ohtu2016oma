package statistics;

import statistics.matcher.*;

public class Main {
    public static void main(String[] args) {
        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstatistics.herokuapp.com/players.txt"));

        PinoRakentaja query = new PinoRakentaja();

       Matcher m = query.OneOf(
                        query.PlaysIn("PHI")
                             .HasAtLeast(10, "goals")
                             .HasFewerThan(15, "assists").build(),

                        query.PlaysIn("EDM")
                             .HasAtLeast(50, "points").build()
                       ).build();
        
                     

        for (Player player : stats.matches(m)) {
            System.out.println( player );
        }
    }
}
