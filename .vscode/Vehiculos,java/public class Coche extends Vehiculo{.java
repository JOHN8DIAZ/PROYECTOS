public class Coche extends Vehiculo{
    private int numPuertas;

    public void Coche(String marca, String modelo, int numPuertas){
        super(marca, modelo);
        this.numPuertas = numPuertas;
    }
    public void mostrarDetalles() {
        System.out.println("Detalles del coche: ");
        detalles();
        System.out.println("Numero de puertas: " + numPuertas);
    }
}
