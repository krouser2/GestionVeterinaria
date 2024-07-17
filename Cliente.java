public class Cliente extends Persona{
    private boolean estatus;

    public Cliente() {
        
    }

    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, Contacto contacto,
            Direccion direccion, boolean estatus) {
        super(nombre, apellidoPaterno, apellidoMaterno, contacto, direccion);
        this.estatus = estatus;
    }
    
    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public String generarId(){
        String id = "";
        id += apellidoPaterno.charAt(0)+""+apellidoPaterno.charAt(1);
        id += apellidoMaterno.charAt(0)+""+apellidoMaterno.charAt(1);
        id += nombre.charAt(0)+""+nombre.charAt(1);
        return id;

    }
    

}
