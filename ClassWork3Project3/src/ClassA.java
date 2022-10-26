import java.util.Scanner;
public class ClassA implements ClassInterfaceA {
    //1)	განსაზღვრეთ კლასი A: ორი მთელი ტიპის a და b თვისებით.

    Scanner scan = new Scanner(System.in);
    int a,b;

    //მეთოდი 1:  ბეჭდავს ყველა მთელ რიცხვს a-სა და b-ს შორის;
    @Override
    public void Methodi1(){
        System.out.println("შეიყვანეთ a რიცხვი");
        a = scan.nextInt();
        System.out.println("შეიყვანეთ b რიცხვი");
        b = scan.nextInt();
        while (a > 0 && a<b)
            System.out.println(a++);
    }

    //მეთოდი 2:  ბეჭდავს a-ს ყველა გამყოფს;
    @Override
    public void Methodi2(){
        for (int i=1; i<=a; i++){
            if (a % i == 0){
                System.out.printf("%d " ,i);
            }
        }
    }

    @Override
    //მეთოდი 3:  ბეჭდავს b-ს ყველა მარტივ გამყოფს;
    public void Methodi3(){
        for (int i=1;i<=b;i++) {
            if (b % i == 0) {
                System.out.printf("%d ", i);
            }
        }
    }

    @Override
    //მეთოდი 4:  აბრუნებს b-ს ჩანაწერში ყველაზე ხშირად გამეორებად ციფრს.
    public void Methodi4(){
       return;
    }

}
