import java.util.Scanner;

public class DisplayGeomatry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int height = 0; height < 3; height++) {
                        for (int width = 0; width < 7; width++) {
                            System.out.print("+");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice");
            }
        }
    }
}
