/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer4.sol;

/**
 *
 * @author Martin
 */
public class Mergesort implements Ordenamiento
{
    
 private int[] lista;   
 
    private void mergesort()
    {
        mergesort(0,lista.length-1, new int[lista.length]);
    }
    
    private void mergesort(int low, int high,int[] helper) 
    {		
		if (low < high) {			
			int middle = (low + high) / 2;			
			mergesort(low, middle,helper);			
			mergesort(middle + 1, high,helper);			
			merge(low, middle, high,helper);
		}
    }

    private void merge(int low, int middle, int high,int [] helper) 
    {
		for (int i = low; i <= high; i++) {
			helper[i] = lista[i];
		}
		int i = low;
		int j = middle + 1;
		int k = low;		
		while (i <= middle && j <= high) {
			if (helper[i] <= helper[j]) {
				lista[k] = helper[i];
				i++;
			} else {
				lista[k] = helper[j];
				j++;
			}
			k++;
		}		
		while (i <= middle) {
			lista[k] = helper[i];
			k++;
			i++;
		}
        }
    public int[] orden(int[] lista) {
        System.out.println("Mergesort");
        this.lista=lista;
        mergesort();
        return this.lista;
    }


   
 }
