public class Animal{

    public String nombre;
    public int edad;
    public String tipo;

    public Animal(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

    public void comer() {
        System.out.println(nombre +" esta comiendo. ");
    }
    public void dormir() {
        System.out.println(nombre+ " esta duemiendo. ");
    }
    public void hacerSonido() {
        System.out.println(nombre+ "esta haciendo sonido. ");
    }

}
