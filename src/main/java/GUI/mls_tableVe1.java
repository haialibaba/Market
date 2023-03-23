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
public class mls_tableVe1 extends MouseAdapter {
    
    NhapHangGUI1 ve;
    
    public mls_tableVe1(NhapHangGUI1 ve) {
        this.ve = ve;
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        String idVe=(String) ve.tbl_nv.getModel().getValueAt(ve.tbl_nv.getSelectedRow(),0);
        String tenVe=(String) ve.tbl_nv.getModel().getValueAt(ve.tbl_nv.getSelectedRow(),1);
        String descriptionVe=(String) ve.tbl_nv.getModel().getValueAt(ve.tbl_nv.getSelectedRow(),3);
        ve.lbl_idnv.setText(idVe);
        ve.ds_input_nv[0].setText(tenVe);
        ve.ds_input_nv[1].setText(descriptionVe);

    }
}
