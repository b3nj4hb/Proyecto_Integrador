package modeloDAO;

import config.bd.ConectaBd;
import interfaces.CRUD_Prestamo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Prestamo;

public class PrestamoDAO implements CRUD_Prestamo {

    ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Prestamo e = new Prestamo();

    @Override
    public List listarprestamo() {
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        String consulta = " select * from prestamo ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();

            while (rs.next()) {
                Prestamo prestamo = new Prestamo();
                prestamo.setIdprestamo(rs.getInt("idprestamo"));
                prestamo.setFecha_prestamo(rs.getString("fecha_prestamo"));
                prestamo.setFecha_devolucion(rs.getString("fecha_devolucion"));
                prestamo.setEstado(rs.getString("estado"));
                prestamo.setIdusuario(rs.getInt("idusuario"));
                prestamos.add(prestamo);
            }
        } catch (Exception e) {
            System.out.println("ERROR : PROBLEMAS CON EL LISTAR AUTOR");
            System.out.println(e.getMessage());
        }
        return prestamos;
    }

    @Override
    public Prestamo buscarprestamo(int idprestamo) {
        String consulta = " select *  "
                + " from prestamo  "
                + " where idprestamo = " + idprestamo + " ;";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                e.setIdprestamo(rs.getInt("idprestamo"));
                e.setFecha_prestamo(rs.getString("fecha_prestamo"));
                e.setFecha_devolucion(rs.getString("fecha_devolucion"));
                e.setEstado(rs.getString("estado"));
                e.setIdusuario(rs.getInt("idusuario"));
                e.setIdlibro(rs.getInt("idlibro"));
            }
        } catch (SQLException e) {
        }

        return e;
    }

    @Override
    public boolean agregarprestamo(Prestamo prestamo) {
        String consulta = " insert into autor(idprestamo,fecha_prestamo,fecha_devolucion, estado, idusuario, idlibro)  "
                + " values( "
                + "'" + prestamo.getIdprestamo() + "', "
                + "'" + prestamo.getFecha_prestamo() + "', "
                + "'" + prestamo.getFecha_devolucion() + "', "
                + "'" + prestamo.getEstado() + "', "
                + "'" + prestamo.getIdusuario() + "', "
                + "'" + prestamo.getIdlibro() + "') ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (SQLException e) {
            return false;
        }
        return true;

    }

    @Override
    public boolean editarprestamo(Prestamo prestamo) {
        String consulta = " update prestamo "
                + " set "
                + " fecha_prestamo = '" + prestamo.getFecha_prestamo() + "', "
                + " fecha_devolucion= '" + prestamo.getFecha_devolucion() + "', "
                + " estado = '" + prestamo.getEstado() + "', "
                + " idusuario = '" + prestamo.getIdusuario() + "', "
                + " idlibro = '" + prestamo.getIdlibro() + "' "
                + " where "
                + " idprestamo = " + prestamo.getIdprestamo() + "; ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean eliminarprestamo(int idprestamo) {
        String consulta = " delete from prestamo "
                + " where "
                + " idprestamo = " + idprestamo + "; ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
            
}
