package ejercicio04;

import java.util.Scanner;

class CalculodelFactorial {
    static int calcFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcFactorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
    Pila pila = new Pila();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese los valores (separados por ','). Presione Enter para finalizar:");
    while (true) {
        String valor = scanner.nextLine();
        if (valor.isEmpty()) {
            break;
        }
        pila.push(valor);
    }

    System.out.println("Los valores invertidos son:");
    ImprInvert(pila);
}
