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
public class mls_tableVe extends MouseAdapter {
    
    NhapHangGUI ve;
    
    public mls_tableVe(NhapHangGUI ve) {
        this.ve = ve;
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        String idVe=(String) ve.tbl_nv.getModel().getValueAt(ve.tbl_nv.getSelectedRow(),0);
        String tenVe=(String) ve.tbl_nv.getModel().getValueAt(ve.tbl_nv.getSelectedRow(),1);
        String unitVe=(String) ve.tbl_nv.getModel().getValueAt(ve.tbl_nv.getSelectedRow(),3);
        String amountVe=(String) ve.tbl_nv.getModel().getValueAt(ve.tbl_nv.getSelectedRow(),4);
        String imageVe= (String) ve.tbl_nv.getModel().getValueAt(ve.tbl_nv.getSelectedRow(),6);
        String priceVe=(String) ve.tbl_nv.getModel().getValueAt(ve.tbl_nv.getSelectedRow(),5);
        ve.lbl_idnv.setText(idVe);
        ve.ds_input_nv[0].setText(tenVe);
        ve.ds_input_nv[1].setText(unitVe);
        ve.ds_input_nv[2].setText(amountVe);
        ve.ds_input_nv[3].setText(priceVe);
        
        ve.cb_categoryInput.setSelectedItem(ve.tbl_nv.getModel().getValueAt(
                ve.tbl_nv.getSelectedRow(),2));
        
        ve.lbl_imgnv.setText(imageVe); 

        imgs img=new imgs();
        ImageIcon icon=new ImageIcon(img.imgs("banhbao.jpg"));
        Image ic=icon.getImage().getScaledInstance(260, 260, Image.SCALE_SMOOTH);
        icon=new ImageIcon(ic);
        ve.inner_img(icon);  
    }
}
