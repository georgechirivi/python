
/*
Bucle While (Meentras)
Sintaxis: 
While (Condicion){
linea 1
linea 2 
Linea 3
}
 * 
*/
import javax.swing.*;
import java.lang.String;
public class Bucles {
    public static void main(String[] args) throws Exception {
        String clave = "Jorge";

        String pass = "";

        while (clave.equals(pass) == false) {
            pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor");

            if (clave.equals(pass) == false) {
                System.out.println("Contraseña Incorrecta");
            }

        }
        System.out.println("Contraseña correcta, Accesopermitido");

    }
}
