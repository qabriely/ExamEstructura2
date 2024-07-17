package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
    private static String[] notas = new String[100];
    private static int contador = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            limpiarPantalla();
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("Ingrese la nota:");
                    String nota = scanner.nextLine();
                    añadirNota(nota);
                    pausa();
                    break;
                case 2:
                    limpiarPantalla();
                    mostrarNotas(0);
                    pausa();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    limpiarPantalla();
                    System.out.println("Opción no válida");
                    pausa();
                    break;
            }
        } while (opcion != 3);
    }


  private static void mostrarMenu() {
        System.out.println("Menú de opciones:");
        System.out.println("1. Añadir nota");
        System.out.println("2. Mostrar notas");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }
}
