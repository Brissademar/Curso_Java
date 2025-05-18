import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Lista segura de temas activos
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
                // Agregamos temas
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        // Orden alfabético (uso de Comparable)
        Collections.sort(temas);
        System.out.println("Temas ordenados alfabéticamente:");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // Orden por prioridad ascendente (uso de Comparator)
        temas.sort(Comparator.comparingInt(Tema::getPrioridad));
        System.out.println("\nTemas ordenados por prioridad:");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // Repositorio concurrente de recursos por tema
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/ambiente");

        // Mostrar el repositorio de recursos
        System.out.println("\nRepositorio de recursos:");
        for (String clave : recursos.keySet()) {
            System.out.println(clave + " → " + recursos.get(clave));
        }
    }
}