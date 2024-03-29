
public class ColaDoble {

    private String C[];
    private int tam;
    private int izq;
    private int der;

    public ColaDoble() {
        tam = 5;
        izq = -1;
        der = -1;
        C = new String[tam];
    }

    public ColaDoble(int tam) {
        this.tam = tam;
        izq = -1;
        der = -1;
        C = new String[tam];
    }

    public boolean vacia() {
        return izq == -1 && der == -1;
    }

    public boolean llena() {
        return (der == tam - 1 && izq == 0) || der + 1 == izq;
    }

    public boolean llenaIzq() {
        return izq == 0;
    }

    public boolean llenaDer() {
        return der == tam - 1;
    }

    public void pushDer(String c) {
        if (llenaDer()) {
            System.out.println("Cola llena por la derecha");
        } else {
           C[++der] = c;
           if(izq==-1) izq = 0;
        }

    }

    public void pushIzq(String c) {
        if (llenaIzq()|| izq == -1) {
            System.out.println("Cola llena por la izquierda");
        } else {
            C[--izq] = c;
        }

    }

    public String popDer() {
        String d = null;
        if (vacia()) {
            System.out.println("Cola vacia");
        } else {
           d = C[izq++];
            //C[inicio]= null;
            if (izq > der) {
                der = izq = -1;
            }
        }
        return d;
    }

    public String popIzq() {
        String d = null;
        if (vacia()) {
            System.out.println("Cola vacia");
        } else {
            d = C[izq++];
            //C[inicio]= null;
            if (izq > der) {
                der = izq = -1;
            }
        }
        return d;
    }

    public void mostrar() {
        if (vacia()) {
            System.out.println("Cola vacia");
        } else {
            for (int i = izq; i <= der; i++) {
                System.out.println("[" + C[i] + "]");
            }
        }
        System.out.println("----------");
    }

    public static void main(String[] args) {
        ColaDoble c = new ColaDoble(4);
        c.popDer();
        c.popIzq();
        c.pushIzq("1");
        c.pushDer("2");
        c.pushDer("2");        
        c.pushDer("2");        
        c.pushDer("2");
        c.pushDer("2");
        c.popDer();
        c.popDer();
        c.popIzq();
        c.popDer();
        c.popDer();  
        c.popDer();        
        c.mostrar();
    }
}
