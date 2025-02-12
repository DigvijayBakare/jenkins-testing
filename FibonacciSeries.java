
public class FibonacciSeries {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3;
        int count = 10;

        System.out.println("Fibonacci series: ");
        if (count <= 1) {
            System.out.println(n1);
        } else if (count == 2) {
            System.out.println(n1 + " " + n2);
        } else {
            System.out.print(n1 + " " + n2 + " ");
            for (int i = 3; i <= count; i++) {
                n3 = n1 + n2;
                System.out.print(n3 + " ");
                n1 = n2;
                n2 = n3;
            }
            System.out.println();
        }
    }
}
