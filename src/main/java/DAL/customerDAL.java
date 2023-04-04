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
public class customerDAL {
    Session session = HibernateUtils.getSessionFactory().openSession();
    public customerDAL() {
        this.session = session;
    }
    
    public List loadCustomers() {
        List<customers> list;
        Transaction transaction = session.beginTransaction();
        list = session.createQuery("FROM customers", customers.class).list();
        transaction.commit();
        return list;

    }
}
