public class Electronico extends Producto{
    private int garantia;

    public int getgarantia() {
        return garantia;
    }

    public void setgarantia(int garantia) {
        this.garantia = garantia;
    }
    public void mostrarInfomracion() {
        System.out.println("Nombre: " + getnombre() );
        System.out.println("Precio: " + getprecio() );
        System.out.println("Garantia: " + getgarantia() );
    }
}