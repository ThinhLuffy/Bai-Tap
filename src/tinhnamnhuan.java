import java.util.Locale;
import java.util.Scanner;

public class tinhnamnhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Enter a year:");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d is a leap year",year);
                } else {
                    System.out.printf("%d is not a leap year",year);
                }
            } else {
                System.out.printf("%d is not a leap year",year);
            }
        } else {
            System.out.printf("%d is not a leap year",year);
        }
    }
}
