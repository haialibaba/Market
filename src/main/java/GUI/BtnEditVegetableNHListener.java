
package GUI;

import DAL.category;
import DAL.vegetable;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class BtnEditVegetableNHListener extends MouseAdapter { 
    NhapHangVegetableGUI context;
    public BtnEditVegetableNHListener(NhapHangVegetableGUI context) {
        this.context = context;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if(context.lbl_idnv.getText().equals(null)){
            JOptionPane.showMessageDialog(null, "Please choose vegetable from the table!");
        }else{
            if(context.ds_lbl_congcu[1].getText().equals("EDIT")){
            context.ds_lbl_congcu[1].setText("SAVE EDIT");
            context.ds_lbl_congcu[1].setBorder(BorderFactory.createLineBorder(Color.RED, 3));
            context.ds_lbl_congcu[0].setVisible(false);
            context.ds_lbl_congcu[2].setVisible(false);
            context.ds_lbl_congcu[4].setVisible(true);
        }else{
            if(context.checkDataInput()){
                vegetable v = context.vegetableBLL.getVegetable(context.lbl_idnv.getText());
                v.setVegetable_Name(context.ds_input_nv[0].getText());
                v.setUnit(context.ds_input_nv[1].getText());
                v.setAmount(context.ds_input_nv[2].getText());
                v.setPrice(context.ds_input_nv[3].getText());
                v.setCatagory((category) context.cb_categoryInput.getModel().getSelectedItem());
                v.setImage(context.lbl_imgnv.getText());
                boolean status = context.vegetableBLL.updateVegetable(v); 
                if(status){
                    JOptionPane.showMessageDialog(null,"Save successfully","Save",
                            JOptionPane.PLAIN_MESSAGE);
                    context.setNullAllInfo();
                    context.ds_lbl_congcu[1].setText("EDIT");
                    context.ds_lbl_congcu[1].setBorder(null);
                    context.ds_lbl_congcu[0].setVisible(true);
                    context.ds_lbl_congcu[2].setVisible(true);
                    context.ds_lbl_congcu[4].setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null,"Save failure","Save",
                            JOptionPane.PLAIN_MESSAGE);
                }    
            } 
        }
        }
    }
}
