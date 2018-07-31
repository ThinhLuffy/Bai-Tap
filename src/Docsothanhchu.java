import java.util.Locale;
import java.util.Scanner;

public class Docsothanhchu {
    public static void main(String[] args) {
        System.out.println("Nhập vào số muốn đọc thành chữ: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number < 0) return;
        if (number < 10) {
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
            }
        } else if (number < 20) {
            int teen = number % 10;
            switch (teen) {
                case 0:
                    System.out.println("Ten");
                    break;
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
                    System.out.println("Forteen");
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
            }
        } else if (number < 100) {
            int chuc = number / 10;
            int donvi = number % 10;
            String step1;
            String step2;
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
            System.out.printf("%s %s", step1 , step2);
        } else if (number < 1000) {
            int tram = number / 100;
            int dutram = tram / 10;
            int duchuc = dutram / 10;
            int dudonvi = duchuc % 10;
        }
    }
}