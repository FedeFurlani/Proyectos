/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validarcuit.cuil;

import javax.swing.JOptionPane;

/**
 *
 * @author Fede
 */
public class ValidarCUITCUIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Form F=new Form();
        F.setVisible(true);
        /*
        JOptionPane.showMessageDialog(null, "BIENVENIDO A VALIDACION DE CUIT/CUIL");
        String dato = JOptionPane.showInputDialog(
        null,"Introduzca su CUIT/CUIL",
        "Validacion CUIT/CUIL",
        JOptionPane.QUESTION_MESSAGE) ;
        boolean bol= isValidCUITCUIL(dato);
        if(bol)
        {
            JOptionPane.showMessageDialog(null, "CUIT/CUIL correcto.");
        } else JOptionPane.showMessageDialog(null, "CUIT/CUIL incorrecto.", "Validacion CUIT/CUIL", JOptionPane.WARNING_MESSAGE);
        */
    }
    
    /* public static boolean isValidCUITCUIL(String cuit){
    
    if (cuit.length() != 13) return false;
	
	boolean rv = false;
	int resultado = 0;
	String cuit_nro = cuit.replace("-", "");
	String codes = "6789456789";
	int verificador = Character.getNumericValue(cuit_nro.charAt(cuit_nro.length() - 1));
	int x = 0;
		
	while (x < 10)
	{
		int digitoValidador = Integer.parseInt(codes.substring(x, x+1));
		int digito = Integer.parseInt(cuit_nro.substring(x, x+1));
		int digitoValidacion = digitoValidador * digito;
		resultado += digitoValidacion;
		x++;
	}
	resultado = resultado % 11;
	rv = (resultado == verificador);
	return rv;    
} */
   
}
