

/*   Write a Java program that throws an exception and catch it using a try-catch block. */

public class Que1 {
    public static void main(String[] args) {
        System.out.println("This is question number 1");
        try {
            int a = 10/0;
        } catch (ArithmeticException ai){
            System.out.println(ai);
            System.out.println("Exception handled using try-catch block");
        }

        System.out.println("End of first question");
    }
}
