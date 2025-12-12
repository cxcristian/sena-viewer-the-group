package edu.miSena.senaViewer.model;

import java.io.FileWriter;
import java.io.IOException;

public class Report {
    private String name;
    private String title;
    private String content;
    private String extension = ".txt";

    public void makeReport() {
        if (name != null && title != null && content != null) {
            try (FileWriter fileWriter = new FileWriter(name + extension)) {
                fileWriter.write("Título: " + title + "\n\n");
                fileWriter.write(content);
                System.out.println("Reporte '" + name + extension + "' creado exitosamente en la raíz del proyecto.");
            } catch (IOException e) {
                System.out.println("Error creando el reporte: " + e.getMessage());
            }
        } else {
            System.out.println("Datos del reporte incompletos. No se puede crear el reporte.");
        }
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public String getExtension() { return extension; }
    public void setExtension(String extension) { this.extension = extension; }
}
