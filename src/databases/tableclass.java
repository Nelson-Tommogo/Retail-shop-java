/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databases;

import javax.swing.JOptionPane;

/**
 *
 * @author TOMMOGO
 */
public class tableclass {

    public static void main(String[] args) {
        try {
            String ItemsTable = "create table ItemsTable(itemNo varchar(100) PRIMARY KEY,Description char(100),Department varchar(100),TaxCategory varchar(100),Price varchar(100),UPCs varchar(100))";
            databaseoperation.setDataorDelete(ItemsTable, "Items Tables Created Successfully");
//            String Item = "insert into ItemsTable(itemNo,Description,Department,TaxCategory,Price,UPCs)values(1,'Nyeri','itsme','Whats your favuorite car?','Mercedes','true')";
//            databaseoperation.setDataorDelete(Item, "Admin Details Added Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        /**/    }
}
