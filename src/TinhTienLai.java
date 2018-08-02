import java.util.Locale;
import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        double money = 1.0d;
        double rate = 1.0d;
        int month = 1;

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Nhập số tiền gửi");
        money = sc.nextDouble();
        System.out.println("Nhập lãi suất");
        rate = sc.nextDouble();
        System.out.println("Nhập số tháng gửi");
        month = sc.nextInt();

        double total_rate = 0;
        for (int i = 0; i < month; i++) {
            total_rate = money * (rate / 100) / 12 * month;
        }
        System.out.println("Tổng số tiền nhận được của bạn là: " + total_rate);
    }
}
