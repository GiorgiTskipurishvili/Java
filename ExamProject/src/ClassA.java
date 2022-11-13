import java.util.*;
import java.util.Arrays;
import java.util.Random;


public class ClassA {
//განსაზღვრეთ კლასი A: მთელი ტიპის m[15] მასივით; 4 მეთოდით; მეთოდი 1-ის
//იმპლემენტაციისთვის გამოიყენეთ ინტერფეისი.

    int m[] =new int[15];

    Scanner scanner=new Scanner(System.in);
    Random random = new Random();

    //მეთოდი 1: ანიჭებს m მასივის ელემენტებს შემთხვევით მნიშვნელობებს [a; b]
//შუალედუდან, a და b-ს მნიშვნელობების შეტანა ხდება კლავიატურიდან;
    public void Methodi1(){
        int a,b;
        System.out.println("Sheikvanet a da b ricxvebi");
        a = scanner.nextInt();
        b = scanner.nextInt();
        for (int i=0; i<m.length; i++){
//            m[i] = random.nextInt(a, b);
            System.out.println(m[i] = random.nextInt(a, b));
        }
    }

    //მეთოდი 2: აბრუნებს მასივის იმ ელემენტების მნიშვნელობათა ჯამს, რომლის
    //მნიშვნელობა თავის ინდექსზე ნაკლებია;
    public int Methodi2(){
        int sum = 0;
        for (int i = 0 ; i<m.length;i++){
            if (m[i]<i)
                sum += m[i];
        }
        return sum;
    }

//მეთოდი 3: აბრუნებს მასივის იმ ელემენტების ინდექსების ნამრავლს, რომლის
//მნიშვნელობა თავის ინდექსზე მეტია;

    public long Methodi3(){
        long numr=1;
        for (int i=0; i<m.length; i++){
            if (m[i]>i)
                numr *= m[i];
            System.out.println(m[i] + " ");
        }
        return numr;
    }

//მეთოდი 4: ბეჭდავს მასივში არსებულ ლუწ რიცხვებს.
    public void Methodi4(){
        for (int i=0; i<m.length; i++){
            if(m[i]%2==0)
                System.out.println(m[i] + " ");
        }
    }





}
