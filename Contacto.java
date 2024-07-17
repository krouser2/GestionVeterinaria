import java.util.Scanner;

public class Contacto {
    private String correoElectronico;
    private long telefonoMovil;
    private long telefonoFijo;
    Scanner sc = new Scanner(System.in);

    public Contacto() {

    }

    public Contacto(String correoElectronico, long telefonoMovil, long telefonoFijo) {
        this.correoElectronico = correoElectronico;
        this.telefonoMovil = telefonoMovil;
        this.telefonoFijo = telefonoFijo;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public long getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(long telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public long getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(long telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    
    

    @Override
    public String toString() {
        return "------------Contacto---------- \n" +
                "Correo Electronico: " + correoElectronico + "" + "\n"
                + "Telefono Movil: " + telefonoMovil + "\n"
                + "Telefono Fijo: " + telefonoFijo + "\n";
    }

}
