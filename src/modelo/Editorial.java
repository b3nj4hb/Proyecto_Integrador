package modelo;

public class Editorial {
    
    private int ideditorial;
    private String nombre;
    private int codigo;
    private String direccion;
    private String URL;
    private String estado;

    public Editorial() {
    }

    public Editorial(int ideditorial, String nombre, int codigo, String direccion, String URL, String estado) {
        this.ideditorial = ideditorial;
        this.nombre = nombre;
        this.codigo = codigo;
        this.direccion = direccion;
        this.URL = URL;
        this.estado = estado;
    }

    public Editorial(int id, String nombre, String codigo, String direccion, String URL, String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Editorial(String nombre, String codigo, String direccion, String URL, String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdeditorial() {
        return ideditorial;
    }

    public void setIdeditorial(int ideditorial) {
        this.ideditorial = ideditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
