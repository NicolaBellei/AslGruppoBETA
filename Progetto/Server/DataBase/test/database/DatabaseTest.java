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
    public void testToJson() throws Exception {
        Persona persona = new Persona(2, "Harry", "Potter", "harry.potter@grifondoro.it");
        Azienda azienda = new Azienda(2, "Grifondoro", new Persona(persona));
        
        Database Db = new Database(azienda);
        
        assertEquals("[{\"idazienda\":\"2\",\"azienda\":\"Grifondoro\",\"persone\":[{\"idpersona\":\"2\",\"nome\":\"Harry\",\"cognome\":\"Potter\",\"email\":\"harry.potter@grifondoro.it\"}]]", Db.toJson());
    }
    
    @Test
    public void testSalva() throws Exception {
        Persona persona = new Persona(2, "Harry", "Potter", "harry.potter@grifondoro.it");
        Persona pers2 = new Persona(3, "Ron", "Weasley", "ron.weasley@grifondoro.it");
        Azienda azienda = new Azienda(2, "Grifondoro", new Persona(persona));
        
        Database Db = new Database(azienda);
        Db.aggiungiPersona(azienda, pers2);
        Db.salva();
        
        assertEquals("[{\"idazienda\":\"2\",\"azienda\":\"Grifondoro\",\"persone\":[{\"idpersona\":\"2\",\"nome\":\"Harry\",\"cognome\":\"Potter\",\"email\":\"harry.potter@grifondoro.it\"},{\"idpersona\":\"3\",\"nome\":\"Ron\",\"cognome\":\"Weasley\",\"email\":\"ron.weasley@grifondoro.it\"}]]", Db.leggi("Database"));
    }
}
