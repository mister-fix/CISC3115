import java.util.Scanner;

public class InfoOf3 {
    public static void main(String[] args) {
        // Opening a new keyboard input scanner
        Scanner input = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;

        // Assignign value of a
        System.out.println("first number? ");
        a = input.nextInt();

        // Assignign value of b
        System.out.println("second number? ");
        b = input.nextInt();

        // Assignign value of c
        System.out.println("third number? ");
        c = input.nextInt();

        // Calling all and printing all method results
        System.out.println("allAreEqual: " + allAreEqual(a, b, c));
        System.out.println("twoAreEqual: " + twoAreEqual(a, b, c));
        System.out.println("noneAreEqual: " + noneAreEqual(a, b, c));
        System.out.println("areAscending: " + areAscending(a, b, c));
        System.out.println("areDescending: " + areDescending(a, b, c));
        System.out.println("strictlyAscending: " + strictlyAscending(a, b, c));
        System.out.println("strictlyDescending: " + strictlyDescending(a, b, c));

        // closing keyboard input scanner
        input.close();
    }

    public static boolean allAreEqual(int n1, int n2, int n3) {
        return n1 == n2 && n2 == n3;
    }

    public static boolean twoAreEqual(int n1, int n2, int n3) {
        return !allAreEqual(n1, n2, n3) && (n1 == n2 || n1 == n3 || n2 == n3);
    }

    public static boolean noneAreEqual(int n1, int n2, int n3) {
        return n1 != n2 && n1 != n3;

        // Can also be done as such
        // return !allAreEqual(n1, n2, n3) && !twoAreEqual(n1, n2, n3);
    }

    public static boolean areAscending(int n1, int n2, int n3) {
        return n1 <= n2 && n2 <= n3;
    }

    public static boolean areDescending(int n1, int n2, int n3) {
        return n1 >= n2 && n2 >= n3;
    }

    public static boolean strictlyAscending(int n1, int n2, int n3) {
        return n1 < n2 && n2 < n3;
    }

    public static boolean strictlyDescending(int n1, int n2, int n3) {
        return n1 > n2 && n2 > n3;
    }
}