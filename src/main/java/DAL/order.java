/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table
public class order {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private String OrderID;
    @Column
    @Temporal(value = TemporalType.DATE)
    private String Date;
    @Column
    private String Total;
    @Column
    private String Note;
    @ManyToOne
    @JoinColumn(name = "CustomerID")
    private customers Customer;

}
