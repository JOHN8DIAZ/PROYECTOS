public class Vehiculo{

    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca
        this.modelo = modelo 
    }
    public void detalles() {
        System.out.println("Detalles del vehiculo");
        System.out.println("Marca: " +marca);
        System.out.println("modelo: " +modelo);
    }
    

}