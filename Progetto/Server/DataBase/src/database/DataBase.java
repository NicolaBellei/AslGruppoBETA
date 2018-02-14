package database;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;

public class Database {
    static Azienda[] az;
    
    public void leggi(String file, ArrayList a) throws IOException{
        Gson json = new Gson();
        Reader reader = new FileReader(file);
        
        Database.az = json.fromJson(reader, Azienda[].class);
        a.addAll(Arrays.asList(Database.az));
    }
    
    public void scrivi(String file, ArrayList a) throws IOException{ 
        Gson json = new Gson();
        String toJson = json.toJson(a);
        FileWriter writer = new FileWriter(file);
        writer.write(toJson);    
    }
    
    
   public void aggiungi(ArrayList a) throws IOException{
       ArrayList temp = new ArrayList();
       
       leggi("json/azienda.json", a);
       leggi("json/aggiungi.json", temp);
       a.add(Arrays.asList(temp));
       scrivi("json/mest.json", a);
   }
}