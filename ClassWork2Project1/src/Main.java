import java.lang.reflect.Member;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//
//        ClassA cA = new ClassA();
//        cA.Methodi1();
//        cA.Methodi2();
//        cA.Methodi3();
//        System.out.println("a*b = " + cA.Methodi3());

//
//        ClassB cB = new ClassB();
//        cB.Methodi1();
//        cB.Methodi2();
////        System.out.println("Minimal Number is " + cB.Methodi3());
//        cB.Methodi3();


        ClassC cC = new ClassC();
        cC.Methodi1();
        System.out.println("a აბრუნებს ბოლო ციფრს : " + cC.Methodi2());
        System.out.println("b აბრუნებს პირველ ციფრს : " + cC.Methodi3());
        System.out.println("c-ს მნიშვნელობის ციფრთა ჯამია: " + cC.Methodi4());

    }

}