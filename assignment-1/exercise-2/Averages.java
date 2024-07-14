import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Averages {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fs = new Scanner(new File("numbers.txt"));

        int counter = 0;

        while (fs.hasNextInt()) {
            int sum = 0;
            int header = fs.nextInt();

            double average = 0;

            System.out.println("The average of the " + header + " integers ");

            for (int i = 0; i < header; i++) {
                int number = fs.nextInt();
                System.out.print(number + " ");
                sum += number;
            }

            average = (double) sum / header;
            System.out.println("is " + average);
            counter++;
        }

        fs.close();
    }
}