
package boletin04;

public class Boletin04 {

    public static void main(String[] args) {
        //instancio objeto tipo Semaforo.
        Semaforo sema1= new Semaforo ();
        String valor=sema1.damecolor();
        System.out.println ("color antes de darle valor"+valor);
        
        //nombreobjeto.atributo/metodo
        sema1.poncolor("verde");
        valor=sema1.damecolor();
        System.out.println ("Color: "+valor);
        
        System.out.println ("Color: "+sema1.damecolor());

    }
    
}
