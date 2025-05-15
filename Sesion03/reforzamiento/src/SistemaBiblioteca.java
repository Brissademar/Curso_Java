public class SistemaBiblioteca {
    public static void main(String[] args) {

        System.out.println("Total de libros inicialmente: "+Libro.obtenerTotaldeLibros());

        //Crear varios objetos
        Libro libro1 = new Libro("Las aventuras de peter pan", "Adaman Smith", 400);
        Libro libro2 = new Libro("Aprendiendo a programar", "Luis. R.", 1000);

        libro1.mostrarInfomracion();
        libro2.mostrarInfomracion();

        Libro libro3 = new Libro("Anne of Green Gables", "Lucy Maud", 600);
        libro3.mostrarInfomracion();

        System.out.println("Total de libros al final: "+Libro.obtenerTotaldeLibros());
    }
}
