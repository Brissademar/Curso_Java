import java.util.Scanner;

public class cajeroAutomatico {
    public static void main(String[] args) {
        //recuerda que aqui todo se inicializa, las variables deben de estar bien inicializadas
        var saldo = 1000.00;
        Scanner scanner = new Scanner(System.in);
        int opc = 0;
        double deposito = 0;
        double retiro = 0;
        do {
            System.out.println(
                    "Bienvenido al cajero automático\n" +
                            "1. Consultar saldo\n" +
                            "2. Depositar dinero\n" +
                            "3. Retirar dinero\n" +
                            "4. Salir"
            );
            opc = scanner.nextInt();
            switch (opc){
                case 1 -> {
                    System.out.println("Has elegido la opción de consultar tu saldo actual\n"+"Tu saldo actual es de: "+saldo);
                }
                case 2 -> {
                    System.out.println("Has elegido depositar saldo, seleccione la cantidad que piensa depositar: ");
                    deposito = scanner.nextDouble();
                    if(deposito >= 0 ){
                        saldo = saldo+deposito;
                        System.out.println("Depósito realizado con éxito, consulte su saldo para mejor aseguramiento");
                    }else System.out.println("Deposite una cantidad correcta o mayor a 0");
                }
                case 3 -> {
                    System.out.println("has elegido retirar dinero, elija cantidad");
                    retiro = scanner.nextDouble();
                    if(retiro <= 0 && retiro > saldo){
                        System.out.println("error, no es posible poder retirar dinero negativo");
                    }else saldo = saldo-retiro;
                    System.out.println("retiro realizado con exito");
                }
                default -> {
                    System.out.println("ups, opción inválida, solo puede ser del 1 al 4");

                }

            }
        } while (opc != 4);
        System.out.println("Adioos, esperamos volver a verteee");

    }
}
