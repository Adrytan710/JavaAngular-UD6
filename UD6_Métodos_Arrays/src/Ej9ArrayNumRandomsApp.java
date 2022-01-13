import javax.swing.JOptionPane;

public class Ej9ArrayNumRandomsApp {
	
	//  @author Adrián Rodriguez
	
	public static void main(String[] args) {
	    int num[] = new int[Integer.parseInt(JOptionPane.showInputDialog("Introduce un tamaño"))];
	    rellenarAleatorios(num);
	    mostrarArray(num);
	    sumarArray(num);
	}
	
	public static void rellenarAleatorios(int num[]){
	    for(int i = 0; i < num.length; i++) {
	        int num1 = ((int)Math.floor(Math.random()*(10-0)+0));
	        num[i] = num1;
	    }
	}
	
	public static void mostrarArray(int num[]){
	    for(int i = 0; i < num.length; i++){
	        System.out.println("En el indice " + i + " esta el valor " + num[i]);
	    }
	}
	
	public static void sumarArray(int num[]){
		double resultado = 0;
	    for(int i = 0; i < num.length; i++){
	        resultado = resultado + num[i];
	    }
	    System.out.println(resultado);
	}
}
