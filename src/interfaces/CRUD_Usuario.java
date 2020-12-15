package interfaces;

import java.util.List;
import modelo.Usuario;

public interface CRUD_Usuario {

    public List listarusuario();

    public Usuario buscarusuario(int idusuario);

    public boolean agregarusuario(Usuario usuario);

    public boolean editarusuario(Usuario usuario);

    public boolean eliminarusuario(int idusuario);
}
