import java.util.Scanner;

public class parca {

    public static void main(String[] args) {
        int N1, N2;
        double M, MAX;
        Scanner leer = new Scanner(System.in);
        N1 = leer.nextInt();
        N2 = leer.nextInt();

        MAX = (N1 + N2) / 2;
        while (N2 != 999 && N1 != 999) {
            N1 = leer.nextInt();
            N2 = leer.nextInt();
            M = (N1 + N2) / 2;
            if (M > MAX) {
                MAX = M;

                System.out.println("media maxima=" + MAX);
            }
        }
    }
}
