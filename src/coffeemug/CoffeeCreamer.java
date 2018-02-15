/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeemug;



/**
 *
 * @author Jared Boese
 */
public class CoffeeCreamer extends CoffeeMug {
    private Additive additive;

    public CoffeeCreamer(int _mugs) {
        super(_mugs);
    }
    
    public void setCreamerIn(Creamer In) {additive.setCreamerIn(In);}
    public Creamer getCreamerIn(){return additive.getCreamerIn();}
    public void setCreamerOut(Creamer Out){additive.setCreamerOut(Out);}
    public Creamer getCreamerOut(){return additive.getCreamerOut();}
    
    public CoffeeCreamer(int _mugs, Creamer creamer){
        super(_mugs);
        additive = new Additive(creamer);
        additive.setCreamerOut(creamer);
        additive.setCreamerIn(creamer);
        Waterlevel = MugState.EMPTY;
        for(int mug = 0;mug<_mugs;++mug)
        {
           mugStates[mug] =MugState.EMPTY;
        }
    }
        
    @Override
    public MugState GetMugState(int _mugs){
        
        switch(getWaterlevel()){
            case EMPTY: return MugState.EMPTY;
            case FULL: return MugState.FULL;
        }
        throw new IllegalStateException();
    }
    
    
    
    
}
