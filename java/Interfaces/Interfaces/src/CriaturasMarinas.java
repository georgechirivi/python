public abstract class CriaturasMarinas {

    // Variables 
    String nombre;

    public CriaturasMarinas(String nombre) {
        this.nombre = nombre;
    }

    // esta obligado a sobreesdribir en las clases que hereden de criaturas marinas
    abstract void nadar();

}
