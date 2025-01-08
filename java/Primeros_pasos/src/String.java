/* Clase String
 * String no es un tipo primitivo
 * Como almacenar una cadena de caracteres?
 * String mi_nombre="Jorge"; donde mi_nombre es un objeto(instancio, ejemplar) de la clase String
 * Metodos (mas usados) de la clase Stringpara manipulacion de cadena de texto:
 * length(): devuelve la longitud de una cadena de caracteres
 * mi_nombre.length()=5
 * charAt(): devuelve la posicion de un caracter de una cadena derntro de una cadena.(La posicion empieza a contar desde cero)
 * mi_nombre.charAt(2)=r
 * substring(x,y): devuelve una subcadena dentro de la cadena, siendo de la cadena, siendo X elcaracter a partir del cual se extrae Y el Numero de caracteres que se quieren extraer
 * equals(cadena): Devuelve true  si dos cadenas de caracters son iguales y false si no lo son.Distingue mayusculas y minusculass
 * equalsIgnoreCase(cadena): Igual que la anterios pero no tiene encuenta si es mayuscula o minuscula
 * 
 */
import java.lang.*;
 public class String {
    public static void main(String[] args) {
        String nombre = "Jorge";
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi nombre tiene " + nombre.length() + " letras. ");
        System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));
        int ultima_letra=nombre.length();
        System.out.println("Y la ultima letra es la " + nombre.charAt(ultima_letra-1));
    }

}
