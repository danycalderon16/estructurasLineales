package Librero;


public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private float precio;

    public Libro() {
    }
    
    public Libro(String ISBN, String titulo, String autor, float preci) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = preci;
    }

    @Override
    public String toString() {
        return "Libro  {" + "ISBN: " + ISBN + ", titulo: " + titulo + ", autor: " + autor + ", precio: " + precio + '}';
    }
  
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
