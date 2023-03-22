/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import DAL.category;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author caothanh
 */
public class CategoryModel extends DefaultComboBoxModel<category>{
    
    public CategoryModel(category[] listCate)
    {
        super(listCate);
    }
}
