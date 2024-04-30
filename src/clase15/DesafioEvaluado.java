package clase15;

public class DesafioEvaluado {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Debe proporcionar al menos un parámetro.");
            return;
        }

        String parametro = args[0];

        switch (parametro) {
            case "visitas":
                int[] visitasDiarias = construirArreglo(args);
                System.out.println("El promedio de visitas diarias es: " + promedio(visitasDiarias));
                break;
            case "pasos":
                int[] pasosDiarios = construirArreglo(args);
                System.out.println("El promedio de pasos diarios es: " + clearSteps(pasosDiarios));
                break;
            case "multiplos":
                int[] multiplosDe3 = construirArreglo(args);
                double[] resultadoMultiplos3 = suma(multiplosDe3);
                System.out.println("La suma de los múltiplos de 3 es: " + resultadoMultiplos3[0]);
                System.out.println("El promedio de los múltiplos de 3 es: " + resultadoMultiplos3[1]);
                break;
            default:
                System.out.println("Parámetro no reconocido. Opciones válidas: visitas, pasos, multiplos");
        }
    }

    public static int[] construirArreglo(String[] args) {
        if (args.length == 0) {
            System.out.println("Debe proporcionar al menos un valor.");
            return new int[0];
        }

        int[] valores = new int[args.length];
        for (int i = 1; i < args.length; i++) {
            try {
                valores[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Los argumentos deben ser números enteros.");
                return new int[0];
            }
        }

        return valores;
    }

    static double promedio(int[] visitas) {
        if (visitas.length == 0) {
            return 0;
        }

        int suma = 0;
        for (int visita : visitas) {
            suma += visita;
        }

        return (double) suma / visitas.length;
    }

    static double clearSteps(int[] pasos) {
        if (pasos.length == 0) {
            return 0;
        }

        int suma = 0;
        for (int paso : pasos) {
            if (paso > 200 && paso < 100000) {
                suma += paso;
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

        for (int multiplo : multiplos) {
            if (multiplo % 3 == 0) {
                suma += multiplo;
                contador++;
            }
        }

        return new double[]{suma, (double) suma / contador};
    }
}
