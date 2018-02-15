package database;

import java.io.*;
import java.util.ArrayList;

public class Database {
    ArrayList<Azienda> aziende;
    
    public Database() {
    }
    
    public String leggi(String nomeFile) throws IOException{
        RandomAccessFile raf = new RandomAccessFile(nomeFile + ".json", "r");
        return raf.readLine();
    }
    
    public void scrivi(String nomeFile, String json) throws IOException{
        RandomAccessFile raf = new RandomAccessFile(nomeFile + ".json", "rw");
        raf.write(json.getBytes());
    }
    
    public void fileToObj(String nomeFile) throws IOException {
        String json = this.leggi(nomeFile);
        
        for(int i = 0; i < json.length(); i++) {
            
        }
    }
            
    public void aggiungiAzienda(String nome) throws IOException {
        aziende.add(new Azienda(aziende.lastIndexOf(aziende) + 1, nome));
        
        this.leggi("Database");
    }
    
    public void aggiungiPersona(Azienda azienda, Persona persona) throws IOException {
        azienda.aggiungiPersona(persona);
    }
}