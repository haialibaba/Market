/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL_ThongKe;

import DAL_ThongKe.ThongKeDoanhThu_DAL;
import java.util.List;

/**
 *
 * @author trinh_hoang_phu
 */
public class ThongKeDoanhThu_BLL {

    ThongKeDoanhThu_DAL thongKeDoanhThu_DAL;

    public ThongKeDoanhThu_BLL() {
        thongKeDoanhThu_DAL = new ThongKeDoanhThu_DAL();
    }

    public List<Order> getOrder() {
        return thongKeDoanhThu_DAL.getOrder();
    }

    public List<Vegetable> getVegetable() {
        return thongKeDoanhThu_DAL.getVegetable();
    }
    
    public List<Orderdetail> getOrderdetail(){
        return thongKeDoanhThu_DAL.getOrderdetail();
    }

}
