/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaadapter;

/**
 *
 * @author Jared Boese
 */
public class Customer implements Pizza{
    private Pizza pizza;
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
    }
    
    
}
