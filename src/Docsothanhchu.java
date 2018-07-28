import java.util.Locale;
import java.util.Scanner;

public class Docsothanhchu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Nhập vào số bạn muốn đọc thành chữ");
        int number = sc.nextInt();
    }
}
