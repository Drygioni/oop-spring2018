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
public class PizzaAdapter implements Pizza {
    private static final Logger LOGGER = Logger.getLogger(PizzaAdapter.class.getName());
    private PineapplePizza pizza;
    
    public PizzaAdapter(){
        pizza = new PineapplePizza();
    }


    @Override
    public void eat() {
        pizza.EatBadPizza();
    }
    
}
