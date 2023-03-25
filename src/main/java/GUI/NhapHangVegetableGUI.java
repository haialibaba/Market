package GUI;

import BLL.categoryBLL;
import BLL.vegetableBLL;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

public class NhapHangVegetableGUI {
    
    JPanel pnl_input,pnl_tuongtac,top_content,pnl_contentbottom,pnl_information;
    public  JPanel pnl_congcu,pnl_tk_nv,pnl_tkborder;
    public  String[] title_ifm_nv={"Name","Unit","Amount","Price"};
    public  JPanel[] ds_pnl_nv=new JPanel[title_ifm_nv.length];
    public  JTextField[] ds_input_nv= new JTextField[title_ifm_nv.length];
    
    public  String[] btn_congcu={"ADD","EDIT","DELETE","RESET","CANCEL"};
    public  JLabel[] ds_lbl_congcu=new JLabel[btn_congcu.length];
    
    public  JLabel lbl_timkiem_nv,lbl_idnv,lbl_anhnv,lbl_btnaddNV,lbl_imgnv;
    public  JTextField txt_timkiem_nv;
    
    public  JComboBox cb_categoryFilter, cb_categoryInput;
            
    public  JTable tbl_nv;
    public  DefaultTableModel tblm;
    
    public JLabel anh;
    public ImageIcon anhnv;
    public Image ic;
    public int trangthai=0;
    
    public String idnv;
    vegetableBLL vegetableBLL = new vegetableBLL();
    categoryBLL categoryBLL = new categoryBLL();

    List listCategory = categoryBLL.loadCategory();
    
    public NhapHangVegetableGUI(JPanel pnl_input, JPanel pnl_tuongtac, JPanel top_content,
            JPanel pnl_information,JPanel pnl_contentbottom) {
        this.pnl_input = pnl_input;//
        this.pnl_tuongtac = pnl_tuongtac;//
        this.top_content = top_content;
        this.pnl_congcu = pnl_congcu;//
        this.pnl_information = pnl_information;//
        this.pnl_contentbottom = pnl_contentbottom;
        init();
    }
    public void init(){
        congcu();
        nhanvienTBL();
    }
  
