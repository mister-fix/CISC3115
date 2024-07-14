import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindLast {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number: ");

        while (keyboard.hasNext()) {
            int userNum = keyboard.nextInt();
            int result = findLast(userNum);

            if (result != -1) {
                System.out.println(userNum + " last appears in the file at position " + result);
            } else {
                System.out.println(userNum + " does not appear in the file");
            }

            System.out.println("Enter a number: ");
        }

        keyboard.close();
    }

    public static int findLast(int number) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("numbers.txt"));

        int result = -1;
        int position = 1;

        while (fileScanner.hasNextInt()) {
            int currNum = fileScanner.nextInt();

            if (currNum == number) {
                result = position;
            }

            position++;
        }

        fileScanner.close();

        return result;
    }
}