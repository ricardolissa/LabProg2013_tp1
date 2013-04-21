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
   
  
  public boolean contains(Integer[] a, Integer b){
      
      for (Integer i:a) {
      if (i==b){
        return true;
      }
    }
    return false; 
  }
} 