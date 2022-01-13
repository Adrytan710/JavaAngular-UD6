import javax.swing.JOptionPane;

public class Ej8Array10App {
	
	//  @author Adrián Rodriguez
	
	public static void main(String[] args) {
	    int num[] = new int[10];
	    rellenarArray(num);
	    mostrarArray(num);
	}

	public static void rellenarArray(int num[]) {
	    for (int i = 0; i < num.length; i++) {
	        num[i]= Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
	    }
	}
	
	public static void mostrarArray(int num[]) {
	    for (int i = 0; i < num.length; i++){
	        System.out.println("En el indice " + i + " esta el valor " + num[i]);
	    }
	}
}
