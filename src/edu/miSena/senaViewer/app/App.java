package edu.miSena.senaViewer.app;

import edu.miSena.senaViewer.model.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Movie> movies = Movie.makeMoviesList();
    private static List<Series> series = Series.makeSeriesList();
    private static List<Book> books = Book.makeBooksList();
    private static List<Magazine> magazines = Magazine.makeMagazinesList();

    public static void main(String[] args) {
        showMenu();
    }

    private static void showMenu() {
        int option = -1;
        while (option != 0) {
            System.out.println("\n=== SENA VIEWER ===");
            System.out.println("1. Películas");
            System.out.println("2. Series");
            System.out.println("3. Libros");
            System.out.println("4. Revistas");
            System.out.println("5. Reporte General");
            System.out.println("6. Reporte de Hoy");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");

            try {
                option = Integer.parseInt(scanner.nextLine());
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
                        makeGeneralReport();
                        break;
                    case 6:
                        makeTodayReport();
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida, por favor intenta de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor, ingresa un número válido.");
            }
        }
        scanner.close();
    }

    private static void showMovies() {
        System.out.println("\n=== Lista de Películas ===");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println((i + 1) + ". " + movies.get(i).getTitle() + " (Visto: " + movies.get(i).isViewed() + ")");
        }
        System.out.println("0. Volver al Menú Principal");
        System.out.print("Selecciona una película: ");

        try {
            int option = Integer.parseInt(scanner.nextLine());
            if (option > 0 && option <= movies.size()) {
                Movie selectedMovie = movies.get(option - 1);
                selectedMovie.setViewed(true);
                selectedMovie.setStartViewingDate(new Date());
                System.out.println("\n... VIENDO ...");
                System.out.println(selectedMovie);
                System.out.println("Marcado como visto.\n");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor, ingresa un número válido.");
        }
    }

    private static void showSeries() {
        System.out.println("\n=== Lista de Series ===");
        for (int i = 0; i < series.size(); i++) {
            System.out.println((i + 1) + ". " + series.get(i).getTitle());
        }
        System.out.println("0. Volver al Menú Principal");
        System.out.print("Selecciona una serie: ");

        try {
            int seriesOption = Integer.parseInt(scanner.nextLine());
            if (seriesOption > 0 && seriesOption <= series.size()) {
                Series selectedSeries = series.get(seriesOption - 1);
                
                int chapterOption = -1;
                while (chapterOption != 0) {
                    System.out.println("\n=== Capítulos de: " + selectedSeries.getTitle() + " ===");
                    List<Chapter> chapters = selectedSeries.getChapters();
                    if (chapters.isEmpty()) {
                        System.out.println("Esta serie aún no tiene capítulos.");
                        chapterOption = 0;
                        continue;
                    }

                    for (int i = 0; i < chapters.size(); i++) {
                        System.out.println((i + 1) + ". " + chapters.get(i).getTitle() + " (Visto: " + chapters.get(i).isViewed() + ")");
                    }
                    System.out.println("0. Volver a la Lista de Series");
                    System.out.print("Selecciona un capítulo: ");

                    chapterOption = Integer.parseInt(scanner.nextLine());
                    if (chapterOption > 0 && chapterOption <= chapters.size()) {
                        Chapter selectedChapter = chapters.get(chapterOption - 1);
                        selectedChapter.setViewed(true);
                        selectedChapter.setStartViewingDate(new Date());
                        System.out.println("\n... VIENDO CAPÍTULO ...");
                        System.out.println(selectedChapter);
                        System.out.println("Marcado como visto.\n");
                    }
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor, ingresa un número válido.");
        }
    }

    private static void showBooks() {
        System.out.println("\n=== Lista de Libros ===");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i).getTitle() + " (Leído: " + books.get(i).isReaded() + ")");
        }
        System.out.println("0. Volver al Menú Principal");
        System.out.print("Selecciona un libro: ");

        try {
            int option = Integer.parseInt(scanner.nextLine());
            if (option > 0 && option <= books.size()) {
                Book selectedBook = books.get(option - 1);
                selectedBook.setReaded(true);
                selectedBook.setStartReadingDate(new Date());
                System.out.println("\n... LEYENDO ...");
                System.out.println(selectedBook);
                System.out.println("Marcado como leído.\n");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor, ingresa un número válido.");
        }
    }

    private static void showMagazines() {
        System.out.println("\n=== Lista de Revistas ===");
        for (int i = 0; i < magazines.size(); i++) {
            System.out.println((i + 1) + ". " + magazines.get(i).getTitle());
        }
        System.out.println("0. Volver al Menú Principal");
        System.out.print("Selecciona una revista para ver detalles: ");

        try {
            int option = Integer.parseInt(scanner.nextLine());
            if (option > 0 && option <= magazines.size()) {
                Magazine selectedMagazine = magazines.get(option - 1);
                System.out.println("\n... DETALLES ...");
                System.out.println(selectedMagazine);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor, ingresa un número válido.");
        }
    }

    private static void makeGeneralReport() {
        Report report = new Report();
        report.setName("ReporteGeneral");
        report.setTitle("--- CONTENIDO VISTO ---");
        StringBuilder content = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        for (Movie movie : movies) {
            if (movie.isViewed()) {
                content.append("Película: ").append(movie.getTitle());
                if (movie.getStartViewingDate() != null) {
                    content.append(" (Visto en: ").append(sdf.format(movie.getStartViewingDate())).append(")");
                }
                content.append("\n");
            }
        }

        for (Series s : series) {
            for (Chapter chapter : s.getChapters()) {
                if (chapter.isViewed()) {
                    content.append("Serie: ").append(s.getTitle()).append(" - Capítulo: ").append(chapter.getTitle());
                    if (chapter.getStartViewingDate() != null) {
                        content.append(" (Visto en: ").append(sdf.format(chapter.getStartViewingDate())).append(")");
                    }
                    content.append("\n");
                }
            }
        }
        
        for (Book book : books) {
            if (book.isReaded()) {
                content.append("Libro: ").append(book.getTitle());
                if (book.getStartReadingDate() != null) {
                    content.append(" (Leído en: ").append(sdf.format(book.getStartReadingDate())).append(")");
                }
                content.append("\n");
            }
        }
        
        report.setContent(content.toString());
        report.makeReport();
    }

    private static void makeTodayReport() {
        Report report = new Report();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        report.setName("ReporteHoy_" + sdf.format(new Date()));
        report.setTitle("--- CONTENIDO VISTO HOY ---");
        StringBuilder content = new StringBuilder();
        
        SimpleDateFormat dateCmp = new SimpleDateFormat("yyyyMMdd");
        String todayStr = dateCmp.format(new Date());

        for (Movie movie : movies) {
            if (movie.isViewed() && movie.getStartViewingDate() != null && dateCmp.format(movie.getStartViewingDate()).equals(todayStr)) {
                content.append("Película: ").append(movie.getTitle()).append("\n");
            }
        }

        for (Series s : series) {
            for (Chapter chapter : s.getChapters()) {
                if (chapter.isViewed() && chapter.getStartViewingDate() != null && dateCmp.format(chapter.getStartViewingDate()).equals(todayStr)) {
                    content.append("Serie: ").append(s.getTitle()).append(" - Capítulo: ").append(chapter.getTitle()).append("\n");
                }
            }
        }

        for (Book book : books) {
            if (book.isReaded() && book.getStartReadingDate() != null && dateCmp.format(book.getStartReadingDate()).equals(todayStr)) {
                content.append("Libro: ").append(book.getTitle()).append("\n");
            }
        }

        report.setContent(content.toString());
        report.makeReport();
    }
}
