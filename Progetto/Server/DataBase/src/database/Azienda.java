package database;

import java.util.ArrayList;
import java.util.Iterator;

public class Azienda {
    private int idazienda;
    private String azienda;
    private ArrayList<Persona> persone = new ArrayList<>();


    public Azienda() {
    }

    public Azienda(int idazienda, String azienda) {
        this.idazienda = idazienda;
        this.azienda = azienda;
    }

    public Azienda(int idazienda, String azienda, Persona persona) {
        this.idazienda = idazienda;
        this.azienda = azienda;
        this.persone.add(persona);
    }

    public Azienda(Azienda azienda) {
        this.idazienda = azienda.idazienda;
        this.azienda = azienda.azienda;
    }
    
    
    public String toJson() {
        String json = "{\"idazienda\":\"" + idazienda + "\",\"azienda\":\"" + azienda + "\",\"persone\":[";
        String temp = json;
        
        for (Persona i : persone) {
            json = json + i.toJson();
            temp = json;
            json += ",";
        }
        
        json = temp + "]";
        
        return json;
    }
    
    public void aggiungiPersona(Persona pers) {
        persone.add(new Persona(pers));
    }
}