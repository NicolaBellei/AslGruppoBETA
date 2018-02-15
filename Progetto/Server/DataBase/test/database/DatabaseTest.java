package database;

import org.junit.Test;
import static org.junit.Assert.*;

public class DatabaseTest {
    /**
     * Test of scrivi method, of class Database.
     * @throws java.lang.Exception
     */
    @Test
    public void testScriviELeggi() throws Exception {
        Database Db = new Database();
        String json = "[{\"idazienda\":\"2\",\"azienda\":\"Grifondoro\",\"persone\":[{\"idpersona\":\"2\",\"nome\":\"Harry\",\"cognome\":\"Potter\",\"email\":\"harry.potter@grifondoro.it\"}]}]";
        Db.scrivi("Prova", json);
        
        assertEquals(json, Db.leggi("Prova"));
    }

    /**
     * Test of aggiungiPersona method, of class Database.
     * @throws java.lang.Exception
     */
    @Test
    public void testAggiungiPersona() throws Exception {
        /*Database Db = new Database();
        Db.aziende.set(0, new Azienda(0, "Pippo.srl"));
        Persona pers = new Persona(0, "Gianni", "Pippo", "www.www@www.com");
        Db.aggiungiPersona(Db.aziende.get(0), pers);
        
        assertEquals(pers, Db.aziende.get(0));*/
    }
}
