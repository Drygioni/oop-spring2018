/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author Jared
 */
public class Pizza {
    private Sauce sauce = new Sauce();
    private Size size = new Size();
    private int nToppings;
    
    public void setSize(Size _size){
        size = _size;
    }
    public void setSauce(Sauce _sauce){
        sauce = _sauce;
    }
    public void setNumToppings(int _numToppings){
        if (_numToppings > -1) nToppings = _numToppings;
        else throw new IndexOutOfBoundsException("Number of Toppings must be positive");
    }
    
    public int getToppings(){
        return nToppings;
    }
    
   // void Pizza::setPizzaOrders(vector<Pizza> _pizzaOrders){ pizzaOrders = _pizzaOrders; }
   //vector<Pizza> Pizza::getPizzaOrders(){ return pizzaOrders; }
    void setPizzaOrders(){
        
    }
    
}
    
    

