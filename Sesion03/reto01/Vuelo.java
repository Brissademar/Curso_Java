import java.util.Optional;

public class Vuelo {
private final String CODIGOVUELO;
private  String destino;
private String horaSalida;
private Optional<Pasajero> asientoReservado;


//constructor del vuelo
public Vuelo(String CODIGOVUELO, String destino, String horaSalida){
    this.CODIGOVUELO = CODIGOVUELO;
    this.destino = destino;
    this.horaSalida = horaSalida;
    this.asientoReservado = Optional.empty(); //Inicialmente no hay reserva
 }

 public boolean reservarAsiento(Pasajero p){
    if (asientoReservado.isEmpty()){
        asientoReservado = Optional.of(p);
        return true;
    }
    return false;
 }
 public boolean reservarAsiento(String nombre, String pasaporte){
    Pasajero nuevoPasajero =new Pasajero(nombre, pasaporte);
    return reservarAsiento(nuevoPasajero);
 }

    public void cancelarReserva() {
        asientoReservado = Optional.empty();
        System.out.println("❌ Cancelando reserva...");
    }

    public void obtenerItinerario(){
        System.out.println("✈\uFE0F Itinerario del vuelo:\n" +
                "Código: "+CODIGOVUELO+"\n" +
                "Destino: "+destino+"\n" +
                "Salida: "+horaSalida+"\n" +
                "Pasajero: "+asientoReservado);
    }
}

