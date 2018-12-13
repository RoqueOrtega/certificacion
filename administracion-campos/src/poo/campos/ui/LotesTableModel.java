/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.campos.ui;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import poo.campos.clases.Lote;

/**
 *
 * @author roque.ortega
 */
public class LotesTableModel extends AbstractTableModel {
    
    private static final String[] COLUMNAS = { "Nro", "Superficie", "Tipo Suelo" };

    List<Lote> lotes;
    
    //Constructor
    public LotesTableModel(List<Lote> listLotes) {
        super();
        
        lotes= listLotes;
    }
    
    
    @Override
    public int getRowCount() {
        return lotes.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    
    @Override
    public Object getValueAt(int fila, int columna) {
        Object retorno = null;
        Lote loteAux = lotes.get(fila);
        
        switch (columna) {
            case 0:
                retorno = loteAux.getNumero();
                break;
            case 1:
                retorno = loteAux.getSuperficie();
                break;
            case 2:
                retorno = loteAux.getTipoSuelo().getNombre();
                break;
        }
        
        return retorno;
    }    

    @Override
    public String getColumnName(int index) {
        return COLUMNAS[index];
    }

    public void setLotes(List<Lote> lotes) {
        this.lotes = lotes;
    }
    
    
    
}
