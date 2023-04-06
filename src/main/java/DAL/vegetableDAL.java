/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;
import BLL_ThongKe.Vegetable;
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
 
    public vegetableDAL()
    {
        this.session = session;
    }
    public Vegetable getVegetable(int vegetableID)
    {
        Vegetable obj;
        
        session.beginTransaction();
        obj = session.get(Vegetable.class, vegetableID);
        session.getTransaction().commit();
        return obj;
        
    }
    public List getVegetableInCategory(int categoryID)
    {
        List list;
        session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query q = session.createQuery("FROM vegetable WHERE CatagoryID = :categoryID");
        q.setParameter("categoryID", categoryID);
        list = q.list();
        transaction.commit();
        return list;
    }
    public void addVegetable(Vegetable obj)
    {
        session.save(obj);
    }
    public void updateVegetable(Vegetable obj)
    {
        session.update(obj);
    }
    public void deleteVegetable(Vegetable obj)
    {
        session.delete(obj);
    }
    
    public static void main(String args[])
    {
        vegetableDAL dal = new vegetableDAL();
        //Vegetable obj = dal.getVegetable(1);
        //System.out.println(obj.getVegetableName());
        List list = dal.getVegetableInCategory(1);
        
        for (Iterator iterator = list.iterator(); iterator.hasNext();){
             Vegetable v = (Vegetable) iterator.next(); 
             System.out.print("ID: " + v.getVegetableID()); 
             System.out.print("Name: " + v.getVegetable_Name()); 
             
          }
        
    
    }
}
