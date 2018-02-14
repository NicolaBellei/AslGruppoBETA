package database;

import com.google.gson.Gson;


/**
 *
 * @author m.santosuosso
 */
public class Persona {
    int idpersona;
    String nome;
    String cognome;
    String mail;
    int numero;

    public Persona(int idpersona, String nome, String cognome, String mail, int numero) {
        this.idpersona = idpersona;
        this.nome = nome;
        this.cognome = cognome;
        this.mail = mail;
        this.numero = numero;
    }

    public Persona() {};
    
    
}
