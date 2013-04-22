package ar.edu.untdf.labprog.tp1.ejer6.sol;


/**
 * 
 * @author Martin
 */
public class Ftp {

    Estado start;
    Estado userid;
    Estado conected;

    Estado estado;
    
    private String user = "admin";
    private String passwd = "1234";
    private final String archivo = "unarchivo.txt";

    
    public Ftp() {
    
     start = new Start(this);
     userid = new UserId(this);
     conected = new Conected(this);
    
        estado = start;
    }
    
    
    public String getUser() {
return user;
}
    
public String getPasswd() {	
return passwd;	
}

  public String getArchivo() {
return archivo;
}


public void checkUser(String ruser) {
       estado.checkUser(ruser);
    }
    
    public void checkPasswd(String pass) {
       estado.checkPasswd(pass);
    }

    public String getFile() {
       return estado.getFile();
    }
    
public void close(){
//estado.close();
}

public void setEstado(Estado estado) {
this.estado = estado;
}
    
    
public Estado getStart() {return start;}
public Estado getConected() {	return conected;}
public Estado getUserid() {	return userid;}

}


 