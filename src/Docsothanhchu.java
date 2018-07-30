import java.util.Locale;
import java.util.Scanner;

public class Docsothanhchu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Nhập vào số bạn muốn đọc thành chữ");
        int number = sc.nextInt();
        switch (number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                break;
        }
        int teen = number % 10;
        if (number >= 10 && number < 20) {
            switch (teen) {
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fifteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
                    default:
                        break;
            }
        } else if (number >= 20 && number <= 100) {
            int chuc = number / 10;
            int donvi = number % 10;
            String ones;
            String twos;
            switch (chuc) {
                case 2:
                    ones = "Twenty";
                    break;
                case 3:
                    ones = "Thirty";
                    break;
                case 4:
                    ones = "Forty";
                    break;
                case 5:
                    ones = "Fifty";
                    break;
                case 6:
                    ones = "Sixty";
                    break;
                case 7:
                    ones = "Seventy";
                    break;
                case 8:
                    ones = "Eighty";
                    break;
                case 9:
                    ones = "Ninety";
                    break;
                    default:
                        ones = "";
                        break;
            }
            switch (donvi) {
                case 1:
                    twos = "One";
                    break;
                case 2:
                    twos = "Two";
                    break;
                case 3:
                    twos = "Three";
                    break;
                case 4:
                    twos = "Four";
                    break;
                case 5:
                    twos = "Five";
                    break;
                case 6:
                    twos = "Six";
                    break;
                case 7:
                    twos = "Seven";
                    break;
                case 8:
                    twos = "Eight";
                    break;
                case 9:
                    twos = "Nine";
                    break;
                    default:
                        twos = "";
                        break;
            }
            if (ones != "") {
                if (twos != "") {
                    System.out.printf("%s %s", ones , twos);
                }
            }
        }
    }
}

