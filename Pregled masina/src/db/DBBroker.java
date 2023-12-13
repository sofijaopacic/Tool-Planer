/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import domen.Alat;
import domen.Lokacija;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sofija
 */
public class DBBroker {

    private static DBBroker instanca;
    private Connection konekcija;

    private DBBroker() throws SQLException {

        konekcija = DriverManager.getConnection("jdbc:mysql://localhost:3306/kolokvijumsama", "root", "");
        konekcija.setAutoCommit(false);

    }

    public static DBBroker getInstanca() throws SQLException {
        if (instanca == null) {
            instanca = new DBBroker();
        }
        return instanca;
    }

    public List<Lokacija> vratiSlobodneLokacije() throws SQLException {
        String upit = "SELECT * FROM lokacija";
        PreparedStatement ps = konekcija.prepareStatement(upit);
        ResultSet rs = ps.executeQuery();

        List<Lokacija> lokacije = new LinkedList<>();
        while (rs.next()) {
            int sifraLokacije = rs.getInt("sifraLokacije");
            String nazivLokacije = rs.getString("naziv");

            Lokacija l = new Lokacija(nazivLokacije, sifraLokacije);
            lokacije.add(l);
        }
        return lokacije;
    }

    public List<Alat> vratiListuAlata() throws SQLException {

        String upit = "SELECT * FROM alat";
        PreparedStatement ps = konekcija.prepareStatement(upit);

        ResultSet rs = ps.executeQuery();

        List<Alat> alati = new LinkedList<>();

        while (rs.next()) {
            int sifra = rs.getInt("sifraAlata");
            String naziv = rs.getString("nazivAlata");
            int stanje = rs.getInt("stanje");

            Alat a = new Alat(sifra, naziv, stanje);
            alati.add(a);
        }
        return alati;

    }

    public List<Alat> vratiListuObelezenihAlata(int[] obelezeni) throws SQLException, Exception {

        String upit = "SELECT * FROM alat WHERE sifraAlata=?";
        PreparedStatement ps = konekcija.prepareStatement(upit);

        List<Alat> alati = new LinkedList<>();

        for (int i = 0; i < obelezeni.length; i++) {
            ps.setInt(1, obelezeni[i] + 1);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int sifra = rs.getInt("sifraAlata");
               
                String naziv = rs.getString("nazivAlata");
                int stanje = rs.getInt("stanje");

                 if(stanje<=0){
                    throw new Exception("MANJE OD NULE");
                }
                Alat a = new Alat(sifra, naziv, --stanje);
                alati.add(a);
            }
        }
        
        ispraviStanje(obelezeni);
        
        return alati;
    }

    private void ispraviStanje(int[] obelezeni) throws SQLException {
        String upit="UPDATE alat SET stanje = stanje - 1 WHERE sifraAlata = ?";
        PreparedStatement ps = konekcija.prepareStatement(upit);
        
         for (int i = 0; i < obelezeni.length; i++) {
             ps.setInt(1, obelezeni[i] + 1);
             ps.execute();
         }
         
         konekcija.commit();
         
        
    }
}
