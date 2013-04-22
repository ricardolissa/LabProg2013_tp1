/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer6.sol;

/**
 *
 * @author Martin
 */
public class UserId implements Estado{

    Ftp p;
    
    public UserId (Ftp nuevoftp)
    {
      this.p = nuevoftp;
    }
    
    @Override
    public void checkUser(String ruser) {}

    @Override
    public void checkPasswd(String pass) 
    {
    	if (pass.equals(p.getPasswd())) 
        {
        System.out.println("Password correcta!");
        p.setEstado(p.getConected());
        System.out.println("Usted tiene acceso al siguiente archivo: " + p.getArchivo());
        } 
        else 
        {
        System.out.println("Password incorrecto!");
        p.setEstado(p.getStart());
        p.close();
        }
    }
   
    public String getFile() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
