/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import BLL_ThongKe.Vegetable;
import DAL.vegetableDAL;
import java.util.List;

/**
 *
 * @author DELL
 */
public class vegetableBLL {
     private  vegetableDAL vegetableDAL;
     
       public vegetableBLL()
  {
      vegetableDAL = new vegetableDAL();
  }
       
         public Object[][] converVegetable(List<Vegetable> list)
  {
      int rows = list.size();
        int cols = 6;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            obj[i][0] = list.get(i).getVegetableID();
            obj[i][1] = list.get(i).getVegetable_Name();
            obj[i][2] = list.get(i).getUnit();
            obj[i][3] = list.get(i).getAmount();
            obj[i][4] = list.get(i).getImage();
            obj[i][5] = list.get(i).getPrice();
        }
        return obj;
  }
}
