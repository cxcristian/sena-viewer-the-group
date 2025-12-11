import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option = -1;

        do {
            System.out.println("\n=== SENA VIEWER ===");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Report Today");
            System.out.println("0. Exit");
            System.out.print("Selecciona opción: ");

            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                option = -1;
            }

            switch (option) {
                case 1:
                    showMovies();
                    break;
                case 2:
                    showSeries();
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                    showMagazines();
                    break;
                case 5:
                    System.out.println("Generando Reporte General...");
                    
                    break;
                case 6:
                    System.out.println("Generando Reporte del Día...");
                  
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("❌ Opción inválida, intenta de nuevo.");
            }

        } while (option != 0);

    }

    // --- MÉTODOS DEL MENÚ ---

    private static void showMovies() {
        System.out.println("\n=== LISTA DE PELÍCULAS ===");

        System.out.println("Simulando lista de películas...");

        System.out.println("Volviendo al menú...");
    }

    private static void showSeries() {
        System.out.println("\n=== LISTA DE SERIES ===");
        System.out.println("Simulando lista de series...");
        System.out.println("Volviendo al menú...");
    }

    private static void showBooks() {
        System.out.println("\n=== LISTA DE LIBROS ===");
        System.out.println("Simulando lista de libros...");
        System.out.println("Volviendo al menú...");
    }

    private static void showMagazines() {
        System.out.println("\n=== LISTA DE REVISTAS ===");
        System.out.println("Simulando lista de revistas...");
        System.out.println("Volviendo al menú...");
    }

}
