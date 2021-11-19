/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String name;
    private String username;
    private String password;
    private String address;
    private String phone;
    private ArrayList <Dish> listOfDishes;
    private ArrayList <Order> listOfOrders;
    
    //Constructor

    public Restaurant(String name, String username, String password, String address, String phone) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.listOfDishes=new ArrayList<Dish>();
        this.listOfOrders=new ArrayList<Order>();
    }
    
    //add order to listoforders
     public Order addOrder(String restaurantName,String customerName, String deliverymanName,String price, String status, ArrayList<Dish> listOfDishes,String deliveryAddress){
        Order order=new Order(restaurantName,customerName,deliverymanName,price,"New Order",listOfDishes,deliveryAddress);
        if(listOfOrders==null)
        {
            listOfOrders=new ArrayList<Order>();
        }
        listOfOrders.add(order);
        return order;
        
    }
     //get one dish
     public Dish getOneDish(String dishname)
     {
         for(Dish dish : listOfDishes)
         {
             if(dish.getName().equalsIgnoreCase(dishname))
             {
                 return dish;
             }
         }
         return null;
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

    public ArrayList<Dish> getListOfDishes() {
        if(listOfDishes==null)
        {
            listOfDishes=new ArrayList<Dish>();
        }
        return listOfDishes;
    }

    public void setListOfDishes(ArrayList<Dish> listOfDishes) {
        this.listOfDishes = listOfDishes;
    }

    public ArrayList<Order> getListOfOrders() {
        return listOfOrders;
    }

    public void setListOfOrders(ArrayList<Order> listOfOrders) {
        this.listOfOrders = listOfOrders;
    }
    @Override
    public String toString(){
        return name;
    }
}
