import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        GestionMascota gestionMascotas = new GestionMascota();
        GestionClientes gestionClientes = new GestionClientes();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("------ Menú Principal ------");
            System.out.println("1. Insertar Mascota");
            System.out.println("2. Mostrar Mascotas");
            System.out.println("3. Insertar Cliente");
            System.out.println("4. Mostrar Cliente");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    gestionMascotas.insertar(gestionMascotas.crearElemento());
                    break;
                case 2:
                    gestionMascotas.mostrarElementos();
                    break;
                case 3:
                    gestionClientes.insertar(gestionClientes.crearElemento());
                    break;
                case 4:
                    gestionClientes.mostrarElementos();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 3.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
