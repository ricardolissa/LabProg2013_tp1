package ar.edu.untdf.labprog.tp1.ejer6;

/**
 * 
 * @author Matias
 */
public class Ftp {

    private String user = "admin";
    private String passwd = "1234";
    private final String archivo = "unarchivo.txt";

    enum FtpState {

        START, USERID, CONECTED
    };
    FtpState estado;

    public Ftp() {
        estado = FtpState.START;
        System.out.println(estado);
    }

    /**
     * Verifica el usuario
     * @param ruser el usuario a verificar
     */
    public void checkUser(String ruser) {
        if (estado.equals(FtpState.START)) {

            if (ruser.equals(user)) {
                estado = FtpState.USERID;
                System.out.println("Ingrese su clave");
            }
            
        } else {
            System.out.println("error, comando no esperado");
            this.estado = FtpState.START;

        }

    }

    public void checkPasswd(String pass) {
        if (estado.equals(FtpState.USERID)) {
            System.out.println("Bienvenido");
            if (pass.equals(passwd)) {
                estado = FtpState.CONECTED;
            }
        } else {
            System.out.println("error, comando no esperado");
            this.estado = FtpState.START;
        }

    }

    public String getFile() {
        if (estado.equals(FtpState.CONECTED)) {
            return archivo;
        } else {
            System.out.println("error, comando no esperado");
            this.estado = FtpState.START;
            return null;
        }
    }

    public void close() {
        estado = FtpState.START;
    }

    public static void main(String[] args) {
        Ftp ftp = new Ftp();
        ftp.checkUser("admin");
        ftp.checkPasswd("admin");

    }
}
