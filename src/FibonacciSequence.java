public class FibonacciSequence {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        System.out.println(a);
        System.out.println(b);

        for (int i = 0; i < 6; i++) {
            a = a + b;
            System.out.println(a);
            b = b + a;
            System.out.println(b);
        }
    }
}
