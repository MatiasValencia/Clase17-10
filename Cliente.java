public class Cliente {
    private String IDCliente;
    private String nombre;
    private String email;
    private int mes;
    private int dia;
    private int anio;
    //private ArrayList<Mascota> mascotas;
    //Constructor
    public Cliente(int IDGlobal, String nombre, String email) {
        this.IDCliente = String.valueOf(IDGlobal);
        this.nombre = nombre;
        this.email = email;
    }
    //Getters
    public String getIDCliente() {
        return IDCliente;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "id: " + IDCliente + "\n" + "Fecha: " + dia + "-" + mes + "-" + anio;
    }
}
