public punto9  {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //code
        int A = 16;
        int B = 30;
        // price
        int PA = 200;
        int PB = 50;
        //units
        int AE = 5;
        int BE = 9;

        System.out.println("Ingrese el codigo:");
        int articulo = leer.nextInt();
        switch (articulo) {
            case 16:
                System.out.println("codigo articulo:" + A);
                System.out.println("unidades existentes:" + AE);
                System.out.println("importe total:" + PA * AE);
                break;
            case 30:
                System.out.println("codigo articulo:" + B);
                System.out.println("unidades existentes" + BE);
                System.out.println("importe total:" + PB * BE);
                break;
            default:
                System.out.println("ingrese un articulo valido:");
                break;
}
}
}