

/*   Write a Java program to create a method that reads a file and throws an
     exception if the file is not found. */

import java.io.FileReader;
import java.io.IOException;

public class Que3 {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("Que4FromQueBank.txt");
        System.out.println("Name: "+f);
    }
}
