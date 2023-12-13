/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forme;

import domen.Alat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sofija
 */
public class TableModelAlati extends AbstractTableModel{
    
    private List<Alat> alati;
    private String[] kolone= new String[]{"naziv","stanje"};

    public TableModelAlati(List<Alat> alati) {
        this.alati = alati;
    }
    

    @Override
    public int getRowCount() {
        return alati.size();
    }

    @Override
    public int getColumnCount() {
     return kolone.length;
    }
    
     @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Alat alat=alati.get(rowIndex);
        switch(columnIndex){
            case 0:return alat.getNaziv();
            case 1: return alat.getZalihe();
            default: return "";
        }
    }
    
}
