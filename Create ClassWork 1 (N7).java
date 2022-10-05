import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*იპოვეთ ორი მთელი რიცხვის უდიდესი საერთო გამყოფი და უმცირესი
        საერთო ჯერადი.(ევკლიდეს ალგორითმი).*/

        Scanner scan = new Scanner(System.in);

        int num1,num2,gcd;
        System.out.println("შეიყვანეთ ორი მთელი რიცხვი: ");

        num1 = scan.nextInt();
        num2 = scan.nextInt();


        //უმცირესი საერთო გამოფი
        if(num1 > num2){
            gcd =num2;
        }else {
            gcd = num1;
        }

        while (!(num1 % gcd ==0 && num2 % gcd ==0)){
            gcd--;
        }


        //უდიდესი საერთო გამყოფი
        for (int i = 1; i <= num1 && i <= num2; i++){
            if (num1 % i==0 && num2 % i == 0)
                gcd = i ;
        }

        int lcm = (num1 * num2) / gcd;


        System.out.println("უმცირესი საერთო გამყოფი  = "+gcd);

        System.out.println("უმცირესი საერთო ჯერარდი = "+lcm);
    }
}
