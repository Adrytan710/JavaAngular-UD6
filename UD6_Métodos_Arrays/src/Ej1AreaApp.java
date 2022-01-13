import javax.swing.JOptionPane;

public class Ej1AreaApp {

	//  @author Adrián Rodriguez
	
	public static void main(String[] args) {
		calculos();
	}
	
	public static void calculos() {
		double resultado = 0;
		String figura = JOptionPane.showInputDialog("Introduce circulo, triangulo o cuadrado");
		
		switch (figura) {
        	case "circulo":
        		resultado = calcularCirculos();
        		System.out.println(resultado);
        		break;

        	case "triangulo":
        		resultado = calcularTriangulos();
        		System.out.println(resultado);
        		break;

        	case "cuadrado":
        		resultado = calcularCuadrados();
        		System.out.println(resultado);
        		break;

         default:
             System.out.println("La figura introducida no es correcta");
             break;
		}
	}

	public static double calcularCirculos() {
	    double radio = Double.parseDouble(JOptionPane.showInputDialog("introduce el radio"));
	    double resultado = Math.PI*Math.pow(radio, 2);
	    return resultado;
	}

	public static double calcularTriangulos() {
	    double base= Double.parseDouble(JOptionPane.showInputDialog("introduce la base"));
	    double altura= Double.parseDouble(JOptionPane.showInputDialog("introduce la altura"));
	    double resultado = (base * altura) / 2;
	    return resultado;
	}
	
	public static double calcularCuadrados() {
	    double lado= Double.parseDouble(JOptionPane.showInputDialog("introduce el lado"));
	    double resultado = lado * lado;
	    return resultado;
	}
}