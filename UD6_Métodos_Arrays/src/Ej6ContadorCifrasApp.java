import javax.swing.JOptionPane;

public class Ej6ContadorCifrasApp {

	//  @author Adrián Rodriguez
	
	public static void main(String[] args) {
	
		contarCifras();
	}
	
	public static void contarCifras() {
		String num = JOptionPane.showInputDialog("Introduce el número");
        int numero = Integer.parseInt(num);
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, num.length());
        } else {
            JOptionPane.showMessageDialog(null, "Introduce un número positvo");
        }
	}
}