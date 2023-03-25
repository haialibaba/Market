/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.category;
import DAL.vegetable;
import DAL.vegetableDAL;
import java.util.List;

/**
 *
 * @author DELL
 */
public class vegetableBLL {
    private  vegetableDAL vegetableDAL;
     
    public vegetableBLL(){
        vegetableDAL = new vegetableDAL();
    }
    
    public List loadAllVegetable(){
        List list;
        list = vegetableDAL.loadVegetable();
        return list;   
    }
    
    public Object[][] converVegetable(List<vegetable> list){
        int rows = list.size();
        int cols = 6;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            obj[i][0] = list.get(i).getVegetableID();
            obj[i][1] = list.get(i).getVegetable_Name();
            obj[i][2] = list.get(i).getCatagory();
            obj[i][3] = list.get(i).getUnit();
            obj[i][4] = list.get(i).getAmount();
            obj[i][5] = list.get(i).getPrice();
        }
        return obj;
    }
    public boolean isNumber(String str) {
        try {
            Integer.valueOf(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        } 
    }
    public List searchVegetable(String name, Object obj){
        try {
            category c = (category) obj;
            return vegetableDAL.searchVegetableNameInCategory(name, c.getCatagoryID());
        } catch (Exception e) {
            return vegetableDAL.searchVegetableName(name);
        }
    }
     
    public boolean updateVegetable(vegetable v){
        return vegetableDAL.updateVegetable(v);
    }
    
    public boolean deleteVegetable(vegetable v){
        return vegetableDAL.deleteVegetable(v);
    }
    
    public boolean insertVegetable(vegetable v){
        return vegetableDAL.addVegetable(v);
    }
    
    public vegetable getVegetable(String id){
        return vegetableDAL.getVegetable(id);
    }
    
}
