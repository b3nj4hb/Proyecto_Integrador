package modelo;

public class Pais {

    private int idpais;
    private String nombre;
    private String estado;

    public Pais() {
    }

    public Pais(int idpais, String nombre, String estado) {
        this.idpais = idpais;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Pais(String nombre, String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdpais() {
        return idpais;
    }

    public void setIdpais(int idpais) {
        this.idpais = idpais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
