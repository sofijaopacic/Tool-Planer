/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Sofija
 */
public class Masina {
    
    private int sifra;
    private String naziv;
    private String proizvodjac;
    private int radniVek;
    private int godinaProizvodnje;
    private Date datumPocetka;
    private String tip;
    private Lokacija lokacija;
    private List<Alat> alati;

    public Masina() {
    }

    public Masina(int sifra,String naziv, String proizvodjac, int radniVek, int godinaProizvodnje, Date datumPocetka, String tip, Lokacija lokacija, List<Alat> alati) {
        this.sifra=sifra;
        this.naziv = naziv;
        this.proizvodjac = proizvodjac;
        this.radniVek = radniVek;
        this.godinaProizvodnje = godinaProizvodnje;
        this.datumPocetka = datumPocetka;
        this.tip = tip;
        this.lokacija = lokacija;
        this.alati=alati;
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

    public String getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(String proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    public int getRadniVek() {
        return radniVek;
    }

    public void setRadniVek(int radniVek) {
        this.radniVek = radniVek;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public Date getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Lokacija getLokacija() {
        return lokacija;
    }

    public void setLokacija(Lokacija lokacija) {
        this.lokacija = lokacija;
    }

    public List<Alat> getAlati() {
        return alati;
    }

    public void setAlati(List<Alat> alati) {
        this.alati = alati;
    }
    
}
