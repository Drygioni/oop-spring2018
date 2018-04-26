/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaadapter;

import java.util.logging.Logger;

/**
 *
 * @author Jared Boese
 */
public class Customer implements Pizza{
    private Pizza pizza;
   // private static final Logger LOGGER = Logger.getLogger(Customer.class.getName());
    public String result;
    public Customer(){
        
    }
    
    public Customer(Pizza pizza){
        this.pizza = pizza;
    }
    public void Customer(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public void eat() {
        pizza.eat();
    //    LOGGER.info("The pizza has been eaten");
        
        result = "The pizza has been eaten";
        System.out.println(result);
    }
    
    
}
