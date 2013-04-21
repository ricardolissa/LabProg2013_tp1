package ar.edu.untdf.labprog.tp1.ejer1.sol;

import ar.edu.untdf.labprog.tp1.ejer1.sol.Conn;

public class PadronPostgresConn extends Padron
{
    @Override
    Conn getConn() {
        return new PostgresConn();
    }

  
     
}
