package database;

import com.google.gson.Gson;


/**
 *
 * @author m.santosuosso
 */
public class Persona {
    int id;
    String nome;
    String cognome;
    int numTel;
    String mail;
    
    public Persona(int id, String nome, String cognome, int numTel, String mail) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.numTel = numTel;
        this.mail = mail;
    }

    public Persona() {
    }
    
    public void export() {
        Gson json = new Gson();
        json.toJson(this);
    }
}
