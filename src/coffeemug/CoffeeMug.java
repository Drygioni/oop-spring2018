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
public class CoffeeMug {
    

    
    protected MugState[] mugStates;
    protected MugState Waterlevel;
    protected mug_creamer mug_creamers;
    protected int mugs;

    public CoffeeMug(int _mugs) {
        if(_mugs<=0){
            throw new IllegalArgumentException("outlets (" + _mugs + ") must be positive.");
        }
             mugs = _mugs;
             mugStates = new MugState[mugs];
             Waterlevel = MugState.EMPTY;
             for(int mug = 0;mug<mugs;mug++){
                 mugStates[mug] = MugState.EMPTY;
             }       
        }
    
    public int getMugs(){
        return mugs;
    }
    
    
    public void setMug_Creamer( mug_creamer Creamer ){
        mug_creamers = Creamer; 
    }
    
    public mug_creamer GetMugCreamer(int mugs){
        switch(mug_creamers){
            case NOCREAMER: return mug_creamer.NOCREAMER;
            case HALFNHALF: return mug_creamer.HALFNHALF;
            case HEAVYCREAM: return mug_creamer.HEAVYCREAM;
        }
        throw new IllegalStateException();
    }
    
    public void setWaterLevel(MugState _waterlevel){
        Waterlevel = _waterlevel;
        
    }
    public MugState getWaterlevel(){
        return Waterlevel;
    }
    
    public MugState GetMugState(int mugs){
        switch(Waterlevel){
            case EMPTY: return MugState.EMPTY;
            case FULL: return MugState.FULL;
        }
        throw new IllegalStateException();
    }
    
    public void setCreamerNone() {setMug_Creamer(mug_creamer.NOCREAMER);}
    
    
   
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
