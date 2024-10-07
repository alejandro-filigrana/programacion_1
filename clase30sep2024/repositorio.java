public class repositorio {
    public static void main(String[] args) {
        
        boolean c;
        boolean b;
        boolean a = b = c = true;
        if (!a || (b && c)) {
            System.out.println("sentencia if ejecutada");
        } else {
            System.out.println("sentencia else ejecutada");
        }
    }
}