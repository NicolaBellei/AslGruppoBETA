package database;

import java.io.*;
import java.util.ArrayList;

public class Database {
    ArrayList<Azienda> aziende;
    
    public Database() {
    }
    
    public String leggi(String nomeFile) throws IOException{
        RandomAccessFile raf = new RandomAccessFile(nomeFile + ".json", "rw");
        return raf.readLine();
    }
    
    public static void scrivi(String nomeFile, String json) throws IOException{
        RandomAccessFile raf = new RandomAccessFile(nomeFile + ".json", "rw");
        raf.write(json.getBytes());
    }
    
    public void aggiungiPersona(Azienda azienda, Persona persona) throws IOException {
        azienda.aggiungiPersona(persona);
    }
}