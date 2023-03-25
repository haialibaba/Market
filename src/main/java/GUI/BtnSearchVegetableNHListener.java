
package GUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class BtnSearchVegetableNHListener extends MouseAdapter {
    NhapHangVegetableGUI context;
    public BtnSearchVegetableNHListener(NhapHangVegetableGUI context) {
        this.context = context;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        String name = context.txt_timkiem_nv.getText();
        Object categoryObject = context.cb_categoryFilter.getModel().getSelectedItem();
        List list = context.vegetableBLL.searchVegetable(name, categoryObject);
        context.loadNV(list);
    }
}
