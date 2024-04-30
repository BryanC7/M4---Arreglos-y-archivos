package clase15;

import java.util.Arrays;

public class DesafioEvaluado {
    public static void main(String[] args) {

        // Ejercicio 1 - Visitas

        if (args.length == 0) {
            System.out.println("Debe proporcionar al menos un valor de visita diaria.");
            return;
        }

        int[] visitasDiarias = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                visitasDiarias[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Los argumentos deben ser números enteros.");
                return;
            }
        }

        System.out.println("El promedio de visitas diarias es: " + promedio(visitasDiarias));

        // Ejercicio 2 - SmartWatch

        /*
        if (args.length == 0) {
            System.out.println("Debe proporcionar al menos un valor de pasos diarios.");
            return;
        }

        int[] pasosDiarios = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                pasosDiarios[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Los argumentos deben ser números enteros.");
                return;
            }
        }

        System.out.println("El promedio de pasos diarios entre 200 y 100.000 es: " + clearSteps(pasosDiarios));
        */

        // Ejercicio 3 y 4 - Múltiplos de tres (Suma y su respectivo promedio)

        /*
        if (args.length == 0) {
            System.out.println("Debe proporcionar al menos un valor de pasos diarios.");
            return;
        }

        int[] multiplosDe3 = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                multiplosDe3[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Los argumentos deben ser números enteros.");
                return;
            }
        }

        System.out.println("La suma de los múltiplos de 3 es: " + suma(multiplosDe3)[0]);
        System.out.println("El promedio del valor anterior es: " + suma(multiplosDe3)[1]);
        */
    }

    static double promedio(int[] visitas) {
        if (visitas.length == 0) {
            return 0;
        }

        int suma = 0;
        for (int i = 0; i < visitas.length; i++) {
            suma += visitas[i];
        }

        return (double) suma / visitas.length;
    }

    static double clearSteps(int[] pasos) {
        if (pasos.length == 0) {
            return 0;
        }

        int suma = 0;
        for (int i = 0; i < pasos.length; i++) {
            if(pasos[i] > 200 && pasos[i] < 100000) {
                suma += pasos[i];
            }
        }

        return (double) suma / pasos.length;
    }

    static double[] suma(int[] multiplos) {
        if (multiplos.length == 0) {
            return new double[0];
        }

        int suma = 0;
        int contador = 0;

        for (int i = 0; i < multiplos.length; i++) {
            if(multiplos[i] % 3 == 0) {
                suma += multiplos[i];
                contador++;
            }
        }

        return new double[]{suma, (double) suma / contador};
    }
}
