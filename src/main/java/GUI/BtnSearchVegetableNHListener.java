
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
        List list = context.categoryBLL.searchCategory(name);
        context.loadNV(context.categoryBLL.convertList(list));
    }
}
