/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer4.sol;

/**
 *
 * @author Martin
 */

public class Secuencial implements Busqueda{
   
  
  public boolean buscar(int[] lista , int b)
  {
     for(int i:lista)
               {
      if (i==b)
      {
        return true;
      }
    }
    return false; 
  }
} 