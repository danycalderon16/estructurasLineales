
public class ColaString {
    private String C[];
    private int tam;
    private int tope;

    public ColaString() {
    }

    public ColaString(int tam) {
        this.tam = tam;
        tope = -1;
        C=new String[tam];
    }

    @Override
    public String toString() {
        return "ColaString{" + "C=" + C + ", tam=" + tam + ", tope=" + tope + '}';
    }
    
    public boolean vacia() {
        return tope == -1;
    }

    public boolean llena() {
        return tope == (tam - 1);
    }

    public void push(String c) {
        if (llena()) {
            System.out.println("Cola llena");
        } else {
            C[++tope] = c;
        }
    }

    public String pop() {
        if (vacia()) {
            System.out.println("Cola vacia");
            return null;
        } else {
            
            String t = C[0];
            for(int i = 0;i<tam;i++)C[i] = C[i+1];
            return t;
        }
    }
    
     public void mostrar() {
        for (int i = 0; i <= tope; i++) {
            System.out.println("[" + C[i] + "]");
        }
        System.out.println("----------");
    }
     
    public static void main (String s[]){
        ColaString cola = new ColaString(3);
        cola.push("Ana");
        cola.push("Adrian");
        cola.push("Pedro");
        cola.push("Diego");
        cola.mostrar();
        cola.pop();
        cola.mostrar();
    }
    
}
