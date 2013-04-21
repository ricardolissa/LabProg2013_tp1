/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer2.sol;

/**
 *
 * @author Martin
 */
public class Adapter implements Conn{
    MsSqlServer server = null;
    public Adapter(){
    
    server = new MsSqlServer();
    };
    public void connect()
    {
     server.getConnect();
    }
    
    public void query()
    {
    server.ExecuteQuery();
    }
    
}
