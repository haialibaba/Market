
package GUI;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class BtnAddCategoryNHListener extends MouseAdapter {
    
    NhapHangCategoryGUI context;
    
    public BtnAddCategoryNHListener(NhapHangCategoryGUI context) {
        this.context = context;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if(context.ds_lbl_congcu[0].getText().equals("ADD")){
                context.setNullAllInput();
                //tu dong tang id
                context.ds_lbl_congcu[0].setText("ADD NEW");
                context.ds_lbl_congcu[0].setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                context.ds_lbl_congcu[1].setVisible(false);
                context.ds_lbl_congcu[2].setVisible(false);
                context.ds_lbl_congcu[4].setVisible(true);
            }else if (context.checkDataInput()){
                //function add bll
                //reload table
                context.setNullAllInput();
                context.ds_lbl_congcu[0].setText("ADD");
                context.ds_lbl_congcu[0].setBorder(null);
                context.ds_lbl_congcu[1].setVisible(true);
                context.ds_lbl_congcu[2].setVisible(true);
                context.ds_lbl_congcu[4].setVisible(false);
                JOptionPane.showMessageDialog(null,"Saved","Save",JOptionPane.PLAIN_MESSAGE);
            }
    }
}
