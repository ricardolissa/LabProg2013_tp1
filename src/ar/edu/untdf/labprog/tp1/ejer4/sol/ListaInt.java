/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer4.sol;

/**
 *
 * @author Matias
 */

public class ListaInt 
{

    private Ordenamiento o = null;
    private Busqueda a = null;
    private int[] lista;
    
    public void setO(Ordenamiento o){
     this.o=o;    
    }
    
    public void setBusqueda(Busqueda a){
    this.a=a;
    } 
    public ListaInt(int[] list){
    lista=list;
    } 
    
    
    
    
    public void bus(int[]lista, int b)
    {
     if (a.buscar(lista, b) == true)
     {
        System.out.println("encontrado");
     };
          
    }
    public void sort()
     {
     o.orden(lista);
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
    
        public static void main(String[] args) {
            int [] test={34,6,3,3,5,6,4,434,5,7,8,535,67,8,8,4,63464,7,8,6,86,85,54,6346,346,4,546,985};
            ListaInt l =new ListaInt(test);
            l.setO(new Quicksort());
               
            l.printMe();
            l.sort();
            l.setO(new Mergesort());
            l.setBusqueda(new Secuencial());
            l.bus(test,6);
            
               
    }
}
