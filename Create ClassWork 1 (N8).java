import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*დაბეჭდეთ მთელი რიცხვები M-დან N-მდე.*/

        Scanner scan = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int i = 0;


        System.out.println("შეიყვანეთ პირველი საწყისი რიცხვი: ");
        num1 = scan.nextInt();
        System.out.println("შეიყვანეთ ბოლო რიცხვი: ");
        num2 = scan.nextInt();

        for ( i = num1; i<num2; i++){
            System.out.println(i);
        }

    }
}
