import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInfo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("numbers.txt"));

        int header = fileScanner.nextInt();

        double[] numbers = new double[header];

        for (int i = 0; i < header; i++) {
            numbers[i] = fileScanner.nextDouble();
        }

        System.out.println("The array: {" + Arrays.toString(numbers).replace("[", "").replace("]", "") + "} contains "
                + numbers.length + " elements");
        System.out.println("The first element of the array is " + numbers[0]);
        System.out.println("The last element of the array is " + numbers[numbers.length - 1] + " and is at position "
                + (numbers.length - 1));
        System.out.println("The middle element of the array is " + numbers[(numbers.length - 1) / 2]
                + " and is at position " + ((numbers.length - 1) / 2));
        System.out.println("The largest element of the array is " + numbers[maxPos(numbers)] + " and is at position "
                + maxPos(numbers));
        System.out.println("The smallest element of the array is " + numbers[minPos(numbers)] + " and is at position "
                + minPos(numbers));

        fileScanner.close();
    }

    public static int maxPos(double[] arr) {
        int result = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[result]) {
                result = i;
            }
        }

        return result;
    }

    public static int minPos(double[] arr) {
        int result = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[result]) {
                result = i;
            }
        }

        return result;
    }
}
