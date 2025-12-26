package com.example.tp2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        LogManager logger = new LogManager("application.log");
        logger.log("INFO", "Démarrage de l’application");
        logger.log("DEBUG", "Chargement de la configuration");
        logger.log("ERROR", "Impossible de se connecter à la base");

        List<String> header = Arrays.asList("id", "nom", "score");
        List<String[]> rows = Arrays.asList(
                new String[]{"1", "Alice", "85"},
                new String[]{"2", "Bob", "92"},
                new String[]{"3", "Carol", "78"}
        );

        CsvWriter.writeCsv("report.csv", header, rows);

        HtmlGenerator.writeHtml(
                "index.html",
                "Ma première page",
                "Bienvenue sur ma page générée par PrintWriter !"
        );

        System.out.println("Tous les fichiers ont été générés.");
    }
}
