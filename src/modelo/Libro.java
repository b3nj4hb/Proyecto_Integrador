package modelo;

public class Libro {
    
    private int idlibro;
    private String titulo;
    private int ISBN;
    private int paginas;
    private int año;
    private int stock;
    private int stock_disponibles;
    private int idautor;
    private int idpais;
    private int ideditorial;

    public Libro() {
    }

    public Libro(int idlibro, String titulo, int ISBN, int paginas, int año, int stock, int stock_disponibles, int idautor, int idpais, int ideditorial) {
        this.idlibro = idlibro;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.año = año;
        this.stock = stock;
        this.stock_disponibles = stock_disponibles;
        this.idautor = idautor;
        this.idpais = idpais;
        this.ideditorial = ideditorial;
    }

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock_disponibles() {
        return stock_disponibles;
    }

    public void setStock_disponibles(int stock_disponibles) {
        this.stock_disponibles = stock_disponibles;
    }

    public int getIdautor() {
        return idautor;
    }

    public void setIdautor(int idautor) {
        this.idautor = idautor;
    }

    public int getIdpais() {
        return idpais;
    }

    public void setIdpais(int idpais) {
        this.idpais = idpais;
    }

    public int getIdeditorial() {
        return ideditorial;
    }

    public void setIdeditorial(int ideditorial) {
        this.ideditorial = ideditorial;
    }
    
    
}
