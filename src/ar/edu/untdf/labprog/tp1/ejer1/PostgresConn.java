package ar.edu.untdf.labprog.tp1.ejer1;

public class PostgresConn implements Conn{
    
     public void connect(){
        System.out.println("Conectado  a postgres");
    };
    public void query(){
        System.out.println("consulta");
    }
     
}
