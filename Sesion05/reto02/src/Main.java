//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MetodoPago[] pagos = new MetodoPago[] {
                new PagoEfectivo(500),
                new PagoTarjeta(300, 200), // Esto fallará al autenticar
                new PagoTarjeta(200, 500), // Esto sí pasará
                new PagoTransferencia(700, 899)
        };

        for (MetodoPago pago : pagos) {
            Autenticable auth = (Autenticable) pago;

            System.out.println("------------");
            if (auth.autenticar()) {
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println("⚠️ Falló la autenticación del pago: " + pago.getClass().getSimpleName());
            }
        }
    }
}