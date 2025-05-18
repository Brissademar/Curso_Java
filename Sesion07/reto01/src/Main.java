import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        guardarParametros();     // llamamos al método
        leerParametros();        // llamamos al método
    }

    public static void guardarParametros() {
        try {
            Path carpeta = Paths.get("config");
            Path archivo = Paths.get("config/parametros.txt");

            if (!Files.exists(carpeta)) {
                Files.createDirectory(carpeta);
                System.out.println("📁 Carpeta 'config' creada.");
            }

            String contenido = """
                Tiempo de ciclo: 55.8 segundos
                Velocidad de línea: 1.2 m/s
                Número de estaciones: 8
                """;

            Files.write(archivo, contenido.getBytes());
            System.out.println("✅ Archivo 'parametros.txt' guardado correctamente.");

        } catch (IOException e) {
            System.out.println("❌ Error al guardar los parámetros: " + e.getMessage());
        }
    }

    public static void leerParametros() {
        try {
            Path archivo = Paths.get("config/parametros.txt");

            if (Files.exists(archivo)) {
                String contenido = Files.readString(archivo);
                System.out.println("📄 Contenido del archivo:");
                System.out.println(contenido);
            } else {
                System.out.println("⚠️ El archivo 'parametros.txt' no existe.");
            }

        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo: " + e.getMessage());
        }
    }
}
