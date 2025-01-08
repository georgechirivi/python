public class persona {

    //Atributos (estado/caracteristicas deun objeto)
    public String nombre;
    public String apellido;
    public int edad;
    public String carrera;
    // Metodo (comportamiento de un objeto)

    public String darNombreCompleto(){
        return apellido + " , " + nombre;
    }

    public String enviarSaludo(String saludado) {
        return "Hola, Como esats? " + saludado + " ? ";
    }
}
