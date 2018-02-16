package database;

import com.google.gson.Gson;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Database {
    public ArrayList<Azienda> aziende = new ArrayList<>();
    final String nome_file = "Database";
    
    public Database() {
    }

    public Database(Azienda azienda) {
        aziende.add(azienda);
    }
    
    public String leggi(String nomeFile) throws IOException{
        String lettura;
        try (RandomAccessFile raf = new RandomAccessFile(nomeFile + ".json", "r")) {
            lettura = raf.readLine();
        }
        return lettura;
    }
    
    public void scrivi(String nomeFile, String json) throws IOException{
        try (RandomAccessFile raf = new RandomAccessFile(nomeFile + ".json", "rw")) {
            raf.write(json.getBytes());
            raf.close();
        }
    }
    
    public void elimina(String nomeFile) {
        File file = new File(nomeFile + ".json", "rw");
        System.out.println(file.delete());
    }
    
    public void salva() throws IOException{
        this.scrivi(nome_file, this.toJson());
    }
    
    public Database fromJson(String json) {
        Gson gson = new Gson();
        return null;
    }
    
    public void aggiungiAzienda(String nome) throws IOException {
        aziende.add(new Azienda(aziende.lastIndexOf(aziende) + 1, nome));
        Collections.sort(aziende, (Azienda az1, Azienda az2) -> az1.azienda.compareTo(az2.azienda));
        this.salva();
    }
    
    public void aggiungiAzienda(Azienda azienda) throws IOException {
        aziende.add(new Azienda(azienda));
        Collections.sort(aziende, (Azienda az1, Azienda az2) -> az1.azienda.compareTo(az2.azienda));
        this.salva();
    }
    
    public String toJson() {
        String json = "[";
        String temp = json;
        
        for (Azienda i : aziende) {
            json = json + i.toJson();
            temp = json;
            json += ",";
        }
        
        json = temp;
        json += "]";
        
        return json;
    }
    
    public void aggiungiPersona(Azienda azienda, Persona persona) throws IOException {
        azienda.aggiungiPersona(persona);
        this.salva();
    }
    
    public void spedisciFile() throws IOException {
        routeContext.send(this.leggi(nome_file));
    }
}