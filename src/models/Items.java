/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author common
 */
public class Items {
   private String ItemNo;

    public Items() {
    }

    public Items(String ItemNo, String Descption, String Department, String TaxCategory, String Price, String UPCs) {
        this.ItemNo = ItemNo;
        this.Descption = Descption;
        this.Department = Department;
        this.TaxCategory = TaxCategory;
        this.Price = Price;
        this.UPCs = UPCs;
    }

    public String getItemNo() {
        return ItemNo;
    }

    public void setItemNo(String ItemNo) {
        this.ItemNo = ItemNo;
    }

    public String getDescption() {
        return Descption;
    }

    public void setDescption(String Descption) {
        this.Descption = Descption;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getTaxCategory() {
        return TaxCategory;
    }

    public void setTaxCategory(String TaxCategory) {
        this.TaxCategory = TaxCategory;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getUPCs() {
        return UPCs;
    }

    public void setUPCs(String UPCs) {
        this.UPCs = UPCs;
    }
    private String Descption;
    private String Department;
    private String TaxCategory;
    private String Price;
    private String UPCs;

    
    
}
