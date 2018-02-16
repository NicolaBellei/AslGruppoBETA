package database;

public class Persona  {
    private int idpersona;
    private String nome;
    private String cognome;
    private String email;

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
    
    public int getIdpersona() {
        return idpersona;
    }
    
    public String toJson() {
        return "{\"idpersona\":\"" + idpersona + "\",\"nome\":\"" + nome + "\",\"cognome\":\"" + cognome + "\",\"email\":\"" + email + "\"}";
    }
}