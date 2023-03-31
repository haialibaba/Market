

package BLL;

import DAL.order;
import DAL.orderDAL;
import java.util.List;

public class orderBLL {
    private orderDAL orderDAL;

    public orderBLL(){
         orderDAL = new orderDAL();
    }
    
    public List loadOrder(){
        List list;
        list = orderDAL.loadOrder();
        return list;   
    }
    
    public Object[][] convertListTable(List<order> list){
        int rows = list.size();
        int cols = 5;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++){
            obj[i][0] = list.get(i).getOrderID();
            obj[i][1] = list.get(i).getCustomer();
            obj[i][2] = list.get(i).getDate();
            obj[i][3] = list.get(i).getTotal();
            obj[i][4] = list.get(i).getNote();
        }
        return obj;
    }
    
    public order getOrder(int OrderID){
        order o = orderDAL.getOrder(OrderID);
        return o;
    }
    
//    public boolean updateOrder(order o){
//        return orderDAL.updateOrder(o);
//    }
//
//    public boolean insertOrder(order o){
//        return orderDAL.addOrder(o);
//    }
    
}