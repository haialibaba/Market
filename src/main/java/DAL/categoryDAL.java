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
     Session session;

    public categoryDAL( ) {
        this.session = session;
    }

    public List loadCategory() {
        List<category> category;
        session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        category = session.createQuery("FROM category", category.class).list();
        transaction.commit();
        return category;

    }
    public category getCategory(int CategoryID)
    {
        category c = session.get(category.class, CategoryID);
        return c;
    }
}
