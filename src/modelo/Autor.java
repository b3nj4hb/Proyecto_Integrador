package modelo;

public class Autor {
    
    private int idautor;
    private String nombre;
    private String apellidos;

    public Autor() {
    }

    public Autor(int idautor, String nombre, String apellidos) {
        this.idautor = idautor;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Autor(String nombre, String apellidos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdautor() {
        return idautor;
    }

    public void setIdautor(int idautor) {
        this.idautor = idautor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
}
