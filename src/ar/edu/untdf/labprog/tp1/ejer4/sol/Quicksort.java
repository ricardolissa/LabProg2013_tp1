/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer4.sol;

/**
 *
 * @author Martin
 */
public class Quicksort implements Ordenamiento
{
    private int[] lista;
    
    private void quicksort(){
     quicksort(0,lista.length-1);
    }
    private void quicksort(int low,int high) {                         
		int i=low, j =high;
		int pivot = lista[low + (high-low)/2];
		while (i <= j) {
			while (lista[i] < pivot) {
				i++;
			}
			while (lista[j] > pivot) {
				j--;
			}

			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		// Recursion
		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}

	private void exchange(int i, int j) {
		int temp = lista[i];
		lista[i] = lista[j];
		lista[j] = temp;
	}

    @Override
    public int[] orden(int[] lista) {
        System.out.println("Quicksort");
        this.lista=lista;
        quicksort();
        return this.lista;
    }
        
    
}
