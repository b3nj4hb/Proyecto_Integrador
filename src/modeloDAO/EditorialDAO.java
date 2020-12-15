package modeloDAO;

import config.bd.ConectaBd;
import interfaces.CRUD_Editorial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Editorial;

public class EditorialDAO implements CRUD_Editorial {

    ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Editorial e = new Editorial();

    @Override
    public List listareditorial() {
        ArrayList<Editorial> editoriales = new ArrayList<>();
        String consulta = " select * from editorial ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();

            while (rs.next()) {
                Editorial editorial = new Editorial();
                editorial.setIdeditorial(rs.getInt("ideditorial"));
                editorial.setNombre(rs.getString("nombre"));
                editorial.setCodigo(rs.getInt("codigo"));
                editorial.setDireccion(rs.getString("direccion"));
                editorial.setURL(rs.getString("URL"));
                editorial.setEstado(rs.getString("estado"));
                editoriales.add(editorial);
            }
        } catch (Exception e) {
            System.out.println("ERROR : PROBLEMAS CON EL LISTAR AUTOR");
            System.out.println(e.getMessage());
        }
        return editoriales;
    }

    @Override
    public Editorial buscareditorial(int ideditorial) {
        String consulta = " select *  "
                + " from autor  "
                + " where ideditorial= " + ideditorial + " ;";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                e.setIdeditorial(rs.getInt("ideditorial"));
                e.setNombre(rs.getString("nombre"));
                e.setCodigo(rs.getInt("codigo"));
                e.setDireccion(rs.getString("direccion"));
                e.setURL(rs.getString("URL"));
                e.setEstado(rs.getString("estado"));
                
            }
        } catch (SQLException e) {
        }

        return e;

    }

    @Override
    public boolean agregareditorial(Editorial editorial) {
        String consulta = " insert into autor(ideditorial,nombre, codigo,direccion, URL, estado)  "
                + " values( "
                + "'" + editorial.getIdeditorial() + "', "
                + "'" + editorial.getNombre() + "', "
                + "'" + editorial.getCodigo() + "', "
                + "'" + editorial.getDireccion() + "', "
                + "'" + editorial.getURL() + "', "
                + "'" + editorial.getEstado() + "') ";
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
    public boolean editareditorial(Editorial editorial) {
        String consulta = " update editorial "
                + " set "
                + " nombre = '" + editorial.getNombre() + "', "
                + " codigo = '" + editorial.getCodigo() + "', "
                + " direccion = '" + editorial.getDireccion() + ", "
                + " URL = '" + editorial.getURL() + ", "
                + " Estado = '" + editorial.getEstado() + "' "
                + " where "
                + " ideditorial= " + editorial.getIdeditorial() + "; ";
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
    public boolean eliminareditorial(int ideditorial) {
        String consulta = " delete from editorial "
                + " where "
                + " ideditorial = " + ideditorial + "; ";
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
