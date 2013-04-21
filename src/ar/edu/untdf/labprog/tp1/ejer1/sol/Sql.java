/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer1.sol;


/**
 *
 * @author Martin
 */
public class Sql {

    public void query(String type) 
    {
    
        Conn conn = null;
       conn.connect();
        conn.query("d");
            
    }
    
    public  static void main (String args[])
    {
    PadronMysql p = new PadronMysql();
    p.ingresarMenores();
    PadronPostgresConn a = new PadronPostgresConn();
    a.ingresarMenores();
    PadronOracleConn b = new PadronOracleConn();
    b.ingresarMenores();
    
    }
    
    }

