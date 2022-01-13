import javax.swing.JOptionPane;

public class Ej12NumerosAcabaApp {
	
	//  @author Adri�n Rodriguez
	
	public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero"));
        String opcion = JOptionPane.showInputDialog("Introduce el n�mero que quieres ver");
        int lista[] = new int[num];
        rellenar(lista);
        mostrar(lista);
        sumar(lista);
        mostraropcion(lista, opcion);
    }

    public static void rellenar(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            int num1 = ((int) Math.floor(Math.random() * (300 - 1) + 1));
            lista[i] = num1;
        }
    }

    public static void mostrar(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }

    public static void sumar(int lista[]) {
        int resultado = 0;
        for (int i = 0; i < lista.length; i++) {
            resultado += lista[i];
        }
        System.out.println("La suma es : " + resultado);
    }

    public static void mostraropcion(int lista[], String opcion) {
        String num;
        for (int i = 0; i < lista.length; i++) {
            num = Integer.toString(lista[i]);
            if (num.contains(opcion)) {
                System.out.println("N�mero elegido: " + lista[i]);
            }

        }
    }
}
