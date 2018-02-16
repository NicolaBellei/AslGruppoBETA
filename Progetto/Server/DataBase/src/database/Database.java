package database;

import java.io.*;
import java.util.ArrayList;

public class Database {
    ArrayList<Azienda> aziende = new ArrayList<>();
    final String nome_file = "Database";
    
    public Database() {
    }

    public Database(Azienda azienda) {
        aziende.add(azienda);
    }
    
    public String leggi(String nomeFile) throws IOException{
        RandomAccessFile raf = new RandomAccessFile(nomeFile + ".json", "r");
        return raf.readLine();
    }
    
    public void scrivi(String nomeFile, String json) throws IOException{
        RandomAccessFile raf = new RandomAccessFile(nomeFile + ".json", "rw");
        raf.write(json.getBytes());
    }
    
    public void salva() throws IOException{
        this.scrivi(nome_file, this.toJson());
    }
    
    public void fromJson(String json) {
        
    }
    
    public void aggiungiAzienda(String nome) throws IOException {
        aziende.add(new Azienda(aziende.lastIndexOf(aziende) + 1, nome));
        
        this.leggi(nome_file);
    }
    
    public void aggiungiAzienda(Azienda azienda) throws IOException {
        aziende.add(new Azienda(azienda));
        
        this.leggi(nome_file);
    }
    
    public String toJson() {
        String json = "[";
        for (Azienda az : aziende) {
            json = json + az.toJson();
        }
        json += "]";
        
        return json;
    }
    
    public void aggiungiPersona(Azienda azienda, Persona persona) throws IOException {
        azienda.aggiungiPersona(persona);
    }
    
    public void spedisciFile() {
        routeContext.send(this.leggi(nome_file));
    }
}