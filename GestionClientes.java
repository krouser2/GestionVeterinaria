public class GestionClientes extends Gestion<Cliente> {
    protected Cliente[] elementos;

    @Override
    public Cliente crearElemento() {
        Cliente nuevoCliente = new Cliente();
        // Establecemos los datos Personales del cliente
        nuevoCliente.setNombre(obtenerEntrada("Nombre del Cliente: "));
        nuevoCliente.setApellidoPaterno(obtenerEntrada("Apellido Paterno del Cliente: "));
        nuevoCliente.setApellidoMaterno(obtenerEntrada("Apellido Materno del Cliente: "));

        // Establecemos los datos de contacto
        Contacto contacto = new Contacto();
        contacto.setCorreoElectronico(obtenerEntrada("Correo Electronico"));
        contacto.setTelefonoFijo(obtenerEntradaLong("Telefono Fijo"));
        contacto.setTelefonoMovil(obtenerEntradaLong("Telefono Movil"));
        nuevoCliente.setContacto(contacto);

        // Establecemos los datos de direccion
        Direccion direccion = new Direccion();
        direccion.setNoCasa(obtenerEntradaInt("Numero de casa del cliente: "));
        direccion.setCalle(obtenerEntrada("Calle del Cliente: "));
        direccion.setColonia(obtenerEntrada("Colonia del Cliente: "));
        direccion.setCodPostal(obtenerEntradaInt("Codigo postal del Cliente: "));
        direccion.setMunicipio(obtenerEntrada("Municipio del Cliente: "));
        direccion.setCiudad(obtenerEntrada("Ciudad del Cliente: "));

        // Regresamos el objeto Cliente
        return nuevoCliente;
    }

    @Override
    public void mostrarElementos() {
        for (int i = 0; i < contador; i++) {
            Cliente cliente = elementos[i]; // Accede al cliente en la posición i
            System.out.println(cliente.toString()); // Muestra el cliente utilizando su método toString()
        }
    }

}
