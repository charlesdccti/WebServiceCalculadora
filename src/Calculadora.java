import javax.jws.WebService;

/**
 * 
 */


/**
 * @author charles
 *
 */
@WebService(targetNamespace = "http://default_package/", portName = "CalculadoraPort", serviceName = "CalculadoraService")
public class Calculadora {
	
	public String somar( Integer op1, Integer op2){
		
		return String.valueOf(op1 + op2);
	}
	
	public String subtrair( Integer op1, Integer op2){
		
		return String.valueOf(op1 + op2);
	}
	
	public String multiplicar( Integer op1, Integer op2){
		
		return String.valueOf(op1 * op2);
	}
	
	public String dividir( Integer op1, Integer op2){
		
		return String.valueOf(op1 / op2);
	}
}
