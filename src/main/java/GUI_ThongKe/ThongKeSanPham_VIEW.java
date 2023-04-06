/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_ThongKe;

import BLL_ThongKe.ThongKeDoanhThu_BLL;
import BLL_ThongKe.Order;

import DAL.HibernateUtils;
import DAL.categoryDAL;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author trinh_hoang_phu
 */
public class ThongKeSanPham_VIEW {

    public JPanel pnl_input, pnl_tuongtac, top_content, pnl_contentbottom, pnl_information;
    public JPanel jPanel_LuaChonNgayThangNam;
    public JPanel jPanel_LuaChonNgayThangNamKetThuc;
    public JPanel jPanel_LuaChonJRB;

    public String[] ngay = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
        "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    public String[] thang = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
    public String[] nam = {"2020", "2021", "2022", "2023"};
    public String[] column = {"Mã SP", "Loại SP", "Tên SP", "Giá", "Đơn vị tính", "Số lượng đã bán"};
    public String[][] data = {};

    public JComboBox jComboBox_Ngay;
    public JComboBox jComboBox_Thang;
    public JComboBox jComboBox_Nam;
    public JComboBox jComboBox_NgayKetThuc;
    public JComboBox jComboBox_ThangKetThuc;
    public JComboBox jComboBox_NamKetThuc;

    public JLabel jLabel_Ngay;
    public JLabel jlabel_Thang;
    public JLabel jLabel_Nam;
    public JLabel jLabel_NgayKetThuc;
    public JLabel jlabel_ThangKetThuc;
    public JLabel jLabel_NamKetThuc;
    public JLabel jLabel_ButtonThongKe;

    public JRadioButton jrb_TheoNgay;
    public JRadioButton jrb_TheoKhoangNgay;

    public ButtonGroup buttonGroup_LuaChonJRB;

    public DefaultTableModel defaultTableModel;

    public JTable jTable;

    public JScrollPane jScrollPane;

    ThongKeDoanhThu_BLL thongKeDoanhThu_BLL;

    public ThongKeSanPham_VIEW(JPanel pnl_input, JPanel pnl_tuongtac, JPanel top_content, JPanel pnl_contentbottom, JPanel pnl_information) {
        this.pnl_input = pnl_input;
        this.pnl_tuongtac = pnl_tuongtac;
        this.top_content = top_content;
        this.pnl_contentbottom = pnl_contentbottom;
        this.pnl_information = pnl_information;

        thongKeDoanhThu_BLL = new ThongKeDoanhThu_BLL();

        this.init();
    }

