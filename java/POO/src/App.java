public class App {
    public static void main(String[] args) throws Exception {

        Animal animal = new Animal("Bestia", 20);
        Gato gato = new Gato("Glottis", 10);
        Perro perro = new Perro("Princesa", 10);

        System.out.println("El animal llamado " + animal.nombre + " hace: ");
        System.out.println(animal.hacerSonido());
        System.out.println("El gato llamado " + gato.nombre + " hace: ");
        System.out.println(gato.hacerSonido());
        System.out.println("El perro llamado " + gato.nombre + " hace: ");
        System.out.println(perro.hacerSonido());

        System.out.println("El total de los animales creados es de : " + animal.getCantAnimales());
        System.out.println("Yo atiendo a mis animalitos en " + Veterinaria.nombre);
    }
}
