public class Estudiante extends Persona{

    private String carrera;

    public Estudiante(String nombre, int edad, String matricula, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }
    public void estudiar() {
        System.out.println("Estoy estudiando para mis examenes de la carrera de " +carrera+ ". ");
    }
}
