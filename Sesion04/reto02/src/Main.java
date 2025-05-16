//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DeclaracionImpuestos impuesto1 = new DeclaracionImpuestos("4455AAAA", 56);
        CuentaFiscal cuenta1 = new CuentaFiscal("4455AAAA", -9);

        System.out.println("Cuenta fiscal registrada por RFC "+impuesto1.rfcContribuyente()+" por "+impuesto1.montoDeclarado());
        System.out.println("Cuenta fiscal registrada con RFC: "+cuenta1.getRFC()+" saldo disponible "+cuenta1.getSaldoDisponible());

        boolean rfcvalidado = cuenta1.validarRFC(impuesto1);
        System.out.println("El rfc es valido para esta cuenta?"+rfcvalidado);
    }
}