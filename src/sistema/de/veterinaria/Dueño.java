
package sistema.de.veterinaria;
public class Dueño {
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private int DNI;
    private int telefono;   
    public Dueño() {
    }
    //proceso
    public Dueño(String Nombre, String Apellido, String Direccion, int DNI, int telefono) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.DNI = DNI;
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Due\u00f1o{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Direccion=" + Direccion + ", DNI=" + DNI + ", telefono=" + telefono + '}';
    }
    
}