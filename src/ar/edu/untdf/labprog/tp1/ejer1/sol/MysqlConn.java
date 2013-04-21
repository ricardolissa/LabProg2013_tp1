/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer1.sol;

/**
 *
 * @author matiasgel
 */
public class MysqlConn implements Conn{
    public void connect(){
        System.out.println("Conectado  a mysql");
    }; 
    public void query(String q){
        System.out.println("consulta");
    }
}
