
package DAL;

import javax.persistence.Embeddable;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;

@Embeddable
public class OrderVegetableID implements Serializable { 
    private order order;
    private vegetable vegetable;
 
    @ManyToOne(cascade = CascadeType.ALL)
    public order getOrder() {
        return order;
    }
 
    public void setOrder(order order) {
        this.order = order;
    }
 
    @ManyToOne(cascade = CascadeType.ALL)
    public vegetable getVegetable() {
        return vegetable;
    }
 
    public void setVegetable(vegetable vegetable) {
        this.vegetable = vegetable;
    }

}
