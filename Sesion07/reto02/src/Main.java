import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        analizarArchivoLogs("errores.log");
    }

    public static void analizarArchivoLogs(String nombreArchivo) {
        int totalLineas = 0;
        int cantidadErrores = 0;
        int cantidadWarnings = 0;

        // try-with-resources para abrir el archivo
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                totalLineas++;

                if (linea.contains("ERROR")) {
                    cantidadErrores++;
                }

                if (linea.contains("WARNING")) {
                    cantidadWarnings++;
                }
            }

            // Mostrar resumen
            System.out.println("📄 Resumen del análisis:");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores: " + cantidadErrores);
            System.out.println("Cantidad de advertencias: " + cantidadWarnings);

            // Porcentaje
            int totalIncidentes = cantidadErrores + cantidadWarnings;
            double porcentaje = (totalLineas > 0) ? (100.0 * totalIncidentes / totalLineas) : 0;

            System.out.printf("Porcentaje de líneas con errores o advertencias: %.2f%%\n", porcentaje);

        } catch (IOException e) {
            // Guardar error en registro_fallos.txt
            try (PrintWriter pw = new PrintWriter(new FileWriter("registro_fallos.txt"))) {
                pw.println("❌ Error al leer el archivo de logs:");
                pw.println(e.getMessage());
            } catch (IOException ex) {
                System.out.println("❗ Error al escribir en registro_fallos.txt: " + ex.getMessage());
            }
        }
    }
}
