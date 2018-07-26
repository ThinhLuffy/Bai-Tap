import java.util.Locale;
import java.util.Scanner;

public class ptbacnhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants: ");

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Input a");
        float a = sc.nextFloat();
        if (a == 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            System.out.println("input b");
            float b = sc.nextFloat();
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                float x = -b / a;
                System.out.println("Phuong trinh co nghiem: x = " + x);
            }
        }
    }
}
