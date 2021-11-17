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
public class RestaurantDirectory {
    private ArrayList<Restaurant> listOfRestaurants;
    
    //Constructor
    public RestaurantDirectory() {
        this.listOfRestaurants = new ArrayList<Restaurant>() ;
    }
    
    public Restaurant getRestaurant(String restaurantUserName){
        for(Restaurant r : listOfRestaurants)
        {
            if(r.getUsername().equalsIgnoreCase(restaurantUserName))
            {
                return r;
            }
        }
        return null;
    }
    //create, delete and update deliveryman
    public Restaurant createRestaurant(String name, String username, String password, String address, String phone)
    {
        Restaurant restaurant=new Restaurant(name,username,password,address,phone);
        listOfRestaurants.add(restaurant);
        return restaurant;
    }
    
    public void updateRestaurant(Restaurant restaurant,String name, String username, String password, String address, String phone)
    {
        for(Restaurant res : listOfRestaurants)
        {
            if(res.getUsername().equalsIgnoreCase(username))
            {
                res.setUsername(username);
                res.setName(name);
                res.setAddress(address);
                res.setPhone(phone);
                break;
            }
        }
        
    }
    public void deleteRestaurant(Restaurant restaurant)
    {
        listOfRestaurants.remove(restaurant);
    }
    //getters and setters
    public ArrayList<Restaurant> getListOfRestaurants() {
        return listOfRestaurants;
    }

    public void setListOfRestaurants(ArrayList<Restaurant> listOfRestaurants) {
        this.listOfRestaurants = listOfRestaurants;
    }
    
    
}
