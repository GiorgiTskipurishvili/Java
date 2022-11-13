import java.util.*;
import java.util.Random;
import java.util.Arrays;


public class ClassB {
//1)	განსაზღვრეთ კლასი A: ორი მთელი ტიპის ცვლადით a, b, მთელი ტიპის 12 ელემენტიანი m მასივით;
//მეთოდი 6:  ბეჭდავს m მასივს დადებითი ელემენტების ჯამს;
//მეთოდი 7:  ბეჭდავს m მასივს დადებით ელემენტებს შორის მინი¬მა¬ლურს.
    int a , b;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int m[] = new int[12];

    //მეთოდი 1:  ანიჭებს a და b ცვლადებს შემთხვევით მნიშვნელობებს [10; 25] შუალედიდან ;
    public void Methodi1(){
        System.out.println("Sheikvanet a da b ricxvebi");
        a = scanner.nextInt(10)+15;
        b =scanner.nextInt(10)+15;

        System.out.println(a);
        System.out.println(b);
    }

    //მეთოდი 2:  აბრუნებს a და b ცვლადების მნიშვნელობებს;
    public int[] Methodi2(){
        int [] ab={a,b};
        return ab;
    }

    //მეთოდი 3:  აბრუნებს a და b ცვლადების მნიშვნელობებს შესაბამის სიმბოლოებს;
    public char[] Methodi3(){
        char[] ab = {(char) a, (char) b};
        return ab;
    }

    //მეთოდი 4:  ანიჭებს m მასივს შემთხვევით მნიშვნელობებს [-10; 60] შუალედიდან;
    public void Methodi4(){
        System.out.println("m მასივს შემთხვევით მნიშვნელობებს [-10; 60] შუალედიდან");
        for (int i=0; i<m.length; i++){
            m[i] = random.nextInt(71)-11;
        }
        System.out.println(m);
    }

    //მეთოდი 5:  ბეჭდავს m მასივს ლუწ ელემენტებს;
    public void Methodi5(){
        for (int i=0; i<m.length;i++){
            if (m[i]%2==0){
                System.out.println(m[i]);
            }
        }
    }


}


