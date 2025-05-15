public class Main {
    public static void main(String[] args) {
        // Crear un pasajero
        Pasajero ana = new Pasajero("Ana Martínez", "AB123456");

        // Crear un vuelo
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        // Reservar el asiento para Ana
        boolean reservaExitosa = vuelo.reservarAsiento(ana);
        if (reservaExitosa) {
            System.out.println("✅ Reserva realizada con éxito.\n");
        } else {
            System.out.println("❌ No se pudo realizar la reserva.\n");
        }

        // Mostrar el itinerario
        vuelo.obtenerItinerario();
        System.out.println();

        // Cancelar la reserva
        vuelo.cancelarReserva();
        System.out.println();

        // Mostrar el itinerario después de cancelar
        vuelo.obtenerItinerario();
        System.out.println();

        // Reservar un asiento para Mario usando el método sobrecargado
        vuelo.reservarAsiento("Mario Gonzalez", "CD789012");

        // Mostrar el itinerario con la nueva reserva
        vuelo.obtenerItinerario();
    }
}
