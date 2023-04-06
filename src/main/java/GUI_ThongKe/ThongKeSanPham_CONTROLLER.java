/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_ThongKe;

import BLL_ThongKe.Order;
import BLL_ThongKe.Orderdetail;
import BLL_ThongKe.ThongKeDoanhThu_BLL;
import BLL_ThongKe.Vegetable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author trinh_hoang_phu
 */
public class ThongKeSanPham_CONTROLLER implements ActionListener, MouseListener {

    ThongKeSanPham_VIEW ThongKeSanPham_VIEW;
    ThongKeDoanhThu_BLL thongKeDoanhThu_BLL;
    int ngay;
    int thang;
    int nam;
    int ngayKetThuc;
    int thangKetThuc;
    int namKetThuc;
    Map<Object, Object[]> map_Key_VegetableID;
    Object[][] obj;

    public ThongKeSanPham_CONTROLLER(ThongKeSanPham_VIEW ThongKeSanPham_VIEW) {
        this.ThongKeSanPham_VIEW = ThongKeSanPham_VIEW;
        this.thongKeDoanhThu_BLL = new ThongKeDoanhThu_BLL();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.ThongKeSanPham_VIEW.jComboBox_Ngay.setEnabled(false);
        this.ThongKeSanPham_VIEW.jComboBox_Thang.setEnabled(false);
        this.ThongKeSanPham_VIEW.jComboBox_Nam.setEnabled(false);
        this.ThongKeSanPham_VIEW.jComboBox_NgayKetThuc.setEnabled(false);
        this.ThongKeSanPham_VIEW.jComboBox_ThangKetThuc.setEnabled(false);
        this.ThongKeSanPham_VIEW.jComboBox_NamKetThuc.setEnabled(false);
        this.ThongKeSanPham_VIEW.jComboBox_Ngay.setSelectedIndex(0);
        this.ThongKeSanPham_VIEW.jComboBox_Thang.setSelectedIndex(0);
        this.ThongKeSanPham_VIEW.jComboBox_Nam.setSelectedIndex(0);
        this.ThongKeSanPham_VIEW.jComboBox_NgayKetThuc.setSelectedIndex(0);
        this.ThongKeSanPham_VIEW.jComboBox_ThangKetThuc.setSelectedIndex(0);
        this.ThongKeSanPham_VIEW.jComboBox_NamKetThuc.setSelectedIndex(0);
        if (this.ThongKeSanPham_VIEW.jrb_TheoNgay.isSelected()) {
            this.ThongKeSanPham_VIEW.jComboBox_Ngay.setEnabled(true);
            this.ThongKeSanPham_VIEW.jComboBox_Thang.setEnabled(true);
            this.ThongKeSanPham_VIEW.jComboBox_Nam.setEnabled(true);
        } else if (this.ThongKeSanPham_VIEW.jrb_TheoKhoangNgay.isSelected()) {
            this.ThongKeSanPham_VIEW.jComboBox_Ngay.setEnabled(true);
            this.ThongKeSanPham_VIEW.jComboBox_Thang.setEnabled(true);
            this.ThongKeSanPham_VIEW.jComboBox_Nam.setEnabled(true);
            this.ThongKeSanPham_VIEW.jComboBox_NgayKetThuc.setEnabled(true);
            this.ThongKeSanPham_VIEW.jComboBox_ThangKetThuc.setEnabled(true);
            this.ThongKeSanPham_VIEW.jComboBox_NamKetThuc.setEnabled(true);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.ThongKeSanPham_VIEW.defaultTableModel.setRowCount(0);
        this.ngay = Integer.valueOf((String) this.ThongKeSanPham_VIEW.jComboBox_Ngay.getSelectedItem());
        this.thang = Integer.valueOf((String) this.ThongKeSanPham_VIEW.jComboBox_Thang.getSelectedItem());
        this.nam = Integer.valueOf((String) this.ThongKeSanPham_VIEW.jComboBox_Nam.getSelectedItem());
        this.ngayKetThuc = Integer.valueOf((String) this.ThongKeSanPham_VIEW.jComboBox_NgayKetThuc.getSelectedItem());
        this.thangKetThuc = Integer.valueOf((String) this.ThongKeSanPham_VIEW.jComboBox_ThangKetThuc.getSelectedItem());
        this.namKetThuc = Integer.valueOf((String) this.ThongKeSanPham_VIEW.jComboBox_NamKetThuc.getSelectedItem());
        List<Orderdetail> list = this.thongKeDoanhThu_BLL.getOrderdetail();
        map_Key_VegetableID = new HashMap<Object, Object[]>();
        int rows = list.size();
        int cols = 12;
        obj = new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            obj[i][1] = list.get(i).getOrder_data().getDate();
            obj[i][3] = list.get(i).getOrder_data().getDate().getDate();
            obj[i][4] = list.get(i).getOrder_data().getDate().getMonth() + 1;
            obj[i][5] = list.get(i).getOrder_data().getDate().getYear() + 1900;
            obj[i][2] = list.get(i).getVegetable().getVegetableID();
            obj[i][6] = list.get(i).getQuantity();
            obj[i][7] = list.get(i).getVegetable().getPrice();
            obj[i][8] = list.get(i).getVegetable().getVegetable_Name();
            obj[i][9] = list.get(i).getVegetable().getUnit();
            obj[i][10] = list.get(i).getVegetable().getCategory().getName();
        }
        if (this.ThongKeSanPham_VIEW.jrb_TheoNgay.isSelected()) {
            for (Object[] ngay : obj) {
                Object[] value = new Object[5];
                value[0] = ngay[6];
                value[1] = ngay[7];
                value[2] = ngay[8];
                value[3] = ngay[9];
                value[4] = ngay[10];
                if (this.thang == (int) ngay[4] && this.nam == (int) ngay[5] && this.ngay == (int) ngay[3]) {
                    map(map_Key_VegetableID, ngay, value);
                }
            }
            int rows2 = map_Key_VegetableID.size();
            Object[][] obj2 = new Object[rows2][cols];
            int i = 0;
            for (Map.Entry<Object, Object[]> entry : map_Key_VegetableID.entrySet()) {
                obj2[i][0] = entry.getKey();
                System.out.println(obj2[i][0]);
                obj2[i][1] = entry.getValue()[4];
                obj2[i][2] = entry.getValue()[2];
                obj2[i][3] = entry.getValue()[1];
                obj2[i][4] = entry.getValue()[3];
                obj2[i][5] = entry.getValue()[0];
                i++;
            }
            for (Object[] objects : obj2) {
                this.ThongKeSanPham_VIEW.defaultTableModel.addRow(objects);
            }
            this.ThongKeSanPham_VIEW.pnl_information.repaint();
            this.ThongKeSanPham_VIEW.pnl_information.validate();
        } else if (this.ThongKeSanPham_VIEW.jrb_TheoKhoangNgay.isSelected()) {
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
                    Object[] value = new Object[5];
                    value[0] = ngay[6];
                    value[1] = ngay[7];
                    value[2] = ngay[8];
                    value[3] = ngay[9];
                    value[4] = ngay[10];
                    if (this.nam < (int) ngay[5] && (int) ngay[5] < this.namKetThuc) {
                        map(map_Key_VegetableID, ngay, value);
                    }
                    if (this.nam == (int) ngay[5] && (int) ngay[5] == this.namKetThuc) {
                        if (this.thang < (int) ngay[4] && (int) ngay[4] < this.thangKetThuc) {
                            map(map_Key_VegetableID, ngay, value);
                        }
                        if (this.thang == (int) ngay[4] && (int) ngay[4] == this.thangKetThuc) {
                            if (this.ngay <= (int) ngay[3] && (int) ngay[3] <= this.ngayKetThuc) {
                                map(map_Key_VegetableID, ngay, value);
                            }
                        } else {
                            if (this.thang == (int) ngay[4]) {
                                if (this.ngay <= (int) ngay[3]) {
                                    map(map_Key_VegetableID, ngay, value);
                                }
                            }
                            if ((int) ngay[4] == this.thangKetThuc) {
                                if ((int) ngay[3] <= this.ngayKetThuc) {
                                    map(map_Key_VegetableID, ngay, value);
                                }
                            }
                        }
                    } else {
                        if (this.nam == (int) ngay[5]) {
                            if (this.thang < (int) ngay[4]) {
                                map(map_Key_VegetableID, ngay, value);
                            }
                            if (this.thang == (int) ngay[4]) {
                                if (this.ngay <= (int) ngay[3]) {
                                    map(map_Key_VegetableID, ngay, value);
                                }
                            }
                        }
                        if ((int) ngay[5] == this.namKetThuc) {
                            if ((int) ngay[4] < this.thangKetThuc) {
                                map(map_Key_VegetableID, ngay, value);
                            }
                            if ((int) ngay[4] == this.thangKetThuc) {
                                if ((int) ngay[3] <= this.ngayKetThuc) {
                                    map(map_Key_VegetableID, ngay, value);
                                }
                            }
                        }
                    }
                }
            }

