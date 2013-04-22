/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer10.sol;

import ar.edu.untdf.labprog.tp1.ejer9.sol.Validacion;
import java.util.Arrays;

/**
 *
 * @author Martin
 */
public class ValidarProvincia implements Validacion{
    String provinciasv[] = {"Tierra del Fuego", "Buenos Aires"};
    
   public ValidarProvincia()
   {
   
   }
   
    @Override
    public boolean isValid(String provincia) 
    {
        for (String prov: provinciasv)
        {
             if (prov.equals(provincia))
             {
              return true;
             }
             else
             {
              return false;
             }
       
        }
        return false;
    }

   
}
