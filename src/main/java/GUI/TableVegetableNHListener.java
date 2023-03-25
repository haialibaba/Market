
package GUI;

import DAL.vegetable;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class TableVegetableNHListener extends MouseAdapter {
    
    NhapHangVegetableGUI context;
    
    public TableVegetableNHListener(NhapHangVegetableGUI ve) {
        this.context = ve;
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        context.setNullAllInfo();
        String id=(String) context.tbl_nv.getValueAt(context.tbl_nv.getSelectedRow(),0);
        vegetable ve = context.vegetableBLL.getVegetable(id);
        context.lbl_idnv.setText(id);
        context.ds_input_nv[0].setText(ve.getVegetable_Name());
        context.ds_input_nv[1].setText(ve.getUnit());
        context.ds_input_nv[2].setText(ve.getAmount());
        context.ds_input_nv[3].setText(ve.getPrice());
        context.cb_categoryInput.getModel().setSelectedItem(ve.getCatagory());
        context.lbl_imgnv.setText(ve.getImage()); 
        imgs img=new imgs();
        ImageIcon icon=new ImageIcon(img.imgs("banhbao.jpg"));
        Image ic=icon.getImage().getScaledInstance(260, 260, Image.SCALE_SMOOTH);
        icon=new ImageIcon(ic);
        context.inner_img(icon);  
    }
}
