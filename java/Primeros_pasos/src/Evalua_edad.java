import java.util.*;

public class Evalua_edad {
    public static void main(String[] args ) throws Exception {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Introduce tu edad, por favor");
            int edad=entrada.nextInt();
            if(edad>=18){
                System.out.println("Eres mayor de edad");
            }
            else{
                System.err.println("Eres menor de edad");
            }
        }
    }
}
