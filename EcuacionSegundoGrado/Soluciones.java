package EcuacionSegundoGrado;

public class Soluciones {
    public static String calcularSoluciones(double A, double B, double C) {
        double discriminante = B * B - 4 * A * C;

        if (discriminante > 0) {
            double raiz1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double raiz2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            return "Raíces reales: x1 = " + raiz1 + ", x2 = " + raiz2;
        } else if (discriminante == 0) {
            double raiz1 = -B / (2 * A);
            return "Raíz única: x = " + raiz1;
        } else {
            double realParte = -B / (2 * A);
            double imaginarioParte = Math.sqrt(-discriminante) / (2 * A);
            return "Raíces complejas: x1 = " + realParte + " + " + imaginarioParte + "i, x2 = " + realParte + " - " + imaginarioParte + "i";
        }
    }
}

