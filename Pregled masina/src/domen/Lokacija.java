/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author Sofija
 */
public class Lokacija {
    
    private String naziv;
    private int sifra;

    public Lokacija() {
    }

    public Lokacija(String naziv, int sifra) {
        this.naziv = naziv;
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    @Override
    public String toString() {
        return naziv;
    }
    
    
    
    
}
