import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Hacer un arraylist donde colocare las muestras
        List<String> listaMuestras = new ArrayList<>();
        listaMuestras.add("Homo sapiens");
        listaMuestras.add("Mus musculus");
        listaMuestras.add("Arabidopsis thaliana");
        listaMuestras.add("Homo sapiens"); // muestra repetida
        System.out.println("Orden de llegada de las muestras");
        for (String muestra : listaMuestras){
            System.out.println("- "+muestra);
        }

        // HashSet para encontrar especies únicas
        Set<String> especiesUnicas = new HashSet<>(listaMuestras);

        System.out.println("🧬 Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        // HashMap para asociar ID de muestra con el nombre del investigador
        Map<String, String> idInvestigador = new HashMap<>();
        idInvestigador.put("M-001", "Dra. López");
        idInvestigador.put("M-002", "Dr. Hernández");
        idInvestigador.put("M-003", "Dra. Márquez");

        System.out.println("👩‍🔬 Relación de ID de muestra → Investigador:");
        for (String id : idInvestigador.keySet()) {
            System.out.println(id + " → " + idInvestigador.get(id));
        }

    }
}