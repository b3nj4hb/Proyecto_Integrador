package interfaces;

import java.util.List;
import modelo.Autor;

public interface CRUD_autor {

    public List listarautor();

    public Autor buscarautor(int idautor);

    public boolean agregarautor(Autor autor);

    public boolean editarautor(Autor autor);

    public boolean eliminarautor(int idautor);
}
