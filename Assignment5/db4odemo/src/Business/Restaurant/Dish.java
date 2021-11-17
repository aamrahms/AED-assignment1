/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author aamrah
 */
public class Dish {
    private String name;
    private String price;
    private String description;
    
    //Constructor
    public Dish(String name, String price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
    
    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString()
    {
        return name;
    }
    
    
    
}
