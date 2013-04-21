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

  public boolean contains(Integer[] a, Integer b) {
    if (a.length == 0) {
      return false;
    }
    int low = 0;
    int high = a.length-1;

    while(low <= high) {
      int middle = (low+high) /2; 
      if (b> a[middle]){
        low = middle +1;
      } else if (b< a[middle]){
        high = middle -1;
      } else { // The element has been found
        return true; 
      }
    }
    return false;
  }
     
}
