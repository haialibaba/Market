package BLL_ThongKe;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class Order_dataVegetableID implements Serializable {
	private Order order_data;
	private Vegetable vegetable;

	@ManyToOne(cascade = CascadeType.ALL)
	public Order getOrder_data() {
		return order_data;
	}

	public void setOrder_data(Order order_data) {
		this.order_data = order_data;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	public Vegetable getVegetable() {
		return vegetable;
	}

	public void setVegetable(Vegetable vegetable) {
		this.vegetable = vegetable;
	}
}
