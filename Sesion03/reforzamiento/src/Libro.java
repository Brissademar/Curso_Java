public class Libro {
    //Variables privadas que solo entre cada libro debe de saber
    private int id;
    private String titulo;
    private String Autor;
    private int n_paginas;

    //Variables estaticas que la informacion debe ser compartida por todos los libros
    private static int contadorLibros = 0;
    private static int ultimoid = 0;

    public Libro(String titulo, String Autor, int n_paginas){
    this.titulo = titulo;
    this.Autor = Autor;
    this.n_paginas = n_paginas;

    //incrementar el contador de libros
        contadorLibros++;
    //Asignar id unico al libro
        ultimoid++;
        this.id=ultimoid;
    }

    //metodo esatatico para obtener el total de libros
    public static int obtenerTotaldeLibros(){
        return contadorLibros;
    }
    //metodo normal porque este es la informacion de cada libro
public void mostrarInfomracion(){
    System.out.println("Libroo # "+id);
    System.out.println("Titulo del libro: "+titulo);
    System.out.println("Autor del libro: "+Autor);
    System.out.println("Cantidad de paginas: "+n_paginas);
    System.out.println("--------------------------------------------------");
 }
}




