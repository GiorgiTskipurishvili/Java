import java.util.Scanner;

public class ClassA {
    /*მეთოდი 1: ანიჭებს a და b ცვლადებს მნიშვნელობებს კლავიატურიდან.
    მეთოდი 2: დაბეჭდოს ცვლადების ჯამი.
    მეთოდი 3: დაგვიბრუნოს ცვლადების ნამრავლი.*/

    int a, b;


    //ორი ცვლადის მინიჭება
    public void Methodi1(){
        System.out.println("შეიყვანეთ რიცხვები: ");
        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();

        System.out.println("a= " + a + "\nb= " + b);
    }

    //ჯამი
    public void Methodi2(){
        int sum = a + b;
        System.out.println("a+b ="+sum);
    }

    //ცვლადის ნამრავლი return
    public int Methodi3(){
        return a*b;
    }

}
