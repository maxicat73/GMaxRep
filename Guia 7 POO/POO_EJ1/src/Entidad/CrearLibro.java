/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Entidad;

/**
 *
 * @author Maxi
 */
public class CrearLibro {
    
    public int isbn;
    public String titulo;
    public String autor;
    public int paginas;
    
    
    public CrearLibro(){

}
    public CrearLibro(int isbn,String titulo, String autor, int paginas){
            
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.paginas=paginas;
        
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

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public void setIsbn(int isbn){
        this.isbn=isbn;
    }
    
    public int getIsbn(){
    return isbn;
    }
    
    
}






