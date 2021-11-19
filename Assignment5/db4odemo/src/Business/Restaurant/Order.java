/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author aamrah
 */
public class Order {
    int orderId; 
    String restaurantName;
    String customerName; 
    String deliverymanName; 
    String price; 
    String status; 
    ArrayList<Dish> listOfDishes; 
    String deliveryAddress;
    private static int count=0;
    //Constructor
    public Order( String restaurantName, String customerName, String deliverymanName, String price, String status, ArrayList<Dish> listOfDishes, String deliveryAddress) {
        this.orderId = count++;
        this.restaurantName = restaurantName;
        this.customerName = customerName;
        this.deliverymanName = deliverymanName;
        this.price = price;
        this.status = status;
        this.listOfDishes = listOfDishes;
        this.deliveryAddress = deliveryAddress;
    }
    
    //getters and setters

    public int getOrderId() {
        return orderId;
    }

    

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDeliverymanName() {
        return deliverymanName;
    }

    public void setDeliverymanName(String deliverymanName) {
        this.deliverymanName = deliverymanName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Dish> getListOfDishes() {
        return listOfDishes;
    }

    public void setListOfDishes(ArrayList<Dish> listOfDishes) {
        this.listOfDishes = listOfDishes;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    
    @Override
    public String toString(){
        return String.valueOf(orderId);
    }
}
