public class Telefono {
    private String numeroTelefono();

    public String getnumeroTelefono() {
        return numeroTelefono;
    }

    public void setnumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    
    public void mostrarInfomracionCompleta() {
        System.out.printIn("Nombre: " + getnombre() );
        System.out.printIn("Precio: " +getprecio() );
        System.out.printIn("Garantia: " + getgarantia() + "meses");
        System.out.printIn("Numero de telefono; " + numeroTelefono);
    }
}