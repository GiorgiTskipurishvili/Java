import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        შეიტანეთ ნებისმიერი მთელი რიცხვი, დაბეჭდეთ რიცხვის ციფრთა ჯამი.
         */

        Scanner scan = new Scanner(System.in);

        int number = 0;
        int remainder = 0;
        int sum = 0;

        System.out.println("შეიყვანე ნებისმიერი მთელი რიცხვი: ");

        number = scan.nextInt();

        while (number>0){
            remainder = number%10;
            sum = sum + remainder;
            number = number / 10;
        }

        System.out.println("ციფრთა ჯამი = " + sum);

    }
}
