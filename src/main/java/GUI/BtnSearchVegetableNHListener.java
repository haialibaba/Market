
package GUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BtnSearchVegetableNHListener extends MouseAdapter {
    NhapHangVegetableGUI context;
    public BtnSearchVegetableNHListener(NhapHangVegetableGUI context) {
        this.context = context;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        //function search bll and load to table
    }
}
