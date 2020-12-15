package modeloDAO;

import config.bd.ConectaBd;
import interfaces.CRUD_Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Libro;

public class LibroDAO implements CRUD_Libro {

    ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Libro e = new Libro();

    @Override
    public List listarlibro() {
        ArrayList<Libro> libros = new ArrayList<>();
        String consulta = " select * from libro ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();

            while (rs.next()) {
                Libro libro = new Libro();
                libro.setIdlibro(rs.getInt("idlibro"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setISBN(rs.getInt("ISBN"));
                libro.setPaginas(rs.getInt("paginas"));
                libro.setAño(rs.getInt("año"));
                libro.setStock(rs.getInt("stock"));
                libro.setStock_disponibles(rs.getInt("stock_disponibles"));
                libro.setIdautor(rs.getInt("idautor"));
                libro.setIdpais(rs.getInt("idpais"));
                libro.setIdeditorial(rs.getInt("ideditorial"));
                libros.add(libro);
            }
        } catch (Exception e) {
            System.out.println("ERROR : PROBLEMAS CON EL LISTAR AUTOR");
            System.out.println(e.getMessage());
        }
        return libros;
    }

    @Override
    public Libro buscarlibro(int idlibro) {
        String consulta = " select *  "
                + " from libro "
                + " where idlibro = " + idlibro + " ;";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                e.setIdlibro(rs.getInt("idlibro"));
                e.setTitulo(rs.getString("titulo"));
                e.setISBN(rs.getInt("ISBN"));
                e.setPaginas(rs.getInt("paginas"));
                e.setAño(rs.getInt("año"));
                e.setStock(rs.getInt("stock"));
                e.setStock_disponibles(rs.getInt("stock_disponibles"));
                e.setIdautor(rs.getInt("Idautor"));
                e.setIdpais(rs.getInt("Idpais"));
                e.setIdeditorial(rs.getInt("Ideditorial"));
            }
        } catch (SQLException e) {
        }
        return e;
    }

    @Override
    public boolean agregarlibro(Libro libro) {
        String consulta = " insert into autor(idlibro, titulo, ISBN, paginas, año, stock, stock_disponibles, idautor, idpais, ideditorial)  "
                + " values( "
                + "'" + libro.getIdlibro() + "', "
                + "'" + libro.getTitulo() + "', "
                + "'" + libro.getISBN() + "', "
                + "'" + libro.getPaginas() + "', "
                + "'" + libro.getAño() + "', "
                + "'" + libro.getStock() + "', "
                + "'" + libro.getStock_disponibles() + "', "
                + "'" + libro.getIdautor() + "', "
                + "'" + libro.getIdpais() + "', "
                + "'" + libro.getIdeditorial() + "') ";
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
    public boolean editarlibro(Libro libro) {
        String consulta = " update autor "
                + " set "
                + " titulo = '" + libro.getTitulo() + "', "
                + " ISBN = '" + libro.getISBN() + "', "
                + " paginas = '" + libro.getPaginas() + "', "
                + " año = '" + libro.getAño() + "', "
                + " stock = '" + libro.getStock() + "', "
                + " stock_disponibles  = '" + libro.getStock_disponibles() + "', "
                + " idautor = '" + libro.getIdautor() + "', "
                + " idpais = '" + libro.getIdpais() + "', "
                + " ideditorial = '" + libro.getIdeditorial() + "' "
                + " where "
                + " idlibro = " + libro.getIdlibro() + "; ";
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
    public boolean eliminarlibro(int idlibro) {
         String consulta = " delete from libro "
                + " where "
                + " idlibro = " + idlibro + "; ";
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
