public class parcial {
    /**
     * @param args
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
          double media;
          System.out.println("Ingrese el nombre del alumno: ");
          int nombre = leer.nextInt();
          while (!"**".equals(nombre)) {
              System.out.println("Ingrese la nota en BASIC: ");
              double BASIC = leer.nextDouble();
              System.out.println("Ingrese la nota pascal: ");
              double pascal = leer.nextDouble();
              System.out.println("Ingrese la nota en FORTRAN: ");
              double FORTRAN = leer.nextDouble();
              media = (BASIC + pascal + FORTRAN) / 3;
              System.out.println("alumno: " + nombre + "/nSu media: " + media);
              System.out.println("Ingrese el nombre del alumno: ");
              nombre = leer.nextInt();
          }
  }
  }
  