package vistacontrol;

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
<<<<<<< HEAD
                    System.out.println("--------------------------------");
                    System.out.println("\n Hasta la proxima...\n");
                    System.out.println("--------------------------------");
=======
                    System.out.println("\n Hasta la proxima...\n");
>>>>>>> 3577ebe5f394ab3a05b07aa8d6aa7844640798f9
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

    public static void inicio() {
        switches();
    }

    public static void main(String[] args) {
        inicio();
    }

}
