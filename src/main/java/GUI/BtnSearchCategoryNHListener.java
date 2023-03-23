
package GUI;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class BtnSearchCategoryNHListener extends MouseAdapter {
    
    NhapHangCategoryGUI context;
    
    public BtnSearchCategoryNHListener(NhapHangCategoryGUI context) {
        this.context = context;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        //function search bll and load to table
    }
}
