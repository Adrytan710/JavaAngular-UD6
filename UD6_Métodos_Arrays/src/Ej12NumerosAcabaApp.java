import java.util.Random;
import javax.swing.JOptionPane;

public class Ej12NumerosAcabaApp {
	
	//  @author Adri�n Rodriguez
	
	public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero"));
        int numFinal = Integer.parseInt(JOptionPane.showInputDialog("Introduce el n�mero en el que quieres que acabe"));
        int array[]= new int[num1];
        rellenarArray(array);
        mostrarFinal(array, numFinal);
    }

    public static void rellenarArray(int array[]) {
        Random claseRandom = new Random();
        for (int i = 0; i < array.length; i++) {
            int num1 = claseRandom.nextInt(300);
            array[i] = num1;
        }
    }

    public static void mostrarFinal(int array[], int numfinal) {
    	int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%10 == numfinal) {
                System.out.println(array[i]+ " acaba en " + numfinal);
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No hay ningun n�mero que acabe en " + numfinal);
        }
    }
}
