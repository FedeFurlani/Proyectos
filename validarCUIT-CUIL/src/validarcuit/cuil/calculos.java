/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validarcuit.cuil;

/**
 *
 * @author Fede
 */
public class calculos {
    
    public static boolean validacioncuil(String cuit){
    
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
        }
}
