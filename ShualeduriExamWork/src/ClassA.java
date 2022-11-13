import java.util.*;
import java.util.Random;
import java.util.Arrays;

public class ClassA implements InterfaceA{
    //განსაზღვრეთ კლასი A: მთელი ტიპის m[15] მასივით; 4 მეთოდით; მეთოდი 1-ის
    //იმპლემენტაციისთვის გამოიყენეთ ინტერფეისი.
    //შუალედუდან, a და b-ს მნიშვნელობების შეტანა ხდება კლავიატურიდან;


    //მეთოდი 4: ბეჭდავს მასივში არსებულ ლუწ რიცხვებს.

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int m[] = new int[15];

    @Override
    //მეთოდი 1: ანიჭებს m მასივის ელემენტებს შემთხვევით მნიშვნელობებს [a; b]
    public void Methodi1(){
        System.out.println("შეიყვანეთ a და b რიცხვები ");
        int a, b ;
        a= scanner.nextInt();
        b= scanner.nextInt();

        for (int i=0; i < m.length; i++){
            m[i] = random.nextInt(a, b);
//            System.out.println(m[i]);
        }
    }

    //მეთოდი 2: აბრუნებს მასივის იმ ელემენტების მნიშვნელობათა ჯამს, რომლის
    //მნიშვნელობა თავის ინდექსზე ნაკლებია;

    @Override
    public int Methodi2(){
        int sum = 0;
        for (int i=0; i<m.length; i++){
            if (m[i]<i) sum+=m[i];
        }
        return sum;
    }


    //მეთოდი 3: აბრუნებს მასივის იმ ელემენტების ინდექსების ნამრავლს, რომლის
    //მნიშვნელობა თავის ინდექსზე მეტია;
//    public int Methodi3(){
//        int p=1;
//        for (int i=0; i<m.length; i++){
//            if (m[i]>i) p*=m[i];
//            System.out.print(m[i]+" ");
//        }
//        System.out.println();
//        return p;
//    }

    @Override
    public long Methodi3(){
        long p=1;
        for (int i=0; i<m.length; i++){
            if (m[i]>i) p*=m[i];
            System.out.print(m[i]+" ");
        }
        System.out.println();
        return p;
    }


    @Override
    //მეთოდი 4: ბეჭდავს მასივში არსებულ ლუწ რიცხვებს.
    public void Methodi4(){
        for (int i=0; i<m.length; i++){
            if(m[i]%2==0)
                System.out.println(m[i] + " ");
        }
    }

}

