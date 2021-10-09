/*----------------------------------------------------------------------------------------------
 *Copyright(C) GDSE-56-GIT Exam. All rights reserved.
 *Licensed under the MIT License. See License, txt in the project root for license information.
 *---------------------------------------------------------------------------------------------*/

package lk.ijse.model;

/**
 * @author Tharushi Welarathna <nirmanitharushi1@gmail.com>
 * @since 10/9/2021
 */
public class Customer {
      private String customerID;
      private String Name;
      private String Address;
      private String city;
      private String province;
      private int contact;

    public Customer() {
    }

    public Customer(String customerID, String name, String address, String city, String province, int contact) {
        this.customerID = customerID;
        Name = name;
        Address = address;
        this.city = city;
        this.province = province;
        this.contact = contact;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", contact=" + contact +
                '}';
    }
}
