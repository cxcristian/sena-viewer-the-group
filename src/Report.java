import java.util.ArrayList;
import java.time.LocalDate;

public class Report {

    // Reporte general
    public static void generateReport(
            ArrayList<Movie> movies,
            ArrayList<Series> series,
            ArrayList<Book> books,
            ArrayList<Magazine> magazines
    ) {

        System.out.println("\n=== REPORTE GENERAL ===");

        System.out.println("\nPELÍCULAS VISTAS:");
        for (Movie m : movies) {
            if (m.isViewed()) {
                System.out.println("- " + m.getTitle() + " (" + m.getYear() + ")");
            }
        }

        System.out.println("\nSERIES VISTAS:");
        for (Series s : series) {
            if (s.isViewed()) {
                System.out.println("- " + s.getTitle() + " (" + s.getYear() + ")");
            }
        }

        System.out.println("\nLIBROS LEÍDOS:");
        for (Book b : books) {
            if (b.isReaded()) {
                System.out.println("- " + b.getTitle() + " (" + b.getEdititionDate() + ")");
            }
        }

        System.out.println("\nREVISTAS LEÍDAS:");
        for (Magazine m : magazines) {
            if (m.isReaded()) {
                System.out.println("- " + m.getTitle());
            }
        }

        System.out.println("\n=== FIN REPORTE ===");
    }



    // Reporte del día
    public static void generateReportToday(
            ArrayList<Movie> movies,
            ArrayList<Series> series,
            ArrayList<Book> books,
            ArrayList<Magazine> magazines
    ) {

        System.out.println("\n=== REPORTE DEL DÍA ===");

        String today = LocalDate.now().toString();

        System.out.println("Fecha: " + today + "\n");

        System.out.println("PELÍCULAS VISTAS HOY:");
        for (Movie m : movies) {
            if (m.isViewed() && today.equals(m.getDateViewed())) {
                System.out.println("- " + m.getTitle());
            }
        }

        System.out.println("\nSERIES VISTAS HOY:");
        for (Series s : series) {
            if (s.isViewed() && today.equals(s.getDateViewed())) {
                System.out.println("- " + s.getTitle());
            }
        }

        System.out.println("\nLIBROS LEÍDOS HOY:");
        for (Book b : books) {
            if (b.isReaded() && today.equals(b.getDateReaded())) {
                System.out.println("- " + b.getTitle());
            }
        }

        System.out.println("\nREVISTAS LEÍDAS HOY:");
        for (Magazine m : magazines) {
            if (m.isReaded() && today.equals(m.getDateReaded())) {
                System.out.println("- " + m.getTitle());
            }
        }

        System.out.println("\n=== FIN REPORTE DEL DÍA ===");
    }
}
