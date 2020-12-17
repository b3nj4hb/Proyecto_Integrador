package vistacontrol;

import java.util.List;
import modelo.Autor;
import modelo.Editorial;
import modelo.Libro;
import modelo.Pais;
import modelo.Usuario;
import modeloDAO.AutorDAO;
import modeloDAO.EditorialDAO;
import modeloDAO.LibroDAO;
import modeloDAO.PaisDAO;
import modeloDAO.UsuarioDAO;
import utils.Leer;

public class Index {

    public static void menu_principal() {
        System.out.println("\n\t ~~ MENU ~~");
        System.out.println("1. Datos Autor");
        System.out.println("2. Datos País");
        System.out.println("3. Datos Editorial");
        System.out.println("4. Datos Usuario");
        System.out.println("5. Datos Libro");
        System.out.println("6. Prestamos");
        System.out.println("7. Devoluciones");
        System.out.println("8. Salir");
        System.out.print("Opcion [1-8]: ");
    }

    public static void menu_secundario() {

        System.out.println("1. Agregar");
        System.out.println("2. Eliminar");
        System.out.println("3. Editar");
        System.out.println("4. Listar");
        System.out.println("5. Salir");
        System.out.print("Opcion [1-5]: ");
    }

    public static int opcion;

    public static void error() {

    }

