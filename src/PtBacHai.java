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
    }
}
