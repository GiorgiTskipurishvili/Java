import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Class1 c1 = new Class1();
        System.out.println("2x-7 " + c1.Methodi1());
        System.out.println("3y+z "+c1.Methodi2());
        System.out.println("12y-x+z  "+c1.Methodi3());

         Class2 c2 = new Class2();
         System.out.println("2n^2+1 " + c2.Methodi1());
         System.out.println("3y^3-n^2 " + c2.Methodi2());

        Class3 c3 = new Class3();
        System.out.println(c3.Methodi1());
        System.out.println(c3.Methodi2());

        Class4 c4 = new Class4();
        System.out.println(c4.Methodi1());
        System.out.println(c4.Methodi2());
        System.out.println(c4.Methodi3());

    }
}