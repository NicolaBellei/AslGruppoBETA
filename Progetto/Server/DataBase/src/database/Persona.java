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
    
    public String toJson() {
        return "{\"idpersona\":\"" + idpersona + "\",\"nome\":\"" + nome + "\",\"cognome\":\"" + cognome + "\",\"email\":\"" + email + "\"}";
    }
}