    public void congcu(){
        for(int i=0; i<title_ifm_nv.length;i++){
            ds_pnl_nv[i]=new JPanel();
            ds_pnl_nv[i].setBorder(BorderFactory.createTitledBorder(title_ifm_nv[i]));
            ds_pnl_nv[i].setBackground(null);
            ds_pnl_nv[i].setLayout(new FlowLayout());
            pnl_input.add(ds_pnl_nv[i]);

            ds_input_nv[i]=new JTextField();
            ds_input_nv[i].setBackground(null);
            ds_input_nv[i].setBorder(new MatteBorder(0, 0, 3, 0, new Color(0, 0, 60)));
            ds_input_nv[i].setPreferredSize(new Dimension(150, 20));
            ds_pnl_nv[i].add(ds_input_nv[i]);
        }
        ds_pnl_nv[0].setBounds(205, 0, 180, 60);//name
        ds_pnl_nv[1].setBounds(20, 60, 180, 60);//unit
        ds_pnl_nv[2].setBounds(205, 60, 180, 60);//amout
        ds_pnl_nv[3].setBounds(390, 60, 180, 60);//price

        lbl_idnv=new JLabel();
        lbl_idnv.setText(null);
        lbl_idnv.setBounds(20, 0, 180, 60);
        lbl_idnv.setBackground(null);
        lbl_idnv.setBorder(BorderFactory.createTitledBorder("ID"));
        lbl_idnv.setEnabled(false);
        pnl_input.add(lbl_idnv);

        lbl_imgnv=new JLabel("",JLabel.CENTER);
        lbl_imgnv.setBounds(20, 120, 180, 60);
        lbl_imgnv.setBackground(null);
        lbl_imgnv.setBorder(BorderFactory.createTitledBorder("Image"));
        pnl_input.add(lbl_imgnv);

        lbl_btnaddNV = new JLabel("",JLabel.CENTER);
        lbl_btnaddNV.setBackground(new Color(0, 0, 60));
        lbl_btnaddNV.setOpaque(true);
        lbl_btnaddNV.setText("Chọn Ảnh");
        lbl_btnaddNV.setForeground(Color.white);
        lbl_btnaddNV.setBounds(202, 148, 70, 30);
        pnl_input.add(lbl_btnaddNV);

        CategoryModel categoryInputCBModel = new CategoryModel(
                categoryBLL.convertList1(listCategory));
        cb_categoryInput=new JComboBox(categoryInputCBModel);
        cb_categoryInput.setBounds(390, 0, 180, 60);
        cb_categoryInput.setBackground(null);
        cb_categoryInput.setBorder(BorderFactory.createTitledBorder("Category"));
        cb_categoryInput.setLightWeightPopupEnabled(true);
        pnl_input.add(cb_categoryInput);
        
        //cong cu
        pnl_congcu=new JPanel();
        pnl_congcu.setBounds(560, 5, 140, 180);
        pnl_congcu.setBackground(null);
        pnl_input.add(pnl_congcu);

        for(int i=0;i<btn_congcu.length;i++){           
            ds_lbl_congcu[i]=new JLabel(btn_congcu[i],JLabel.CENTER);
            ds_lbl_congcu[i].setBackground(new Color(0, 0, 60));
            ds_lbl_congcu[i].setOpaque(true);
            ds_lbl_congcu[i].setForeground(Color.white);
            ds_lbl_congcu[i].setPreferredSize(new Dimension(100, 40));
            pnl_congcu.add(ds_lbl_congcu[i]);
        }
        
        // xu ly su kien them
        ds_lbl_congcu[0].addMouseListener(new BtnAddVegetableNHListener(this));
        // xu ly su kien sua
        ds_lbl_congcu[1].addMouseListener(new BtnEditVegetableNHListener(this));
        // xu ly su kien xoa
        ds_lbl_congcu[2].addMouseListener(new BtnDeleteVegetableNHListener(this));
        // xu ly su kien lam moi
        ds_lbl_congcu[3].addMouseListener(new BtnResetVegetableNHListener(this));
        // xu ly su kien huy bo
        ds_lbl_congcu[4].addMouseListener(new BtnCancelVegetableNHListener(this));
        
        //tim kiem
        pnl_tkborder=new JPanel();
        pnl_tkborder.setBackground(null);
        pnl_tkborder.setBorder(new MatteBorder(2, 0, 0, 0, new Color(0, 0, 60)));
        pnl_tkborder.setBounds(0, 190, 700, 70);
        pnl_input.add(pnl_tkborder);

        pnl_tk_nv=new JPanel();
        pnl_tk_nv.setPreferredSize(new Dimension(280,60));
        pnl_tk_nv.setBackground(null);
        pnl_tk_nv.setBorder(BorderFactory.createTitledBorder("Search by name"));
        pnl_tkborder.add(pnl_tk_nv);

        txt_timkiem_nv=new JTextField();
        txt_timkiem_nv.setPreferredSize(new Dimension(260, 30));
        txt_timkiem_nv.setBackground(null);
        txt_timkiem_nv.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(0, 0, 60)));
        pnl_tk_nv.add(txt_timkiem_nv);

        lbl_timkiem_nv=new JLabel("SEARCH",JLabel.CENTER);
        lbl_timkiem_nv.setBackground(new Color(0, 0, 60));
        lbl_timkiem_nv.setOpaque(true);
        lbl_timkiem_nv.setForeground(Color.white);
        lbl_timkiem_nv.setPreferredSize(new Dimension(100, 40));
        pnl_tkborder.add(lbl_timkiem_nv);
        
        // xu ly su kien tim kiem
        lbl_timkiem_nv.addMouseListener(new BtnSearchVegetableNHListener(this));
    }

    public void inner_img(ImageIcon icon){
        pnl_tuongtac.removeAll();
        lbl_anhnv=new JLabel(icon,JLabel.CENTER);
        lbl_anhnv.setBounds(0, 0, 260, 260);
        pnl_tuongtac.add(lbl_anhnv);
        pnl_tuongtac.repaint();
        pnl_tuongtac.validate();
    }

    public void nhanvienTBL(){
        String[] colum={"ID","Name","Category","Unit","Amount","Price"};
        tblm=new DefaultTableModel(null, colum);
        tbl_nv=new JTable();
        tbl_nv.setModel(tblm);
        tbl_nv.setRowHeight(30);
        tbl_nv.setGridColor(new Color(0, 0, 60));
        tbl_nv.setAutoCreateRowSorter(true);
        tbl_nv.getTableHeader().setBackground(new Color(0, 0, 60));
        tbl_nv.getTableHeader().setForeground(Color.white);
        tbl_nv.setPreferredScrollableViewportSize(new Dimension(970, 320));
        pnl_information.add(new JScrollPane(tbl_nv));   
        tbl_nv.addMouseListener(new TableVegetableNHListener(this));
        inner_combobox_vegeType();
        //load all vegetable
        loadNV(vegetableBLL.loadAllVegetable());
    }
        
    public void loadNV(List list){
        Object[][] data = vegetableBLL.converVegetable(list);
        tblm.setRowCount(0);
        for (Object[] row : data) {
            tblm.addRow(row);
        }
    }
    public void inner_combobox_vegeType(){
        CategoryModel categoryFilterCBModel = new CategoryModel(
                categoryBLL.convertList1(listCategory));
        cb_categoryFilter=new JComboBox(categoryFilterCBModel);
        cb_categoryFilter.insertItemAt("All Category", 0);
        cb_categoryFilter.setSelectedItem("All Category");
        cb_categoryFilter.setBounds(0, 0, 150, 60);
        cb_categoryFilter.setLightWeightPopupEnabled(true);
        pnl_tkborder.add(cb_categoryFilter);
        cb_categoryFilter.addActionListener((ActionEvent e) -> {
            String name = txt_timkiem_nv.getText();
            Object categoryObject = cb_categoryFilter.getModel().getSelectedItem();
            List list = vegetableBLL.searchVegetable(name, categoryObject);
            loadNV(list);
        });   
    }
    
    public void setNullAllInput(){
        for(int i=0; i<title_ifm_nv.length;i++){
            ds_input_nv[i].setText(null);
        }
    }
    
    public void setNullAllInfo(){
        for(int i=0; i<title_ifm_nv.length;i++){
            ds_input_nv[i].setText(null);
        }
        lbl_idnv.setText(null);
        lbl_imgnv.setText(null);
    }
    
    public boolean checkDataInput(){
        if ("".equals(ds_input_nv[0].getText())) {
            JOptionPane.showMessageDialog(null, "Please enter 'Name'!");
            return false;
        }
        if ("".equals(ds_input_nv[1].getText())) {
            JOptionPane.showMessageDialog(null, "Please enter 'Unit'!");
            return false;
        }
        if ("".equals(ds_input_nv[2].getText())) {
            JOptionPane.showMessageDialog(null, "Please enter 'Amount'!");
            return false;
        }
        if(!(vegetableBLL.isNumber((String)ds_input_nv[2].getText()))){
            JOptionPane.showMessageDialog(null, "'Amount' must be number!");
            return false;
        }
        if ("".equals(ds_input_nv[3].getText())) {
            JOptionPane.showMessageDialog(null, "Please enter 'Price'!");
            return false;
        }
//        if(!(vegetableBLL.isNumber((String)ds_input_nv[3].getText()))){
//            JOptionPane.showMessageDialog(null, "'Price' must be number!");
//            return false;
//        }
        if ("".equals(lbl_imgnv.getText())) {
            JOptionPane.showMessageDialog(null, "Please enter 'Image'!");
            return false;
        }
        return true;
    }
}
