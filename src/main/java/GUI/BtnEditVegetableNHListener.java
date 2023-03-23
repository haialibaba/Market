
package GUI;

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
        if(context.ds_lbl_congcu[1].getText().equals("EDIT")){
            context.ds_lbl_congcu[1].setText("SAVE EDIT");
            context.ds_lbl_congcu[1].setBorder(BorderFactory.createLineBorder(Color.RED, 3));
            context.ds_lbl_congcu[0].setVisible(false);
            context.ds_lbl_congcu[2].setVisible(false);
            context.ds_lbl_congcu[4].setVisible(true);
        }else{
            if(context.checkDataInput()){
                //update function
                // reload table
                context.setNullAllInput();
                context.ds_lbl_congcu[1].setText("EDIT");
                context.ds_lbl_congcu[1].setBorder(null);
                context.ds_lbl_congcu[0].setVisible(true);
                context.ds_lbl_congcu[2].setVisible(true);
                context.ds_lbl_congcu[4].setVisible(false);
                JOptionPane.showMessageDialog(null,"Saved","Save",JOptionPane.PLAIN_MESSAGE);
            } 
        }
    }
}
