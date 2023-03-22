/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.category;
import DAL.categoryDAL;
import java.util.List;



/**
 *
 * @author DELL
 */
public class categoryBLL {
     private categoryDAL cateDAL;
    
    
    public categoryBLL()
    {
        cateDAL = new categoryDAL();
    }
    
    public List loadCategory()
    {
        List list;
        list = cateDAL.loadCategory();
        
        return list;
    }
    public category[] convertList1 (List<category> list)
    {
        int rows = list.size();
        category[] newList = new category[rows];
        for(int i = 0; i < rows; i++)
        {
            newList[i] = list.get(i);
            
        }
        return newList;
    }
    public Object[][] convertList(List<category> list)
    {
        int rows = list.size();
        int cols = 4;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            obj[i][0] = list.get(i).getCatagoryID();
            obj[i][1] = list.get(i).getName();
            obj[i][2] = list.get(i).getDescription();
            obj[i][3] = list.get(i).getListVegetable().size();
        }
        return obj;
    }

    public category getCategory(int CategoryID)
    {
        category c = cateDAL.getCategory(CategoryID);
        return c;
    }
}
