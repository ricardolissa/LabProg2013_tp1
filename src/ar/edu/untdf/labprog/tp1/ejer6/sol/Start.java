/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer6.sol;

/**
 *
 * @author Martin
 */
public class Start implements Estado {

    Ftp p;
    
    public Start (Ftp nuevoftp){
    this.p = nuevoftp;
    }
    
    @Override
    public void checkUser(String ruser) {
        //if (estado.equals(FtpState.START)) {
            if (ruser.equals(p.getUser())) {
               p.setEstado(p.getUserid());
               System.out.println("Ingrese su clave");
        } else {
            System.out.println("Usuario incorrecto");
         p.setEstado(p.getStart());
        }
       }
    
    @Override
    public void checkPasswd(String pass) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getFile() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
