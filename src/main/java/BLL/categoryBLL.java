
package BLL;

import DAL.category;
import DAL.categoryDAL;
import java.util.List;

public class categoryBLL {
    private categoryDAL cateDAL;

    public categoryBLL(){
        cateDAL = new categoryDAL();
    }
    
    public List loadCategory(){
        List list;
        list = cateDAL.loadCategory();
        return list;   
    }
    
    public category[] convertList1(List<category> list){
        int rows = list.size();
        category[] newList = new category[rows];
        for(int i = 0; i < rows; i++){
            newList[i] = list.get(i);    
        }
        return newList;
    }
    public Object[][] convertList(List<category> list){
        int rows = list.size();
        int cols = 4;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++){
            obj[i][0] = list.get(i).getCatagoryID();
            obj[i][1] = list.get(i).getName();
            obj[i][2] = list.get(i).getDescription();
            obj[i][3] = list.get(i).getListVegetable().size();
        }
        return obj;
    }
    
    public category getCategory(int CategoryID){
        category c = cateDAL.getCategory(CategoryID);
        return c;
    }
    public List searchCategory(String name){
        return cateDAL.searchCategoryName(name);
    }
    public boolean updateCategory(category c){
        return cateDAL.updateCategory(c);
    }
    
    public boolean deleteCategory(category c){
        return cateDAL.deleteCategory(c);
    }
    public boolean insertCategory(category c){
        return cateDAL.addCategory(c);
    }
    
}
