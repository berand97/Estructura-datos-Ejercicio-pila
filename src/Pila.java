import java.io.File;
import java.util.Scanner;

public class Pila {

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
        ListP pila1;
        ListP pila2;
        ListP pila3;
        ListaC cola1;
        ListaC cola2;
        Integer x, y, z, b, c, g, l, n, v;
        try {
            pila1 = new ListP();
            pila2 = new ListP();
            pila3 = new ListP();
            cola1 = new ListaC();
            cola2 = new ListaC();
            b = 0;
            v = 0;
            input = new Scanner(new File("entrada.txt"));
            pila1 = leerImprimirLinea();
            pila2 = leerImprimirLinea();
            pila3 = leerImprimirLinea();
            System.out.println("Elementos de la Pila: ");
            while (!pila1.pilaVacia() || !pila2.pilaVacia()) {
                x = (Integer) pila1.quitar();
                System.out.print(x + " ");
                y = (Integer) pila2.quitar();
                System.out.print(y + " ");
                c = x + y;
                c = c + b;
                if (c > 9) {
                    String h = Integer.toString(c);
                    g = Integer.parseInt(Character.toString(h.charAt(0)));
                    Integer i = Integer.parseInt(Character.toString(h.charAt(1)));
                    cola1.insertar(i);
                    b = g;
                    n = (Integer) pila3.quitar();
                    l = n + i;
                    l = l + v;
                    if (l > 9) {
                        String o = Integer.toString(l);
                        Integer w = Integer.parseInt(Character.toString(o.charAt(0)));
                        Integer p = Integer.parseInt(Character.toString(o.charAt(1)));
                        cola2.insertar(p);
                        v = w;
                    } else {
                        cola2.insertar(l);
                        v = 0;
                    }
                } else {
                    cola1.insertar(c);
                    n = (Integer) pila3.quitar();
                    l = n + c;
                    l = l + v;
                    b = 0;
                    if (l > 9) {
                        String o = Integer.toString(l);
                        Integer w = Integer.parseInt(Character.toString(o.charAt(0)));
                        Integer p = Integer.parseInt(Character.toString(o.charAt(1)));
                        cola2.insertar(p);
                        v = w;
                    } else {
                        cola2.insertar(l);
                        v = 0;
                    }
                }
            }
            if (b > 0) {
                cola1.insertar(b);
            }
            System.out.println(" ");
            while (!cola1.colaVacia()) {
                z = (Integer) cola1.quitar();
                System.out.print(z + " ");
            }
            System.out.println(" ");
            System.out.println("Resultados de la sumatoria:");
            System.out.println(" ");
            while (!cola2.colaVacia()) {
                z = (Integer) cola2.quitar();
                System.out.print(z + " ");
            }

    } catch (Exception er) {
            System.err.println("Excepcion: " + er);
        }
    }
}