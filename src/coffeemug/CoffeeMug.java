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
    

    
    private mug_wlevel[] mug_wlevels;
    private mug_creamer mug_creamers;
    private int mugs;

    public CoffeeMug(int _mugs) {
        if(_mugs<=0){
            throw new IllegalArgumentException("outlets (" + _mugs + ") must be positive.");
        }
             mugs = _mugs;
             mug_wlevels = new mug_wlevel[mugs];
             for(int mug = 0;mug<mugs;mug++){
             }       
        }
    
    public int getMugs(){
        return mugs;
    }
    
    public void setMug_Wlevel(int mugs, mug_wlevel Wlevel){
        mug_wlevels[mugs] =Wlevel;
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
    
    public void setCreamerNone() {setMug_Creamer(mug_creamer.NOCREAMER);}
    
   
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
