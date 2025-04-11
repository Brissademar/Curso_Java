import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner paciente = new Scanner(System.in);
    //Crear objeto
        Paciente Javier= new Paciente();
        System.out.println("Ingrese su nombre");
        Javier.Nombre = paciente.nextLine();

        System.out.println("Ingrese su edad");
        Javier.edad = paciente.nextInt();
        paciente.nextLine();

        System.out.println("Especifique padecimiento");
        Javier.padecimiento = paciente.nextLine();

        System.out.println("Ingrese expediente");
        Javier.n_Expediente = paciente.nextLine();

        Javier.MostrarInformación();

    }
}