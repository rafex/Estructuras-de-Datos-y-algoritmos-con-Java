package mx.rafex.cursos.estructuraDeDatosYAlgoritmos.cadenas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {

        String fecha = null;
        String regexp = "\\d{1,2}/\\d{1,2}/\\d{4}";

        // Lo siguiente devuelve true
        fecha = "11/12/2014";
        System.out.println(fecha + " " + Pattern.matches(regexp, fecha));
        fecha = "1/12/2014";
        System.out.println(fecha + " " + Pattern.matches(regexp, fecha));
        fecha = "11/2/2014";
        System.out.println(fecha + " " + Pattern.matches(regexp, fecha));
        fecha = "99/99/9999";
        System.out.println(fecha + " " + Pattern.matches(regexp, fecha));


        // Los siguientes devuelven false
        fecha = "11/12/14";
        System.out.println(fecha + " " + Pattern.matches(regexp, fecha));  // El año no tiene cuatro cifras
        fecha = "11//2014";
        System.out.println(fecha + " " + Pattern.matches(regexp, fecha));  // el mes no tiene una o dos cifras
        fecha = "11/12/14perico";
        System.out.println(fecha + " " + Pattern.matches(regexp, fecha));  // Sobra "perico"

        System.out.println("-----");

        Pattern patron = Pattern.compile("a*b");
        // creamos el Matcher a partir del patron, la cadena como parametro
        Matcher encaja = patron.matcher("aabmanoloaabmanoloabmanolob");
        // invocamos el metodo replaceAll
        String resultado = encaja.replaceAll("-");
        System.out.println(resultado);

        System.out.println("-----");

        String emailRegexp = "[^@]+@[^@]+\\.[a-zA-Z]{2,}";
        String email = null;
        // Lo siguiente devuelve true
        email = "a@b.com";
        System.out.println(email + " " + Pattern.matches(emailRegexp, email));
        email = "+++@+++.com";
        System.out.println(email + " " + Pattern.matches(emailRegexp, email));

        // Lo siguiente devuelve false
        email = "@b.com";
        System.out.println(email + " " + Pattern.matches(emailRegexp, email)); // Falta el nombre
        email = "a@b.c";
        System.out.println(email + " " + Pattern.matches(emailRegexp, email)); // El dominio final debe tener al menos dos letras


        System.out.println("-----");
        // La cadena a analizar
        String cadena = "23+12=35";

        patron = Pattern.compile("(\\d+)\\+(\\d+)=(\\d+)");
        Matcher matcher = patron.matcher(cadena);

        // Hace que Matcher busque los trozos.
        matcher.find();

        // Va devolviendo los trozos. El primer paréntesis es el 1,
        // el segundo el 2 y el tercero el 3
        System.out.println(matcher.group(1));
        System.out.println(matcher.group(2));
        System.out.println(matcher.group(3));


    }
}
