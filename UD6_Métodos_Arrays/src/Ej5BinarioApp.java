import javax.swing.JOptionPane;

public class Ej5BinarioApp {

	//  @author Adrián Rodriguez
	
	public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        String binario = decimalBinario(numero);
        System.out.println("El numero " + numero + " en binario es " + binario);
    }
	
	public static String decimalBinario (int numero){
        String binario="";
        String digito;
        for(int i = numero; i > 0; i/=2){
            if(i%2==1) {
                digito = "1";
            } else {
                digito = "0";
            }
            binario = digito + binario;
        }
        return binario;
    }
}