package com.example.tp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileUtils {

    
    public static boolean exists(String path) {
        return Files.exists(Path.of(path));
    }

   
    public static void delete(String path) throws IOException {
        Files.deleteIfExists(Path.of(path));
    }

   
    public static void copy(String source, String destination) throws IOException {
        Files.copy(
                Path.of(source),
                Path.of(destination),
                StandardCopyOption.REPLACE_EXISTING
        );
    }

    public static String readAll(String path) throws IOException {
        return Files.readString(Path.of(path));
    }

    
    public static void write(String path, String content) throws IOException {
        Files.writeString(Path.of(path), content);
    }
}
