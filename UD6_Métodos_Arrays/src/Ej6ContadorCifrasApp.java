import javax.swing.JOptionPane;

public class Ej6ContadorCifrasApp {

	//  @author Adri�n Rodriguez
	
	public static void main(String[] args) {
	
		contarCifras();
	}
	
	public static void contarCifras() {
		String num = JOptionPane.showInputDialog("Introduce el n�mero");
        int numero = Integer.parseInt(num);
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, num.length());
        } else {
            JOptionPane.showMessageDialog(null, "Introduce un n�mero positvo");
        }
	}
}