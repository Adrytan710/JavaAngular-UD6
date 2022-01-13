import javax.swing.JOptionPane;

public class Ej7ConversionesApp {

	//  @author Adrián Rodriguez
	
	public static void main(String[] args) {
		conversor();
	}
	
	public static void conversor (){
		double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Escribe una cantidad de euros"));
		String moneda = JOptionPane.showInputDialog("¿A qué moneda quieres convertir?");
		double resultado = 0;
		boolean correcto = true;
		
		switch (moneda) {
			case "libras":
		    	resultado = cantidad*0.86;
		        break;
		    
			case "dolares":
		        resultado = cantidad*1.29;
		        break;
		    
			case "yenes":
		        resultado = cantidad*129.852;
		        break;
		    
			default:
		        System.out.println("No has introducido una moneda correcta");
		        correcto = false;
		 }
		     
		 if (correcto){
			 System.out.println("La cantida de " + cantidad + " euros en " + moneda +
									" son " + resultado);
		 }
	}
}

