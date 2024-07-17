// Clase principal
public class Ejercicio02 {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Bienvenido a la Calculadora de sus Compras\n");

        while (continuar) {
            System.out.print("Ingrese un producto para agregar a su lista \n(Presione 'fin' para terminar): ");
            String palabra = scanner.nextLine();

            if (palabra.equalsIgnoreCase("fin")) {
                continuar = false;
            } else {
                lista.agregar(palabra);
                System.out.printf("\nEl producto '%s' ha sido agregado correctamente.\n\n", palabra);
            }
        }

        int totalPalabras = lista.contarPalabras();
        System.out.printf("\nProductos en total: %d\n", totalPalabras);

        String palabrasConcatenadas = lista.concatenarConEspacios();
        System.out.println("\nLos productos son los siguientes:");
        System.out.println(palabrasConcatenadas);

        System.out.println("\n Hasta luego...");
    }
}
