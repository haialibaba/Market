/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

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
        int cols = 7;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            obj[i][0] = list.get(i).getVegetableID();
            obj[i][1] = list.get(i).getVegetable_Name();
            obj[i][2] = list.get(i).getCatagory();
            obj[i][3] = list.get(i).getUnit();
            obj[i][4] = list.get(i).getAmount();
            obj[i][5] = list.get(i).getPrice();
            obj[i][6] = list.get(i).getImage();
        }
        return obj;
    }
    public boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        } 
    }
    public List searchVegetable(String name){
        return vegetableDAL.searchVegetableName(name);
    }
}
