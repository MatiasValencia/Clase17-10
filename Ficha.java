public class Ficha {
    private int IDFicha;
    private int anio;
    private int dia;
    private int mes;
    private String descripcion;
    private int precio;
    private boolean vacuna;
    private boolean esterilizacion;
    //Constructor
    public Ficha(int IDFicha, int anio, int dia, int mes) {
        this.IDFicha = IDFicha;
        this.anio = 2023;
        this.dia = 17;
        this.mes = 10;
        this.precio = 10000;
        this.vacuna = false;
        this.esterilizacion = false;
    }
    //Getters
    public int getAnio() {
        return anio;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getPrecio() {
        return precio;
    }
    public boolean getVacuna() {
        return vacuna;
    }
    public boolean getEsterilizacion() {
        return esterilizacion;
    }
    //Setter descripcion
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    //Customers
    public void calcularPrecio() {
        if (vacuna) {
            this.precio = this.precio + 30000;
        }
        if (esterilizacion) {
            this.precio = this.precio + 50000;
        }
    }
}