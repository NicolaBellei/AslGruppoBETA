package database;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;

public class Database {
    public static ArrayList<Azienda> az = new ArrayList<>;    

    public Database() {
    }
    
    public Gson leggi(String nomeFile) throws IOException{
        Gson json = new Gson();
        Reader reader = new FileReader(nomeFile);
        
        Database.az = json.fromJson(reader, Azienda[].class);
        return az;
    }
    
    public void scrivi(String file, String str) throws IOException{ 
        Gson json = new Gson();
        String toJson = json.toJson(az);
        FileWriter writer = new FileWriter(file);
        writer.write(json);    
    }
    
    public void scrivi(String file, Gson json) throws IOException{
        String toJson = json.toJson(az);
        FileWriter writer = new FileWriter(file);
        writer.write(json);    
    }
    
    public void aggiungi(ArrayList a) throws IOException{
        ArrayList temp = new ArrayList();

        leggi("json/azienda.json");
        leggi("json/aggiungi.json");
        a.add(Arrays.asList(temp));
        scrivi("json/mest.json");
    }

    void scrivi(String provajson, String idazienda2aziendaGrifondoropersoneidperso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void scrivi(String provajson, String idazienda2aziendaGrifondoropersoneidperso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}