
import javax.swing.JOptionPane;
import java.lang.ClassNotFoundException;

public class Factorial {
    public static void main(String[] args) {
        int resultado = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un mumero"));
        for (int i = numero; i > 0; i--) {
            resultado = resultado * i;
        }
        System.out.println("El Factorial de " + numero + " es " + resultado);
    }

}
