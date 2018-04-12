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
public class Main {
        public static void main(String[] args) {
            
        // TODO code application logic here
        Customer customer = new Customer(new PizzaAdapter());
        customer.eat();
    }
    
}
