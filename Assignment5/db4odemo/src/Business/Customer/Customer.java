/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Restaurant.Order;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer {
    private String name;
    private String username;
    private String password;
    private String address;
    private String phone;
    private ArrayList <Order> myOrders;

    public Customer(String name, String username, String password, String address, String phone) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.myOrders = new ArrayList<Order>();
        
    }
    //Add to list method
    public void addOrder(Order order)
    {
        myOrders.add(order);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Order> getMyOrders() {
        return myOrders;
    }

    public void setMyOrders(ArrayList<Order> myOrders) {
        this.myOrders = myOrders;
    }
    
    
    
    
    
}
