/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author DELL
 */
public class TableCategoryNHListener extends MouseAdapter {
    
    NhapHangCategoryGUI ve;
    
    public TableCategoryNHListener(NhapHangCategoryGUI ve) {
        this.ve = ve;
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        String idVe= ve.table_category.getModel().getValueAt(ve.table_category.getSelectedRow(),0).toString();
        String tenVe=(String) ve.table_category.getModel().getValueAt(ve.table_category.getSelectedRow(),1);
        String descriptionVe=(String) ve.table_category.getModel().getValueAt(ve.table_category.getSelectedRow(),2);
        ve.lbl_id_category.setText(idVe);
        ve.list_input_category[0].setText(tenVe);
        ve.list_input_category[1].setText(descriptionVe);

    }
}
