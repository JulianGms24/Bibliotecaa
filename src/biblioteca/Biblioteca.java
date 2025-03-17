package biblioteca;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    // Constructor
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    // Método para agregar un libro
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("📚 Libro agregado: " + libro.getTitulo());
    }

    // Método para buscar libros por título
    public void buscarPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(libro);
                return;
            }
        }
        System.out.println("❌ No se encontró ningún libro con ese título.");
    }

    // Método para buscar libros por autor
    public void buscarPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(libro);
            }
        }
    }
    public void buscarPorISBN(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                System.out.println("Libro Encontrado"+libro);

            }
        }
        System.out.println("no se encontro  libro con ese ISBN.");
    }
    // Método para listar todos los libros
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("📭 La biblioteca está vacía.");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }
}