//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Ambulancia miambulancia = new Ambulancia("Ambulancia", "Sasha");
    Patrulla patrulla = new Patrulla("Patrulla", "Miakasa");
    UnidadBomberos unidadBomberos = new UnidadBomberos("Bomberos", "Connie");

    //Iniciando la operacion
        miambulancia.iniciarOperacion();
        System.out.println();
        patrulla.iniciarOperacion();
        System.out.println();
        unidadBomberos.iniciarOperacion();


    }
}