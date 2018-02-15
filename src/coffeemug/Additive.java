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
public class Additive {
    private Creamer _creamer;
    
    Additive(Creamer creamer) {_creamer = creamer; }
    Additive() { _creamer = Creamer.DEFAULT_CREAMER; }
    public Creamer getcreamer() { return _creamer; }
    public void setcreamer(Creamer creamer) {_creamer = creamer;}
    
    private Creamer _In;
    
    public void setCreamerIn(Creamer value){
        _In = value;
    }
    
    public Creamer getCreamerIn(){
        return _In;
    }
    
    private Creamer _Out;
    
    public void setCreamerOut(Creamer value){
        _Out = value;
    }
    
    public Creamer getCreamerOut(){
        return _Out;
    }


    
    
}
