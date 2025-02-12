

/*  Write a Java program to create a method that takes an integer as a parameter
    and throws an exception if the number is odd. */


public class Que2 {
    public static void ifOdd(int a) {
        if (a %2 !=0){
            throw new OddNumber("The given number is odd, please provide even number");
        } else {
            System.out.println("Given number is "+a+" and it is a even number!");
        }
    }
    public static void main(String[] args) {
        ifOdd(50);
    }
}

class OddNumber extends RuntimeException {
    OddNumber(String s) {
        super(s);
    }
}