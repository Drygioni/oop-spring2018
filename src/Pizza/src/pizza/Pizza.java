/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import pizza.Size.size;
import pizza.Sauce.sauce;

/**
 *
 * @author Jared
 */
public class Pizza {
    private Sauce.sauce psauce = new Sauce().sauce;
    private Size.size psize = new Size().size;
    private int nToppings;
    protected Pizza[] pizzaOrders;
    protected int counter = 0;
    
    
    public void setSize(Size.size _size){
        psize = _size;
    }
    public Size.size getSize(){
        return psize;
    }
    public void setSauce(Sauce.sauce _sauce){
        psauce = _sauce;
    }
    public Sauce.sauce getSauce(){
        return psauce;
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
    void setPizzaOrders(Pizza[] _pizzaOrders){
        pizzaOrders = _pizzaOrders;
        
    }
    
    Pizza[] getPizzaOrders(){
        return pizzaOrders;
    }
    
    /*void Pizza::add(Pizza pizza){ pizzaOrders.push_back(pizza); }
int Pizza::arraySize(){ return pizzaOrders.size(); }
void Pizza::printOrders(Pizza pizza){
  for (int i = 0; i < pizza.arraySize(); i++){
    cout << "Size: " << pizza.pizzaOrders[i].getSize() << endl;
    cout << "Sauce: " << pizza.pizzaOrders[i].getSauce() << endl;
    cout << "Number of Toppings: " << pizza.pizzaOrders[i].getNumOfToppings() << endl;
  }*/
    
    void addPizza(Pizza pizza){
        pizzaOrders[counter] = pizza;
        counter++;
    }
    
    int arraySize(){
        return pizzaOrders.length;
    }
    
    void printOrders(Pizza pizza){
        for(int i = 0; i < arraySize();i++)
        {
            System.out.print("Size:" + pizza.pizzaOrders[i].getSize());
            System.out.print("Sauce:" + pizza.pizzaOrders[i].getSauce());
            System.out.print("Toppings: " + pizza.pizzaOrders[i].getToppings());
        }
    }

        public static void main(String[] args) {
          Pizza pizza = new Pizza();
          pizza.setSize(size.L);
          pizza.setSauce(sauce.TOMATO);
          pizza.setPizzaOrders(pizza.pizzaOrders);
//                    pizza.addPizza(pizza);

        }
        // TODO code application logic here
    }
    
    

    
    

