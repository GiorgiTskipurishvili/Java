import java.util.Scanner;
public abstract class ClassB implements ClassInterfaceB{
    //2)	განსაზღვრეთ კლასი B:  მთელი ტიპის ცვლადით a=33, ნამდვილი ტიპის ცვლადით b=9.7, სიმბოლური ტიპის ცვლადით s=’#’;
    //მეთოდი 8:  ბეჭდავს b ცვლადზე 10-ით მეტ რიცხვს.
    int a = 33;
    double b= 9.7;
    static char s='#';

    @Override
    //მეთოდი 1:  ბეჭდავს s ცვლადის მნიშვნელობას;
    public void Methodi1(){
        System.out.println(s);
    }

    @Override
    //მეთოდი 2:  ბეჭდავს a ცვლადის მნიშვნელობას;
    public void Methodi2(){
        System.out.println(a);
    }

    @Override
    //მეთოდი 3:  ბეჭდავს b ცვლადის მნიშვნელობას;
    public void Methodi3(){
        System.out.println(b);
    }

    @Override
    //მეთოდი 4:  ბეჭდავს a და b ცვლადების სხვაობას;
    public void Methhodi4(){
        System.out.println(a-b);
    }

    @Override
    //მეთოდი 5:  აბრუნებს a და b ცვლადების განაყოფს;
    public double Methodi5(){
        return a/b;
    }

    @Override
    //მეთოდი 6:  ანიჭებს ცვლადებს სხვა ნებისმიერ შესაბამისი ტიპის მნიშ¬ვნე¬ლობას;
    public void Methodi6(){
        return;
    }

    @Override
    //მეთოდი 7:  ანიჭებს a ცვლადს მნიშვნელობას კლავიატურიდან;
    public void Methodi7(){
        Scanner scan = new Scanner(System.in);
        System.out.println("გთხოვთ შეიყვანეთ ა ცვლადი");
        double a = scan.nextDouble();
    }

    //    //მეთოდი 8:  ბეჭდავს b ცვლადზე 10-ით მეტ რიცხვს..
    public void Methodi8(){
        System.out.println(b+10);
    }
}
