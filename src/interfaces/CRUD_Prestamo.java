package interfaces;

import java.util.List;
import modelo.Prestamo;

public interface CRUD_Prestamo {

    public List listarprestamo();

    public Prestamo buscarprestamo(int idprestamo);

    public boolean agregarprestamo(Prestamo prestamo);

    public boolean editarprestamo(Prestamo prestamo);

    public boolean eliminarprestamo(int idprestamo);
}
