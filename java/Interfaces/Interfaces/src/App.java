public class App {
    public static void main(String[] args) throws Exception {
     Delfin delfin = new Delfin("Adolfin");
     Pulpo pulpo = new Pulpo("Gonzales", 8);

     delfin.nadar();
     delfin.comunicarse();
     
     pulpo.nadar();
     pulpo.comunicarse();
    }
}
