import java.util.*;
import java.lang.System;

public class Adivina_numero {
    public static void main(String[] args) throws Exception {

        int aleatorio=(int)(Math.random()*100);
        Scanner entrada = new Scanner(System.in);

        int numero = 0;

        int intentos = 0;

        while (numero != aleatorio) {

            intentos++;

            System.out.println("Introduce un numero por favor");

            numero = entrada.nextInt();

            if (aleatorio < numero) {
                System.out.println("Mas bajo");
            }

            else if (aleatorio > numero) {
                System.out.println("Mas alto");
            }

        }
        System.out.println(("Correcto.Lo has conseguido en " + intentos + " intentos "));
        System.out.println(aleatorio);
    }
}
