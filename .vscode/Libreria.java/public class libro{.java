public class libro{

    public String titulo;
    public String autor;
    public int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void abrir() {
        System.out.println("el libro'" +titulo+ "' de" +autor+ "esta abierto. ");
    }
    public void leer() {
        System.out.println("el libro'" +titulo+ "se esta leyendo en" +paginas+ ".");
    }
    public void cerrar() {
        System.out.println("el libro '" +titulo+ "'esta cerrado. ");
    }
}