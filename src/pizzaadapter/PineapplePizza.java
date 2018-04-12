/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaadapter;

//import com.sun.istack.internal.logging.Logger;
import java.util.logging.Logger;

/**
 *
 * @author Jared Boese
 */
public class PineapplePizza {
    private static final Logger LOGGER = Logger.getLogger(PineapplePizza.class.getName());
    public void EatBadPizza(){
        LOGGER.info("The Pineapple pizza has been eaten");
    }
}
