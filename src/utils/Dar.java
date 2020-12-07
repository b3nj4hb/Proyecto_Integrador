

package utils;

public class Dar {
    
    public static String f10(String cadena) {
        
        if (cadena.length() >= 10) {
            return cadena.substring(0, 10) + "...\t";
        } else if (cadena.length() >= 7) {
            return cadena + "\t\t";
        } else {
            return cadena;
        }
    }
    
    public static String formato(String cadena) {

        if (cadena.length() >= 30) {

            return cadena.substring(0, 20) + "...";
        } else if (cadena.length() <= 7) {
            return cadena + "\t";
        } else {
            return cadena;
        }
    }

    public static String Formato(String cadena) {
        if (cadena.length() >= 20) {
            cadena = cadena.substring(0, 17) + "... ";
        } else if (cadena.length() >= 16) {
            cadena = cadena + "...";
        } else if (cadena.length() >= 13) {
            cadena = cadena + "\t";
        } else if (cadena.length() >= 11) {
            cadena = cadena + " \t";
        } else if (cadena.length() >= 9) {
            cadena = cadena + "\t";
        } else if (cadena.length() >= 8) {
            cadena = cadena + "\t";
        } else if (cadena.length() >= 4) {
            cadena = cadena + "\t\t";
        } else if (cadena.length() >= 1) {
            cadena = cadena + "\t\t\t";
        } else {
            cadena = cadena + "\t";
        }
        return cadena;
    }
    
}
