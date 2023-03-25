
package GUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class BtnDeleteVegetableNHListener extends MouseAdapter {
    NhapHangVegetableGUI context;
    public BtnDeleteVegetableNHListener(NhapHangVegetableGUI context) {
        this.context = context;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        int i=context.tbl_nv.getSelectedRow();
        if(i<0){
            JOptionPane.showMessageDialog(null, "Please choose vegetable from the table!");
        }else{
            int dialog_del = JOptionPane.showConfirmDialog(null,
                "Do you want to delete vegetable?\n"+"ID: "+ context.tbl_nv.getValueAt(i,0)
                +"\n"+"Name: "+ context.tbl_nv.getValueAt(i,1),"Delete",
                JOptionPane.YES_NO_OPTION);
            if(dialog_del == JOptionPane.YES_OPTION){
                // function delele bll
                //reload table
                context.setNullAllInfo();
                JOptionPane.showMessageDialog(null, "Deleted"); 
            }
        }
    }
}
