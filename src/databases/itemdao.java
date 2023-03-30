/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databases;

import java.sql.ResultSet;
import java.util.ArrayList;
import models.Items;

/**
 *
 * @author common
 */
public class itemdao {

    public static void save(Items item) {

        String Query = "INSERT INTO ItemsTable VALUES('" + item.getItemNo() + "','" + item.getDescption() + "','" + item.getDepartment() + "','" + item.getTaxCategory() + "','" + item.getPrice() + "','" + item.getUPCs() + "')";
        databaseoperation.setDataorDelete(Query, "Items Succusfully wait for Admin Approval");

    }

    public static ArrayList<Items> getAllRecords() {
        ArrayList<Items> arrayList = new ArrayList<>();
        try {
            ResultSet rs = databaseoperation.getData("select *from Product");
            while (rs.next()) {
                Items item = new Items();
                item.setItemNo(rs.getString("itemNo"));
                item.setDescption(rs.getString("Description"));
                item.setDepartment(rs.getString("Department"));
                item.setPrice(rs.getString("TaxCategory"));
                item.setTaxCategory(rs.getString("Price"));
                item.setUPCs(rs.getString("UPCs"));
                arrayList.add(item);
            }
        } catch (Exception e) {
            //JOptionPane.showInputDialog(null, e);
            System.out.println(e);
        }
        return arrayList;
    }

}
