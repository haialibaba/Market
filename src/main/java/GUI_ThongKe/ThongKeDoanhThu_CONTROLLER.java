/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_ThongKe;

import BLL_ThongKe.ThongKeDoanhThu_BLL;
import BLL_ThongKe.Order;
import BLL_ThongKe.Orderdetail;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author trinh_hoang_phu
 */
public class ThongKeDoanhThu_CONTROLLER implements ActionListener, MouseListener {

    ThongKeDoanhThu_VIEW ThongKeDoanhThu_VIEW;
    ThongKeDoanhThu_BLL thongKeDoanhThu_BLL;
    int ngay;
    int thang;
    int nam;
    int ngayKetThuc;
    int thangKetThuc;
    int namKetThuc;
    Object[][] obj;
    Map<Object, Double> thongTinNgay;
    Map<Object, Double> tienVon_Map;
    Map<Object, Double> tienLai_Map;

    public ThongKeDoanhThu_CONTROLLER(ThongKeDoanhThu_VIEW ThongKeDoanhThu_VIEW) {
        this.ThongKeDoanhThu_VIEW = ThongKeDoanhThu_VIEW;
        this.thongKeDoanhThu_BLL = new ThongKeDoanhThu_BLL();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.ThongKeDoanhThu_VIEW.jComboBox_Ngay.setEnabled(false);
        this.ThongKeDoanhThu_VIEW.jComboBox_Thang.setEnabled(false);
        this.ThongKeDoanhThu_VIEW.jComboBox_Nam.setEnabled(false);
        this.ThongKeDoanhThu_VIEW.jComboBox_NgayKetThuc.setEnabled(false);
        this.ThongKeDoanhThu_VIEW.jComboBox_ThangKetThuc.setEnabled(false);
        this.ThongKeDoanhThu_VIEW.jComboBox_NamKetThuc.setEnabled(false);
        this.ThongKeDoanhThu_VIEW.jComboBox_Ngay.setSelectedIndex(0);
        this.ThongKeDoanhThu_VIEW.jComboBox_Thang.setSelectedIndex(0);
        this.ThongKeDoanhThu_VIEW.jComboBox_Nam.setSelectedIndex(0);
        this.ThongKeDoanhThu_VIEW.jComboBox_NgayKetThuc.setSelectedIndex(0);
        this.ThongKeDoanhThu_VIEW.jComboBox_ThangKetThuc.setSelectedIndex(0);
        this.ThongKeDoanhThu_VIEW.jComboBox_NamKetThuc.setSelectedIndex(0);
        if (this.ThongKeDoanhThu_VIEW.jrb_TheoNgayTrongThang.isSelected()) {
            this.ThongKeDoanhThu_VIEW.jComboBox_Thang.setEnabled(true);
            this.ThongKeDoanhThu_VIEW.jComboBox_Nam.setEnabled(true);
        } else if (this.ThongKeDoanhThu_VIEW.jrb_TheoThangTrongNam.isSelected()) {
            this.ThongKeDoanhThu_VIEW.jComboBox_Nam.setEnabled(true);
        } else if (this.ThongKeDoanhThu_VIEW.jrb_TheoNam.isSelected()) {

        } else if (this.ThongKeDoanhThu_VIEW.jrb_TheoKhoangNgay.isSelected()) {
            this.ThongKeDoanhThu_VIEW.jComboBox_Ngay.setEnabled(true);
            this.ThongKeDoanhThu_VIEW.jComboBox_Thang.setEnabled(true);
            this.ThongKeDoanhThu_VIEW.jComboBox_Nam.setEnabled(true);
            this.ThongKeDoanhThu_VIEW.jComboBox_NgayKetThuc.setEnabled(true);
            this.ThongKeDoanhThu_VIEW.jComboBox_ThangKetThuc.setEnabled(true);
            this.ThongKeDoanhThu_VIEW.jComboBox_NamKetThuc.setEnabled(true);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.ThongKeDoanhThu_VIEW.defaultTableModel.setRowCount(0);
        this.ngay = Integer.valueOf((String) this.ThongKeDoanhThu_VIEW.jComboBox_Ngay.getSelectedItem());
        this.thang = Integer.valueOf((String) this.ThongKeDoanhThu_VIEW.jComboBox_Thang.getSelectedItem());
        this.nam = Integer.valueOf((String) this.ThongKeDoanhThu_VIEW.jComboBox_Nam.getSelectedItem());
        this.ngayKetThuc = Integer.valueOf((String) this.ThongKeDoanhThu_VIEW.jComboBox_NgayKetThuc.getSelectedItem());
        this.thangKetThuc = Integer.valueOf((String) this.ThongKeDoanhThu_VIEW.jComboBox_ThangKetThuc.getSelectedItem());
        this.namKetThuc = Integer.valueOf((String) this.ThongKeDoanhThu_VIEW.jComboBox_NamKetThuc.getSelectedItem());

        thongTinNgay = new HashMap<Object, Double>();
        tienVon_Map = new HashMap<Object, Double>();
        tienLai_Map = new HashMap<Object, Double>();

        List<Order> list = this.thongKeDoanhThu_BLL.getOrder();
        int rows = list.size();
        int cols = 12;
        obj = new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            obj[i][0] = list.get(i).getOrderID();
            obj[i][1] = list.get(i).getDate();
            obj[i][2] = list.get(i).getTotal();
            obj[i][3] = list.get(i).getDate().getDate();
            obj[i][4] = list.get(i).getDate().getMonth() + 1;
            obj[i][5] = list.get(i).getDate().getYear() + 1900;
            obj[i][6] = (list.get(i).getDate().getMonth() + 1) + "-" + (list.get(i).getDate().getYear() + 1900);
            obj[i][8] = (double) 0;
            obj[i][9] = (double) 0;
            obj[i][10] = (double) 0;
            double tongTienVon = 0;
            Map<Object, Double> loaiSp = new HashMap<Object, Double>();
            for (Orderdetail object : list.get(i).getOrderdetails()) {
                Object catagoryID = object.getVegetable().getCategory().getCatagoryID();
                Object vegetable_Price = object.getVegetable().getPrice();
                Object quantity = object.getQuantity();

                tongTienVon = tongTienVon + ((int) quantity) * ((double) ((Float) vegetable_Price));
                System.out.println(tongTienVon);
                Object price = object.getPrice();
                double price2 = (double) ((Float) price);
                if (loaiSp.containsKey(catagoryID)) {
                    Double tongTien = loaiSp.get(catagoryID);
                    loaiSp.put(catagoryID, tongTien + price2);
                } else {
                    loaiSp.put(catagoryID, price2);
                }
            }
            obj[i][7] = tongTienVon;
            obj[i][11] = (double) ((Float) obj[i][2]) - (double) obj[i][7];
            System.out.println(obj[i][11]);
            for (Map.Entry<Object, Double> entry : loaiSp.entrySet()) {
                Object key = entry.getKey();
                int key2 = (int) key;
                Object val = entry.getValue();
                if (key2 == 1) {
                    obj[i][8] = val;
                } else if (key2 == 2) {
                    obj[i][9] = val;
                } else if (key2 == 3) {
                    obj[i][10] = val;
                }
            }
        }
        if (this.ThongKeDoanhThu_VIEW.jrb_TheoNgayTrongThang.isSelected()) {
            for (Object[] ngay : obj) {
                double doanhThu = (double) ((Float) ngay[2]);
                double tienVon = (double) ngay[7];
                double tienLai = (double) ngay[11];
                if (this.thang == (int) ngay[4] && this.nam == (int) ngay[5]) {
                    map(thongTinNgay, tienVon_Map, tienLai_Map, ngay, doanhThu, tienVon, tienLai);
                }
            }
            int rows2 = thongTinNgay.size();
            Object[][] obj2 = new Object[rows2][cols];
            int i = 0;
            for (Map.Entry<Object, Double> entry : thongTinNgay.entrySet()) {
                obj2[i][0] = i + 1;
                obj2[i][1] = entry.getKey();
                obj2[i][4] = entry.getValue();
                i++;
            }
            i = 0;
            for (Map.Entry<Object, Double> entry : tienVon_Map.entrySet()) {
                obj2[i][2] = entry.getValue();
                i++;
            }
            i = 0;
            for (Map.Entry<Object, Double> entry : tienLai_Map.entrySet()) {
                obj2[i][3] = entry.getValue();
                i++;
            }
            for (Object[] objects : obj2) {
                this.ThongKeDoanhThu_VIEW.defaultTableModel.addRow(objects);
            }
            this.ThongKeDoanhThu_VIEW.pnl_information.repaint();
            this.ThongKeDoanhThu_VIEW.pnl_information.validate();
        } else if (this.ThongKeDoanhThu_VIEW.jrb_TheoThangTrongNam.isSelected()) {
            for (Object[] ngay : obj) {
                double doanhThu = (double) ((Float) ngay[2]);
                double tienVon = (double) ngay[7];
                double tienLai = (double) ngay[11];
                if (this.nam == (int) ngay[5]) {
                    if (thongTinNgay.containsKey(ngay[6])) {
                        Double tongTien = thongTinNgay.get(ngay[6]);
                        Double tongTienVon = tienVon_Map.get(ngay[6]);
                        Double tongTienLai = tienLai_Map.get(ngay[6]);
                        thongTinNgay.put(ngay[6], tongTien + doanhThu);
                        tienVon_Map.put(ngay[6], tongTienVon + tienVon);
                        tienLai_Map.put(ngay[6], tongTienLai + tienLai);
                    } else {
                        thongTinNgay.put(ngay[6], doanhThu);
                        tienVon_Map.put(ngay[6], tienVon);
                        tienLai_Map.put(ngay[6], tienLai);
                    }
                }
            }
            int rows2 = thongTinNgay.size();
            Object[][] obj2 = new Object[rows2][cols];
            int i = 0;
            for (Map.Entry<Object, Double> entry : thongTinNgay.entrySet()) {
                obj2[i][0] = i + 1;
                obj2[i][1] = entry.getKey();
                obj2[i][4] = entry.getValue();
                i++;
            }
            i = 0;
            for (Map.Entry<Object, Double> entry : tienVon_Map.entrySet()) {
                obj2[i][2] = entry.getValue();
                i++;
            }
            i = 0;
            for (Map.Entry<Object, Double> entry : tienLai_Map.entrySet()) {
                obj2[i][3] = entry.getValue();
                i++;
            }
            for (Object[] objects : obj2) {
                this.ThongKeDoanhThu_VIEW.defaultTableModel.addRow(objects);
            }
            this.ThongKeDoanhThu_VIEW.pnl_information.repaint();
            this.ThongKeDoanhThu_VIEW.pnl_information.validate();
        } else if (this.ThongKeDoanhThu_VIEW.jrb_TheoNam.isSelected()) {
            for (Object[] ngay : obj) {
                double doanhThu = (double) ((Float) ngay[2]);
                double tienVon = (double) ngay[7];
                double tienLai = (double) ngay[11];
                if (thongTinNgay.containsKey(ngay[5])) {
                    Double tongTien = thongTinNgay.get(ngay[5]);
                    Double tongTienVon = tienVon_Map.get(ngay[5]);
                    Double tongTienLai = tienLai_Map.get(ngay[5]);
                    thongTinNgay.put(ngay[5], tongTien + doanhThu);
                    tienVon_Map.put(ngay[5], tongTienVon + tienVon);
                    tienLai_Map.put(ngay[5], tongTienLai + tienLai);
                } else {
                    thongTinNgay.put(ngay[5], doanhThu);
                    tienVon_Map.put(ngay[5], tienVon);
                    tienLai_Map.put(ngay[5], tienLai);
                }
            }
            int rows2 = thongTinNgay.size();
            Object[][] obj2 = new Object[rows2][cols];
            int i = 0;
            for (Map.Entry<Object, Double> entry : thongTinNgay.entrySet()) {
                obj2[i][0] = i + 1;
                obj2[i][1] = entry.getKey();
                obj2[i][4] = entry.getValue();
                i++;
            }
            i = 0;
            for (Map.Entry<Object, Double> entry : tienVon_Map.entrySet()) {
                obj2[i][2] = entry.getValue();
                i++;
            }
            i = 0;
            for (Map.Entry<Object, Double> entry : tienLai_Map.entrySet()) {
                obj2[i][3] = entry.getValue();
                i++;
            }
            for (Object[] objects : obj2) {
                this.ThongKeDoanhThu_VIEW.defaultTableModel.addRow(objects);
            }
            this.ThongKeDoanhThu_VIEW.pnl_information.repaint();
            this.ThongKeDoanhThu_VIEW.pnl_information.validate();
        } else if (this.ThongKeDoanhThu_VIEW.jrb_TheoKhoangNgay.isSelected()) {
            int dem = 0;
            if (this.nam < this.namKetThuc) {
                dem++;
            } else if (this.nam == this.namKetThuc) {
                if (this.thang < this.thangKetThuc) {
                    dem++;
                } else if (this.thang == this.thangKetThuc) {
                    if (this.ngay < this.ngayKetThuc) {
                        dem++;
                    } else if (this.ngay == this.ngayKetThuc) {
                        dem++;
                    }
                }
            }

            if (dem > 0) {
                for (Object[] ngay : obj) {
                    double doanhThu = (double) ((Float) ngay[2]);
                    double tienVon = (double) ngay[7];
                    double tienLai = (double) ngay[11];
                    if (this.nam < (int) ngay[5] && (int) ngay[5] < this.namKetThuc) {
                        map(thongTinNgay, tienVon_Map, tienLai_Map, ngay, doanhThu, tienVon, tienLai);
                    }
                    if (this.nam == (int) ngay[5] && (int) ngay[5] == this.namKetThuc) {
                        if (this.thang < (int) ngay[4] && (int) ngay[4] < this.thangKetThuc) {
                            map(thongTinNgay, tienVon_Map, tienLai_Map, ngay, doanhThu, tienVon, tienLai);
                        }
                        if (this.thang == (int) ngay[4] && (int) ngay[4] == this.thangKetThuc) {
                            if (this.ngay <= (int) ngay[3] && (int) ngay[3] <= this.ngayKetThuc) {
                                map(thongTinNgay, tienVon_Map, tienLai_Map, ngay, doanhThu, tienVon, tienLai);
                            }
                        } else {
                            if (this.thang == (int) ngay[4]) {
                                if (this.ngay <= (int) ngay[3]) {
                                    map(thongTinNgay, tienVon_Map, tienLai_Map, ngay, doanhThu, tienVon, tienLai);
                                }
                            }
                            if ((int) ngay[4] == this.thangKetThuc) {
                                if ((int) ngay[3] <= this.ngayKetThuc) {
                                    map(thongTinNgay, tienVon_Map, tienLai_Map, ngay, doanhThu, tienVon, tienLai);
                                }
                            }
                        }
                    } else {
                        if (this.nam == (int) ngay[5]) {
                            if (this.thang < (int) ngay[4]) {
                                map(thongTinNgay, tienVon_Map, tienLai_Map, ngay, doanhThu, tienVon, tienLai);
                            }
                            if (this.thang == (int) ngay[4]) {
                                if (this.ngay <= (int) ngay[3]) {
                                    map(thongTinNgay, tienVon_Map, tienLai_Map, ngay, doanhThu, tienVon, tienLai);
                                }
                            }
                        }
                        if ((int) ngay[5] == this.namKetThuc) {
                            if ((int) ngay[4] < this.thangKetThuc) {
                                map(thongTinNgay, tienVon_Map, tienLai_Map, ngay, doanhThu, tienVon, tienLai);
                            }
                            if ((int) ngay[4] == this.thangKetThuc) {
                                if ((int) ngay[3] <= this.ngayKetThuc) {
                                    map(thongTinNgay, tienVon_Map, tienLai_Map, ngay, doanhThu, tienVon, tienLai);
                                }
                            }
                        }
                    }
                }
            }
            int rows2 = thongTinNgay.size();
            Object[][] obj2 = new Object[rows2][cols];
            int i = 0;
            for (Map.Entry<Object, Double> entry : thongTinNgay.entrySet()) {
                obj2[i][0] = i + 1;
                obj2[i][1] = entry.getKey();
                obj2[i][4] = entry.getValue();
                i++;
            }
            i = 0;
            for (Map.Entry<Object, Double> entry : tienVon_Map.entrySet()) {
                obj2[i][2] = entry.getValue();
                i++;
            }
            i = 0;
            for (Map.Entry<Object, Double> entry : tienLai_Map.entrySet()) {
                obj2[i][3] = entry.getValue();
                i++;
            }
            for (Object[] objects : obj2) {
                this.ThongKeDoanhThu_VIEW.defaultTableModel.addRow(objects);
            }
            this.ThongKeDoanhThu_VIEW.pnl_information.repaint();
            this.ThongKeDoanhThu_VIEW.pnl_information.validate();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void map(Map<Object, Double> thongTinNgay
            , Map<Object, Double> tienVon_Map
            , Map<Object, Double> tienLai_Map
            , Object[] ngay
            , double doanhThu
            , double tienVon
            , double tienLai) {
        if (thongTinNgay.containsKey(ngay[1])) {
            Double tongTien = thongTinNgay.get(ngay[1]);
            Double tongTienVon = tienVon_Map.get(ngay[1]);
            Double tongTienLai = tienLai_Map.get(ngay[1]);
            thongTinNgay.put(ngay[1], tongTien + doanhThu);
            tienVon_Map.put(ngay[1], tongTienVon + tienVon);
            tienLai_Map.put(ngay[1], tongTienLai + tienLai);
        } else {
            thongTinNgay.put(ngay[1], doanhThu);
            tienVon_Map.put(ngay[1], tienVon);
            tienLai_Map.put(ngay[1], tienLai);
        }
    }
}
