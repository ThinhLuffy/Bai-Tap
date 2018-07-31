import java.util.Locale;
import java.util.Scanner;

public class PtBacHai {
    public static void main(String[] args) {
        System.out.println("Chương trình giải hệ phương trình bậc 2: a*x*x + b*y + c = 0");
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Mời bạn nhập vào giá trị a:");
        double a = sc.nextDouble();
        System.out.println("Mời bạn nhập vào giá trị b:");
        double b = sc.nextDouble();
        System.out.println("Mời bạn nhập vào giá trị c:");
        double c = sc.nextDouble();
        double x;

        if (a != 0) {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Phương trình có 2 nghiệm: x1 = %.0f và x2 = %.0f.", x1, x2);
            } else if (delta == 0) {
                x = -b / 2 * a;
                System.out.printf("Phương trình có nghiệm x = %f", x);
            } else if (delta < 0) {
                System.out.println("Phương trình không có nghiệm thực");
            }
        } else {
            System.out.println("Hiện tại phương trình có dạng: bx + c = 0");
            if (b != 0) {
                if (c != 0) {
                    x = -c / b;
                    System.out.printf("Phương trình có nghiệm x = %.0f", x);
                } else {
                    System.out.println("phương trình có nghiệm x = 0");
                }
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
