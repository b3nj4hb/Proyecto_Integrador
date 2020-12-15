package modeloDAO;

import config.bd.ConectaBd;
import interfaces.CRUD_Pais;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Pais;

public class PaisDAO implements CRUD_Pais {

    ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Pais e = new Pais();

    @Override
    public List listarpais() {
        ArrayList<Pais> paises = new ArrayList<>();
        String consulta = " select * from pais ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();

            while (rs.next()) {
                Pais pais = new Pais();
                pais.setIdpais(rs.getInt("idautor"));
                pais.setNombre(rs.getString("nombre"));
                pais.setEstado(rs.getString("estado"));
                paises.add(pais);
            }
        } catch (Exception e) {
            System.out.println("ERROR : PROBLEMAS CON EL LISTAR AUTOR");
            System.out.println(e.getMessage());
        }
        return paises;
    }

    @Override
    public Pais buscarpais(int idpais) {
        String consulta = " select *  "
                + " from pais  "
                + " where idpais  = " + idpais + " ;";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                e.setIdpais(rs.getInt("idpais"));
                e.setNombre(rs.getString("nombre"));
                e.setEstado(rs.getString("estado"));
            }
        } catch (SQLException e) {
        }

        return e;
    }

    @Override
    public boolean agregarpais(Pais pais) {
        String consulta = " insert into pais(idpais,nombre,estado)  "
                + " values( "
                + "'" + pais.getIdpais() + "', "
                + "'" + pais.getNombre() + "', "
                + "'" + pais.getEstado() + "') ";
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
    public boolean editarpais(Pais pais) {
        String consulta = " update pais  "
                + " set "
                + " nombre = '" + pais.getNombre() + "', "
                + " estado = '" + pais.getEstado() + "' "
                + " where "
                + " idautor = " + pais.getIdpais() + "; ";
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
    public boolean eliminarpais(int idpais) {
        String consulta = " delete from pais"
                + " where "
                + " idpais = " + idpais + "; ";
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
