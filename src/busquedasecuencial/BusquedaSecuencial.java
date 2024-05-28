/*
 * DIseñar un programa que lea un numero cualquiera y lo busque en el vector x,
 * el cual tiene almacenados 80 elementos. Escribir la posiscion donde se encuentra 
 * almacenado el numero en el vector o el mensaje "NO" si no lo encentra.
 */
package busquedasecuencial;

/**
 *
 * @author Rubén Arellano Correa
 */
public class BusquedaSecuencial {
    
    public static void main(String[] args) 
    {
        Busquedas cll=new Busquedas();
        System.out.println("----Busque su numero favorito----");
        cll.vector();
        cll.busqueda();
    }
    
}
