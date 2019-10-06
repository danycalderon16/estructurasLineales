
public class ColaDobleM {

    private String C[];
    private int tam;
    private int izq;
    private int der;

    public ColaDobleM() {
        tam = 5;
        izq = tam / 2 + 1;// 2+1 = 3
        der = tam / 2; // 2
        C = new String[tam];
    }

    public ColaDobleM(int tam) {
        this.tam = tam;
        izq = tam / 2 + 1;// 2+1 = 3
        der = tam / 2; // 2
        C = new String[tam];
    }

    public boolean vacia() {
        return izq > der;
    }

    public boolean llenaDer() {
        return (der == tam -1);
    }

    public boolean llenaIzq() {
        return (izq == 0);
    }

    public void pushDer(String c) {
        if (llenaDer()) {
            System.out.println("Cola llena por la derecha");
        } else {
            C[++der] = c;
        }
    }

    public void pushIzq(String c) {
        if (llenaIzq()) {
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
            d = C[der--];
        }
        return d;
    }

    public String popIzq() {
        String d = null;
        if (vacia()) {
            System.out.println("Cola vacia");
        } else {
            d = C[izq++];
        }
        return d;
    }

    public void mostrar() {
        if (vacia()) {
            System.out.println("Cola vacia");
        } else {
            for (int j = izq; j <= der; j++) {
                System.out.println("[" + C[j] + "]");
            }
        }

        System.out.println("----------");
    }

    public static void main(String[] args) {
        ColaDobleM c = new ColaDobleM(4);
        c.popDer();
        c.popIzq();
        c.pushDer("1");
        c.pushDer("2");
        c.pushIzq("!");
        c.pushIzq("!");
        c.pushIzq("!");
        c.pushIzq("!");
        c.popDer();
        c.popDer();
        c.popDer();
        c.popDer();
        c.popIzq();
        c.popDer();
    }
}
