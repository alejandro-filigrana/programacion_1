import java.util.Scanner;

public class ejercicio56 {
    public static void main(String[] args) {
        double nota = 0.0;
        int aprobados = 0, noAprobados = 0;
        // notas de los estudiantes
        Scanner leer = new Scanner(System.in);
        System.out.print("digite la cantidad de estudiantes:");
        int estudiantes = leer.nextInt();
        for (int i = 1; i <= estudiantes; i++) {
            System.out.print("nota del estudiante " + i + "=");
            nota = leer.nextDouble();
            if (nota >= 5.0) {
                aprobados++;
            } else {
                noAprobados++;

            }
        }
        System.out.println("aprobados : " + aprobados + noAprobados + noAprobados);
        
    }
}