
package GUI;

import DAL.category;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BtnResetHoaDonListener extends MouseAdapter {  
    
    HoaDonGUI context;
    public BtnResetHoaDonListener(HoaDonGUI context) {
        this.context = context;
    }
    @Override
    public void mouseClicked(MouseEvent e){
        context.loadOrders(context.orderBLL.loadOrder());  
    }
}
