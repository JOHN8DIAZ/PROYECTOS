public class Persona{

    public String nombre;
    public int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void presentarse() {
        System.out.println("Hola, mi nombre es" +nombre+ " y tengo " +edad+ " años. ");
    }
}