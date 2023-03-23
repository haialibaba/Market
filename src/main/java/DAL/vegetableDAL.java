/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author DELL
 */
public class vegetableDAL {
    
    Session session;
 
    public vegetableDAL(){
        this.session = session;
    }
    
    public vegetable getVegetable(int vegetableID){
        vegetable obj;
        session.beginTransaction();
        obj = session.get(vegetable.class, vegetableID);
        session.getTransaction().commit();
        return obj;    
    }
    
    public List getVegetableInCategory(int categoryID){
        List list;
        session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query q = session.createQuery("FROM vegetable WHERE CatagoryID = :categoryID");
        q.setParameter("categoryID", categoryID);
        list = q.list();
        transaction.commit();
        return list;
    }
    public void addVegetable(vegetable obj){
        session.save(obj);
    }
    
    public void updateVegetable(vegetable obj){
        session.update(obj);
    }
    
    public void deleteVegetable(vegetable obj){
        session.delete(obj);
    }
    
    public static void main(String args[]){
        vegetableDAL dal = new vegetableDAL();
        //Vegetable obj = dal.getVegetable(1);
        //System.out.println(obj.getVegetableName());
        List list = dal.getVegetableInCategory(1);
        
        for (Iterator iterator = list.iterator(); iterator.hasNext();){
             vegetable v = (vegetable) iterator.next(); 
             System.out.print("ID: " + v.getVegetableID()); 
             System.out.print("Name: " + v.getVegetable_Name()); 
             
          } 
    }
}
