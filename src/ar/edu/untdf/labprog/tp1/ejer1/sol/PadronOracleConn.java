/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer1.sol;

import ar.edu.untdf.labprog.tp1.ejer1.sol.Conn;

/**
 *
 * @author matiasgel
 */
public class PadronOracleConn extends Padron{
   
    Conn getConn(){
        return new OracleConn();
    }

  
}
