import java.util.*;
import java.util.Random;
import java.util.Arrays;
public class ClassA implements InterfaceClassA{
    //1)	განსაზღვრეთ კლასი A: ორი მთელი ტიპის ცვლადით a, b, მთელი ტიპის 12 ელემენტიანი m მასივით;
    Scanner  scan = new Scanner(System.in);
    int a;
    int b;
    Random random = new Random();
    int[] m = new int[12];


    @Override
    ////მეთოდი 1:  ანიჭებს a და b ცვლადებს შემთხვევით მნიშვნელობებს [10; 25] შუალედიდან ;
    public void Methodi1(){
        System.out.println( "ბეჭდავს შემთხვევით მნიშვნელობებს [10; 25] შუალედიდან");
        a = random.nextInt(10)+15;
        b = random.nextInt(10)+15;
        System.out.println("a " +a);
        System.out.println("b "+b);

    }

    @Override
    //მეთოდი 2:  აბრუნებს a და b ცვლადების მნიშვნელობებს;
    public int[] Methodi2(){
        int [] ab={a,b};
        return ab;
    }

    @Override
    //მეთოდი 3:  აბრუნებს a და b ცვლადების მნიშვნელობებს შესაბამის სიმბოლოებს;
    public char[] Methodi3(){
        char[] ab={(char)a , (char) b};
        return ab;
    }

    @Override
    //მეთოდი 4:  ანიჭებს m მასივს შემთხვევით მნიშვნელობებს [-10; 60] შუალედიდან;
    public void Methodi4(){
        System.out.println("m მასივს შემთხვევით მნიშვნელობებს [-10; 60] შუალედიდან");
        for (int i=0; i < m.length; i++){
            m[i] =random.nextInt(71)-11;
        }
        System.out.println(m);
    }

    @Override
    //მეთოდი 5:  ბეჭდავს m მასივს ლუწ ელემენტებს;
    public void Methodi5(){
        for(int i=0; i<m.length; i++){
            if (m[i]%2==0){
                System.out.println(m[i]);
            }
        }
    }

    @Override
    //მეთოდი 6:  ბეჭდავს m მასივს დადებითი ელემენტების ჯამს;
    public void Methodi6(){
        System.out.println(Arrays.stream(m).filter(i -> i >=0).sum());
    }

    @Override
    //მეთოდი 7:  ბეჭდავს m მასივს დადებით ელემენტებს შორის მინი¬მა¬ლურს.
    public void Methodi7(){
        int smallest = 0;
        for(int i=0;i<m.length;i++)
        {
            if(m[i]>0)
            {
                smallest=m[i];
                break;
            }
        }


        for(int i=0;i<m.length;i++)
        {

            if(smallest>m[i]&&m[i]>0)
            {
                smallest=m[i];

            }

        }

        System.out.println(smallest);
    }
}
