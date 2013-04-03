/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer1;

/**
 *
 * @author matiasgel
 */
public class OracleConn implements Conn{
    public void connect(){
        System.out.println("Conectado  a oracle");
    }; 
    public void query(){
        System.out.println("consulta");
    }
    
}
