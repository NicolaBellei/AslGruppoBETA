package database;

import com.google.gson.Gson;

/**
 *
 * @author m.santosuosso
 */
public class Azienda {
    int id;
    String nome;

    public Azienda(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Azienda() {
    }
    
    public void exp() {
        Gson json = new Gson();
        json.toJson(this);
    }
}