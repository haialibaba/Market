package BLL_ThongKe;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "ORDERDETAIL")
@AssociationOverrides({
		@AssociationOverride(name = "primaryKey.order_data", joinColumns = @JoinColumn(name = "ORDERID")),
		@AssociationOverride(name = "primaryKey.vegetable", joinColumns = @JoinColumn(name = "VEGETABLEID"))})
public class Orderdetail {
	private Order_dataVegetableID primaryKey = new Order_dataVegetableID();

	private int Quantity;
	private float Price;

	@EmbeddedId
	public Order_dataVegetableID getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(Order_dataVegetableID primaryKey) {
		this.primaryKey = primaryKey;
	}

	@Transient
	public Order getOrder_data() {
		return getPrimaryKey().getOrder_data();
	}

	public void setOrder_data(Order order_data) {
		getPrimaryKey().setOrder_data(order_data);
	}

	@Transient
	public Vegetable getVegetable() {
		return getPrimaryKey().getVegetable();
	}

	public void setVegetable(Vegetable vegetable) {
		getPrimaryKey().setVegetable(vegetable);
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

}
