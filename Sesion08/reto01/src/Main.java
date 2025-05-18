//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class MainNarrativa{
    private final TransiciónHistoria TRANSICION;
    private final GestorDialogo DIALOGO;
    private final LogicaDecision DECISION;

    public MainNarrativa(TransiciónHistoria TRANSICION, GestorDialogo DIALOGO, LogicaDecision DECISION) {
        this.TRANSICION = TRANSICION;
        this.DIALOGO = DIALOGO;
        this.DECISION = DECISION;
    }
    public void iniciarHistoria(){
        DIALOGO.mostrarDialogo("Había una vez. una princesa que quería comprar zapatos");
        boolean tomarDecision = DECISION.tomarDecision("La vas a acompañar a comprar las mejores zapatillas para su baile con el príncipe?");
        if (tomarDecision){
            DIALOGO.mostrarDialogo("La acompañas, se pone muy contenta, la ayudas a elegir los mejores tacones y se casa con el príncipe y te da chamba");
        }else{
            DIALOGO.mostrarDialogo("No la acompañas, se pone triste y no va al baile con el príncipe así que no se casan y sigeus trabajando de programador que gana 10,000 al mes");
        }
        TRANSICION.siguienteEscena();
    }
}

public class Main {
    public static void main(String[] args) {
        TransiciónHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        MainNarrativa narrativa = new MainNarrativa(transicion, dialogo, decision);
        narrativa.iniciarHistoria();
    }
}