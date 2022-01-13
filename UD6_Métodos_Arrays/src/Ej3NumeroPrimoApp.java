import javax.swing.JOptionPane;

public class Ej3NumeroPrimoApp {

	//  @author Adri�n Rodriguez
	
	public static void main(String[] args) {
		
		primo();
	}
	
	public static void primo() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero"));
        if (primoSi(num)) {
            System.out.println("El numero " + num + " es primo");
        } else {
            System.out.println("El numero " + num + " no es primo");
        }
    }
	
    public static boolean primoSi (int num){
    	  int cont = 2;
          boolean esPrimo = true;
          while ((esPrimo) && (cont != num)) {
              if (num%cont == 0)
                  esPrimo = false;
              cont++;
          }
          return esPrimo;
     }
}