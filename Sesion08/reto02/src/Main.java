// MonitorCPU.java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> consumosRegistrados = new HashSet<>();

        System.out.println("🔍 Monitor de Consumo de CPU (ingresa -1 para terminar)");

        try {
            while (true) {
                System.out.print("Ingresa el consumo de CPU (%): ");
                String entrada = scanner.nextLine();

                if (entrada.equals("-1")) {
                    System.out.println("🛑 Finalizando monitoreo...");
                    break;
                }

                int consumo;
                try {
                    consumo = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    System.out.println("⚠️ Error: Ingresa un número válido.");
                    continue;
                }

                // Validaciones
                if (consumo < 0 || consumo > 100) {
                    System.out.println("❌ El consumo debe estar entre 0% y 100%.");
                    continue;
                }

                if (consumosRegistrados.contains(consumo)) {
                    System.out.println("🔁 Este consumo ya fue registrado.");
                    continue;
                }

                if (consumo > 95) {
                    throw new ConsumoCriticoException("🚨 ¡Alerta! El servidor ha superado el umbral crítico de CPU: " + consumo + "%");
                }

                // Agregar a conjunto si todo está bien
                consumosRegistrados.add(consumo);
                System.out.println("✅ Consumo registrado correctamente.");
            }
        } catch (ConsumoCriticoException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("📦 Recursos cerrados. Fin del monitoreo.");
        }
    }
}
