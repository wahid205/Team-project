/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author wahid
 */
public class ForEmp {
     String name;
     String address ;
    int id ;
     int phone ;
    public int getEmployee_id() {
        return id;
    }

    public int setEmployee_id(int customer_id) {
        
         return this.id = customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone_no() {
        return phone;
    }

    public void setPhone_no(String phone_no) {
        this.phone= phone;
    }
}
