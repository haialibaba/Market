/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.HibernateUtils;
import DAL.customerDAL;
import DAL.customers;
import java.util.List;

/**
 *
 * @author PC
 */
public class customerBLL {
    private customerDAL customerDAL;

    public customerBLL(){
        customerDAL = new customerDAL();
    }
    public List loadCustomers(){
        List list;
        list = customerDAL.loadCustomers();
        return list;   
    }
    public customers[] convertListComboBox(List<customers> list){
        int rows = list.size();
        customers[] newList = new customers[rows];
        for(int i = 0; i < rows; i++){
            newList[i] = list.get(i);    
        }
        return newList;
    }
}
