import java.util.*;
public class Class4 {
    //	მეთოდი 2: აბრუნებს (az-b)/zb.

    int a,b,z;
    Scanner scanner = new Scanner(System.in);


    //	მეთოდი 1: აბრუნებს  (a+b^3-7)/(z+8).
    public float Methodi1(){
        System.out.println("შეიყვანეთ სამი რიცხვი");
        a = scanner.nextInt();
        b=scanner.nextInt();
        z=scanner.nextInt();

        return (float) ((a+Math.pow(b,3)-7)/(z+8));
    }

    //	მეთოდი 2: აბრუნებს (a+z-b^3)/zab.
    public float Methodi2(){
        return (float) ((a+z-Math.pow(b,3)/(z*a*b)));
    }

    //	მეთოდი 2: აბრუნებს (az-b)/zb.

    public float Methodi3(){
        return (float) ((a*z-b)/(z*b));
    }
}
