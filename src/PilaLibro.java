

import Librero.*;


public class PilaLibro {

    private Libro A[];
    private int tam;
    private int tope;

    public PilaLibro() {
        tam = 5;
        tope = -1;
        A = new Libro[tam];
    }

    public PilaLibro(int t) {
        tam = t;
        tope = -1;
        A = new Libro[tam];
    }
    
    public boolean vacia() {
        return tope == -1;
    }

    public boolean llena() {
        return tope == (tam - 1);

    }

    public void meter(Libro d) {
        if (llena()) {
            System.out.println("Pila llena");
        } else {
            A[++tope] = d;
        }
    }

    public String mostrar() {
        String str ="";
        for (int i = 0; i <= tope; i++) {
            str += "[" + A[i] + "]\n";
        }
        str +=("----------");
        return str;    
    }

    public Libro sacar() {
        if (vacia()) {
            System.out.println("Pila vacia");
            return null;
        } else {
            return A[tope--];
        }
    }/*

    public static void main(String s[]) {
        PilaLibro pila = new PilaLibro(5);
        pila.meter(new Libro("123","Java","Joyanes",199));
        pila.meter(new Libro("123","C++","Ceballos",199));
        pila.meter(new Libro("123","PHP","Joyanes",199));
        System.out.println( pila.mostrar());
        pila.sacar();
        System.out.println( pila.mostrar());

    }*/

}
