import java.util.Locale;
import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("nhap vao chieu cao: ");
        float height = sc.nextFloat();

        System.out.println("nhap vao can nang: ");
        float weight = sc.nextFloat();

        double bmi = weight/(height*height);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (18.5 <= bmi && bmi < 25.0) {
            System.out.println("Normal");
        }
        else if (25.0 <= bmi && bmi < 30.0) {
            System.out.println("Overweight");
        }
        else if (30 <= bmi) {
            System.out.println("Obese");
        }
        else {
            System.out.println("chiu");
        }
    }
}