//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Entrada evento1 = new Entrada("Obra de Teatro", 8965);
        Entrada evento2 = new Entrada("La bella durmiente",89745.45);
        evento1.mostrarInformacion();
        evento2.mostrarInformacion();

        //reto adicional
        Entrada_Record evento3 = new Entrada_Record("Curso de BEDU de Java", 700.25);
        evento3.mostrarInformacion();
    }
}