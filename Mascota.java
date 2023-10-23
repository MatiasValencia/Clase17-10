import java.util.ArrayList;

public class Mascota {
    // Atributos
    private int IDMascota;
    private String nombre;
    private int edad;
    private String raza;
    private String especie;
    private ArrayList<Ficha> fichas;
    private Ficha ultimaFicha;
    //Constructor
    public Mascota(String IDPersona, String nombre, int edad, String raza, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.especie = especie;
    }
    // Getters
    public int IDMascota() {
        return IDMascota;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getRaza() {
        return raza;
    }
    public String getEspecie() {
        return especie;
    }
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void setVacuna(boolean vacuna) {
    }
    public void setEsterilizacion(boolean esterilizacion) {
    }
    public void crearFicha(String IDFicha, int dia, int mes, int anio) {
        int cantMascotas = fichas.size();
        String IDFicha2 = "." + String.valueOf(cantMascotas);
        IDMascota = Integer.parseInt(IDFicha2);
        Ficha auxiliar = new Ficha(IDFicha, dia, mes, anio);
        fichas.add(auxiliar);
        ultimaFicha = auxiliar;
    }
    public void vacunar(){
        ultimaFicha.setVacuna(true);
    }
    public void esterilizar(){
        ultimaFicha.setEsterilizacion(true);
    }
    public void mostrarFichas() {
        for (Ficha f: fichas) {
            System.out.println(f.toString());
        }
    }
}
