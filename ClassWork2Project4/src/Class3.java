import java.util.Scanner;

public class Class3 {
    int a,b;
    Scanner scan = new  Scanner(System.in);

    //	მეთოდი 1: აბრუნებს (4a^2)/b-1.
    public int Methodi1(){
        System.out.println("შეიყვანეთ a და b რიცხვები");
        a= scan.nextInt();
        b= scan.nextInt();

        return ((4*(a*a)/b)-1);
    }

    //	მეთოდი 2: აბრუნებს 3a^3/2  - b^2.
    public int Methodi2(){
        return (3*((a*a*a)/2))-(b*b);
    }
}
