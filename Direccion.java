public class Direccion {
    private String ciudad;
    private String municipio;
    private String colonia;
    private String calle;
    private int codPostal;
    private int noCasa;


    public Direccion() {
    }

    public Direccion(String ciudad, String municipio, String colonia, String calle, int codPostal, int noCasa) {
        this.ciudad = ciudad;
        this.municipio = municipio;
        this.colonia = colonia;
        this.calle = calle;
        this.codPostal = codPostal;
        this.noCasa = noCasa;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public int getNoCasa(){
        return noCasa;
    }

    public void setNoCasa(int noCasa){
        this.noCasa = noCasa;
    }

    @Override
    public String toString() {
        return "------------Contacto---------- \n" +
                "ciudad: " + ciudad + "" + "\n"
                + "Municipio: " + municipio + "\n"
                + "Colonia: " + colonia + "\n"
                + "Calle: " + calle + "\n" +
                "Numero de Casa: " + noCasa + "\n" +
                "Codigo Postal: " + codPostal + "\n";
    }

}