    public void init() {
        ActionListener actionListener = new ThongKeSanPham_CONTROLLER(this);
        MouseListener mouseListener = new ThongKeSanPham_CONTROLLER(this);

        jLabel_Ngay = new JLabel("Chọn ngày", JLabel.CENTER);
        jComboBox_Ngay = new JComboBox(ngay);
        jComboBox_Ngay.setEnabled(false);
        jlabel_Thang = new JLabel("Chọn tháng", JLabel.CENTER);
        jComboBox_Thang = new JComboBox(thang);
        jComboBox_Thang.setEnabled(false);
        jLabel_Nam = new JLabel("Chọn năm", JLabel.CENTER);
        jComboBox_Nam = new JComboBox(nam);
        jComboBox_Nam.setEnabled(false);

        jPanel_LuaChonNgayThangNam = new JPanel();
        jPanel_LuaChonNgayThangNam.setLayout(new GridLayout(1, 6));
        jPanel_LuaChonNgayThangNam.setBackground(Color.WHITE);
        jPanel_LuaChonNgayThangNam.setBounds(0, 10, 680, 30);
        jPanel_LuaChonNgayThangNam.add(jLabel_Ngay);
        jPanel_LuaChonNgayThangNam.add(jComboBox_Ngay);
        jPanel_LuaChonNgayThangNam.add(jlabel_Thang);
        jPanel_LuaChonNgayThangNam.add(jComboBox_Thang);
        jPanel_LuaChonNgayThangNam.add(jLabel_Nam);
        jPanel_LuaChonNgayThangNam.add(jComboBox_Nam);

        jLabel_NgayKetThuc = new JLabel("Ngày kết thúc", JLabel.CENTER);
        jComboBox_NgayKetThuc = new JComboBox(ngay);
        jComboBox_NgayKetThuc.setEnabled(false);
        jlabel_ThangKetThuc = new JLabel("Tháng kết thúc", JLabel.CENTER);
        jComboBox_ThangKetThuc = new JComboBox(thang);
        jComboBox_ThangKetThuc.setEnabled(false);
        jLabel_NamKetThuc = new JLabel("Năm kết thúc", JLabel.CENTER);
        jComboBox_NamKetThuc = new JComboBox(nam);
        jComboBox_NamKetThuc.setEnabled(false);

        jPanel_LuaChonNgayThangNamKetThuc = new JPanel();
        jPanel_LuaChonNgayThangNamKetThuc.setLayout(new GridLayout(1, 6));
        jPanel_LuaChonNgayThangNamKetThuc.setBackground(Color.WHITE);
        jPanel_LuaChonNgayThangNamKetThuc.setBounds(0, 60, 680, 30);
        jPanel_LuaChonNgayThangNamKetThuc.add(jLabel_NgayKetThuc);
        jPanel_LuaChonNgayThangNamKetThuc.add(jComboBox_NgayKetThuc);
        jPanel_LuaChonNgayThangNamKetThuc.add(jlabel_ThangKetThuc);
        jPanel_LuaChonNgayThangNamKetThuc.add(jComboBox_ThangKetThuc);
        jPanel_LuaChonNgayThangNamKetThuc.add(jLabel_NamKetThuc);
        jPanel_LuaChonNgayThangNamKetThuc.add(jComboBox_NamKetThuc);

        jLabel_ButtonThongKe = new JLabel("Thống kê", JLabel.CENTER);
        jLabel_ButtonThongKe.setBackground(new Color(0, 0, 60));
        jLabel_ButtonThongKe.setForeground(Color.WHITE);
        jLabel_ButtonThongKe.setBounds(550, 160, 130, 50);
        jLabel_ButtonThongKe.setFont(new Font(null, Font.BOLD, 20));
        jLabel_ButtonThongKe.setOpaque(true);
        jLabel_ButtonThongKe.addMouseListener(mouseListener);

        jrb_TheoNgay = new JRadioButton("Theo ngày tháng năm");
        jrb_TheoNgay.setBackground(Color.WHITE);
        jrb_TheoNgay.addActionListener(actionListener);
        jrb_TheoKhoangNgay = new JRadioButton("Theo khoảng ngày");
        jrb_TheoKhoangNgay.setBackground(Color.WHITE);
        jrb_TheoKhoangNgay.addActionListener(actionListener);

        buttonGroup_LuaChonJRB = new ButtonGroup();
        buttonGroup_LuaChonJRB.add(jrb_TheoNgay);
        buttonGroup_LuaChonJRB.add(jrb_TheoKhoangNgay);

        jPanel_LuaChonJRB = new JPanel();
        jPanel_LuaChonJRB.setLayout(new FlowLayout(FlowLayout.LEFT));
        jPanel_LuaChonJRB.setBounds(10, 120, 680, 30);
        jPanel_LuaChonJRB.setBackground(Color.WHITE);
        jPanel_LuaChonJRB.add(jrb_TheoNgay);
        jPanel_LuaChonJRB.add(jrb_TheoKhoangNgay);

        defaultTableModel = new DefaultTableModel(data, column);

        jTable = new JTable();
        jTable.setModel(defaultTableModel);
        jTable.setRowHeight(20);
        jTable.setGridColor(Color.BLACK);
        jTable.setAutoCreateRowSorter(true);
        jTable.getTableHeader().setBackground(new Color(0, 0, 60));
        jTable.getTableHeader().setForeground(Color.white);
        jTable.setPreferredScrollableViewportSize(new Dimension(970, 320));
        jTable.setBounds(0, 0, 970, 320);

        jScrollPane = new JScrollPane(jTable);

        this.pnl_input.add(jPanel_LuaChonNgayThangNam);
        this.pnl_input.add(jPanel_LuaChonNgayThangNamKetThuc);
        this.pnl_input.add(jPanel_LuaChonJRB);
        this.pnl_input.add(jLabel_ButtonThongKe);

        this.pnl_information.add(jScrollPane);
//        load();

    }

    public void load() {
        defaultTableModel.setRowCount(0);

//        Session session = HibernateUtils.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//        Query<vegetable> query = session.createQuery("FROM vegetable WHERE VegetableID >= :categoryID");
//        query.setParameter("categoryID", 1);
//        List<vegetable> list = query.list();
//        transaction.commit();
//
//        session.close();
//        List<category> category;
//        Session session = HibernateUtils.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//        category = session.createQuery("FROM category", category.class).list();
//        transaction.commit();
//        Session session = HibernateUtils.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//        List<vegetable> list;
//        Query<vegetable> query = session.createQuery("FROM vegetable WHERE VegetableID >= : a ");
//        query.setParameter("a", 1);
//        list = query.list();
//        transaction.commit();
        List<Order> list = thongKeDoanhThu_BLL.getOrder();

        int rows = list.size();
        int cols = 3;
        Object[][] obj = new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            obj[i][0] = list.get(i).getOrderID();
            obj[i][1] = list.get(i).getTotal();
            obj[i][2] = list.get(i).getOrderID();

        }
        for (Object[] objects : obj) {
            defaultTableModel.addRow(objects);
        }
        this.pnl_information.repaint();
        this.pnl_information.validate();
    }

}
