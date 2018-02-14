package database;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
    
    public Gson leggi(File file) throws FileNotFoundException{
        Gson json = new Gson();
        FileReader fis = new FileReader(file);
        
        return json;
    }
}