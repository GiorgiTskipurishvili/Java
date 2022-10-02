import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        შეიტანეთ ოთხნიშნა მთელი რიცხვი, დაბეჭდეთ რიცხვის ციფრთა ჯამი.
         */

        Scanner scan = new Scanner(System.in);

        int number = 0;

        System.out.println("გთხოვთ შეიყვანეთ ოთხნიშნა მთელი რიცხვი ");

        number = scan.nextInt();

        int digit1 = number / 1000;
        int digit2 = (number % 1000)/100;
        int digit3 = (number % 100)/10;
        int digit4 = number % 10;

        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);

        int sumOfDigits = digit1 + digit2 + digit3 + digit4;

        System.out.println("ციფრთა ჯამი = " + sumOfDigits);

    }
}
