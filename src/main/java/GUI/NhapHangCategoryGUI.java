package GUI;

import BLL.categoryBLL;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

public class NhapHangCategoryGUI {
    
    JPanel pnl_input,pnl_tuongtac,top_content,pnl_contentbottom,pnl_information;
    public  JPanel pnl_congcu,pnl_search,pnl_search_border;
    public  String[] title_info_category={"Name","Description"};
    public  JPanel[] list_pnl_category=new JPanel[title_info_category.length];
    public  JTextField[] list_input_category= new JTextField[title_info_category.length];
    
    public  String[] btn_congcu={"ADD","EDIT","DELETE","RESET","CANCEL"};
    public  JLabel[] ds_lbl_congcu=new JLabel[btn_congcu.length];
    
    public  JLabel lbl_search,lbl_id_category;
    public  JTextField input_search;
     
    public  JTable table_category;
    public  DefaultTableModel table_model_category;
    
    categoryBLL categoryBLL = new categoryBLL();

    public NhapHangCategoryGUI(JPanel pnl_input, JPanel pnl_tuongtac, JPanel top_content,
            JPanel pnl_information,JPanel pnl_contentbottom) {
        this.pnl_input = pnl_input;
        this.pnl_tuongtac = pnl_tuongtac;
        this.top_content = top_content;
        this.pnl_congcu = pnl_congcu;
        this.pnl_information = pnl_information;
        this.pnl_contentbottom = pnl_contentbottom;
        init();
    }
    private void init(){
        congCu();
        categoryTable();
    }
  
    private void congCu(){
        for(int i=0; i<title_info_category.length;i++){
            list_pnl_category[i]=new JPanel();
            list_pnl_category[i].setBorder(BorderFactory.createTitledBorder(title_info_category[i]));
            list_pnl_category[i].setBackground(null);
            list_pnl_category[i].setLayout(new FlowLayout());
            pnl_input.add(list_pnl_category[i]);

            list_input_category[i]=new JTextField();
            list_input_category[i].setBackground(null);
            list_input_category[i].setBorder(new MatteBorder(0, 0, 3, 0, new Color(0, 0, 60)));
            list_input_category[i].setPreferredSize(new Dimension(150, 20));
            list_pnl_category[i].add(list_input_category[i]);
        }
        list_pnl_category[0].setBounds(205, 0, 180, 60);//name
        list_pnl_category[1].setBounds(20, 60, 180, 60);//description
        
        //id
        lbl_id_category=new JLabel();
        lbl_id_category.setBounds(20, 0, 180, 60);
        lbl_id_category.setBackground(null);
        lbl_id_category.setBorder(BorderFactory.createTitledBorder("ID"));
        lbl_id_category.setEnabled(false);
        pnl_input.add(lbl_id_category);
        
        pnl_congcu=new JPanel();
        pnl_congcu.setBounds(560, 5, 140, 180);
        pnl_congcu.setBackground(null);
        pnl_input.add(pnl_congcu);
        
        //cong cu
        for(int i=0;i<btn_congcu.length;i++){           
            ds_lbl_congcu[i]=new JLabel(btn_congcu[i],JLabel.CENTER);
            ds_lbl_congcu[i].setBackground(new Color(0, 0, 60));
            ds_lbl_congcu[i].setOpaque(true);
            ds_lbl_congcu[i].setForeground(Color.white);
            ds_lbl_congcu[i].setPreferredSize(new Dimension(100, 40));
            pnl_congcu.add(ds_lbl_congcu[i]);
        }
        ds_lbl_congcu[4].setVisible(false);
        
        // xu ly su kien them
        ds_lbl_congcu[0].addMouseListener(new BtnAddCategoryNHListener(this));
        // xu ly su kien sua
        ds_lbl_congcu[1].addMouseListener(new BtnEditCategoryNHListener(this));
        // xu ly su kien xoa
        ds_lbl_congcu[2].addMouseListener(new BtnDeleteCategoryNHListener(this));
        // xu ly su kien lam moi
        ds_lbl_congcu[3].addMouseListener(new BtnResetCategoryNHListener(this));
        // xu ly su kien huy bo
        ds_lbl_congcu[4].addMouseListener(new BtnCancelCategoryNHListener(this));

        //tim kiem
        pnl_search_border=new JPanel();
        pnl_search_border.setBackground(null);
        pnl_search_border.setBorder(new MatteBorder(2, 0, 0, 0, new Color(0, 0, 60)));
        pnl_search_border.setBounds(0, 190, 700, 70);
        pnl_input.add(pnl_search_border);
        
        pnl_search=new JPanel();
        pnl_search.setPreferredSize(new Dimension(280,60));
        pnl_search.setBackground(null);
        pnl_search.setBorder(BorderFactory.createTitledBorder("Tìm kiếm tên sản phẩm"));
        pnl_search_border.add(pnl_search);

        input_search=new JTextField();
        input_search.setPreferredSize(new Dimension(260, 30));
        input_search.setBackground(null);
        input_search.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(0, 0, 60)));
        pnl_search.add(input_search);

        lbl_search=new JLabel("Tìm kiếm",JLabel.CENTER);
        lbl_search.setBackground(new Color(0, 0, 60));
        lbl_search.setOpaque(true);
        lbl_search.setForeground(Color.white);
        lbl_search.setPreferredSize(new Dimension(100, 40));
        pnl_search_border.add(lbl_search);
        // xu ly su kien tim kiem
        lbl_search.addMouseListener(new BtnSearchCategoryNHListener(this));
    }

    private void categoryTable(){
        String[] colum={"ID","Name","Description"};
        table_model_category=new DefaultTableModel(null, colum);
        table_category=new JTable();
        table_category.setModel(table_model_category);
        table_category.setRowHeight(30);
        table_category.setGridColor(new Color(0, 0, 60));
        table_category.setAutoCreateRowSorter(true);
        table_category.getTableHeader().setBackground(new Color(0, 0, 60));
        table_category.getTableHeader().setForeground(Color.white);
        table_category.setPreferredScrollableViewportSize(new Dimension(970, 320));
        pnl_information.add(new JScrollPane(table_category));   
        table_category.addMouseListener(new TableCategoryNHListener(this));
        loadCategory();
    }
        
    public void loadCategory(){
        table_model_category.setRowCount(0);
        List categoryList = categoryBLL.loadCategory();
        Object[][] data = categoryBLL.convertList(categoryList);
        for (Object[] row : data) {
            table_model_category.addRow(row);
        }
    }
    
    public void setNullAllInput(){
        for(int i=0; i<title_info_category.length;i++){
            list_input_category[i].setText(null);   
        }
    }
    
    public boolean checkDataInput(){
        if ("".equals(list_input_category[0].getText())) {
            JOptionPane.showMessageDialog(null, "Please enter 'Name'");
            return false;
        }
        return true;
    }

}
