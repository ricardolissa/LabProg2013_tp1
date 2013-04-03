/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer4;

/**
 *
 * @author Matias
 */
public class ListaInt {
    private int[] lista;
    public ListaInt(int[] list){
    lista=list;
    }
    public void sort(String tipo){
        if (tipo.equals("quicksort"))
            this.quicksort();
                    else 
            if (tipo.equals("mergesort"))
                this.mergesort();    
    }
    public void printMe(){
        System.out.println();
        System.out.print("(");
        for(int x:lista){
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.print(")");
        System.out.println();
    }
    private void mergesort(){
        mergesort(0,lista.length-1, new int[lista.length]);
    }
    private void mergesort(int low, int high,int[] helper) {		
		if (low < high) {			
			int middle = (low + high) / 2;			
			mergesort(low, middle,helper);			
			mergesort(middle + 1, high,helper);			
			merge(low, middle, high,helper);
		}
	}

	private void merge(int low, int middle, int high,int [] helper) {
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
        
        public static void main(String[] args) {
            int [] test={34,6,3,3,5,6,4,434,5,7,8,535,67,8,8,4,63464,7,8,6,86,85,54,6346,346,4,546,985};
            ListaInt l =new ListaInt(test);
            l.printMe();
            l.sort("quicksort");
            l.printMe();
            
           
      
    }
}