            int rows2 = map_Key_VegetableID.size();
            Object[][] obj2 = new Object[rows2][cols];
            int i = 0;
            for (Map.Entry<Object, Object[]> entry : map_Key_VegetableID.entrySet()) {
                obj2[i][0] = entry.getKey();
                System.out.println(obj2[i][0]);
                obj2[i][1] = entry.getValue()[4];
                obj2[i][2] = entry.getValue()[2];
                obj2[i][3] = entry.getValue()[1];
                obj2[i][4] = entry.getValue()[3];
                obj2[i][5] = entry.getValue()[0];
                i++;
            }
            for (Object[] objects : obj2) {
                this.ThongKeSanPham_VIEW.defaultTableModel.addRow(objects);
            }
            this.ThongKeSanPham_VIEW.pnl_information.repaint();
            this.ThongKeSanPham_VIEW.pnl_information.validate();
        }
    }

    @Override
    public void mousePressed(MouseEvent e
    ) {

    }

    @Override
    public void mouseReleased(MouseEvent e
    ) {

    }

    @Override
    public void mouseEntered(MouseEvent e
    ) {

    }

    @Override
    public void mouseExited(MouseEvent e
    ) {

    }

    public void map(Map<Object, Object[]> map_Key_VegetableID, Object[] ngay, Object[] value) {
        if (map_Key_VegetableID.containsKey(ngay[2])) {
            Object[] object = map_Key_VegetableID.get(ngay[2]);
            object[0] = (int) object[0] + (int) value[0];
            map_Key_VegetableID.put(ngay[2], object);
        } else {
            map_Key_VegetableID.put(ngay[2], value);
        }
    }
}
