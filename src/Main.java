import java.io.File;
import java.util.Scanner;

public class Main {

    static Scanner input;

    private static ListP leerImprimirLinea() {
        ListP pila;
        pila = new ListP();

        Integer x;

        String line = input.nextLine();
        System.out.println("\n" + line);
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            x = Integer.parseInt(Character.toString(c));

            pila.insertar(x);
        }
        return pila;
    }

    public static void main(String[] a) {
        ListP pila[] = new ListP[2];
        ListaC cola[] = new ListaC[1];

        Integer x, y, z, b, c, g;

        try {
            pila[1] = new ListP();
            pila[2] = new ListP();
            cola[1] = new ListaC();
            b = 0;
            input = new Scanner(new File("entrada.txt"));
            pila[1] = leerImprimirLinea();
            pila[2] = leerImprimirLinea();
            System.out.println("Elementos de la Pila: ");
            while (!pila[1].pilaVacia() || !pila[2].pilaVacia()) {
                x = (Integer) pila[1].quitar();
                System.out.print(x + " ");
                y = (Integer) pila[2].quitar();
                System.out.print(y + " ");
                c = x + y;
                c = c + b;
                if (c > 9) {
                    String h = Integer.toString(c);
                    g = Integer.parseInt(Character.toString(h.charAt(0)));
                    Integer i = Integer.parseInt(Character.toString(h.charAt(1)));
                    cola[1].insertar(i);
                    b = g;
                } else {
                    cola[1].insertar(c);
                    b = 0;
                }
            }
            if (b > 0) {
                cola[1].insertar(b);
            }
            System.out.println(" ");
            while (!cola[1].colaVacia()) {
                z = (Integer) cola[1].quitar();
                System.out.print(z + " ");
            }
        } catch (Exception er) {
            System.err.println("Excepcion: " + er);
        }
    }

}