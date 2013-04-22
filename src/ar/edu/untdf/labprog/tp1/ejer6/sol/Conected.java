/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer6.sol;

/**
 *
 * @author Martin
 */
public class Conected implements Estado{
    	
Ftp p;

public Conected (Ftp nuevoftp)
{
this.p = nuevoftp;    
}
    public String getFile() {
// TODO Auto-generated method stub
return p.getArchivo();
}

    @Override
    public void checkUser(String ruser) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void checkPasswd(String pass) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
