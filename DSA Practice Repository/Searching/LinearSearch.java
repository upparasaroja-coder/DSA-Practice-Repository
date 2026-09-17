import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println("Element not found.");
        }
        sc.close();
    }
}