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
}

class CalculodePotencia {
    static int calcPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * calcPotencia(base, exponente - 1);
        }
    }
}

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar el número para poder calcular su factorial -> A:     ");
        int a = scanner.nextInt();
        int factorialA = CalculodelFactorial.calcFactorial(a);

        System.out.print("Ingresar la base para calcular su potencia  -> B:    ");
        int b = scanner.nextInt();
        System.out.print("Ingresar el exponente para la potencia ->  B^(exponente):    ");
        int exponenteB = scanner.nextInt();
        int potenciaB = CalculodePotencia.calcPotencia(b, exponenteB);

        int resultado = factorialA * potenciaB;
        System.out.printf("%d! * %d^%d = %d\n", a, b, exponenteB, resultado);
    }
}
