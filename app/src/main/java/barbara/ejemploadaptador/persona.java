package barbara.ejemploadaptador;

/**
 * Created by Barbara on 15/12/2015.
 */
public class persona {
    private String nombre;
    private String Apellido;
    private int telefono;

    public persona(String nombre, String apellido, int telefono) {
        this.nombre = nombre;
        Apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
