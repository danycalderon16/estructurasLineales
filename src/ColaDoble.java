
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
		return izq == -1;
	}

	public boolean llena() {
		return (der == tam - 1 && izq == 0) || der + 1 == izq;
	}

	public void pushDer(String c) {
		if (llena()) {
			System.out.println("Cola llena");
		} else {
			C[(der == (tam - 1)) ? der = 0 : ++der] = c;
			if (izq == -1)
				izq = 0;
			// C[0] = c;
		}
	}

	public String  popIzq() {
		if (vacia()) {
			System.out.println("Cola vacia");
		} else {
                        String d = null;
			d = C[izq];
                        //C[inicio]= null;
			if (izq == der) {
				der = izq = -1;
			} else {
				izq = (izq == (tam - 1)) ? izq = 0 : ++izq;
			}// ++inicio; if(inicio == tam) inicio = 0;
		}
                return null;
	}

	public void mostrar() {
		if (vacia())
			System.out.println("Cola vacia");
		else {
			if (izq <= der) {
				for (int i = izq; i <= der; i++)
					System.out.println("[" + C[i] + "]");
			}
			if (izq > der) {
				for (int j = izq; j < tam; j++)
					System.out.println("[" + C[j] + "]");
				for (int j = 0; j < der; j++)
					System.out.println("[" + C[j] + "]");
			}

		}
		System.out.println("----------");
	}
        
                public void mostrarA(){
                    if(vacia()){
                        System.out.println("Cola vacia");
                    }else{
                        int i = izq;
                        for (;  i!= der ; i=(i+1)%tam) {
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
