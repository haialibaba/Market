/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL_ThongKe;

import BLL_ThongKe.Order;
import BLL_ThongKe.Orderdetail;
import BLL_ThongKe.Vegetable;
import DAL.HibernateUtils;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author trinh_hoang_phu
 */
public class ThongKeDoanhThu_DAL {

    Session session;

    public ThongKeDoanhThu_DAL() {
        session = HibernateUtils.getSessionFactory().openSession();
    }

    public List<Order> getOrder() {
        Transaction transaction = session.beginTransaction();
        List<Order> list;
        Query<Order> query = session.createQuery("FROM Order WHERE OrderID >= : a ");
        query.setParameter("a", 0);
        list = query.list();
        transaction.commit();
        return list;
    }

    public List<Vegetable> getVegetable() {
        Transaction transaction = session.beginTransaction();
        List<Vegetable> list;
        Query<Vegetable> query = session.createQuery("FROM Vegetable WHERE VegetableID >= :vegetableID");
        query.setParameter("vegetableID", 0);
        list = query.list();
        transaction.commit();
        return list;
    }
    
    public List<Orderdetail> getOrderdetail() {
        Transaction transaction = session.beginTransaction();
        List<Orderdetail> list;
        Query<Orderdetail> query = session.createQuery("FROM Orderdetail");
//        query.setParameter("vegetableID", 0);
        list = query.list();
        transaction.commit();
        return list;
    }
   
}
