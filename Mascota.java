public class Mascota {
    private String nombre;
    private String sexo;
    private String color;
    private String fechaNacimiento;
    private String identificador;
    private String tipo;
    private double talla;
    private double peso;

    public Mascota() {
    }

    public Mascota(String nombre, String sexo, String color, String fechaNacimiento, String identificador,
            String tipo, double talla, double peso) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.color = color;
        this.fechaNacimiento = fechaNacimiento;
        this.identificador = identificador;
        this.tipo = tipo;
        this.talla = talla;
        this.peso = peso;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        if (talla > 0.0) {
            this.talla = talla;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0.0) {
            this.peso = peso;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Métodos auxiliares
    public String imprimirOpcionesTipo() {
        String[] tipos = { "Gato", "Perro", "Tortuga" };
        StringBuilder tipo = new StringBuilder("Opciones\n");
        for (int i = 0; i < tipos.length; i++) {
            tipo.append((i + 1)).append(") ").append(tipos[i]).append("\n");
        }
        return tipo.toString();
    }

    @Override
    public String toString() {
        return "----------Mascota:----------\n" +
                "Nombre: " + nombre + "\n" +
                "Sexo: " + sexo + "\n" +
                "Color: " + color + "\n" +
                "Tipo: " + tipo + "\n" +
                "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
                "Identificador: " + identificador + "\n" +
                "Talla: " + talla + "\n" +
                "Peso: " + peso + "\n";
    }
}
