
package GUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BtnResetVegetableNHListener extends MouseAdapter {
    NhapHangVegetableGUI context;
    public BtnResetVegetableNHListener(NhapHangVegetableGUI context) {
        this.context = context;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if (context.ds_lbl_congcu[0].getText().equals("ADD NEW")) {
               context.setNullAllInput();
            }else if (context.ds_lbl_congcu[1].getText().equals("SAVE EDIT")) {
                context.setNullAllInput();
            }else{
                context.setNullAllInfo();
                Object[][] data = context.vegetableBLL.converVegetable(
                        context.vegetableBLL.loadAllVegetable());
                context.loadNV(data);
            }
        }
}
