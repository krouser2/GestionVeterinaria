import java.util.Scanner;

public abstract class Gestion<T> {
    // Atributos protegidos para que las clases hijas puedan acceder a ellos
    protected T[] elementos; 
    protected int contador; 
    protected static final int TAMANO_INICIAL = 10; 
    protected static final Scanner sc = new Scanner(System.in);

    // Constructor de la clase
    @SuppressWarnings("unchecked")
    public Gestion() {
        // Inicializa el arreglo de elementos con el tamaño inicial
        elementos = (T[]) new Object[TAMANO_INICIAL];
        contador = 0; // Inicializa el contador en 0
    }

    // Método para insertar un elemento en el arreglo
    public void insertar(T elemento) {
        // Verifica si el arreglo necesita ser expandido
        if (contador == elementos.length) {
            expandirArreglo();
        }
        // Inserta el nuevo elemento y aumenta el contador
        elementos[contador++] = elemento;
    }

    // Método privado para expandir el tamaño del arreglo
    private void expandirArreglo() {
        // Crea un nuevo arreglo con el doble del tamaño
        @SuppressWarnings("unchecked")
        T[] nuevoArreglo = (T[]) new Object[elementos.length * 2];
        // Copia los elementos del arreglo viejo al nuevo
        System.arraycopy(elementos, 0, nuevoArreglo, 0, elementos.length);
        // Asigna el nuevo arreglo al atributo 'elementos'
        elementos = nuevoArreglo;
    }

    // Método abstracto que las clases hijas deben implementar para crear un elemento
    public abstract T crearElemento();

    // Método abstracto que las clases hijas deben implementar para mostrar elementos
    public abstract void mostrarElementos();

    // Método protegido para obtener una entrada de texto del usuario
    protected String obtenerEntrada(String mensaje) {
        System.out.println(mensaje); // Muestra el mensaje al usuario
        return sc.nextLine(); // Lee y retorna la entrada del usuario
    }

    // Método protegido para obtener una entrada entera del usuario
    protected int obtenerEntradaInt(String mensaje) {
        int entrada;
        while (true) {
            try {
                System.out.println(mensaje); // Muestra el mensaje al usuario
                entrada = Integer.parseInt(sc.nextLine()); // Intenta leer la entrada y convertirla a entero
                break; // Sale del bucle si la entrada es válida
            } catch (NumberFormatException e) {
                // Informa al usuario si la entrada no es válida
                System.out.println("Entrada no válida. Por favor ingrese un número entero.");
            }
        }
        return entrada; // Retorna la entrada válida
    }
    protected long obtenerEntradaLong(String mensaje) {
        long entrada;
        while (true) {
            try {
                System.out.println(mensaje); // Muestra el mensaje al usuario
                entrada = Long.parseLong(sc.nextLine()); // Intenta leer la entrada y convertirla a entero
                break; // Sale del bucle si la entrada es válida
            } catch (NumberFormatException e) {
                // Informa al usuario si la entrada no es válida
                System.out.println("Entrada no válida. Por favor ingrese un número entero.");
            }
        }
        return entrada; // Retorna la entrada válida
    }

    // Método protegido para obtener una entrada decimal del usuario
    protected double obtenerEntradaDouble(String mensaje) {
        double entrada;
        while (true) {
            try {
                System.out.println(mensaje); // Muestra el mensaje al usuario
                entrada = Double.parseDouble(sc.nextLine()); // Intenta leer la entrada y convertirla a decimal
                break; // Sale del bucle si la entrada es válida
            } catch (NumberFormatException e) {
                // Informa al usuario si la entrada no es válida
                System.out.println("Entrada no válida. Por favor ingrese un número decimal.");
            }
        }
        return entrada; // Retorna la entrada válida
    }
}
