import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System . in));

        // Primera parte del ejeciciro
        var s = suma(4,6,1);
        System.out.println(s);


// Segunda parte del ejercicio
        String r;
        int incremenPuert = 0;
        Coche miCoche = new Coche(incremenPuert);
        do {
            do {
                System.out.print("agregar puerta al coche? (s/n): ");
                r = bufEntrada.readLine();
                r = r.toLowerCase();
            } while (!(r.equals("s") || r.equals("n")));
            if (r.equals("s")) {

                // crear objeto de clase coche
                incremenPuert=miCoche.puertas(incremenPuert);

                // Imprimir mensaje
                System.out.println("Número de puertas que tiene el objeto: "+incremenPuert);
            }
        } while (!r.equals("n"));
    }

    public static int suma(int a, int b, int c) {

        int sumar = a + b + c;
        return sumar;

    }





}

