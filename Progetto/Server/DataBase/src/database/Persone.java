/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author m.santosuosso
 */
public class Persone {
    int idP;
    String nomeP;
    String cognomeP;
    int numTelP;
    String mailP;

    public Persone(int id, String nome, String cognome, int numTel, String mail) {
        this.idP = id;
        this.nomeP = nome;
        this.cognomeP = cognome;
        this.numTelP = numTel;
        this.mailP = mail;
    }
    
    
}
