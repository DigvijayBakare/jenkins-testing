
/*  Write a Java program that reads a list of numbers from a file and throws an
    exception if any of the numbers are positive. */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Que4 {
    public static void main(String[] args) {
        String filename = "D:\\Coding\\JAVA\\Codes\\June2024\\src\\June2024\\Practice\\Exception\\Que4FromQueBank.txt";
        try {
            numberReader(filename);
            System.out.println("All numbers are negative");
        } catch (PosNumber p) {
            System.out.println("Error: " + p.getMessage());
        } catch (NumberFormatException n) {
            System.out.println("Error in file: " + n.getMessage());
        }catch (IOException e) {
            System.out.println("Error in file: " + e.getMessage());
        }
    }

    public static void numberReader(String filename) throws PosNumber, IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    try {
                        int n = Integer.parseInt(line.trim());
                        if (n > 0) {
                            throw new PosNumber("Positive number found");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(e);
                    } /*catch (PosNumber e) {
                        throw new RuntimeException(e);
                    }*/
                }

            }
        }
    }
}

class PosNumber extends RuntimeException {
    PosNumber(String s) {
        super(s);
    }
}