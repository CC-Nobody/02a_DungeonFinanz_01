package com.dungeoninc.java;

public class App {
    public static void main(String[] args) throws Exception {
        
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("the Goblin", "Boblin", "Finanzgoblin", 2018);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Mittens", "Mr.", "CCO", 2001);
        Mitarbeiter mitarbeiter3 = new Mitarbeiter("Thuzad", "Kel", "CEO", 2000);
        Mitarbeiter mitarbeiter4 = new Mitarbeiter("Ed","Undead","Techniker",2004);
        Mitarbeiter mitarbeiter5 = new Mitarbeiter("Coulton", "Jonathan", "HR-Manager", 2002);

        ausgabe(mitarbeiter5.getInfo("#Familienname"));
        ausgabe(mitarbeiter5.getInfo("#Vorname"));
        ausgabe(mitarbeiter5.getInfo("#Job"));
        ausgabe(mitarbeiter5.getInfo("#Eintrittsjahr"));

        ausgabe(mitarbeiter1.getInfo("#ganzerName"));
        ausgabe(mitarbeiter1.getInfo("#Job"));
        ausgabe(mitarbeiter1.getInfo("#Eintrittsjahr"));

        ausgabe(mitarbeiter2.getInfo("#alles"));
        ausgabe(mitarbeiter3.getInfo("#alles"));
        ausgabe(mitarbeiter4.getInfo("#alles"));

    }

    public static void ausgabe(String outputStr) {
        System.out.println(outputStr);  
        }

} // EoC 
