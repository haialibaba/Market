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
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author DELL
 */
@Data
@Entity
@Table
public class vegetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String VegetableID;
   @Column 
    private String Vegetable_Name;
    @Column
    private String Unit;
    @Column
    private String Amount;
    @Column 
    private String Image;
    @Column
    private String Price;
    @ManyToOne
    @JoinColumn(name="CatagoryID")
    private category catagory;
    
}
