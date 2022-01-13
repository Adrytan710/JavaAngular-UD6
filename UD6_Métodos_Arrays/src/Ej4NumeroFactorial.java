import javax.swing.JOptionPane;

public class Ej4NumeroFactorial {
	
	//  @author Adri�n Rodriguez

	public static void main(String[] args) {
		
		factor();
	}
	
	public static void factor() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero"));
	    System.out.println("El factorial de " + num + " es " + factorial(num));
	}
	
	public static int factorial (int num){
	    int resultado = num;
	    for(int i = (num-1); i > 0; i--){
	    	resultado = resultado*i;
	    }
	    return resultado;
	}
}