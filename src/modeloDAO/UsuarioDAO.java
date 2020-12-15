package modeloDAO;

import config.bd.ConectaBd;
import interfaces.CRUD_Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

public class UsuarioDAO implements CRUD_Usuario{

    ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Usuario e = new Usuario();
    
    @Override
    public List listarusuario() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        String consulta = " select * from usuario ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdusuario(rs.getInt("idusuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellidos(rs.getString("apellidos"));
                usuario.setDni(rs.getInt("dni"));
                usuario.setEstado(rs.getString("estado"));
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            System.out.println("ERROR : PROBLEMAS CON EL LISTAR AUTOR");
            System.out.println(e.getMessage());
        }
        return usuarios;
    }

    @Override
    public Usuario buscarusuario(int idusuario) {
        String consulta = " select *  "
                + " from usuario "
                + " where idusuario = " + idusuario + " ;";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                e.setIdusuario(rs.getInt("idusuario"));
                e.setNombre(rs.getString("nombre"));
                e.setApellidos(rs.getString("apellidos"));
                e.setDni(rs.getInt("dni"));
                e.setEstado(rs.getString("estado"));
            }
        } catch (SQLException e) {
        }

        return e;
    }

    @Override
    public boolean agregarusuario(Usuario usuario) {
        String consulta = " insert into usuario(idusuario,nombre, apellidos, dni, estado)  "
                + " values( "
                + "'" + usuario.getIdusuario() + "', "
                + "'" + usuario.getNombre() + "', "
                + "'" + usuario.getApellidos() + "', "
                + "'" + usuario.getDni() + "', "
                + "'" + usuario.getEstado() + "') ";
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
    public boolean editarusuario(Usuario usuario) {
        String consulta = " update usuario "
                + " set "
                + " nombre = '" + usuario.getNombre() + "', "
                + " apellidos = '" + usuario.getApellidos() + "', "
                + " dni = '" + usuario.getDni() + "', "
                + " estado = '" + usuario.getEstado() + "' "
                + " where "
                + " idusuario = " + usuario.getIdusuario() + "; ";
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
    public boolean eliminarusuario(int idusuario) {
        String consulta = " delete from usuario "
                + " where "
                + " idusuario = " + idusuario  + "; ";
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
    

