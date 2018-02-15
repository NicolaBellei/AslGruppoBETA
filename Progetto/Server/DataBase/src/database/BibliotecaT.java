package database;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BibliotecaT {
    public static void salva(Libro libro) throws IOException{
        RandomAccessFile raf = new RandomAccessFile(libro.titolo + ".txt", "rw");
        raf.write(libro.toString().getBytes());
    }
    
    public static void mostra(String nome_file) throws IOException, ClassNotFoundException{
        try (RandomAccessFile raf = new RandomAccessFile(nome_file + ".txt", "rw")) {
            byte[] bytes = new byte[(int) raf.length()];
            
            raf.read(bytes);
            
            for (byte by:bytes) {
                if (by < 25)
                    System.out.print((int) by);
                else
                    System.out.print((char) by);
            }
        }
    }
    
    public static void leggi(String nome_file) throws IOException{
        RandomAccessFile raf = new RandomAccessFile(nome_file + ".txt", "rw");
        byte[] bytes = new byte[(int) raf.length() - 3];
        
        raf.read(bytes);
        
        String[] arr = new String[3];
        
        //Splittare la stringa dall'array di byte - UNKNOWN
    }
            
    public static void main(String[] args) {
        Libro divComm = new Libro("La divina commedia", "D. Alighieri");
        Libro orlFur = new Libro("Orlando furioso", "L. Ariosto");
        Libro lotr = new Libro("Il signore degli anelli", "J.R.R. Tolkien");
        
        try {
            salva(divComm);
        } catch (IOException ex) {
            Logger.getLogger(BibliotecaT.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                mostra("La divina commedia");
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(BibliotecaT.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try {
            salva(orlFur);
        } catch (IOException ex) {
            Logger.getLogger(BibliotecaT.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                mostra("Orlando furioso");
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(BibliotecaT.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try {
            salva(lotr);
        } catch (IOException ex) {
            Logger.getLogger(BibliotecaT.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                mostra("Il signore degli anelli");
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(BibliotecaT.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
