package database;

import java.util.ArrayList;

public class Azienda {
    static String idazienda;
    private String azienda;
    private ArrayList<Persona> persone;

    public Azienda() {
    }

    public void aggiungiPersona(Persona pers) {
        persone.add(pers);
    }
}