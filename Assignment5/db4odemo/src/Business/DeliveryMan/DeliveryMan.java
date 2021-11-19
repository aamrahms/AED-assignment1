/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Restaurant.Dish;
import Business.Restaurant.Order;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    private String name;
    private String username;
    private String password;
    private String address;
    private String phone;
    private ArrayList <Order> deliveryOrders;

    public DeliveryMan(String name, String username, String password, String address, String phone) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.deliveryOrders = new ArrayList<Order>();
    }
    //add order to deliveryOrders
    
    public void addOrder(String orderId,String restaurantName,String customerName, String deliverymanName,String price, String status, ArrayList<Dish> listOfDishes,String deliveryAddress){
        Order order=new Order(restaurantName,customerName,deliverymanName,price,"New Order",listOfDishes,deliveryAddress);
        if(deliveryOrders==null)
        {
            deliveryOrders=new ArrayList<Order>();
        }
        deliveryOrders.add(order);
        
    }
    
    //getters and setters

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

    public ArrayList<Order> getDeliveryOrders() {
        if(deliveryOrders==null)
        {
            deliveryOrders=new ArrayList<Order>();
        }
        return deliveryOrders;
    }

    public void setDeliveryOrders(ArrayList<Order> deliveryOrders) {
        this.deliveryOrders = deliveryOrders;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
