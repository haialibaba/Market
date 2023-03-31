/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author PC
 */

public class orderDAL {
    Session session = HibernateUtils.getSessionFactory().openSession();
    public orderDAL(){
        this.session = session;
    }
    public order getOrder(int id){
        order o;
        Transaction transaction = session.beginTransaction();
        o = session.get(order.class, id);
        transaction.commit();
        return o;
    }
    
    
    
    public static void main(String[] args) {
        orderDAL dal = new orderDAL();
        order o = dal.getOrder(2);
        customers c = o.getCustomer();
        System.err.println("ID:"+o.getOrderID());
        System.err.println(c.getCustomerID()+"::"+c.getFullname()+"::"+c.getAddress()+"::"+c.getCity());
        System.err.println(o.getDate());
        System.err.println(o.getNote());
        System.err.println(o.getTotal());
        List<vegetable> list = o.getVegetable();
        for (int i = 0; i < list.size(); i++) {
            System.err.println(list.get(i).getVegetableID()+"::"+list.get(i).getVegetable_Name());
        }
        
    }
}

