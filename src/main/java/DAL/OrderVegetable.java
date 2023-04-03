
package DAL;

import javax.persistence.*;



@Entity
@Table(name = "orderdetail")
@AssociationOverrides({
    @AssociationOverride(name = "primaryKey.order",
        joinColumns = @JoinColumn(name = "OrderID")),
    @AssociationOverride(name = "primaryKey.vegetable",
        joinColumns = @JoinColumn(name = "VegetableID")) })

public class OrderVegetable{
    
    private OrderVegetableID primaryKey = new OrderVegetableID();

    private int Quantity;
    private String Price;
    
    
    @EmbeddedId
    public OrderVegetableID getPrimaryKey() {
        return primaryKey;
    }
 
    public void setPrimaryKey(OrderVegetableID primaryKey) {
        this.primaryKey = primaryKey;
    }
  
    @Transient
    public order getOrder() {
        return getPrimaryKey().getOrder();
    }
 
    public void setUser(order order) {
        getPrimaryKey().setOrder(order);
    }

    @Transient
    public vegetable getVegetable() {
        return getPrimaryKey().getVegetable();
    }
 
    public void setVegetable(vegetable vegetable) {
        getPrimaryKey().setVegetable(vegetable);
    }
    
    @Column(name = "Quantity")
    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    
    @Column(name = "Price")
    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }
    
}