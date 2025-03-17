package biblioteca;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n📚 MENÚ BIBLIOTECA");
            System.out.println("1 Agregar un libro");
            System.out.println("2 Buscar libro por título");
            System.out.println("3 Buscar libros por autor");
            System.out.println("4 Buscar libros por ISBN");
            System.out.println("5 Listar todos los libros");
            System.out.println("6 Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("isbn: ");
                    String isbn = scanner.nextLine();
                    biblioteca.agregarLibro(new Libro(titulo, autor, isbn));
                    break;
                case 2:
                    System.out.print("Introduce el título: ");
                    String buscarTitulo = scanner.nextLine();
                    biblioteca.buscarPorTitulo(buscarTitulo);
                    break;
                case 3:
                    System.out.print("Introduce el autor: ");
                    String buscarAutor = scanner.nextLine();
                    biblioteca.buscarPorAutor(buscarAutor);
                    break;
                case 4:
                    System.out.println("Introduce el ISBN: ");
                    String buscarISBN = scanner.nextLine();
                    biblioteca.buscarPorISBN =(buscarISBN);

                case 5:
                    biblioteca.listarLibros();
                    break;
                case 6:
                    System.out.println("👋 Saliendo del programa...");
                    break;
                default:
                    System.out.println("⚠️ Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}


