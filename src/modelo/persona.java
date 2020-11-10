package modelo;
public class persona {
    private int idpersona;
    private String nombre;
    private String apellido;
    private String perro;

    public persona(int idpersona, String nombre, String apellido, String perro) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.perro = perro;
    }

    public persona() {
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
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

    public String getPerro() {
        return perro;
    }

    public void setPerro(String perro) {
        this.perro = perro;
    }
    
}
