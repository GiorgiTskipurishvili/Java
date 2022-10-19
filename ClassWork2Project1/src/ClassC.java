import java.util.Scanner;
public class ClassC {
    /*განსაზღვრეთ კლასი C: სამი მთელი ტიპის ცვლადით a, b, c; 6 მეთოდით;
    მეთოდი 1: ანიჭებს a, b და c ცვლადებს მნიშვნელობებს კლავიატურიდან.
    მეთოდი 2: აბრუნებს a-ს მნიშვნელობის ბოლო ციფრს.
    მეთოდი 3: აბრუნებს b-ს მნიშვნელობის პირველ ციფრს.
    მეთოდი 4: აბრუნებს c-ს მნიშვნელობის ციფრთა ჯამს.
    მეთოდი 5: ბეჭდავს მეთოდი 1-ის მნიშნველობისა და მეთოდი 2-ის
    მნიშვნელობის ნამრავლს.
    მეთოდი 6: ბეჭდავს მეთოდი 3-ის მნიშნველობისა და მეთოდი 5-ის
    მნიშვნელობის ჯამს.*/
    int a,b,c;

    public void Methodi1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
    }

    //  მეთოდი 2: აბრუნებს a-ს მნიშვნელობის ბოლო ციფრს.
    public int Methodi2(){
        int lastInt = a%10;
        return lastInt;
    }





//    მეთოდი 3: აბრუნებს b-ს მნიშვნელობის პირველ ციფრს.
    public int Methodi3(){
        while (b >= 10)
            b /= 10;
        return b;
    }

//    მეთოდი 4: აბრუნებს c-ს მნიშვნელობის ციფრთა ჯამს.
    public int Methodi4(){
//        int r = 0;
//        int s =0 ;
//        while (c >= 0){
//            r = c %10;
//            s = s + r;
//            c = c / 10;
//        }
//        return r ;
        int number = c;
        int sum = 0;
        int remainder = 0;
        while (number>0){
            remainder = number%10;
            sum = sum + remainder;
            number = number / 10;
        }
        return remainder;
    }

    //   მეთოდი 5: ბეჭდავს მეთოდი 1-ის მნიშნველობისა და მეთოდი 2-ის
    //    მნიშვნელობის ნამრავლს.
    public int Methodi5(){
        Methodi1();
    }

}
