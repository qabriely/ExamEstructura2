package ejercicio03;

// Inicia el nodo
class Nodo {
    String valor;
    Nodo siguiente;

    Nodo(String valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}

class Pila {
    Nodo cima;

    Pila() {
        cima = null;
    }

    void push(String valor) {
        Nodo newnodo = new Nodo(valor);
        if (cima == null) {
            cima = newnodo;
        } else {
            newnodo.siguiente = cima;
            cima = newnodo;
        }
    }

    String pop() {
        if (cima == null) {
            return null;
        } else {
            String valor = cima.valor;
            cima = cima.siguiente;
            return valor;
        }
    }

    boolean seono() {
        return cima == null;
    }
}


public static void main(String[] args) {
    Pila pila = new Pila();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingresar los valores (separar por ','). Presionar enter para finalizar el programa:");
    while (true) {
        String valor = scanner.nextLine();
        if (valor.isEmpty()) {
            break;
        }
        pila.push(valor);
    }

    System.out.println("Los valores Invertidos, son:");
    ImprInvert(pila);
}
