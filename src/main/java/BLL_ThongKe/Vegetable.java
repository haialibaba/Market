package BLL_ThongKe;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "VEGETABLE")
public class Vegetable {
	private int VegetableID;
	private String Vegetable_Name;
	private String Unit;
	private int Amount;
	private String Image;
	private float Price;

	private List<Orderdetail> orderdetails;

	private Category category;

	public Vegetable() {
		super();
	}

	public Vegetable(int vegetableID, String vegetable_Name, String unit, int amount, String image, float price,
			List<Orderdetail> orderdetails, Category category) {
		super();
		VegetableID = vegetableID;
		Vegetable_Name = vegetable_Name;
		Unit = unit;
		Amount = amount;
		Image = image;
		Price = price;
		this.orderdetails = orderdetails;
		this.category = category;
	}

	@Id
	@GeneratedValue
	@Column(name = "VegetableID")
	public int getVegetableID() {
		return VegetableID;
	}

	public void setVegetableID(int vegetableID) {
		VegetableID = vegetableID;
	}

	public String getVegetable_Name() {
		return Vegetable_Name;
	}

	public void setVegetable_Name(String vegetable_Name) {
		Vegetable_Name = vegetable_Name;
	}

	public String getUnit() {
		return Unit;
	}

	public void setUnit(String unit) {
		Unit = unit;
	}

	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		Amount = amount;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	@OneToMany(mappedBy = "primaryKey.vegetable", cascade = CascadeType.ALL)
	public List<Orderdetail> getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(List<Orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
	}

	public void addOrderdetail(Orderdetail orderdetail) {
		this.orderdetails.add(orderdetail);
	}

	@ManyToOne
	@JoinColumn(name = "CATAGORYID")
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
