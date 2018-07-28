import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Xosokienthiet {
    public static void main(String[] args) {
        System.out.println("Chương trình xổ số kiến thiết miền bắc xin phép được bắt đầu");
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Nhập vào số đầu tiên (có 1 chữ số thôi nhé)");
        int guessDigit1 = sc.nextInt();
        System.out.println("Nhập vào số thứ 2 (nhập số có 1 chữ số thôi nhé)");
        int guessDigit2 = sc.nextInt();
        Random rd = new Random();
        int lottery = rd.nextInt(100);
        System.out.println("Giải đặc biệt là: " + lottery);

        int num1 = lottery / 10;
        int num2 = lottery % 10;

        if (guessDigit1 == num1) {
            if (guessDigit2 == num2) {
                System.out.println("Trúng lớn rồi đại ca. 10000$ đã nằm trong ví");
            } else {
                System.out.println("An ủi giải ba 1000$ rồi đó");
            }
        } else if (guessDigit2 == num1) {
            if (guessDigit1 == num2) {
                System.out.println("Trúng giải nhì. Bạn nhận được 3000$");
            } else {
                System.out.println("An ủi giải ba mang về 1000$");
            }
        } else {
            System.out.println("Chúc bạn may mắn lần sau");
        }
    }
}
