package modeloDAO;

import config.bd.ConectaBd;
import interfaces.CRUD_autor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Autor;

public class AutorDAO implements CRUD_autor {
    
    ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Autor e = new Autor();
    
    @Override
    public List listarautor() {
        ArrayList<Autor> autores = new ArrayList<>();
        String consulta = " select * from autor ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();

            while (rs.next()) {
                Autor autor = new Autor();
                autor.setIdautor(rs.getInt("idautor"));
                autor.setNombre(rs.getString("nombre"));
                autor.setApellidos(rs.getString("apellidos"));
                autores.add(autor);
            }
        } catch (Exception e) {
            System.out.println("ERROR : PROBLEMAS CON EL LISTAR AUTOR");
            System.out.println(e.getMessage());
        }
        return autores;
    }

    @Override
    public Autor buscarautor(int idautor) {
        String consulta = " select *  "
                + " from autor  "
                + " where idautor = " + idautor + " ;";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                e.setIdautor(rs.getInt("idautor"));
                e.setNombre(rs.getString("nombre"));
                e.setApellidos(rs.getString("apellidos"));
            }
        } catch (SQLException e) {
        }

        return e;
    }

    @Override
    public boolean agregarautor(Autor autor) {
        String consulta = " insert into autor(idautor,nombre, apellidos)  "
                + " values( "
                + "'" + autor.getIdautor() + "', "
                + "'" + autor.getNombre() + "', "
                + "'" + autor.getApellidos() + "') ";
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
    public boolean editarautor(Autor autor) {
        String consulta = " update autor "
                + " set "
                + " nombre = '" + autor.getNombre() + "', "
                + " apellidos = '" + autor.getApellidos() + "', "
                + " where "
                + " idautor = " + autor.getIdautor() + "; ";
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
    public boolean eliminarautor(int idautor) {
        String consulta = " delete from autor "
                + " where "
                + " idautor = " + idautor + "; ";
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
