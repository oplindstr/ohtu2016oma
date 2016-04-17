package ohtu;

public class Submission {
    private String student_number;
    private int week;
    private int hours;
    private boolean a1;
    private boolean a2;
    private boolean a3;
    private boolean a4;
    private boolean a5;
    private boolean a6;
    private boolean a7;
    private boolean a8;
    private boolean a9;
    private boolean a10;
    private boolean a11;

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }
    
    private String tehdytTehtavat() {
        String tehdyt = "";
        if (a1) {
            tehdyt = tehdyt + "1 ";
        }
         if (a2) {
            tehdyt = tehdyt + "2 ";
        }
          if (a3) {
            tehdyt = tehdyt + "3 ";
        }
           if (a4) {
            tehdyt = tehdyt + "4 ";
        }
            if (a5) {
            tehdyt = tehdyt + "5 ";
        }
             if (a6) {
            tehdyt = tehdyt + "6 ";
        }
              if (a7) {
            tehdyt = tehdyt + "7 ";
        }
               if (a8) {
            tehdyt = tehdyt + "8 ";
        }
                if (a9) {
            tehdyt = tehdyt + "9 ";
        }
                 if (a10) {
            tehdyt = tehdyt + "10 ";
        }
                  if (a11) {
            tehdyt = tehdyt + "11 ";
        }
        return tehdyt;
    }

    @Override
    public String toString() {
        return "viikko " + week + ": käytetty aika: " + hours + " tuntia, tehdyt tehtävät: " + tehdytTehtavat();
    }
    
}