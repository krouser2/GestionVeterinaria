public class GestionMascota extends Gestion<Mascota> {

    @Override
    public Mascota crearElemento() {
        Mascota nuevaMascota = new Mascota();
        nuevaMascota.setNombre(obtenerEntrada("Nombre de la mascota: "));
        nuevaMascota.setSexo(obtenerSexo(obtenerEntradaInt("Sexo: \n1) Macho \n2) Femenino")));
        nuevaMascota.setColor(obtenerEntrada("Color de la mascota: "));
        nuevaMascota.setFechaNacimiento(obtenerFecha());
        nuevaMascota.setIdentificador(obtenerEntrada("Identificador: "));
        nuevaMascota.setTipo(obtenerTipo(obtenerEntradaInt(nuevaMascota.imprimirOpcionesTipo())));
        nuevaMascota.setTalla(validarPositivo(obtenerEntradaDouble("Talla de la mascota en cm: ")));
        nuevaMascota.setPeso(validarPositivo(obtenerEntradaDouble("Peso de la mascota en kg: ")));
        return nuevaMascota;
    }

    @Override
    public void mostrarElementos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(elementos[i]);
        }
    }

    private String obtenerFecha() {
        int dia, mes, anio;
        while (true) {
            System.out.println("---------Fecha de nacimiento----------");
            dia = obtenerEntradaInt("Día: ");
            mes = obtenerEntradaInt("Mes: ");
            anio = obtenerEntradaInt("Año: ");
            if (fechaValida(dia, mes, anio)) {
                break;
            } else {
                System.out.println("Fecha no válida, por favor intente nuevamente.");
            }
        }
        return dia + "/" + mes + "/" + anio;
    }

    private boolean fechaValida(int dia, int mes, int anio) {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || anio < 1900) {
            return false;
        }
        // Validaciones adicionales para meses y años bisiestos se pueden agregar aquí
        return true;
    }

    private String obtenerSexo(int sexo) {
        return (sexo == 1) ? "Macho" : (sexo == 2) ? "Femenino" : "Desconocido";
    }

    private double validarPositivo(double var) {
        return Math.max(var, 0.0);
    }

    private String obtenerTipo(int i) {
        switch (i) {
            case 1:
                return "Gato";
            case 2:
                return "Perro";
            case 3:
                return "Tortuga";
            default:
                return "Desconocido";
        }
    }
}
