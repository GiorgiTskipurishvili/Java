import java.util.Scanner;

public class Class2 {
    /*	განსაზღვრეთ კლასი: 2 მთელი ცვლადით n, y. 2 მეთოდით.
	მეთოდი 1: აბრუნებს 2n^2+1.
	მეთოდი 2: აბრუნებს 3y^3-n^2.
*/
    int n,y;
    Scanner scan = new Scanner(System.in);


    public int Methodi1(){
        System.out.println("შეიყვანეთ n რიცხვი");
        n = scan.nextInt();

       return 2*(n*n)+1 ;
    }
    //	მეთოდი 2: აბრუნებს 3y^3-n^2.
    public int Methodi2(){
        System.out.println("შეიყვანეთ n რიცხვი");
        n = scan.nextInt();
        System.out.println("შეიყვანეთ y რიცხვი ");
        y = scan.nextInt();

        return 3*(y*y*y)-(n*n);
    }
}
