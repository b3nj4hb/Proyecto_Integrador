package interfaces;

import java.util.List;
import modelo.Pais;

public interface CRUD_Pais {

    public List listarpais();

    public Pais buscarpais(int idpais);

    public boolean agregarpais(Pais pais);

    public boolean editarpais(Pais pais);

    public boolean eliminarpais(int idpais);
}
