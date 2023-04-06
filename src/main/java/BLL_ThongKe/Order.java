package BLL_ThongKe;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "`order`")
public class Order {
	private int OrderID;
	private Date Date;
	private float Total;
	private String Note;

	private List<Orderdetail> orderdetails;

	public Order() {
		super();
	}

	public Order(int orderID, java.sql.Date date, float total, String note, List<Orderdetail> orderdetails) {
		super();
		OrderID = orderID;
		Date = date;
		Total = total;
		Note = note;
		this.orderdetails = orderdetails;
	}

	@Id
	@GeneratedValue
	@Column(name = "OrderID")
	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int orderID) {
		OrderID = orderID;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public float getTotal() {
		return Total;
	}

	public void setTotal(float total) {
		Total = total;
	}

	public String getNote() {
		return Note;
	}

	public void setNote(String note) {
		Note = note;
	}

	@OneToMany(mappedBy = "primaryKey.order_data", cascade = CascadeType.ALL)
	public List<Orderdetail> getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(List<Orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
	}

	public void addOrderdetail(Orderdetail orderdetail) {
		this.orderdetails.add(orderdetail);
	}
}
