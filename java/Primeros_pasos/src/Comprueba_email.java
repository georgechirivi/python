import java.lang.classfile.*;
import javax.swing.JOptionPane;

public class Comprueba_email {
    public static void main(String[] args) throws Exception {
        int arroba=0;
        String mail=JOptionPane.showInputDialog(("Introduce email"));
        for(int i=0; i<mail.length(),i++){
            if(mail.charAt(i)=='@')
                arroba++;
        }
    }if(arroba==true)

    {
        System.out.println("Es correcto");
    }else
    {
        System.out.println("No es correcto");
    }

}
