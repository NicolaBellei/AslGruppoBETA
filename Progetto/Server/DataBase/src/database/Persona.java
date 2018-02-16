package database;

import com.google.gson.Gson;

public class Persona  {
    public int idpersona;
    public String nome;
    public String cognome;
    public String email;

    public Persona() {
    }

    public Persona(int idpersona, String nome, String cognome, String email) {
        this.idpersona = idpersona;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

    public Persona(Persona pers) {
        this.idpersona = pers.idpersona;
        this.nome = pers.nome;
        this.cognome = pers.cognome;
        this.email = pers.email;
    }
    
    public String toJson() {
        return "{\"idpersona\":\"" + idpersona + "\",\"nome\":\"" + nome + "\",\"cognome\":\"" + cognome + "\",\"email\":\"" + email + "\"}";
    }
    
    public Persona[] fromJson(String json) {
        Gson gson = new Gson();
        
        return gson.fromJson(json, Persona[].class);
    }
}