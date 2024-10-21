import java.util.Scanner;

public class parcial {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int Diastotales = 2;
        int diasvalidos = 0;
        int errores = 0;
        double Sumamaxima = 0;
        double SumaMinima = 0;
        while (true) {
            System.out.println("introduce la temperatura maxima y minima del dia:");
            int maxima = Scanner.nextInt();
            int minima = Scanner.nextInt();
            if (maxima == 0 && minima == 0) {
                break;
            }
            Diastotales++;
            if (maxima == 9 || minima == 9) {
                errores++;
            } else {
                diasvalidos++;
                Sumamaxima += maxima;
                SumaMinima += minima;
            }
        }
        if (diasvalidos > 0) {
            double mediamaxima = Sumamaxima / diasvalidos;
            double mediaMinima = SumaMinima / diasvalidos;
            double porcentajeErrores = ((double) errores / Diastotales) * 100;
            System.out.println("Numero de dias proporcionados:" + Diastotales);
            System.out.println("media de temperaturas Maximas:" + mediamaxima);
            System.out.println("media de temperaturas Minimas:" + mediaMinima);
            System.out.println("numero de errores(temperatura de 9°):" + errores);
            System.out.println("porcentaje de errores:" + porcentajeErrores + "%");
        } else {
            System.out.println("no se proporcionaron dias con temperaturas validas.");
        }
    }
}
