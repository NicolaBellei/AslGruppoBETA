package database;

import java.util.ArrayList;

public class Azienda {
    private int idazienda;
    private String azienda;
    private ArrayList<Persona> persone;

    public Azienda() {
    }

    public Azienda(int idazienda, String azienda) {
        this.idazienda = idazienda;
        this.azienda = azienda;
        persone.set(0, new Persona());
    }
    
    public void aggiungiPersona(Persona pers) {
        persone.set(pers.getIdpersona(), pers);
    }
}