package database;

import java.io.*;
import java.util.ArrayList;

public class Database {
    ArrayList<Azienda> aziende;
    
    public Database() {
    }
    
    public String leggi(String nomeFile) throws IOException, ClassNotFoundException{
        File file = new File(nomeFile + ".json");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        return (String) ois.readObject();
    }
    
    public void scrivi(String nomeFile, String json) throws IOException {
        File file = new File(nomeFile + ".json", "a");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(json);
    }
    
    public void aggiungiPersona(Azienda azienda, Persona persona) throws IOException {
        azienda.aggiungiPersona(persona);
    }
}