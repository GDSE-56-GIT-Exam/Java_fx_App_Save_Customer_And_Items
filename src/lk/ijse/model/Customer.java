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
     private String customerName;
     private String customerAddress;
     private String city;
     private String province;
     private int contact;

    public Customer() {
    }

    public Customer(String customerID, String customerName, String customerAddress, String city, String province, int contact) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
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
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", contact=" + contact +
                '}';
    }
}
