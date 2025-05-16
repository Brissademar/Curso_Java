import java.util.Objects;
public class Main {
    public static void main(String[] args) {

    Factura fac1 = new Factura("A11003", "Javier Martínez", 677.00);
    Factura fac2 = new Factura("A11003", "Brissa Jaramillo", 966550.90);

        System.out.println("Factura 1 "+fac1);
        System.out.println("Factura 2"+fac2);

        System.out.println("Son iguales? "+fac1.equals(fac2));

    }
}