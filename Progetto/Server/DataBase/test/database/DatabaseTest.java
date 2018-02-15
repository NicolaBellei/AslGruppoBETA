package database;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DatabaseTest {
    /**
     * Test of scrivi method, of class Database.
     * @throws java.lang.Exception
     */
    @Test
    public void testScrivi() throws Exception {
        Database Db = new Database();
        
        Db.scrivi("Prova.json", "[{\"idazienda\":\"2\",\"azienda\":\"Grifondoro\",\"persone\":[{\"idpersona\":\"2\",\"nome\":\"Harry\",\"cognome\":\"Potter\",\"email\":\"harry.potter@grifondoro.it\"}]}]");
        
    }
    
    /**
     * Test of leggi method, of class Database.
     * @throws java.lang.Exception
     */
    @Test
    public void testLeggi() throws Exception {
        Database Db = new Database();
        
        Gson json = Db.leggi("Prova.json");
        
    }

    /**
     * Test of aggiungi method, of class Database.
     * @throws java.lang.Exception
     */
    @Test
    public void testAggiungi() throws Exception {
        
    }

}
