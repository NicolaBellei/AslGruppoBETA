package database;

public class Libro {
    final String titolo, autore;
    int prezzo;

    public Libro(String Titolo, String Autore) {
        this.titolo = Titolo;
        this.autore = Autore;
        this.prezzo = (int) (Math.random() * 20 + 1);
    }

    @Override
    public String toString() {
        return titolo + ", " + autore + ", E" + prezzo;
    }
}