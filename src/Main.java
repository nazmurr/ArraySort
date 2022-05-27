import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        String sortMethod = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = scanner.nextInt();
        }

        scanner.nextLine();

        while ((!sortMethod.equals("asc")) && (!sortMethod.equals("desc"))) {
            System.out.println("Enter sort method (asc or desc): ");
            sortMethod = scanner.nextLine();
        }

        scanner.close();

        if (sortMethod.equals("asc")) ArraySort.ascSortArray(myIntArray);
        if (sortMethod.equals("desc")) ArraySort.descSortArray(myIntArray);

        System.out.println("Sorted array (" + sortMethod + ")");
        for (int j : myIntArray) {
            System.out.println(j);
        }
    }
}