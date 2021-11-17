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
    String orderId; 
    String restaurantName;
    String customerName; 
    String deliverymanName; 
    String price; 
    String new_Order; 
    ArrayList<Dish> listOfDishes; 
    String deliveryAddress;
    public Order(String orderId, String restaurantName, String customerName, String deliverymanName, String price, String new_Order, ArrayList<Dish> listOfDishes, String deliveryAddress) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
