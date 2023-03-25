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
 * @author DELL
 */
public class categoryDAL {
     Session session = HibernateUtils.getSessionFactory().openSession();

    public categoryDAL() {
        this.session = session;
    }

    public List loadCategory() {
        List<category> category;
        //session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        category = session.createQuery("FROM category", category.class).list();
        transaction.commit();
        return category;

    }
    public List searchCategoryName(String name){
        Transaction transaction = session.beginTransaction();
        List<category> list = session.createQuery(
                "FROM category where name like '%"+name+"%'", category.class).list();
        transaction.commit();
        return list;
    }
    public category getCategory(int CategoryID)
    {
        category c = session.get(category.class, CategoryID);
        return c;
    }
}
