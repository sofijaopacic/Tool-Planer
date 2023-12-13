/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author Sofija
 */
public class Alat {
    
    private int sifra;
    private String naziv;
    private int zalihe;

    public Alat() {
    }

    public Alat(int sifra, String naziv, int zalihe) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.zalihe = zalihe;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getZalihe() {
        return zalihe;
    }

    public void setZalihe(int zalihe) {
        this.zalihe = zalihe;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alat other = (Alat) obj;
        return this.sifra == other.sifra;
    }

    @Override
    public String toString() {
        return  naziv;
    }
    
    
    
    
    
}
