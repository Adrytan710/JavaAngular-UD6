import javax.swing.JOptionPane;

public class Ej2MostrarNumsApp {

	//  @author Adrián Rodriguez
	
	public static void main(String[] args) {
		
		rangos();
		
	}
	
	public static void rangos() {
		
	   int rango = Integer.parseInt(JOptionPane.showInputDialog("Introduce el rango de números"));
       int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número"));
       int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número"));
       completar(rango, num1, num2);
	}
	
	 public static void completar(int rango,int num1,int num2) {
        for(int i = 0; i < rango; i++) {
            System.out.println(generarNum(num1, num2));
        }
	 }
	 
	 public static int generarNum(int num1, int num2) {
        return ((int)Math.floor(Math.random()*(num2-num1) + num1));
    }
}
