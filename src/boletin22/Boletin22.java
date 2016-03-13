
package boletin22;


public class Boletin22 {
    public static void main(String[] args) {
        Ficheiros obx=new Ficheiros();   
        obx.crearArray();
        obx.crearFichero("Libreria.txt");
        obx.buscarAutor();
        obx.consultarTitulo();
        obx.eliminar();
        obx.engadir("Libreria.txt",new Libros("Libro5","Pepe",5f,5));
        obx.modificar();
        obx.leerFicheiro("Libreria.txt");
        
        
           
    }
    
}
    

        
        
        
        
        
        
        
        
        
        
        
        

    