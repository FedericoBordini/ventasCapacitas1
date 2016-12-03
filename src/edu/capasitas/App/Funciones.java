package edu.capasitas.App;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Fede on 02/12/2016.
 */
public class Funciones {

    public static char LeeCaracter() {
        Scanner reader = new Scanner(System.in);
        char c = reader.next().charAt(0);
        return c;
    }

    public static void clearConsole() throws IOException {
        System.out.println("************************************");
    }

    public static String pedirEntrada() {
        String entrada = null;

        Scanner reader;
        reader = new Scanner(System.in);
        entrada = reader.next();
        return entrada;
    }

    public static long pedirNumeroPositivo() {
        String numero;
        boolean ok;
        Scanner reader;
        reader = new Scanner(System.in);
        numero = reader.next();
        if (!isNumeric(numero)) {
            ok = false;
            return -1;
        } else {
            return Long.parseLong(numero);
        }
    }

    public static int pedirNumeroPositivoInt() {
        String numero;
        boolean ok;
        Scanner reader;
        reader = new Scanner(System.in);
        numero = reader.next();
        if (!isNumeric(numero)) {
            ok = false;
            return -1;
        } else {
            return  Integer.parseInt(numero);
        }
    }

    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static char pedirSexo() {
        return LeeCaracter();
    }


    public static Float pedirFlotante() {
        String numero;
        boolean ok;
        Scanner reader;
        reader = new Scanner(System.in);
        numero = reader.next();
        return Float.parseFloat(numero);
    }
}
