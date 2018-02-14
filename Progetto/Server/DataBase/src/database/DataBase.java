package database;

import java.util.List;

/**
 *
 * @author m.santosuosso
 */
public class DataBase extends Persona {
    int idazienda;
    String azienda;
    List<Persona> persone = (List<Persona>) new Persona();

    public DataBase(int idazienda, String azienda) {
        this.idazienda = idazienda;
        this.azienda = azienda;
    }

    public DataBase() {};
}