
package GUI;

import DAL.category;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TableHoaDonListener extends MouseAdapter {  
    
    HoaDonGUI context;
    public TableHoaDonListener(HoaDonGUI context) {
        this.context = context;
    }
    @Override
    public void mouseClicked(MouseEvent e){
    }
}
