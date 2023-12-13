/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import db.DBBroker;
import domen.Alat;
import domen.Inzenjer;
import domen.Lokacija;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Sofija
 */
public class ClientController {
    
    private static ClientController instanca;
    
    private List<Inzenjer> listaInzinjera;

    public ClientController() {
        listaInzinjera= new LinkedList<>();
        
        Inzenjer inzenjer1= new Inzenjer("sofija", "sofija", "sofija", "opacic");
        Inzenjer inzenjer2= new Inzenjer("danilo", "danilo", "danilo", "djurdjic");
        Inzenjer inzenjer3= new Inzenjer("pera", "pera", "pera", "peric");
        
        listaInzinjera.add(inzenjer1);
        listaInzinjera.add(inzenjer2);
        listaInzinjera.add(inzenjer3);
        
    }

    public static ClientController getInstanca() {
         if(instanca == null){
            instanca = new ClientController();
        }
        return instanca;
    }


    public List<Inzenjer> getListaInzinjera() {
        return listaInzinjera;
    }

    public void setListaInzinjera(List<Inzenjer> listaInzinjera) {
        this.listaInzinjera = listaInzinjera;
    }

    public List<Inzenjer> vratiListuInzinjera() {
        return listaInzinjera;
    }

    public List<Lokacija> vratiSlobodneLokacije() throws SQLException {
        return DBBroker.getInstanca().vratiSlobodneLokacije();
    }

    public List<Alat> vratiListuAlata() throws SQLException {
        return DBBroker.getInstanca().vratiListuAlata();
    }

    public List<Alat> vratiListuObelezenihAlata(int[] obelezeni) throws SQLException, Exception {
        return DBBroker.getInstanca().vratiListuObelezenihAlata(obelezeni);
    }
    
    
    
    
    
    
}
