/*Clase Math:
La clase Math contiene un muestrario de metodos que nos permitira realizar calculos matematicos
+ Math.sqrt(n): raiz cudrada de un numero
+ Math.pow(base, exponente): potencia de un numero. Base y esponente son un doule.
 * + Math.sin(angulo). Math.cos(angulo), Math.tan(angulo), Math.sin(angulo). Math.cos(angulo), Math.tan(angulo), Math.atan(angulo)
 * * Math.round(decimal): redondeo de un numero
 * + Math.Pi: constante de clase con el numero PI
 */


 public class Math {
    public static void main(String[] args) {
        //double raiz=Math.sqrt(9);
        
        //Refundicion
        //int raiz=(int)Math.round(num1);
        double num1=5.85;
        int resultado=(int)Math.round(num1);
        System.out.println(resultado);
    }
}
