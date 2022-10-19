import java.util.Scanner;
public class ClassC {
    //3)	განსაზღვრეთ კლასი C:  ორი მთელი ტიპის ცვლადით a=10, b=9, ორი სიმბოლური ტიპის ცვლადით s=’#’, h=’@’;

    int a = 10;
    int b=9;
    char s='#';
    char h = '@';

    //მეთოდი 1:  ბეჭდავს მთელი ტიპის ცვლადების მნიშვნელობებს;
    public void Methodi1(){
        System.out.println("a ="+a + "\nb="+b);
    }

    //მეთოდი 2:  ბეჭდავს სიმბოლური ტიპის ცვლადების მნიშ¬ვნე¬ლო¬ბებს;
    public void Methodi2(){
        System.out.println(s + "\n" + h);
    }

    //მეთოდი 3:  ბეჭდავს a და b ცვლადების ჯამს, ნამრავლს, სხვაობას, ნაშთიან გაყოფას ცალ-ცალკე სტრიქონზე;
    public void Methodi3(){
        System.out.println("ჯამი " + (a+b));
        System.out.println("ნამრავლი " + (a*b));
        System.out.println("სხვაობა " + (a-b));
        System.out.println("ნაშთი " + (a%b));
    }

    //მეთოდი 4:  ანიჭებს a ცვლადს მნიშვნელობას კლავიატურიდან;
    public void Methodi4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("მიანიჭე a ცვლადი კლავიატურიდან");
        a = scanner.nextInt();
        System.out.println(a);
    }

    //მეთოდი 5:  ანიჭებს b ცვლადს მნიშვნელობას კლავიატურიდან;
    public void Methodi5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("მიანიჭე b ცვლადი კლავიატურიდან");
        b = scanner.nextInt();
        System.out.println(b);
    }

    //მეთოდი 6:  ანიჭებს სიმბოლური ტიპის ცვლადებს მნიშვნელობებს კლავიატურიდან;
    public char Methodi6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("მიანიჭე სიმბოლური ტიპის ცვლადი კლავიატურიდან ");
        return 0;
    }

}
