/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer9.sol;

/**
 *
 * @author Martin
 */
public class FieldValidator 
{
    Validacion validar;
    
    public FieldValidator(String texto) {
        setTipoCampo(texto);
    }

    public void setTipoCampo(String texto) {
        if (texto.equals("Email")) {
            validar = new Email();
        } else if (texto.equals("Documento")) {
            validar = new Documento();
        } else {
            System.out.println("el texto es incorrecto");
        }
    }

    public void validate(String campo) 
    {
        if (validar.isValid(campo)) {
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
        }
    }
}