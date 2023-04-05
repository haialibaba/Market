 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DAL;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.resource.transaction.spi.TransactionStatus;

public class customersDAL {
    Session session = HibernateUtils.getSessionFactory().openSession();
     
    public customersDAL() {
        this.session = session;
    }
    public List loadCustomers() {
        session = HibernateUtils.getSessionFactory().openSession();
        List<customers> list;
        Transaction transaction = session.beginTransaction();
        list = session.createQuery("FROM customers", customers.class).list();
        transaction.commit();
        return list;

    }
    public List searchCustomersFullname(String Fullname){
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("FROM customers where fullname like ?1");
        query.setParameter(1, "%"+Fullname+"%");
        List<customers> list = query.list();
        transaction.commit();
        return list;
    }
    public customers getCustomers(int CustomerID){
        customers c = session.get(customers.class, CustomerID);
        session.beginTransaction();
        session.getTransaction().commit();
        return c;
    }
    public boolean updateCustomers(customers c){
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(c);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
        return transaction.getStatus().isOneOf(TransactionStatus.COMMITTED);
    }
    public boolean deleteCustomers(customers c){
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(c);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
        return transaction.getStatus().isOneOf(TransactionStatus.COMMITTED);
    }
    public boolean addCustomers(customers c){
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(c);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
        return transaction.getStatus().isOneOf(TransactionStatus.COMMITTED);
    }
}