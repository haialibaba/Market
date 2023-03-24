
package GUI;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class BtnSearchCategoryNHListener extends MouseAdapter {
    
    NhapHangCategoryGUI context;
    
    public BtnSearchCategoryNHListener(NhapHangCategoryGUI context) {
        this.context = context;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        String name = context.input_search.getText();
        List list = context.categoryBLL.searchCategory(name);
        context.loadCategoryTable(context.categoryBLL.convertList(list));
    }
}
