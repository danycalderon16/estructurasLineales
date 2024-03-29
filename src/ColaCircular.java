
public class ColaCircular {

    private String C[];
    private int tam;
    private int inicio;
    private int fin;

    public ColaCircular() {
        tam = 5;
        inicio = -1;
        fin = -1;
        C = new String[tam];
    }

    public ColaCircular(int tam) {
        this.tam = tam;
        inicio = -1;
        fin = -1;
        C = new String[tam];
    }

    public boolean vacia() {
        return inicio == -1;
    }

    public boolean llena() {
        return (fin == tam - 1 && inicio == 0) || fin + 1 == inicio;
    }

    public void push(String c) {
        if (llena()) {
            System.out.println("Cola llena");
        } else {
            C[(fin == (tam - 1)) ? fin = 0 : ++fin] = c;
            if (inicio == -1) {
                inicio = 0;
            }
            // C[0] = c;
        }
    }

    public String pop() {
            String d = null;
        if (vacia()) {
            System.out.println("Cola vacia");
        } else {
            d = C[inicio];
            //C[inicio]= null;
            if (inicio == fin) {
                fin = inicio = -1;
            } else {
                inicio = (inicio == (tam - 1)) ? inicio = 0 : ++inicio;
            }// ++inicio; if(inicio == tam) inicio = 0;
        }
        return d;
    }

    public void mostrar() {
        if (vacia()) {
            System.out.println("Cola vacia");
        } else {
            if (inicio <= fin) {
                for (int i = inicio; i <= fin; i++) {
                    System.out.println("[" + C[i] + "]");
                }
            }
            if (inicio > fin) {
                for (int j = inicio; j < tam; j++) {
                    System.out.println("[" + C[j] + "]");
                }
                for (int j = 0; j < fin; j++) {
                    System.out.println("[" + C[j] + "]");
                }
            }

        }
        System.out.println("----------");
    }

    public void mostrarA() {
        if (vacia()) {
            System.out.println("Cola vacia");
        } else {
            int i = inicio;
            for (; i != fin; i = (i + 1) % tam) {
                System.out.println(C[i]);
            }
            System.out.println(C[i]);

        }
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        ColaCircular c = new ColaCircular(4);
        c.push("1");
        c.push("2");
        c.push("3");
        c.pop();
        //c.pop();
        //c.pop();
        c.push("4");
        c.push("5");
        c.push("6");
        c.mostrarA();
    }
}
