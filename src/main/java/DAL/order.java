/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 *
 * @author PC
 */
@Data
@Entity
@Table(name = "`order`")
public class order implements Serializable{
    
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int OrderID;
    
    @Column
    @Temporal(value = TemporalType.DATE)
    private Date Date;
    
    @Column
    private String Total;
    
    @Column
    private String Note;
    
    @ManyToOne
    @JoinColumn(name = "CustomerID")
    private customers Customer;
    
    @OneToMany(mappedBy = "primaryKey.order",cascade = CascadeType.ALL)
    private List<OrderVegetable> orderVegetables;

    
    
    
    @ManyToMany
    @JoinTable(name = "orderdetail", joinColumns={@JoinColumn(name = "OrderID")},
            inverseJoinColumns = {@JoinColumn(name = "VegetableID")})
    private List<vegetable> vegetable;
    
    
}
