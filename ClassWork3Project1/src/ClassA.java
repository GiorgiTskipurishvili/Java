public class ClassA {
    //1)განსაზღვრეთ კლასი A: ორი მთელი ტიპის ცვლადით a=10, b=29;
    int a=10;
    int b=29;

    //მეთოდი 1:  ბეჭდავს “Hello OPP”;
    public void Methodi1(){
        System.out.println("Hello OPP");
    }

    //მეთოდი 2:  ბეჭდავს a ცვლადის მნიშვნელობას;
    public void Methodi2(){
        System.out.println("a "+a);
    }

    //მეთოდი 3:  ბეჭდავს b ცვლადის მნიშვნელობას;
    public void Methodi3(){
        System.out.println("b " + b);
    }

    //მეთოდი 4:  ბეჭდავს a და b ცვლადების ჯამს;
    public void Methodi4(){
        int sum =a+b;
        System.out.println("a+b = " + sum);
    }

    //მეთოდი 5:  აბრუნებს a და b ცვლადების ჯამს;
    public int Methodi5(){
        return a+b;
    }

    //მეთოდი 6:  აბრუნებს a და b ცვლადების ნამრავლს;
    public int Methodi6(){
        return a*b;
    }

    //gasaketebelia
    //მეთოდი 7:  ანიჭებს a და b ცვლადებს 5-ის და 6-ის ტოლ მნიშ¬ვნე¬ლობებს.
    public int Methodi7(){
        return 0;
    }
}