    public static void switches() {

        do {
            menu_principal();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    switch_autor();
                    break;
                case 2:
                    switch_pais();
                    break;
                case 3:
                    switch_editorial();
                    break;
                case 4:
                    switch_usuario();
                    break;
                case 5:
                    switch_libro();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("--------------------------------");
                    System.out.println("\n Hasta la proxima...\n");
                    System.out.println("--------------------------------");
                    break;
                default:
                    if (opcion != 8) {
                        System.out.println("\n Por favor solo opciones en el menu...");
                        switches();
                    }
            }
        } while (opcion != 8);
    }

    public static void switch_autor() {
        int opcion;
        do {
            System.out.println("\n\t ~~ AUTOR ~~");
            menu_secundario();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    listarAutor();
                    break;
                case 5:
                    switches();
                    break;
                default:
                    if (opcion != 8) {
                        System.out.println("\n Por favor solo opciones en el menu...");
                        switch_autor();
                    }
            }
        } while (opcion != 5);
    }

    public static void switch_pais() {
        int opcion;
        do {
            System.out.println("\n\t ~~ PAIS ~~");
            menu_secundario();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    switches();
                    break;
                default:
                    if (opcion != 8) {
                        System.out.println("\n Por favor solo opciones en el menu...");
                        switch_pais();
                    }
            }
        } while (opcion != 5);
    }

    public static void switch_editorial() {
        int opcion;
        do {
            System.out.println("\n\t ~~ EDITORIAL ~~");
            menu_secundario();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    switches();
                    break;
                default:
                    if (opcion != 8) {
                        System.out.println("\n Por favor solo opciones en el menu...");
                        switch_editorial();
                    }
            }
        } while (opcion != 5);
    }

    public static void switch_usuario() {
        int opcion;
        do {
            System.out.println("\n\t ~~ USUARIO ~~");
            menu_secundario();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    switches();
                    break;
                default:
                    if (opcion != 8) {
                        System.out.println("\n Por favor solo opciones en el menu...");
                        switch_usuario();
                    }
            }
        } while (opcion != 5);
    }

    public static void switch_libro() {
        int opcion;
        do {
            System.out.println("\n\t ~~ LIBRO ~~");
            menu_secundario();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    switches();
                    break;
                default:
                    if (opcion != 8) {
                        System.out.println("\n Por favor solo opciones en el menu...");
                        switch_libro();
                    }
            }
        } while (opcion != 5);
    }

    public static void switch_prestamo() {
        int opcion;
        do {
            System.out.println("\n\t ~~ PRESTAMO ~~");
            menu_secundario();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    switches();
                    break;
                default:
                    if (opcion != 8) {
                        System.out.println("\n Por favor solo opciones en el menu...");
                        switch_libro();
                    }
            }
        } while (opcion != 5);
    }

    public static void listarAutor() {
        AutorDAO AutorDAO = new AutorDAO();
        List<Autor> autores = AutorDAO.listarautor();
        System.out.println("Listado de Autores");
        System.out.println("ID\tNombre \tApellidos");
        for (Autor autor : autores) {
            System.out.println(
                    autor.getIdautor() + "\t"
                    + autor.getNombre() + "\t"
                    + autor.getApellidos()
            );
        }
    }

    public static void listarPais() {
        PaisDAO PaisDAO = new PaisDAO();
        List<Pais> paises = PaisDAO.listarpais();
        System.out.println("Listado de Paises");
        System.out.println("ID\tNombre \tApellidos");
        for (Pais pais : paises) {
            System.out.println(
                    pais.getIdpais() + "\t"
                    + pais.getNombre() + "\t"
                    + pais.getEstado()
            );
        }
    }

    public static void listarEditorial() {
        EditorialDAO EditorialDAO = new EditorialDAO();
        List<Editorial> editoriales = EditorialDAO.listareditorial();
        System.out.println("Listado de Editoriales");
        System.out.println("ID\tNombre \tCodigo \tDireccion \tURL \tEstado");
        for (Editorial editorial : editoriales) {
            System.out.println(
                    editorial.getIdeditorial() + "\t"
                    + editorial.getNombre() + "\t"
                    + editorial.getCodigo() + "\t"
                    + editorial.getDireccion() + "\t"
                    + editorial.getURL() + "\t"
                    + editorial.getEstado()
            );
        }
    }

    public static void listarUsuario() {
        UsuarioDAO UsuarioDAO = new UsuarioDAO();
        List<Usuario> usuarios = UsuarioDAO.listarusuario();
        System.out.println("Listado de Editoriales");
        System.out.println("ID\tNombre \tNombre \tApellidos \tDNI \tEstado");
        for (Usuario usuario : usuarios) {
            System.out.println(
                    usuario.getIdusuario() + "\t"
                    + usuario.getNombre() + "\t"
                    + usuario.getApellidos() + "\t"
                    + usuario.getDni() + "\t"
                    + usuario.getEstado()
            );
        }
    }

    public static void listarLibro() {
        LibroDAO LibroDAO = new LibroDAO();
        List<Libro> libros = LibroDAO.listarlibro();
        System.out.println("Listado de Libros");
        System.out.println("ID\tTitulo \tISBN \tPaginas \tAño \tStock \tStock Disponiles \tID Autor \tID Libro \tID Editorial ");
        for (Libro libro : libros) {
            System.out.println(
                    libro.getIdlibro() + "\t"
                    + libro.getTitulo() + "\t"
                    + libro.getISBN() + "\t"
                    + libro.getPaginas() + "\t"
                    + libro.getAño() + "\t"
                    + libro.getStock() + "\t"
                    + libro.getStock_disponibles() + "\t"
                    + libro.getIdautor() + "\t"
                    + libro.getIdlibro() + "\t"
                    + libro.getIdeditorial()
            );
        }
    }

    public static void eliminarAutor() {
        listarAutor();
        System.out.println("Ingrese el ID del autor a Eliminar");
        int id = Leer.entero();
        AutorDAO autorDAO = new AutorDAO();
        autorDAO.eliminarautor(id);
    }

    public static void eliminarPais() {
        listarPais();
        System.out.println("Ingrese el ID del Pais a Eliminar");
        int id = Leer.entero();
        PaisDAO paisDAO = new PaisDAO();
        paisDAO.eliminarpais(id);
    }

    public static void eliminarEditorial() {
        listarEditorial();
        System.out.println("Ingrese el ID del editorial a Eliminar");
        int id = Leer.entero();
        EditorialDAO editorialDAO = new EditorialDAO();
        editorialDAO.eliminareditorial(id);
    }

    public static void eliminarUsuario() {
        listarUsuario();
        System.out.println("Ingrese el ID del usuario a Eliminar");
        int id = Leer.entero();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.eliminarusuario(id);
    }

    public static void eliminarLibro() {
        listarLibro();
        System.out.println("Ingrese el ID del libro a Eliminar");
        int id = Leer.entero();
        LibroDAO libroDAO = new LibroDAO();
        libroDAO.eliminarlibro(id);
    }

    public static void editarAutor() {
        listarAutor();
        System.out.println("Ingrese el ID del autor a editar: ");
        int id = Leer.entero();
        String nombre;
        String apellidos;
        System.out.println("Editar Autor");
        System.out.print("Nombre: ");
        nombre = Leer.cadena();
        System.out.print("Apellidos: ");
        apellidos = Leer.cadena();
        Autor autor = new Autor(id, nombre, apellidos);
        AutorDAO autorDAO = new AutorDAO();
        autorDAO.editarautor(autor);
    }

    public static void editarPais() {
        listarPais();
        System.out.println("Ingrese el ID del pais a editar: ");
        int id = Leer.entero();
        String nombre;
        String estado;
        System.out.println("Editar Estudiante");
        System.out.print("Nombre: ");
        nombre = Leer.cadena();
        System.out.print("Estado: ");
        estado = Leer.cadena();
        Pais pais = new Pais(id, nombre, estado);
        PaisDAO paisDAO = new PaisDAO();
        paisDAO.editarpais(pais);
    }

    public static void editarEditorial() {
        listarEditorial();
        System.out.println("Ingrese el ID del la editorial a editar: ");
        int id = Leer.entero();
        String nombre;
        String codigo;
        String direccion;
        String URL;
        String estado;
        System.out.println("Editar Estudiante");
        System.out.print("Nombre: ");
        nombre = Leer.cadena();
        System.out.print("Codigo: ");
        codigo = Leer.cadena();
        System.out.print("Direccion: ");
        direccion = Leer.cadena();
        System.out.print("URL: ");
        URL = Leer.cadena();
        System.out.print("Estado: ");
        estado = Leer.cadena();
        Editorial editorial = new Editorial(id, nombre, codigo, direccion, URL, estado);
        EditorialDAO editorialDAO = new EditorialDAO();
        editorialDAO.editareditorial(editorial);
    }

    public static void inicio() {
        switches();
    }

    public static void main(String[] args) {
        inicio();
    }

}
