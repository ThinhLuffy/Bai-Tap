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
        } else if (number >= 20 && number <= 1000) {
            int chuc = number / 10;
            int donvi = number % 10;
            int tram = number / 100;
            String step1;
            String step2;
            String step3;
            switch (chuc) {
                case 2:
                    step1 = "Twenty";
                    break;
                case 3:
                    step1 = "Thirty";
                    break;
                case 4:
                    step1 = "Forty";
                    break;
                case 5:
                    step1 = "Fifty";
                    break;
                case 6:
                    step1 = "Sixty";
                    break;
                case 7:
                    step1 = "Seventy";
                    break;
                case 8:
                    step1 = "Eighty";
                    break;
                case 9:
                    step1 = "Ninety";
                    break;
                    default:
                        step1 = "";
                        break;
            }
            switch (donvi) {
                case 1:
                    step2 = "One";
                    break;
                case 2:
                    step2 = "Two";
                    break;
                case 3:
                    step2 = "Three";
                    break;
                case 4:
                    step2 = "Four";
                    break;
                case 5:
                    step2 = "Five";
                    break;
                case 6:
                    step2 = "Six";
                    break;
                case 7:
                    step2 = "Seven";
                    break;
                case 8:
                    step2 = "Eight";
                    break;
                case 9:
                    step2 = "Nine";
                    break;
                    default:
                        step2 = "";
                        break;
            }
            switch (tram) {
                case 1:
                    step3 = "One hundred";
                    break;
                case 2:
                    step3 = "Two hundred";
                    break;
                case 3:
                    step3 = "Three hundred";
                    break;
                case 4:
                    step3 = "For hundred";
                    break;
                case 5:
                    step3 = "Five hundred";
                    break;
                case 6:
                    step3 = "Six hundred";
                    break;
                case 7:
                    step3 = "Seven hundred";
                    break;
                case 8:
                    step3 = "Eight hundred";
                    break;
                case 9:
                    step3 = "Nine hundred";
                    break;
                    default:
                        step3 = "";
                        break;
            }
            if (step1 != "") {
                if (step2 != "")
                    if (step3 != ""){
                    System.out.printf("%s and %s %s", step3, step1 , step2);
                } else {
                        System.out.printf("%s %s", step1, step2);
                    }
            }
        }
    }
}

