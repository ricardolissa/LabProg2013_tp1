/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer4.sol;

/**
 *
 * @author Martin
 */
public class Binaria implements Busqueda 
{

  public boolean buscar(int[] lista, int a) {
    
      if (lista.length == 0) {
      return false;
    }
    int low = 0;
    int high = lista.length-1;

    while(low <= high) {
      int middle = (low+high) /2; 
      if (a> lista[middle]){
        low = middle +1;
      } else if (a< lista[middle]){
        high = middle -1;
      } else { // The element has been found
        return true; 
      }
    }
    return false;
  }

       
}
