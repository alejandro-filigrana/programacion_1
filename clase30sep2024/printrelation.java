public class printrelation {
    public static void main(String[] args) {
        int a = 7 * 3 + 6 / 2 - 5;
        int b = 21 - 8 + a % 3 * 11;

        if (a < b) {
            System.out.println("a is less that b");
        }
        if (a == b) {
            System.out.println("a is equal to b");
        }
        if (a > b) {
            System.out.println("a is greater that b");
        }
    }
}
