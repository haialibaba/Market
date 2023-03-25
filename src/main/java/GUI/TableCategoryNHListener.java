
package GUI;

import DAL.category;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TableCategoryNHListener extends MouseAdapter {  
    NhapHangCategoryGUI ve;
    public TableCategoryNHListener(NhapHangCategoryGUI ve) {
        this.ve = ve;
    }
    @Override
    public void mouseClicked(MouseEvent e){
        String id= ve.table_category.getModel().getValueAt(ve.table_category.getSelectedRow(),0).toString();
        category c = ve.categoryBLL.getCategory(Integer.parseInt(id));
        ve.lbl_id_category.setText(id);
        ve.list_input_category[0].setText(c.getName());
        ve.list_input_category[1].setText(c.getDescription());

    }
}
