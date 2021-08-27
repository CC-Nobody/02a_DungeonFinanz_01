package com.dungeoninc.java;

public class Mitarbeiter {
    private String name;
    private String vorname;
    private String funktion;
    private int eintrittsjahr;
    
    public Mitarbeiter(String name, String vorname, String funktion, int eintrittsjahr) {
        this.name = name;
        this.vorname = vorname;
        this.funktion = funktion;
        this.eintrittsjahr = eintrittsjahr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getFunktion() {
        return funktion;
    }

    public void setFunktion(String funktion) {
        this.funktion = funktion;
    }

    public int getEintrittsjahr() {
        return eintrittsjahr;
    }

    public void setEintrittsjahr(int eintrittsjahr) {
        this.eintrittsjahr = eintrittsjahr;
    }

        String getInfo(String flag){
        switch (flag) {
            case "#Familienname":
                return "Familienname: " + this.getName();
            case "#Vorname":
                return "Vorname: " + this.getVorname();
            case "#Job":
                return "Funktion: " + this.getFunktion();
            case "#Eintrittsjahr":
                return "Eintrittsjahr: " + String.valueOf(this.getEintrittsjahr());
            case "#ganzerName":
                return "Name: " + this.getVorname() + " " + this.getName();
            case "#alles":
                return this.getVorname() + " " + this.getName() + ", " + this.getFunktion() + ", " + this.getEintrittsjahr();
            default:
            return "'?!(Z%(%)";
        }
    }

}
