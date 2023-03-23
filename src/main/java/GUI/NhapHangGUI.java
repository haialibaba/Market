package GUI;

import BLL.categoryBLL;
import BLL.vegetableBLL;
import DAL.category;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

public class NhapHangGUI {
    
    JPanel pnl_input,pnl_tuongtac,top_content,pnl_contentbottom,pnl_information;
    public  JPanel pnl_congcu,pnl_tk_nv,pnl_tkborder;
    public  String[] title_ifm_nv={"Name","Unit","Amount","Price"};
    public  JPanel[] ds_pnl_nv=new JPanel[title_ifm_nv.length];
    public  JTextField[] ds_input_nv= new JTextField[title_ifm_nv.length];
    
    public  String[] btn_congcu={"Thêm","Sửa","Xóa","Reset"};
    public  JLabel[] ds_lbl_congcu=new JLabel[btn_congcu.length];
    
    public  JLabel lbl_timkiem_nv,lbl_idnv,lbl_anhnv,lbl_btnaddNV,lbl_imgnv;
    public  JTextField txt_timkiem_nv;
    
    public  JComboBox cb_categoryFilter, cb_categoryInput;
            
    public  JTable tbl_nv;
    public  DefaultTableModel tblm;
    
    public JLabel anh;
    public ImageIcon anhnv;
    public Image ic;
    
    public String idnv;
    vegetableBLL vegBLL = new vegetableBLL();
    categoryBLL cateBLL = new categoryBLL();

    
    category[] listCategory = cateBLL.convertList1(cateBLL.loadCategory());
    
    public NhapHangGUI(JPanel pnl_input, JPanel pnl_tuongtac, JPanel top_content,
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
            ds_input_nv[i].setPreferredSize(new Dimension(100, 20));
            ds_pnl_nv[i].add(ds_input_nv[i]);
        }
        ds_pnl_nv[0].setBounds(20, 60, 120, 60);
        ds_pnl_nv[1].setBounds(150, 60, 120, 60);
        ds_pnl_nv[2].setBounds(20, 120, 120, 60);
        ds_pnl_nv[3].setBounds(150, 120, 140, 60);

        lbl_idnv=new JLabel();
        lbl_idnv.setBounds(20, 0, 150, 60);
        lbl_idnv.setBackground(null);
        lbl_idnv.setBorder(BorderFactory.createTitledBorder("ID"));
        pnl_input.add(lbl_idnv);

        lbl_imgnv=new JLabel("",JLabel.CENTER);
        lbl_imgnv.setBounds(300, 120, 120, 60);
        lbl_imgnv.setBackground(null);
        lbl_imgnv.setBorder(BorderFactory.createTitledBorder("IMG"));
        pnl_input.add(lbl_imgnv);

        lbl_btnaddNV = new JLabel("",JLabel.CENTER);
        lbl_btnaddNV.setBackground(new Color(0, 0, 60));
        lbl_btnaddNV.setOpaque(true);
        lbl_btnaddNV.setText("Chọn Ảnh");
        lbl_btnaddNV.setForeground(Color.white);
        lbl_btnaddNV.setBounds(435, 137, 100, 40);
        pnl_input.add(lbl_btnaddNV);

        CategoryModel categoryInputCBModel = new CategoryModel(listCategory);
        cb_categoryInput=new JComboBox(categoryInputCBModel);
        cb_categoryInput.setBounds(150, 20, 150, 60);
        cb_categoryInput.setLightWeightPopupEnabled(true);
        pnl_input.add(cb_categoryInput);
        
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

        pnl_tkborder=new JPanel();
        pnl_tkborder.setBackground(null);
        pnl_tkborder.setBorder(new MatteBorder(2, 0, 0, 0, new Color(0, 0, 60)));
        pnl_tkborder.setBounds(0, 190, 700, 70);
        pnl_input.add(pnl_tkborder);

        pnl_tk_nv=new JPanel();
        pnl_tk_nv.setPreferredSize(new Dimension(280,60));
        pnl_tk_nv.setBackground(null);
        pnl_tk_nv.setBorder(BorderFactory.createTitledBorder("Tìm kiếm tên sản phẩm"));
        pnl_tkborder.add(pnl_tk_nv);

        txt_timkiem_nv=new JTextField();
        txt_timkiem_nv.setPreferredSize(new Dimension(260, 30));
        txt_timkiem_nv.setBackground(null);
        txt_timkiem_nv.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(0, 0, 60)));
        pnl_tk_nv.add(txt_timkiem_nv);

        lbl_timkiem_nv=new JLabel("Tìm kiếm",JLabel.CENTER);
        lbl_timkiem_nv.setBackground(new Color(0, 0, 60));
        lbl_timkiem_nv.setOpaque(true);
        lbl_timkiem_nv.setForeground(Color.white);
        lbl_timkiem_nv.setPreferredSize(new Dimension(100, 40));
        pnl_tkborder.add(lbl_timkiem_nv);
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
        MouseAdapter mls_tblVe=new mls_tableVe(this);
        tbl_nv.addMouseListener(mls_tblVe);
        inner_combobox_vegeType();
    }
        
    public void loadNV(int cateID){
        tblm.setRowCount(0);
        List vegetableList = cateBLL.getCategory(cateID).getListVegetable();
        Object[][] data = vegBLL.converVegetable(vegetableList);
        for (Object[] row : data) {
            tblm.addRow(row);
        }
    }
    public void inner_combobox_vegeType(){
        CategoryModel categoryFilterCBModel = new CategoryModel(listCategory);
        cb_categoryFilter=new JComboBox(categoryFilterCBModel);
        cb_categoryFilter.addItem("All");
        cb_categoryFilter.setSelectedItem("All");
        cb_categoryFilter.setBounds(0, 0, 150, 60);
        cb_categoryFilter.setLightWeightPopupEnabled(true);
        pnl_tkborder.add(cb_categoryFilter);
        cb_categoryFilter.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(!e.getItem().equals("All")){
                    category cate = (category) e.getItem(); 
                    int cateid = cate.getCatagoryID();
                    loadNV(cateid);
                }
            }
        });
        
     }
}
