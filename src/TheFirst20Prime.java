import java.util.Scanner;

public class TheFirst20Prime {
    public static void main(String[] args) {
        System.out.println("Nhập vào lượng số nguyên tố cần in ra: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;

        for (int i = 2; i < 1000; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
        }
        for (int i = 2; i < 1000; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (count < number) {
                if (check) {
                    System.out.println(i);
                    count = count + 1;
                }
            }
        }
    }
}

