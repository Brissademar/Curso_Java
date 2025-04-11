import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class simuladorFarmacia {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Introduzca el nombre del medicamento");
        String medicamento = sc1.nextLine();
        System.out.println("Introduzca el precio unitario del producto");
        double p_Unitario = sc1.nextDouble();
        System.out.println("Introduzca la cantidad que quiere comprar");
        int cantidad = sc1.nextInt();
        sc1.nextLine();

        var total = p_Unitario*cantidad;
        boolean aplicaDescuento = total > 500;
        var descuento = aplicaDescuento ? total*0.15:0;
        double totalFinal = total-descuento;
        System.out.println("-- SU COMPRAAAA -- ");
        System.out.println("Nombre de su medicamento: "+medicamento);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Precio unitario: $"+p_Unitario);
        System.out.println("¿Aplica descuento? "+aplicaDescuento);
        System.out.println("Descuento: $"+descuento);
        System.out.println("Total a pagar: $"+totalFinal);

        }
    }
