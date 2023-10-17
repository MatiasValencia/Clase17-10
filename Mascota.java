import java.util.ArrayList;

public class Mascota {
    // Atributos
    private String IDMascota;
    private String nombre;
    private int edad;
    private String raza;
    private String especie;
    private ArrayList<Ficha> fichas;
    private Ficha ultimaFicha;
    public Mascota(String IDPersona, String nombre, int edad, String raza, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.especie = especie;
    }
    // Getters
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
    public void setVacuna() {
        this.vacuna = true;
    }
    public void setEsterilizacion() {
        this.esterilizacion = true;
    }
    public void crearFicha(int dia, int mes, int anio) {
        int cantMascotas = fichas.size();
        String IDFicha = IDMascota = "."+String.valueOf(cantMascotas);
        Ficha auxiliar = new Ficha(dia, mes, anio);
        fichas.add(auxiliar);
        ultimaFicha = auxiliar;
    }
    public void vacunar(){
        ultimaFicha.setVacuna(true);
    }
    public void esterilizar(){
        ultimaFicha.setEsterilizacion(true);
    }
    @Override
    public String toString() {
        return "id: " + idFicha + "\n" + "Fecha: " + dia + "-" + mes + "-" + anio
    }
    public void mostrarFichas() {
        for (ficha f: fichas) {
            System.out.println(f.toString());
            
        }
    }
}
