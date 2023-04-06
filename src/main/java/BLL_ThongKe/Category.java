package BLL_ThongKe;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORY")
public class Category {
	private int CatagoryID;
	private String Name;
	private String Description;

	private List<Vegetable> vegetables;

	public Category() {
		super();
	}

	public Category(int catagoryID, String name, String description, List<Vegetable> vegetables) {
		super();
		CatagoryID = catagoryID;
		Name = name;
		Description = description;
		this.vegetables = vegetables;
	}

	@Id
	public int getCatagoryID() {
		return CatagoryID;
	}

	public void setCatagoryID(int catagoryID) {
		CatagoryID = catagoryID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@OneToMany(mappedBy = "category")
	public List<Vegetable> getVegetables() {
		return vegetables;
	}

	public void setVegetables(List<Vegetable> vegetables) {
		this.vegetables = vegetables;
	}

}
