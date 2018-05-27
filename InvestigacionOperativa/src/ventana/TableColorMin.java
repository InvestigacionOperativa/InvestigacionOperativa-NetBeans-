/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;

/**
 *
 * @author USUARIO
 */
public class TableColorMin extends DefaultTableCellRenderer{
    private Component componente;

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
        int aux = obtenerFilaOptima(table);
        if(row==aux){
            componente.setBackground(Color.GREEN);
        }else{
            componente.setBackground(Color.WHITE);
        }
        componente.setForeground(Color.BLACK);
        return componente;
    }
    
    public int obtenerFilaOptima(JTable table){
        int fila = 0;
        Double aux,res;
        res = 9999999.00;
        TableModel tableModel = table.getModel();
        for (int i = 0; i < tableModel.getRowCount() ; i++) {
            aux = Double.parseDouble((String)tableModel.getValueAt(i, 5)); 
            if (aux < res){
                res = aux;
                fila = i;
            }
        }
        return fila;
    }
        
    
}
