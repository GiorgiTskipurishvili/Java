import java.util.Scanner;
public class ClassB {
    /*განსაზღვრეთ კლასი B: სამი მთელი ტიპის ცვლადით a, b, c; 3 მეთოდით;
    მეთოდი 1: ანიჭებს a, b და c ცვლადებს მნიშვნელობებს კლავიატურიდან.
    მეთოდი 2: ბეჭდავს ცვლადებს შორის მაქსიმალურს.
    მეთოდი 3: გვიბრუნებს ცვლადებს შორის მინიმალურს.*/

    int a, b,c;
    int minimal;

    //მაქსიმალური
    public void Methodi1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("შეიყვანეთ სამი მთელი რიცხვი: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
    }

    public void Methodi2(){
        if (a>=b && a>=c){
            System.out.println("მაქსიმალური რიცხვი არის "+a);
        }else if (b>=a && b >= c){
            System.out.println("მაქსიმალური რიცხვი არის "+b);
        }else if (c>=a && c >= b){
            System.out.println("მაქსიმალური რიცხვი არის "+c);
        }else {
            System.out.println("თანაბარია ");
        }
    }

    //გვიბრუნებს ცვლადებს შორის მინიმალურს
    public int Methodi3(){
//        if(a<b) {
//            if(c<a) {
//                minimal = c;
//            } else {
//                minimal = a;
//            }
//        } else {
//            if(b<c) {
//                minimal = b;
//            } else {
//                minimal = c;
//            }
//        }

        if (a<=b && a<=c){
            System.out.println("მინიმალური რიცხვი არის "+a);
        }else if (b<=a && b <= c){
            System.out.println("მინიმალური რიცხვი არის "+b);
        }else if (c<=a && c <= b){
            System.out.println("მინიმალური რიცხვი არის "+c);
        }else {
            System.out.println("თანაბარია ");
        }

        return minimal;
    }
}
