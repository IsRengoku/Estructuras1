package Estructuras1;

public class empleado {
    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;
    private String cargo;

    public empleado(String nombre, String apellido, String direccion, int edad, String cargo) {
      String Nombre = nombre;
      String Apellido = apellido;
      String Direccion = direccion;
      int Edad = edad;
      String Cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
}
