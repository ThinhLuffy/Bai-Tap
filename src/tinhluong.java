import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class tinhluong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Nhap vao he so luong");
        double hsl = sc.nextDouble();
        if (hsl > 0 && hsl <= 5) {
            System.out.println("Nhap vao so nam lam viec");
            double nlv = sc.nextDouble();
            double luong = hsl * 4000000 + nlv * 500000;
            System.out.printf("Luong hien tai cua ban la %f VND", luong,2);
        } else {
            System.out.println("He so luong khong dung");
        }
    }
}
