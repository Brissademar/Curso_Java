public class Entrada {
    String n_evento;
    double precio_Entrada;

    public Entrada(String n_evento, double precio_Entrada){
        this.n_evento = n_evento;
        this.precio_Entrada = precio_Entrada;
    }
    public void mostrarInformacion(){
        System.out.println("Evento: "+ n_evento+" | Precio de la entrada: "+precio_Entrada );
    }
}
